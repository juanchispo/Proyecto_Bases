package Modelo.Dao;

import Modelo.Cliente;
import Modelo.Genero;
import Modelo.Nacionalidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;

public class DaoCliente extends Conexion {

    public boolean agregar(Cliente c) {
        Connection cnx = getConexion();
        String sql = "INSERT INTO cliente (id_cliente, direccion, nacionalidad, genero, nombre) "
                + "VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);

            pst.setInt(1, c.getId());
            pst.setString(2, c.getDireccion());
            pst.setInt(3, c.getNacionalidad().getId_nacionalidad());
            pst.setInt(4, c.getGenero().getId_genero());
            pst.setString(5, c.getNombre());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error INSERT Cliente -> " + ex);
            mensaje("Error al agregar Cliente", "INSERT ERROR");
        }
        return false;
    }

    public boolean eliminar(int id_cliente) {
        Connection cnx = getConexion();
        String sql = "DELETE FROM cliente WHERE id_cliente = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, id_cliente);

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error DELETE Cliente -> " + ex);
            mensaje("Error al eliminar Cliente", "DELETE ERROR");
        }
        return false;
    }

    public boolean actualizar(Cliente c) {
        Connection cnx = getConexion();
        String sql = "UPDATE cliente SET direccion = ?, nacionalidad = ?, genero = ?, nombre = ? "
                + "WHERE id_cliente = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);

            pst.setString(1, c.getDireccion());
            pst.setInt(2, c.getNacionalidad().getId_nacionalidad());
            pst.setInt(3, c.getGenero().getId_genero());
            pst.setString(4, c.getNombre());
            pst.setInt(5, c.getId());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error UPDATE Cliente -> " + ex);
            mensaje("Error al actualizar Cliente", "UPDATE ERROR");
        }
        return false;
    }

    public boolean consultar_por_id(Cliente c) {
        Connection cnx = getConexion();
        String sql = "SELECT * FROM cliente WHERE id_cliente = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, c.getId());

            ResultSet rst = pst.executeQuery();

            if (rst.next()) {
                c.setId(rst.getInt("id_cliente"));
                c.setDireccion(rst.getString("direccion"));
                c.setNacionalidad(new Nacionalidad(rst.getInt("nacionalidad"), ""));
                c.setGenero(new Genero(rst.getInt("genero"), "c"));
                c.setNombre(rst.getString("nombre"));
                return true;
            }

        } catch (SQLException ex) {
            System.err.println("Error SELECT Cliente -> " + ex);
            mensaje("Error al consultar Cliente", "SELECT ERROR");
        }
        return false;
    }

    public ArrayList<Cliente> listar(int offset, int limit, AtomicInteger resultados) {
        ArrayList<Cliente> lista = new ArrayList<>();

        String sql
                = "SELECT c.id_cliente, c.nombre, c.direccion, "
                + "n.id_nacionalidad, n.nacionalidad, g.id_genero, g.genero, "
                + "COUNT(*) OVER() AS total_registros "
                + "FROM cliente c "
                + "LEFT JOIN nacionalidad n ON c.nacionalidad = n.id_nacionalidad "
                + "LEFT JOIN genero g ON c.genero = g.id_genero "
                + "ORDER BY c.id_cliente "
                + "LIMIT ? OFFSET ?";

        try (Connection cn = getConexion(); PreparedStatement pst = cn.prepareStatement(sql)) {

            pst.setInt(1, limit);
            pst.setInt(2, offset);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("id_cliente"));
                cli.setNombre(rs.getString("nombre"));
                cli.setDireccion(rs.getString("direccion"));
                cli.setGenero(new Genero(rs.getInt("id_genero"), rs.getString("genero")));

                Nacionalidad nac = new Nacionalidad();
                nac.setId_nacionalidad(rs.getInt("id_nacionalidad"));
                nac.setNacionalidad(rs.getString("nacionalidad"));
                cli.setNacionalidad(nac);

                Genero gen = new Genero();
                gen.setId_genero(rs.getInt("id_genero"));
                gen.setGenero(rs.getString("genero"));
                cli.setGenero(gen);

                lista.add(cli);
                resultados.set(rs.getInt("total_registros"));
            }

        } catch (SQLException e) {
            System.err.println("Error SELECT Clientes: " + e.getMessage());
        }
        return lista;
    }

    public String[] ControladorMasServiciosCliente() {
        Connection cnx = getConexion();
        String stc = "SELECT * FROM vista_cliente_mas_servicios";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            ResultSet rst = pst.executeQuery();

            if (rst.next()) {
                return new String[]{
                    rst.getString("id_cliente"),
                    rst.getString("nombre"),
                    rst.getString("total_servicios")
                };
            }

        } catch (SQLException ex) {
            System.err.println("Error consultando la vista -> " + ex);
        }

        return null;
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}

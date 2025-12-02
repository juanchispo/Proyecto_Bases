package Modelo.Dao;

import Modelo.Conductor;
import Modelo.Genero;
import Modelo.Nacionalidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;

public class DaoConductor extends Conexion {

    // AGREGAR → INSERT
    public boolean agregar(Conductor c) {
        Connection cnx = getConexion();
        String stc = "INSERT INTO Conductor (id_conductor, direccion, fotografia, nacionalidad, genero, nombre) "
                + "VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, c.getId());
            pst.setString(2, c.getDireccion());
            pst.setString(3, c.getFotografia());
            pst.setInt(4, c.getNacionalidad().getId_nacionalidad());
            pst.setInt(5, c.getGenero().getId_genero());
            pst.setString(6, c.getNombre());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el INSERT -> " + ex);
            mensaje("Error al ejecutar el INSERT", "Agregar!!!");
        }
        return false;
    }

    // ELIMINAR → DELETE
    public boolean eliminar(int idConductor) {
        Connection cnx = getConexion();
        String stc = "DELETE FROM Conductor WHERE id_conductor = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, idConductor);

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el DELETE -> " + ex);
            mensaje("Error al ejecutar el DELETE", "Eliminar!!!");
        }
        return false;
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(Conductor c) {
        Connection cnx = getConexion();
        String stc = "UPDATE Conductor SET direccion = ?, fotografia = ?, nacionalidad = ?, genero = ?, nombre = ? "
                + "WHERE id_conductor = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setString(1, c.getDireccion());
            pst.setString(2, c.getFotografia());
            pst.setInt(3, c.getNacionalidad().getId_nacionalidad());
            pst.setInt(4, c.getGenero().getId_genero());
            pst.setString(5, c.getNombre());
            pst.setInt(6, c.getId());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el UPDATE -> " + ex);
            mensaje("Error al ejecutar el UPDATE", "Actualizar!!!");
        }
        return false;
    }

    // CONSULTAR → SELECT
    public boolean consultar(Conductor c) {
        Connection cnx = getConexion();
        String stc = "SELECT * FROM Conductor WHERE id_conductor = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, c.getId());

            ResultSet rst = pst.executeQuery();

            if (rst.next()) {
                c.setId(rst.getInt("id_conductor"));
                c.setDireccion(rst.getString("direccion"));
                c.setFotografia(rst.getString("fotografia"));
                c.setNacionalidad(new Nacionalidad(Integer.valueOf(rst.getString("nacionalidad")), ""));
                c.setGenero(new Genero(rst.getInt("genero"), ""));
                c.setNombre(rst.getString("nombre"));
                return true;
            }

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el SELECT -> " + ex);
            mensaje("Error al ejecutar el SELECT", "Consultar!!!");
        }
        return false;
    }

    public ArrayList<Conductor> listar(int offset, int limit, AtomicInteger resultados) {
        ArrayList<Conductor> lista = new ArrayList<>();

        String sql
                = "SELECT c.id_conductor, c.nombre, c.direccion, c.fotografia, "
                + "n.id_nacionalidad, n.nacionalidad, g.id_genero, g.genero, "
                + "COUNT(*) OVER() AS total_registros "
                + "FROM conductor c "
                + "LEFT JOIN nacionalidad n ON c.nacionalidad = n.id_nacionalidad "
                + "LEFT JOIN genero g ON c.genero = g.id_genero "
                + "ORDER BY c.id_conductor "
                + "LIMIT ? OFFSET ?";

        try (Connection cn = getConexion(); PreparedStatement pst = cn.prepareStatement(sql)) {

            pst.setInt(1, limit);
            pst.setInt(2, offset);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Conductor con = new Conductor();
                con.setId(rs.getInt("id_conductor"));
                con.setNombre(rs.getString("nombre"));
                con.setDireccion(rs.getString("direccion"));
                con.setGenero(new Genero(rs.getInt("id_genero"), rs.getString("genero")));

                Nacionalidad nac = new Nacionalidad();
                nac.setId_nacionalidad(rs.getInt("id_nacionalidad"));
                nac.setNacionalidad(rs.getString("nacionalidad"));
                con.setNacionalidad(nac);

                Genero gen = new Genero();
                gen.setId_genero(rs.getInt("id_genero"));
                gen.setGenero(rs.getString("genero"));
                con.setGenero(gen);

                lista.add(con);
                resultados.set(rs.getInt("total_registros"));
            }

        } catch (SQLException e) {
            System.err.println("Error SELECT Conductor: " + e.getMessage());
        }
        return lista;
    }

    public String[] conductorMasServiciosVista() {
        Connection cnx = getConexion();
        String stc = "SELECT * FROM vista_conductor_mas_servicios";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            ResultSet rst = pst.executeQuery();

            if (rst.next()) {
                return new String[]{
                    rst.getString("id_conductor"),
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

package Modelo_Uber;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DaoCliente extends Conexion {

    // AGREGAR → INSERT
    public boolean agregar(Cliente c) {
        Connection cnx = getConexion();
        String sql = "INSERT INTO cliente (id_cliente, direccion, nacionalidad, genero, nombre) "
                   + "VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);

            pst.setInt(1, c.getId_cliente());
            pst.setString(2, c.getDireccion());
            pst.setString(3, c.getNacionalidad());
            pst.setString(4, c.getGenero());
            pst.setString(5, c.getNombre());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error INSERT Cliente -> " + ex);
            mensaje("Error al agregar Cliente", "INSERT ERROR");
        }
        return false;
    }

    // ELIMINAR → DELETE
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

    // ACTUALIZAR → UPDATE
    public boolean actualizar(Cliente c) {
        Connection cnx = getConexion();
        String sql = "UPDATE cliente SET direccion = ?, nacionalidad = ?, genero = ?, nombre = ? "
                   + "WHERE id_cliente = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);

            pst.setString(1, c.getDireccion());
            pst.setString(2, c.getNacionalidad());
            pst.setString(3, c.getGenero());
            pst.setString(4, c.getNombre());
            pst.setInt(5, c.getId_cliente());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error UPDATE Cliente -> " + ex);
            mensaje("Error al actualizar Cliente", "UPDATE ERROR");
        }
        return false;
    }

    // CONSULTAR → SELECT
    public boolean consultar(Cliente c) {
        Connection cnx = getConexion();
        String sql = "SELECT * FROM cliente WHERE id_cliente = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, c.getId_cliente());

            ResultSet rst = pst.executeQuery();

            if (rst.next()) {
                c.setId_cliente(rst.getInt("id_cliente"));
                c.setDireccion(rst.getString("direccion"));
                c.setNacionalidad(rst.getString("nacionalidad"));
                c.setGenero(rst.getString("genero"));
                c.setNombre(rst.getString("nombre"));
                return true;
            }

        } catch (SQLException ex) {
            System.err.println("Error SELECT Cliente -> " + ex);
            mensaje("Error al consultar Cliente", "SELECT ERROR");
        }
        return false;
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}

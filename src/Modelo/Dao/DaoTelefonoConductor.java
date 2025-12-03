package Modelo.Dao;

import Modelo.Conductor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoTelefonoConductor {

    private final Conexion conn = new Conexion();

    // AGREGAR → INSERT
    public boolean agregar(int id_conductor, String telefono) {
        Connection cnx = null;
        String sql = "INSERT INTO telefonoconductor (id_conductor, telefono) VALUES (?, ?)";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {
                pst.setInt(1, id_conductor);
                pst.setString(2, telefono);

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error INSERT TelefonoConductor -> " + ex);
            mensaje("Error al agregar TelefonoConductor", "INSERT ERROR");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // ELIMINAR → DELETE
    public boolean eliminar(int id_conductor, String telefono) {
        Connection cnx = null;
        String sql = "DELETE FROM telefonoconductor WHERE id_conductor = ? AND telefono = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {
                pst.setInt(1, id_conductor);
                pst.setString(2, telefono);
                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error DELETE TelefonoConductor -> " + ex);
            mensaje("Error al eliminar TelefonoConductor", "DELETE ERROR");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(int id_conductor, String telefonoNuevo, String telefonoAntiguo) {
        Connection cnx = null;
        String sql = "UPDATE telefonoconductor SET telefono = ? WHERE id_conductor = ? AND telefono = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {
                pst.setString(1, telefonoNuevo);
                pst.setInt(2, id_conductor);
                pst.setString(3, telefonoAntiguo);

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error UPDATE TelefonoConductor -> " + ex);
            mensaje("Error al actualizar TelefonoConductor", "UPDATE ERROR");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // CONSULTAR → SELECT
    public ArrayList<String> consultar(Conductor conductor) {
        Connection cnx = null;
        String sql = "SELECT telefono FROM telefonoconductor WHERE id_conductor = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {
                pst.setInt(1, conductor.getId());

                try (ResultSet rst = pst.executeQuery()) {

                    while (rst.next()) {
                        // Se asume que conductor.getTelefonos() retorna un ArrayList<String>
                        conductor.getTelefonos().add(rst.getString("telefono"));
                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error SELECT TelefonoConductor -> " + ex);
            mensaje("Error al consultar TelefonoConductor", "SELECT ERROR");
        } finally {
            conn.cerrarConexion(cnx);
        }
        // Se corrige el tipo de retorno para ser explícito (ArrayList<String>)
        return conductor.getTelefonos();
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}
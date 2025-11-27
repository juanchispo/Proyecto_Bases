package Modelo_Uber;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DaoTelefonoConductor extends Conexion {

    // AGREGAR → INSERT
    public boolean agregar(TelefonoConductor t) {
        Connection cnx = getConexion();
        String stc = "INSERT INTO TelefonoConductor (id_conductor, telefono) VALUES (?, ?)";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setString(1, t.getId_conductor());
            pst.setString(2, t.getTelefono());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el INSERT -> " + ex);
            mensaje("Error al ejecutar el INSERT", "Agregar!!!");
        }
        return false;
    }

    // ELIMINAR → DELETE
    public boolean eliminar(TelefonoConductor t) {
        Connection cnx = getConexion();
        String stc = "DELETE FROM TelefonoConductor WHERE id_conductor = ? AND telefono = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setString(1, t.getId_conductor());
            pst.setString(2, t.getTelefono());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el DELETE -> " + ex);
            mensaje("Error al ejecutar el DELETE", "Eliminar!!!");
        }
        return false;
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(TelefonoConductor t, String nuevoTelefono) {
        Connection cnx = getConexion();
        String stc = "UPDATE TelefonoConductor SET telefono = ? "
                   + "WHERE id_conductor = ? AND telefono = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setString(1, nuevoTelefono);
            pst.setString(2, t.getId_conductor());
            pst.setString(3, t.getTelefono());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el UPDATE -> " + ex);
            mensaje("Error al ejecutar el UPDATE", "Actualizar!!!");
        }
        return false;
    }

    // CONSULTAR → SELECT
    public boolean consultar(TelefonoConductor t) {
        Connection cnx = getConexion();
        String stc = "SELECT * FROM TelefonoConductor WHERE id_conductor = ? AND telefono = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setString(1, t.getId_conductor());
            pst.setString(2, t.getTelefono());

            ResultSet rst = pst.executeQuery();

            if (rst.next()) {
                t.setId_conductor(rst.getString("id_conductor"));
                t.setTelefono(rst.getString("telefono"));
                return true;
            }

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el SELECT -> " + ex);
            mensaje("Error al ejecutar el SELECT", "Consultar!!!");
        }
        return false;
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}

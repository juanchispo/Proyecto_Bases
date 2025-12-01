package Modelo.Dao;

import Modelo.Conductor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class DaoTelefonoConductor extends Conexion {

    // AGREGAR → INSERT
    public boolean agregar(int id_conductor, String telefono) {
        Connection cnx = getConexion();
        String sql = "INSERT INTO telefonoconductor (id_conductor, telefono) VALUES (?, ?)";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, id_conductor);
            pst.setString(2, telefono);

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error INSERT TelefonoConductor -> " + ex);
            mensaje("Error al agregar TelefonoConductor", "INSERT ERROR");
        }
        return false;
    }

    // ELIMINAR → DELETE
    public boolean eliminar(int id_conductor, String telefono) {
        Connection cnx = getConexion();
        String sql = "DELETE FROM telefonoconductor WHERE id_conductor = ? AND telefono = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, id_conductor);
            pst.setString(2, telefono);
            pst.executeUpdate();
            System.out.println(pst.toString());
            return true;

        } catch (SQLException ex) {
            System.err.println("Error DELETE TelefonoConductor -> " + ex);
            mensaje("Error al eliminar TelefonoConductor", "DELETE ERROR");
        }
        return false;
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(int id_conductor, String telefonoNuevo, String telefonoAntiguo) {
        Connection cnx = getConexion();
        String sql = "UPDATE telefonoconductor SET telefono = ? WHERE id_conductor = ? AND telefono = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setString(1, telefonoNuevo);
            pst.setInt(2, id_conductor);
            pst.setString(3, telefonoAntiguo);

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error UPDATE TelefonoConductor -> " + ex);
            mensaje("Error al actualizar TelefonoConductor", "UPDATE ERROR");
        }
        return false;
    }

    // CONSULTAR → SELECT
    public ArrayList consultar(Conductor conductor) {
        Connection cnx = getConexion();
        String sql = "SELECT * FROM telefonoconductor WHERE id_conductor = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, conductor.getId());

            ResultSet rst = pst.executeQuery();

            while (rst.next()) {
                conductor.setId(rst.getInt("id_conductor"));
                conductor.getTelefonos().add(rst.getString("telefono"));
            }

        } catch (SQLException ex) {
            System.err.println("Error SELECT TelefonoConductor -> " + ex);
            mensaje("Error al consultar TelefonoConductor", "SELECT ERROR");
        }
        return conductor.getTelefonos();
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}

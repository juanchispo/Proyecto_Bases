package Modelo_Uber;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DaoTipoServicio extends Conexion {

    // AGREGAR → INSERT
    public boolean agregar(TipoServicio ts) {
        Connection cnx = getConexion();
        String stc = "INSERT INTO tipo_servicio (id_conductor, telefono) VALUES (?, ?)";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, ts.getId_conductor());
            pst.setString(2, ts.getTelefono());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el INSERT -> " + ex);
            mensaje("Error al ejecutar el INSERT", "Agregar!!!");
        }
        return false;
    }

    // ELIMINAR → DELETE
    public boolean eliminar(int id_conductor) {
        Connection cnx = getConexion();
        String stc = "DELETE FROM tipo_servicio WHERE id_conductor = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, id_conductor);

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el DELETE -> " + ex);
            mensaje("Error al ejecutar el DELETE", "Eliminar!!!");
        }
        return false;
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(TipoServicio ts) {
        Connection cnx = getConexion();
        String stc = "UPDATE tipo_servicio SET telefono = ? "
                   + "WHERE id_conductor = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setString(1, ts.getTelefono());
            pst.setInt(2, ts.getId_conductor());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el UPDATE -> " + ex);
            mensaje("Error al ejecutar el UPDATE", "Actualizar!!!");
        }
        return false;
    }

    // CONSULTAR → SELECT
    public boolean consultar(TipoServicio ts) {
        Connection cnx = getConexion();
        String stc = "SELECT * FROM tipo_servicio WHERE id_conductor = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, ts.getId_conductor());

            ResultSet rst = pst.executeQuery();

            if (rst.next()) {
                ts.setId_conductor(rst.getInt("id_conductor"));
                ts.setTelefono(rst.getString("telefono"));
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

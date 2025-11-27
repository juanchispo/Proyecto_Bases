package Modelo;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DaoVehiculoConductor extends Conexion {

    // AGREGAR: INSERT correcto
    public boolean agregar(VehiculoConductor vc) {
        Connection cnx = getConexion();
        String stc = "INSERT INTO VehiculoConductor (id_placa, id_conductor) VALUES (?,?)";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, vc.getId_placa());
            pst.setInt(2, vc.getId_conductor());
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el INSERT -> " + ex);
            mensaje("Error al ejecutar el INSERT", "Agregar!!!");
        }
        return false;
    }

    // ELIMINAR: Debe borrar por id_placa E id_conductor
    public boolean eliminar(VehiculoConductor m) {
        Connection cnx = getConexion();
        String stc = "DELETE FROM VehiculoConductor WHERE id_placa = ? AND id_conductor = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, m.getId_placa());
            pst.setInt(2, m.getId_conductor());
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el DELETE -> " + ex);
            mensaje("Error al ejecutar el DELETE", "Eliminar!!!");
        }
        return false;
    }

    // ACTUALIZAR: Actualiza la relación placa-conductor
    public boolean actualizarVehiculoConductor(VehiculoConductor m) {
        Connection cnx = getConexion();
        String stc = "UPDATE VehiculoConductor SET id_conductor = ? WHERE id_placa = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, m.getId_conductor());
            pst.setInt(2, m.getId_placa());
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el UPDATE -> " + ex);
            mensaje("Error al ejecutar el UPDATE", "Actualizar!!!");
        }
        return false;
    }

    // CONSULTAR: Consulta la relación por id_placa
    public boolean consultar(VehiculoConductor m) {
        Connection cnx = getConexion();
        String stc = "SELECT * FROM VehiculoConductor WHERE id_placa = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, m.getId_placa());

            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                m.setId_placa(rst.getInt("id_placa"));
                m.setId_conductor(rst.getInt("id_conductor"));
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

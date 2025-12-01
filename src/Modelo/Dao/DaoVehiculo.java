package Modelo.Dao;

import Modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DaoVehiculo extends Conexion {

    // AGREGAR → INSERT
    public boolean agregar(Vehiculo v) {
        Connection cnx = getConexion();
        String stc = "INSERT INTO Vehiculo (placa, modelo, marca, tipo_servicio) "
                   + "VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, v.getPlaca());
            pst.setString(2, v.getModelo());
            pst.setString(3, v.getMarca());
            pst.setString(4, v.getTipo_servicio());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el INSERT -> " + ex);
            mensaje("Error al ejecutar el INSERT", "Agregar!!!");
        }
        return false;
    }

    // ELIMINAR → DELETE
    public boolean eliminar(int placa) {
        Connection cnx = getConexion();
        String stc = "DELETE FROM Vehiculo WHERE placa = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, placa);

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el DELETE -> " + ex);
            mensaje("Error al ejecutar el DELETE", "Eliminar!!!");
        }
        return false;
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(Vehiculo v) {
        Connection cnx = getConexion();
        String stc = "UPDATE Vehiculo SET modelo = ?, marca = ?, tipo_servicio = ? "
                   + "WHERE placa = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setString(1, v.getModelo());
            pst.setString(2, v.getMarca());
            pst.setString(3, v.getTipo_servicio());
            pst.setInt(4, v.getPlaca());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el UPDATE -> " + ex);
            mensaje("Error al ejecutar el UPDATE", "Actualizar!!!");
        }
        return false;
    }

    // CONSULTAR → SELECT
    public boolean consultar(Vehiculo v) {
        Connection cnx = getConexion();
        String stc = "SELECT * FROM Vehiculo WHERE placa = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, v.getPlaca());

            ResultSet rst = pst.executeQuery();

            if (rst.next()) {
                v.setPlaca(rst.getInt("placa"));
                v.setModelo(rst.getString("modelo"));
                v.setMarca(rst.getString("marca"));
                v.setTipo_servicio(rst.getString("tipo_servicio"));
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

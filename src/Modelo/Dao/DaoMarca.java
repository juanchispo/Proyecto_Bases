package Modelo.Dao;

import Modelo.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DaoMarca extends Conexion {

    // AGREGAR → INSERT
    public boolean agregar(Marca m) {
        Connection cnx = getConexion();
        String stc = "INSERT INTO Marca (id_marca, marca) VALUES (?, ?)";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, m.getId_marca());
            pst.setString(2, m.getMarca());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el INSERT -> " + ex);
            mensaje("Error al ejecutar el INSERT", "Agregar Marca");
        }
        return false;
    }

    // ELIMINAR → DELETE
    public boolean eliminar(int id_marca) {
        Connection cnx = getConexion();
        String stc = "DELETE FROM Marca WHERE id_marca = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, id_marca);

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el DELETE -> " + ex);
            mensaje("Error al ejecutar el DELETE", "Eliminar Marca");
        }
        return false;
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(Marca m) {
        Connection cnx = getConexion();
        String stc = "UPDATE Marca SET marca = ? WHERE id_marca = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setString(1, m.getMarca());
            pst.setInt(2, m.getId_marca());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el UPDATE -> " + ex);
            mensaje("Error al ejecutar el UPDATE", "Actualizar Marca");
        }
        return false;
    }

    // CONSULTAR → SELECT
    public Marca consultar(int id) {
        Connection cnx = getConexion();
        String stc = "SELECT * FROM Marca WHERE id_marca = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(stc);
            pst.setInt(1, id);

            ResultSet rst = pst.executeQuery();
            
            if (rst.next()) {
                Marca marca = new Marca(rst.getInt("id_marca"), rst.getString("marca"));
                return marca;
            }

        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el SELECT -> " + ex);
            mensaje("Error al ejecutar el SELECT", "Consultar Marca");
        }
        return null;
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}

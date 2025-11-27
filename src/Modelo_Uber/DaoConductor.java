package Modelo_Uber;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            pst.setString(4, c.getNacionalidad());
            pst.setString(5, c.getGenero());
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
            pst.setString(3, c.getNacionalidad());
            pst.setString(4, c.getGenero());
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
                c.setNacionalidad(rst.getString("nacionalidad"));
                c.setGenero(rst.getString("genero"));
                c.setNombre(rst.getString("nombre"));
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

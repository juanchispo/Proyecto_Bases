package Modelo.Dao;

import Modelo.TipoServicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DaoTipoServicio {

    private final Conexion conn = new Conexion();

    // AGREGAR → INSERT
    public boolean agregar(TipoServicio ts) {
        Connection cnx = null;
        String stc = "INSERT INTO tiposervicio (id_tipo_servicio, nombre_tipo_servicio) VALUES (?, ?)";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(stc)) {
                pst.setInt(1, ts.getId_servicio());
                pst.setString(2, ts.getNombreServicio());

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el INSERT -> " + ex);
            mensaje("Error al ejecutar el INSERT", "Agregar!!!");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // ELIMINAR → DELETE
    public boolean eliminar(int id_tipo_servicio) {
        Connection cnx = null;
        String stc = "DELETE FROM tiposervicio WHERE id_tipo_servicio = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(stc)) {
                pst.setInt(1, id_tipo_servicio);

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el DELETE -> " + ex);
            mensaje("Error al ejecutar el DELETE", "Eliminar!!!");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(TipoServicio ts) {
        Connection cnx = null;
        String stc = "UPDATE tiposervicio SET nombre_tipo_servicio = ? "
                + "WHERE id_tipo_servicio = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(stc)) {
                pst.setString(1, ts.getNombreServicio());
                pst.setInt(2, ts.getId_servicio());

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el UPDATE -> " + ex);
            mensaje("Error al ejecutar el UPDATE", "Actualizar!!!");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // CONSULTAR → SELECT
    public TipoServicio consultar(int id) {
        Connection cnx = null;
        String stc = "SELECT * FROM tiposervicio WHERE id_tipo_servicio = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(stc)) {
                pst.setInt(1, id);

                try (ResultSet rst = pst.executeQuery()) {
                    if (rst.next()) {
                        TipoServicio t = new TipoServicio(rst.getInt("id_tipo_servicio"), rst.getString("nombre_tipo_servicio"));
                        return t;
                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el SELECT -> " + ex);
            mensaje("Error al ejecutar el SELECT", "Consultar!!!");
        } finally {
            conn.cerrarConexion(cnx);
        }
        return null;
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}
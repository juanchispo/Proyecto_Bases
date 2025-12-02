package Modelo.Dao;

import Modelo.Servicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DaoServicio extends Conexion {

    // AGREGAR → INSERT
    public boolean agregar(Servicio s) {
        Connection cnx = getConexion();
        String sql = "INSERT INTO servicio (id_servicio, valor_servicio, direccion_ori, direccion_des, "
                + "id_conductor, id_cliente, tipo_servicio, medio_pago, tarifa) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);

            pst.setInt(1, s.getId_servicio());
            pst.setDouble(2, s.getValor_servicio());
            pst.setString(3, s.getDireccion_ori());
            pst.setString(4, s.getDireccion_des());
            pst.setInt(5, s.getId_conductor());
            pst.setInt(6, s.getId_cliente());
            pst.setString(7, s.getTipo_servicio());
            pst.setString(8, s.getMedio_pago());
            pst.setString(9, s.getTarifa());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error INSERT Servicio -> " + ex);
            mensaje("Error al agregar Servicio", "INSERT ERROR");
        }
        return false;
    }

    // ELIMINAR → DELETE
    public boolean eliminar(int id_servicio) {
        Connection cnx = getConexion();
        String sql = "DELETE FROM servicio WHERE id_servicio = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, id_servicio);

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error DELETE Servicio -> " + ex);
            mensaje("Error al eliminar Servicio", "DELETE ERROR");
        }
        return false;
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(Servicio s) {
        Connection cnx = getConexion();
        String sql = "UPDATE servicio SET valor_servicio = ?, direccion_ori = ?, direccion_des = ?, "
                + "id_conductor = ?, id_cliente = ?, tipo_servicio = ?, "
                + "medio_pago = ?, tarifa = ? "
                + "WHERE id_servicio = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);

            pst.setDouble(1, s.getValor_servicio());
            pst.setString(2, s.getDireccion_ori());
            pst.setString(3, s.getDireccion_des());
            pst.setInt(4, s.getId_conductor());
            pst.setInt(5, s.getId_cliente());
            pst.setString(6, s.getTipo_servicio());
            pst.setString(7, s.getMedio_pago());
            pst.setString(8, s.getTarifa());
            pst.setInt(9, s.getId_servicio());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error UPDATE Servicio -> " + ex);
            mensaje("Error al actualizar Servicio", "UPDATE ERROR");
        }
        return false;
    }

    // CONSULTAR → SELECT
    public boolean consultar(Servicio s) {
        Connection cnx = getConexion();
        String sql = "SELECT * FROM servicio WHERE id_servicio = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, s.getId_servicio());

            ResultSet rst = pst.executeQuery();

            if (rst.next()) {
                s.setId_servicio(rst.getInt("id_servicio"));
                s.setValor_servicio(rst.getDouble("valor_servicio"));
                s.setDireccion_ori(rst.getString("direccion_ori"));
                s.setDireccion_des(rst.getString("direccion_des"));
                s.setId_conductor(rst.getInt("id_conductor"));
                s.setId_cliente(rst.getInt("id_cliente"));
                s.setTipo_servicio(rst.getString("tipo_servicio"));
                s.setMedio_pago(rst.getString("medio_pago"));
                s.setTarifa(rst.getString("tarifa"));

                return true;
            }

        } catch (SQLException ex) {
            System.err.println("Error SELECT Servicio -> " + ex);
            mensaje("Error al consultar Servicio", "SELECT ERROR");
        }

        return false;
    }

    public String obtenerGananciasUltimoMes() {

        String sql = "SELECT SUM(valor_servicio) AS ganancias "
                + "FROM servicio "
                + "WHERE fecha_servicio >= (CURRENT_DATE - INTERVAL '1 month')";

        try (Connection cnx = getConexion(); PreparedStatement ps = cnx.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                return rs.getString("ganancias"); // puede ser null
            }

        } catch (Exception e) {
            System.out.println("Error al obtener ganancias del último mes: " + e);
        }

        return "0";
    }

    public String[] obtenerMesMasGanancias() {

        String sql
                = "SELECT DATE_FORMAT(fecha_servicio, '%Y-%m') AS mes, "
                + "SUM(valor_servicio) AS total "
                + "FROM servicio "
                + "GROUP BY mes "
                + "ORDER BY total DESC "
                + "LIMIT 1";

        try (Connection cnx = getConexion(); PreparedStatement pst = cnx.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                return new String[]{
                    rs.getString("mes"), 
                    rs.getString("total") 
                };
            }

        } catch (SQLException ex) {
            System.err.println("Error obtenerMesMasGanancias -> " + ex);
        }

        return null;
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}

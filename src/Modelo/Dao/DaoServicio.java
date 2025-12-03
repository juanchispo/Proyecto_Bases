package Modelo.Dao;

import Modelo.Cliente;
import Modelo.Conductor;
import Modelo.MedioPago;
import Modelo.Servicio;
import Modelo.Tarifa;
import Modelo.TipoServicio;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DaoServicio {

    private final Conexion conn = new Conexion();


    // ELIMINAR → DELETE
    public boolean eliminar(int id_servicio) {
        Connection cnx = null;
        String sql = "DELETE FROM servicio WHERE id_servicio = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {
                pst.setInt(1, id_servicio);

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error DELETE Servicio -> " + ex);
            mensaje("Error al eliminar Servicio", "DELETE ERROR");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // ACTUALIZAR → UPDATE
   
    // CONSULTAR → SELECT

    public String obtenerGananciasUltimoMes() {

        String sql = "SELECT SUM(valor_servicio) AS ganancias "
                + "FROM servicio "
                + "WHERE fecha_servicio >= (CURRENT_DATE - INTERVAL '1 month')";

        try (Connection cnx = conn.getConexion(); 
             PreparedStatement ps = cnx.prepareStatement(sql); 
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                // Se utiliza getString aquí ya que la suma puede ser NULL o un valor grande
                return rs.getString("ganancias") != null ? rs.getString("ganancias") : "0";
            }

        } catch (Exception e) {
            System.out.println("Error al obtener ganancias del último mes: " + e);
        }

        return "0";
    }
    

   public ArrayList<Servicio> listar(int offset, int limit, AtomicInteger resultados) {
    ArrayList<Servicio> lista = new ArrayList<>();
    Connection cnx = null;

    String sql
        = "SELECT S.id_servicio, S.valor_servicio, S.direccion_ori, "
        + "S.direccion_des, S.fecha_servicio, S.id_conductor, "
        + "C.nombre AS nombre_conductor, S.id_cliente, CL.nombre AS nombre_cliente, "
        + "S.id_tipo_servicio, TS.nombre_tipo_servicio, "
        + "S.medio_pago AS id_medio_pago, MP.nombre_medio_pago, S.tarifa AS "
        + "id_tarifa, T.nivel AS nivel_tarifa, T.valor_tarifa, COUNT(*) OVER() AS total_registros "
        + "FROM Servicio AS S LEFT JOIN Conductor AS C ON S.id_conductor = C.id_conductor "
        + "LEFT JOIN Cliente AS CL ON S.id_cliente = CL.id_cliente "
        + "LEFT JOIN TipoServicio AS TS ON S.id_tipo_servicio = TS.id_tipo_servicio "
        + "LEFT JOIN MedioPago AS MP ON S.medio_pago = MP.id_medio_pago "
        + "LEFT JOIN Tarifa AS T ON S.tarifa = T.id_tarifa "
        + "ORDER BY S.fecha_servicio DESC, S.id_servicio "
        + "LIMIT ? OFFSET ?";

    try {
        cnx = conn.getConexion();
        try (PreparedStatement pst = cnx.prepareStatement(sql)) {

            pst.setInt(1, limit);
            pst.setInt(2, offset);

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    Servicio serv = new Servicio();
                    serv.setId_servicio(rs.getInt("id_servicio"));
                    serv.setValor_servicio(rs.getDouble("valor_servicio")); // Agregar esta línea
                    serv.setDireccion_des(rs.getString("direccion_des"));
                    serv.setDireccion_ori(rs.getString("direccion_ori"));
                    
                    // Agregar la fecha del servicio
                    java.sql.Timestamp fechaTimestamp = rs.getTimestamp("fecha_servicio");
                    if (fechaTimestamp != null) {
                        serv.setFecha_servicio(new java.util.Date(fechaTimestamp.getTime()));
                    }

                    Cliente cl = new Cliente();
                    cl.setId(rs.getInt("id_cliente"));
                    cl.setNombre(rs.getString("nombre_cliente"));
                    serv.setCliente(cl);

                    Conductor co = new Conductor();
                    co.setId(rs.getInt("id_conductor"));
                    co.setNombre(rs.getString("nombre_conductor"));
                    serv.setConductor(co);

                    TipoServicio tip = new TipoServicio(rs.getInt("id_tipo_servicio"), rs.getString("nombre_tipo_servicio"));
                    serv.setTipo_servicio(tip);

                    MedioPago med = new MedioPago(rs.getInt("id_medio_pago"), rs.getString("nombre_medio_pago"));
                    serv.setMedio_pago(med);

                    Tarifa tar = new Tarifa(rs.getInt("id_tarifa"), rs.getString("nivel_tarifa"), rs.getString("valor_tarifa"));
                    serv.setTarifa(tar);

                    lista.add(serv);
                    resultados.set(rs.getInt("total_registros"));
                }
            }
        }
    } catch (SQLException e) {
        System.err.println("Error SELECT Servicios: " + e.getMessage());
    } finally {
        conn.cerrarConexion(cnx);
    }
    return lista;
}

    public DefaultTableModel obtenerServiciosTableModel(TableModel tb) {
        Connection cnx = null;
        String sql = "SELECT S.id_servicio, C.nombre AS nombre_conductor,"
                + " CL.nombre AS nombre_cliente, S.valor_servicio "
                + "FROM Servicio AS S INNER JOIN Conductor AS C "
                + "ON S.id_conductor = C.id_conductor INNER JOIN Cliente "
                + "AS CL ON S.id_cliente = CL.id_cliente ORDER BY S.fecha_servicio DESC LIMIT 16";

        DefaultTableModel tableModel = (DefaultTableModel) tb;
        PreparedStatement ps = null;
        ResultSet rs = null;

        Vector<String> columnNames = new Vector<>();
        for (int i = 0; i < tableModel.getColumnCount(); i++) {
            columnNames.add(tableModel.getColumnName(i));
        }

        if (columnNames.isEmpty()) {
            columnNames.add("id_servicio");
            columnNames.add("nombre_conductor");
            columnNames.add("nombre_cliente");
            columnNames.add("valor_servicio");
        }

        cnx = conn.getConexion();
        try {
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            Vector<Vector<Object>> data = new Vector<>();

            while (rs.next()) {
                Vector<Object> vector = new Vector<>();

                for (int i = 1; i <= columnCount; i++) {
                    vector.add(rs.getObject(i));
                }
                data.add(vector);
            }

            tableModel = new DefaultTableModel(data, columnNames);

        } catch (SQLException e) {
            System.err.println("Error al obtener el TableModel de servicios: " + e.getMessage());
            e.printStackTrace();
        } finally {
            conn.cerrarConexion(cnx);
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return tableModel;
    }
    
    
    public String[] obtenerMesMasGanancias() {

        String sql
                = "SELECT TO_CHAR(fecha_servicio, 'YYYY-MM') AS mes, "
                + "COALESCE(SUM(valor_servicio), 0) AS total "
                + "FROM servicio "
                + "WHERE fecha_servicio IS NOT NULL "
                + "GROUP BY TO_CHAR(fecha_servicio, 'YYYY-MM') "
                + "ORDER BY total DESC "
                + "LIMIT 1";

        try (Connection cnx = conn.getConexion(); 
             PreparedStatement pst = cnx.prepareStatement(sql); 
             ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                return new String[]{
                    rs.getString("mes"),
                    rs.getString("total")
                };
            }

        } catch (SQLException ex) {
            System.err.println("Error obtenerMesMasGanancias -> " + ex);
        }

        return new String[]{"Sin datos", "0"};
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}
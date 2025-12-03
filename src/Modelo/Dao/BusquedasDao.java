package Modelo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class BusquedasDao {

    private final Conexion conn = new Conexion();

    private JTable generarTabla(ResultSet rs) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSetMetaData meta = rs.getMetaData();

        int columnas = meta.getColumnCount();

        for (int i = 1; i <= columnas; i++) {
            modelo.addColumn(meta.getColumnLabel(i));
        }

        while (rs.next()) {
            Object fila[] = new Object[columnas];
            for (int i = 0; i < columnas; i++) {
                fila[i] = rs.getObject(i + 1);
            }
            modelo.addRow(fila);
        }

        return new JTable(modelo);
    }

    private JTable ejecutarConsulta(String sql, Object... params) {
        JTable tabla = new JTable();
        Connection cn = null;

        try {
            cn = conn.getConexion();
            
            try (PreparedStatement pst = cn.prepareStatement(sql)) { 

                for (int i = 0; i < params.length; i++) {
                    pst.setObject(i + 1, params[i]);
                }

                try (ResultSet rs = pst.executeQuery()) {
                    tabla = generarTabla(rs);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error en consulta -> " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error ejecutando consulta",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            conn.cerrarConexion(cn);
        }

        return tabla;
    }

    public JTable valoresTotalesServicios() {
        String sql = """
            SELECT ts.nombre_tipo_servicio AS nombre_tipo_servicio, t.nivel AS nivel_tarifa,
                    SUM(s.valor_servicio) AS valor_total
            FROM servicio s
            JOIN tiposervicio ts ON s.id_tipo_servicio = ts.id_tipo_servicio
            JOIN tarifa t ON s.tarifa = t.id_tarifa
            GROUP BY nombre_tipo_servicio, nivel_tarifa
            ORDER BY nombre_tipo_servicio, nivel_tarifa
        """;
        return ejecutarConsulta(sql);
    }

    public JTable cantidadServiciosPorMes() {
        String sql = """
            SELECT EXTRACT(MONTH FROM fecha_servicio) AS mes_servicio,
                    ts.nombre_tipo_servicio AS nombre_tipo_servicio,
                    COUNT(*) AS cantidad_servicios
            FROM servicio s
            JOIN tiposervicio ts ON s.id_tipo_servicio = ts.id_tipo_servicio
            GROUP BY mes_servicio, nombre_tipo_servicio
            ORDER BY mes_servicio
        """;
        return ejecutarConsulta(sql);
    }

    public JTable clientesPorPeriodo(String inicio, String fin) {
        String sql = """
            SELECT c.id_cliente AS id_cliente, c.nombre AS nombre_cliente, c.direccion AS direccion_cliente,
                    n.nacionalidad AS nacionalidad, g.genero AS genero,
                    s.fecha_servicio AS fecha_servicio, s.valor_servicio AS valor_servicio
            FROM cliente c
            JOIN servicio s ON c.id_cliente = s.id_cliente
            JOIN nacionalidad n ON c.nacionalidad = n.id_nacionalidad
            JOIN genero g ON c.genero = g.id_genero
            WHERE s.fecha_servicio BETWEEN ? AND ?
            ORDER BY s.valor_servicio DESC
        """;
        return ejecutarConsulta(sql, inicio, fin);
    }

    public JTable valoresPorMedioPago() {
        String sql = """
            SELECT mp.nombre_medio_pago AS nombre_medio_pago,
                    SUM(s.valor_servicio) AS valor_total
            FROM servicio s
            JOIN mediopago mp ON s.medio_pago = mp.id_medio_pago
            GROUP BY nombre_medio_pago
        """;
        return ejecutarConsulta(sql);
    }

    public JTable promedioPorNacionalidad() {
        String sql = """
            SELECT n.nacionalidad AS nacionalidad,
                    AVG(s.valor_servicio) AS promedio_valor_servicio
            FROM cliente c
            JOIN servicio s ON c.id_cliente = s.id_cliente
            JOIN nacionalidad n ON c.nacionalidad = n.id_nacionalidad
            GROUP BY n.nacionalidad
        """;
        return ejecutarConsulta(sql);
    }

    public JTable conductoresPorPeriodo(String inicio, String fin) {
        String sql = """
            SELECT d.id_conductor AS id_conductor, d.nombre AS nombre_conductor, d.direccion AS direccion_conductor,
                    n.nacionalidad AS nacionalidad, g.genero AS genero,
                    s.fecha_servicio AS fecha_servicio, s.valor_servicio AS valor_servicio
            FROM conductor d
            JOIN servicio s ON d.id_conductor = s.id_conductor
            JOIN nacionalidad n ON d.nacionalidad = n.id_nacionalidad
            JOIN genero g ON d.genero = g.id_genero
            WHERE s.fecha_servicio BETWEEN ? AND ?
        """;
        return ejecutarConsulta(sql, inicio, fin);
    }

    public JTable serviciosPorGenero() {
    String sql = """
        SELECT g.genero AS nombre_genero,
               COUNT(*) AS cantidad_servicios
        FROM servicio s
        JOIN cliente c ON s.id_cliente = c.id_cliente
        JOIN genero g ON c.genero = g.id_genero
        JOIN tiposervicio ts ON s.id_tipo_servicio = ts.id_tipo_servicio
        WHERE ts.nombre_tipo_servicio = 'pasajeros'
        GROUP BY nombre_genero
        ORDER BY cantidad_servicios DESC
    """;
    return ejecutarConsulta(sql);
}

    public JTable consultaLibre(String sql) {
        return ejecutarConsulta(sql);
    }
}
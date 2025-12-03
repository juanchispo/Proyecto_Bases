package Modelo.Dao;

import Modelo.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Modelo.VehiculoTipoServicio;
import Modelo.Vehiculo;
import Modelo.TipoServicio;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;

public class DaoVehiculoTipoServicio {

    private final Conexion conexionBD;
    private final DaoVehiculo vehiculoDao;
    private final DaoTipoServicio tipoServicioDao;

    public DaoVehiculoTipoServicio() {
        this.conexionBD = new Conexion();
        this.vehiculoDao = new DaoVehiculo();
        this.tipoServicioDao = new DaoTipoServicio();
    }


    public boolean Insertar(VehiculoTipoServicio vts) {
        Connection con = null;
        String sql = "INSERT INTO VehiculoServicio (id_placa, id_tipo_servicio) VALUES (?, ?)";
        boolean exito = false;

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setString(1, vts.getVehiculo().getPlaca());
                ps.setInt(2, vts.getTipoServicio().getId_servicio());

                exito = ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al insertar Vehiculo-TipoServicio: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con); 
        }
        return exito;
    }

    public ArrayList<VehiculoTipoServicio> ConsultarPorPlaca(String placa) {
        ArrayList<VehiculoTipoServicio> lista = new ArrayList<>();
        Connection con = null;
        String sql = "SELECT id_placa, id_tipo_servicio FROM VehiculoServicio WHERE id_placa = ?";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, placa);

                Vehiculo vehiculoCompleto = vehiculoDao.ConsultarPorId(placa);
                if (vehiculoCompleto == null) {
                    return lista; 
                }

                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        int servicioId = rs.getInt("id_tipo_servicio");

                        TipoServicio servicioCompleto = tipoServicioDao.consultar(servicioId);

                        if (servicioCompleto != null) {
                            VehiculoTipoServicio vts = new VehiculoTipoServicio(vehiculoCompleto, servicioCompleto);
                            lista.add(vts);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al consultar Vehiculo-TipoServicio: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }
        return lista;
    }
    
    public ArrayList<VehiculoTipoServicio> listar(int offset, int limit, AtomicInteger resultados) {
        ArrayList<VehiculoTipoServicio> lista = new ArrayList<>();
        Connection con = null;
        String sql = "SELECT V.placa, V.modelo, M.id_marca, M.marca AS nombre_marca, "
                + "VS.id_tipo_servicio, TS.nombre_tipo_servicio, COUNT(*) OVER() "
                + "AS total_registros FROM Vehiculo AS "
                + "V LEFT JOIN Marca AS M ON V.marca = M.id_marca LEFT JOIN "
                + "VehiculoServicio AS VS ON V.placa = VS.id_placa LEFT JOIN "
                + "TipoServicio AS TS ON VS.id_tipo_servicio = TS.id_tipo_servicio "
                + "ORDER BY V.placa LIMIT ? OFFSET ?";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, limit);
                ps.setInt(2, offset);
                
                
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        int servicioId = rs.getInt("id_tipo_servicio");
                        Marca marca = new Marca(rs.getInt("id_marca"), rs.getString("nombre_marca"));
                        Vehiculo vehiculo = new Vehiculo(rs.getString("placa"), rs.getString("modelo"), marca);
                        TipoServicio servicio = new TipoServicio(rs.getInt("id_tipo_servicio"), rs.getString("nombre_tipo_servicio"));

                        VehiculoTipoServicio vts = new VehiculoTipoServicio(vehiculo, servicio);
                        lista.add(vts);
                        resultados.set(rs.getInt("total_registros"));
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al consultar Vehiculo-TipoServicio: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }
        return lista;
    }
    
    public boolean Eliminar(String placa, int servicioId) {
        Connection con = null;
        String sql = "DELETE FROM VehiculoServicio WHERE id_placa = ? AND id_tipo_servicio = ?";
        boolean exito = false;

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setString(1, placa);
                ps.setInt(2, servicioId);

                exito = ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar relación Vehiculo-TipoServicio: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }
        return exito;
    }

    public boolean Actualizar(VehiculoTipoServicio vtsAnterior, VehiculoTipoServicio vtsNuevo) {
        boolean eliminado = Eliminar(vtsAnterior.getVehiculo().getPlaca(), vtsAnterior.getTipoServicio().getId_servicio());
        if (eliminado) {
            return Insertar(vtsNuevo);
        }
        return false;
    }
    
    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}

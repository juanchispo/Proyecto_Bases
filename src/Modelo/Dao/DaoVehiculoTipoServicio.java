package Modelo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Modelo.VehiculoTipoServicio;
import Modelo.Vehiculo;
import Modelo.TipoServicio;
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

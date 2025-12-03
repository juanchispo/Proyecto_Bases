package Modelo.Dao;

import Modelo.Conductor;
import Modelo.Vehiculo;
import Modelo.VehiculoConductor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class DaoVehiculoConductor {

    private final Conexion conexionBD;
    private final DaoMarca marcaDao;

    public DaoVehiculoConductor() {
        this.conexionBD = new Conexion();
        this.marcaDao = new DaoMarca();
    }

    // Método para crear la relación Vehículo-Conductor
    public boolean asignarVehiculoConductor(VehiculoConductor vc) {
        Connection con = null;
        String sql = "INSERT INTO VehiculoConductor (placa_vehiculo, id_conductor) VALUES (?, ?)";
        boolean exito = false;

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, vc.getVehiculo().getPlaca());
                ps.setInt(2, vc.getConductor().getId());

                exito = ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al asignar vehículo al conductor: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return exito;
    }

    // Método para eliminar la relación Vehículo-Conductor
    public boolean eliminarVehiculoConductor(String placa, int idConductor) {
        Connection con = null;
        String sql = "DELETE FROM VehiculoConductor WHERE placa_vehiculo = ? AND id_conductor = ?";
        boolean exito = false;

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, placa);
                ps.setInt(2, idConductor);

                exito = ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar relación vehículo-conductor: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return exito;
    }

    // Método para obtener vehículos asignados a un conductor
    public DefaultListModel<String> obtenerVehiculosPorConductor(int idConductor) {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        Connection con = null;
        String sql = """
            SELECT v.placa, v.modelo, m.nombre_marca 
            FROM Vehiculo v 
            JOIN VehiculoConductor vc ON v.placa = vc.placa_vehiculo 
            JOIN Marca m ON v.marca = m.id_marca 
            WHERE vc.id_conductor = ? 
            ORDER BY v.placa""";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idConductor);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        String placa = rs.getString("placa");
                        String modeloVehiculo = rs.getString("modelo");
                        String marca = rs.getString("nombre_marca");
                        modelo.addElement(placa + " - " + modeloVehiculo + " (" + marca + ")");
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener vehículos del conductor: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return modelo;
    }

    // Método para verificar si una placa ya está asignada a algún conductor
    public boolean placaYaAsignada(String placa) {
        Connection con = null;
        String sql = "SELECT 1 FROM VehiculoConductor WHERE placa_vehiculo = ?";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, placa);
                ResultSet rs = ps.executeQuery();
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("Error al verificar si placa está asignada: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return false;
    }

    // Método para obtener placas de vehículos NO asignados a ningún conductor
    public DefaultComboBoxModel<String> obtenerPlacasNoAsignadas() {
        DefaultComboBoxModel<String> modeloCombo = new DefaultComboBoxModel<>();
        Connection con = null;
        String sql = """
            SELECT placa FROM Vehiculo 
            WHERE placa NOT IN (SELECT placa_vehiculo FROM VehiculoConductor) 
            ORDER BY placa""";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    modeloCombo.addElement(rs.getString("placa"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al cargar placas no asignadas: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return modeloCombo;
    }

    // Métodos existentes que deben mantenerse...
    public boolean actualizarConductor(int idActual, int idNuevo) {
        Connection con = null;
        String sql = "UPDATE Conductor SET id_conductor = ? WHERE id_conductor = ?";
        boolean exito = false;

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idNuevo);
                ps.setInt(2, idActual);
                exito = ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar ID de conductor: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return exito;
    }

    public HashMap<Integer, String> obtenerConductores() {
        HashMap<Integer, String> mapaConductores = new HashMap<>();
        Connection con = null;
        String sql = "SELECT id_conductor, nombre FROM Conductor ORDER BY nombre";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    mapaConductores.put(
                            rs.getInt("id_conductor"),
                            rs.getString("nombre")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al cargar conductores: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return mapaConductores;
    }

    public DefaultComboBoxModel<String> obtenerPlacasVehiculos() {
        DefaultComboBoxModel<String> modeloCombo = new DefaultComboBoxModel<>();
        Connection con = null;
        String sql = "SELECT placa FROM Vehiculo ORDER BY placa";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    modeloCombo.addElement(rs.getString("placa"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al cargar placas de vehículos: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return modeloCombo;
    }

    public Vehiculo consultarVehiculoPorPlaca(String placa) {
        Vehiculo vehiculo = null;
        Connection con = null;
        String sql = "SELECT placa, modelo, marca FROM Vehiculo WHERE placa = ?";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, placa);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        vehiculo = new Vehiculo();
                        vehiculo.setPlaca(rs.getString("placa"));
                        vehiculo.setModelo(rs.getString("modelo"));
                        int idMarca = rs.getInt("marca");
                        vehiculo.setMarca(new DaoMarca().consultar(idMarca));
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al consultar vehículo por placa: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return vehiculo;
    }

    public String obtenerNombreConductor(int id) {
        String nombre = null;
        Connection con = null;
        String sql = "SELECT nombre FROM Conductor WHERE id_conductor = ?";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    nombre = rs.getString("nombre");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener nombre del conductor: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return nombre;
    }

    public boolean existePlaca(String placa) {
        Connection con = null;
        String sql = "SELECT 1 FROM Vehiculo WHERE placa = ?";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, placa);
                ResultSet rs = ps.executeQuery();
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("Error al verificar placa: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return false;
    }

    public DefaultListModel<String> listarConductores() {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        Connection con = null;
        String sql = "SELECT id_conductor, nombre FROM Conductor ORDER BY nombre ASC";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id_conductor");
                    String nombre = rs.getString("nombre");
                    modelo.addElement(id + " - " + nombre);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al listar conductores: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return modelo;
    }
    // En tu DaoVehiculoConductor, agrega este método:

    public boolean existeRelacionVehiculoConductor(String placa, int idConductor) {
        Connection con = null;
        String sql = "SELECT 1 FROM VehiculoConductor WHERE placa_vehiculo = ? AND id_conductor = ?";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, placa);
                ps.setInt(2, idConductor);
                ResultSet rs = ps.executeQuery();
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("Error al verificar relación vehículo-conductor: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return false;
    }
}

package Modelo.Dao;

import Modelo.Conductor;
import Modelo.Vehiculo;
import Modelo.VehiculoConductor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

                        // Si necesitas cargar la marca completa:
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
    
    public ArrayList<Vehiculo> obtenerVehiculosPorConductor(int idConductor) {
        // Utilizamos List en lugar de DefaultListModel para tener un retorno de datos puro,
        // sin dependencias de la UI (Swing).
        ArrayList<Vehiculo> vehiculosAsociados = new ArrayList<>();
        Connection con = null;
        
        // Consulta SQL para obtener los datos del Vehículo
        // Se une VehiculoConductor con Vehiculo para obtener los datos de la placa
        String sql = "SELECT V.placa, V.modelo, V.marca " +
                     "FROM Vehiculo V " +
                     "JOIN VehiculoConductor VC ON V.placa = VC.placa_vehiculo " +
                     "WHERE VC.id_conductor = ?";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                
                // Establece el parámetro id_conductor
                ps.setInt(1, idConductor);
                
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Vehiculo vehiculo = new Vehiculo();
                        vehiculo.setPlaca(rs.getString("placa"));
                        vehiculo.setModelo(rs.getString("modelo"));
                        
                        // Carga el objeto Marca completo utilizando DaoMarca
                        int idMarca = rs.getInt("marca");
                        // Se asume que this.marcaDao es una instancia válida de DaoMarca.
                        vehiculo.setMarca(this.marcaDao.consultar(idMarca)); 
                        
                        vehiculosAsociados.add(vehiculo);
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener vehículos por conductor: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }

        return vehiculosAsociados;
    }

}

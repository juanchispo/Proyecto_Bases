package Modelo.Dao;

import Modelo.Marca;
import Modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.DefaultComboBoxModel ;
import javax.swing.JOptionPane;

public class DaoVehiculo {

    private final Conexion conexionBD;
    private final DaoMarca marcaDao;

    public DaoVehiculo() {
        this.conexionBD = new Conexion();
        this.marcaDao = new DaoMarca();
    }

    // --- 1. INSERTAR (Crear) ---
    public boolean Insertar(Vehiculo vehiculo) {
        Connection con = null;
        String sql = "INSERT INTO Vehiculo (placa, modelo, marca) VALUES (?, ?, ?)";
        boolean exito = false;

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, vehiculo.getPlaca());
                ps.setString(2, vehiculo.getModelo());
                ps.setInt(3, vehiculo.getMarca().getId_marca());

                exito = ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al insertar vehículo: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }
        return exito;
    }

    // --- 2. CONSULTAR (Listar Todos) ---
    public ArrayList<Vehiculo> listar(int offset, int limit, AtomicInteger resultados) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Connection con = null;
        String sql = "SELECT placa, modelo, marca, COUNT(*) OVER() AS total_registros FROM Vehiculo " + "LIMIT ? OFFSET ?";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, limit);
                ps.setInt(2, offset);

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    int marcaId = rs.getInt("marca");

                    Marca marcaCompleta = marcaDao.consultar(marcaId);

                    Vehiculo v = new Vehiculo();
                    v.setPlaca(rs.getString("placa"));
                    v.setModelo(rs.getString("modelo"));
                    v.setMarca(marcaCompleta);

                    vehiculos.add(v);
                    resultados.set(rs.getInt("total_registros"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al consultar vehículos: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }
        return vehiculos;
    }

    // Método auxiliar (Consultar por Placa)
    public Vehiculo ConsultarPorId(String placa) {
        Vehiculo vehiculo = null;
        Connection con = null;
        String sql = "SELECT placa, modelo, marca FROM Vehiculo WHERE placa = ?";

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setString(1, placa);
                try (ResultSet rs = ps.executeQuery()) {

                    if (rs.next()) {
                        int marcaId = rs.getInt("marca");

                        Marca marcaCompleta = marcaDao.consultar(marcaId);

                        vehiculo = new Vehiculo();
                        vehiculo.setPlaca(rs.getString("placa"));
                        vehiculo.setModelo(rs.getString("modelo"));
                        vehiculo.setMarca(marcaCompleta);
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

    // --- 3. ACTUALIZAR ---
    public boolean Actualizar(Vehiculo vehiculo) {
        Connection con = null;
        String sql = "UPDATE Vehiculo SET modelo = ?, marca = ? WHERE placa = ?";
        boolean exito = false;

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setString(1, vehiculo.getModelo());
                ps.setInt(2, vehiculo.getMarca().getId_marca());
                ps.setString(3, vehiculo.getPlaca());

                exito = ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar vehículo: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }
        return exito;
    }

    // --- 4. ELIMINAR ---
    public boolean Eliminar(String placa) {
        Connection con = null;
        String sql = "DELETE FROM Vehiculo WHERE placa = ?";
        boolean exito = false;

        try {
            con = conexionBD.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setString(1, placa);

                exito = ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar vehículo: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion(con);
        }
        return exito;
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

}

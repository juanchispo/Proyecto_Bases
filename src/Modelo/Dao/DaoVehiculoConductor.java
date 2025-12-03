package Modelo.Dao;

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

    private final Conexion conn = new Conexion();

    // AGREGAR: INSERT correcto
    public boolean agregar(VehiculoConductor vc) {
        Connection cnx = null;
        String stc = "INSERT INTO VehiculoConductor (id_placa, id_conductor) VALUES (?,?)";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(stc)) {
                pst.setInt(1, vc.getId_placa());
                pst.setInt(2, vc.getId_conductor());
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

    // ELIMINAR: Debe borrar por id_placa E id_conductor
    public boolean eliminar(VehiculoConductor m) {
        Connection cnx = null;
        String stc = "DELETE FROM VehiculoConductor WHERE id_placa = ? AND id_conductor = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(stc)) {
                pst.setInt(1, m.getId_placa());
                pst.setInt(2, m.getId_conductor());
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

    // ACTUALIZAR: Actualiza la relación placa-conductor (Asume que id_placa es la clave para la actualización)
    public boolean actualizarVehiculoConductor(VehiculoConductor m) {
        Connection cnx = null;
        String stc = "UPDATE VehiculoConductor SET id_conductor = ? WHERE id_placa = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(stc)) {
                pst.setInt(1, m.getId_conductor());
                pst.setInt(2, m.getId_placa());
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

    // CONSULTAR: Consulta la relación por id_placa
    public boolean consultar(VehiculoConductor m) {
        Connection cnx = null;
        String stc = "SELECT id_placa, id_conductor FROM VehiculoConductor WHERE id_placa = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(stc)) {
                pst.setInt(1, m.getId_placa());

                try (ResultSet rst = pst.executeQuery()) {
                    if (rst.next()) {
                        m.setId_placa(rst.getInt("id_placa"));
                        m.setId_conductor(rst.getInt("id_conductor"));
                        return true;
                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el SELECT -> " + ex);
            mensaje("Error al ejecutar el SELECT", "Consultar!!!");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
        return false;
    }

    public DefaultComboBoxModel<String> obtenerPlacasVehiculos() {
        DefaultComboBoxModel<String> modeloCombo = new DefaultComboBoxModel<>();
        Connection cnx = null;
        String sql = "SELECT placa FROM Vehiculo ORDER BY placa";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement ps = cnx.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    modeloCombo.addElement(rs.getString("placa"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al cargar placas de vehículos: " + e.getMessage());
        } finally {
            conn.cerrarConexion(cnx);
        }

        return modeloCombo;
    }

    public HashMap<Integer, String> obtenerConductores() {
        HashMap<Integer, String> mapaConductores = new HashMap<>();
        Connection con = null;
        String sql = "SELECT id_conductor, nombre FROM Conductor ORDER BY nombre";

        try {
            Connection cnx = conn.getConexion();
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
            conn.cerrarConexion(con);
        }

        return mapaConductores;
    }

    //Consultar id de Conductor
    public DefaultListModel<String> listarConductores() {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        Connection con = null;
        String sql = "SELECT id_conductor, nombre FROM Conductor ORDER BY nombre ASC";

        try {
            Connection cnx = conn.getConexion();
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
            conn.cerrarConexion(con);
        }

        return modelo;
    }

//Consultar por placa
    public DefaultListModel<String> listarPlacasVehiculos() {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        Connection con = null;
        String sql = "SELECT placa FROM Vehiculo ORDER BY placa ASC";

        try {
            Connection cnx = conn.getConexion();
            try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    modelo.addElement(rs.getString("placa"));
                }
            }

        } catch (SQLException e) {
            System.err.println("Error al listar placas de vehículos: " + e.getMessage());
        } finally {
            conn.cerrarConexion(con);
        }

        return modelo;
    }
    
    //actualizar .
    public boolean actualizarConductor(int idActual, int idNuevo) {
    Connection con = null;
    String sql = "UPDATE Conductor SET id_conductor = ? WHERE id_conductor = ?";
    boolean exito = false;

    try {
        Connection cnx = conn.getConexion();
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idNuevo);
            ps.setInt(2, idActual);

            exito = ps.executeUpdate() > 0;
        }
    } catch (SQLException e) {
        System.err.println("Error al actualizar ID de conductor: " + e.getMessage());
    } finally {
        conn.cerrarConexion(con);
    }

    return exito;
}


    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}

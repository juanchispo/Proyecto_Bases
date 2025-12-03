package Modelo.Dao;

import Modelo.Tarifa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class DaoTarifa {

    private final Conexion conn = new Conexion();

    // AGREGAR → INSERT
    public boolean agregar(Tarifa t) {
        Connection cnx = null;
        String sql = "INSERT INTO tarifa (id_tarifa, nivel, valor_tarifa) VALUES (?, ?, ?)";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {
                pst.setInt(1, t.getId_tarifa());
                pst.setString(2, t.getNivel());
                pst.setString(3, t.getValor_tarifa());

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error INSERT Tarifa -> " + ex);
            mensaje("Error al agregar Tarifa", "INSERT ERROR");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // ELIMINAR → DELETE
    public boolean eliminar(int id_tarifa) {
        Connection cnx = null;
        String sql = "DELETE FROM tarifa WHERE id_tarifa = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {
                pst.setInt(1, id_tarifa);

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error DELETE Tarifa -> " + ex);
            mensaje("Error al eliminar Tarifa", "DELETE ERROR");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(Tarifa t) {
        Connection cnx = null;
        String sql = "UPDATE tarifa SET nivel = ?, valor_tarifa = ? WHERE id_tarifa = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {
                pst.setString(1, t.getNivel());
                pst.setString(2, t.getValor_tarifa());
                pst.setInt(3, t.getId_tarifa());

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error UPDATE Tarifa -> " + ex);
            mensaje("Error al actualizar Tarifa", "UPDATE ERROR");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // CONSULTAR → SELECT
    public boolean consultar(Tarifa t) {
        Connection cnx = null;
        String sql = "SELECT * FROM tarifa WHERE id_tarifa = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {
                pst.setInt(1, t.getId_tarifa());

                try (ResultSet rst = pst.executeQuery()) {
                    if (rst.next()) {
                        t.setId_tarifa(rst.getInt("id_tarifa"));
                        t.setNivel(rst.getString("nivel"));
                        t.setValor_tarifa(rst.getString("valor_tarifa"));
                        return true;
                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error SELECT Tarifa -> " + ex);
            mensaje("Error al consultar Tarifa", "SELECT ERROR");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
        return false;
    }

    // LISTAR TODOS → SELECT *
    public ArrayList<Tarifa> listarTodos() {
        ArrayList<Tarifa> lista = new ArrayList<>();
        Connection cnx = null;
        String sql = "SELECT * FROM tarifa";

        try {
            cnx = conn.getConexion();
            // Usando Statement para consultas simples sin parámetros (adaptado a try-with-resources para el cierre automático)
            try (Statement st = cnx.createStatement();
                 ResultSet rs = st.executeQuery(sql)) {

                while (rs.next()) {
                    Tarifa t = new Tarifa(
                            rs.getInt("id_tarifa"),
                            rs.getString("nivel"),
                            rs.getString("valor_tarifa")
                    );
                    lista.add(t);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error LIST Tarifa -> " + ex);
            mensaje("Error al listar Tarifa", "LIST ERROR");
        } finally {
            conn.cerrarConexion(cnx);
        }

        return lista;
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}
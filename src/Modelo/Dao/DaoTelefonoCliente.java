package Modelo.Dao;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoTelefonoCliente {

    private final Conexion conn = new Conexion();

    // AGREGAR → INSERT
    public boolean agregar(int id_cliente, String telefono) {
        Connection cnx = null;
        String sql = "INSERT INTO telefonocliente (id_cliente, telefono) VALUES (?, ?)";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {
                pst.setInt(1, id_cliente);
                pst.setString(2, telefono);

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error INSERT TelefonoCliente -> " + ex);
            mensaje("Error al agregar TelefonoCliente", "INSERT ERROR");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // ELIMINAR → DELETE
    public boolean eliminar(int id_cliente, String telefono) {
        Connection cnx = null;
        String sql = "DELETE FROM telefonocliente WHERE id_cliente = ? AND telefono = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {
                pst.setInt(1, id_cliente);
                pst.setString(2, telefono);
                pst.executeUpdate();
                // Eliminado System.out.println(pst.toString()); por ser depuración
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error DELETE TelefonoCliente -> " + ex);
            mensaje("Error al eliminar TelefonoCliente", "DELETE ERROR");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(int id_cliente, String telefonoNuevo, String telefonoAntiguo) {
        Connection cnx = null;
        String sql = "UPDATE telefonocliente SET telefono = ? WHERE id_cliente = ? AND telefono = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {
                pst.setString(1, telefonoNuevo);
                pst.setInt(2, id_cliente);
                pst.setString(3, telefonoAntiguo);

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error UPDATE TelefonoCliente -> " + ex);
            mensaje("Error al actualizar TelefonoCliente", "UPDATE ERROR");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // CONSULTAR → SELECT
    public ArrayList<String> consultar(Cliente cliente) {
        Connection cnx = null;
        String sql = "SELECT telefono FROM telefonocliente WHERE id_cliente = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {
                pst.setInt(1, cliente.getId());

                try (ResultSet rst = pst.executeQuery()) {
                    // Se asume que cliente.getTelefonos() devuelve o inicializa un ArrayList<String>
                    // que contendrá los resultados.
                    while (rst.next()) {
                        // El ID ya está en el objeto cliente; solo se agrega el teléfono
                        cliente.getTelefonos().add(rst.getString("telefono"));
                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error SELECT TelefonoCliente -> " + ex);
            mensaje("Error al consultar TelefonoCliente", "SELECT ERROR");
        } finally {
            conn.cerrarConexion(cnx);
        }
        
        // Se corrige el tipo de retorno para ser explícito (ArrayList<String>)
        return cliente.getTelefonos();
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}
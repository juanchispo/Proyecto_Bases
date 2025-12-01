package Modelo.Dao;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class DaoTelefonoCliente extends Conexion {

    // AGREGAR → INSERT
    public boolean agregar(int id_cliente, String telefono) {
        Connection cnx = getConexion();
        String sql = "INSERT INTO telefonocliente (id_cliente, telefono) VALUES (?, ?)";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, id_cliente);
            pst.setString(2, telefono);

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error INSERT TelefonoCliente -> " + ex);
            mensaje("Error al agregar TelefonoCliente", "INSERT ERROR");
        }
        return false;
    }

    // ELIMINAR → DELETE
    public boolean eliminar(int id_cliente, String telefono) {
        Connection cnx = getConexion();
        String sql = "DELETE FROM telefonocliente WHERE id_cliente = ? AND telefono = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, id_cliente);
            pst.setString(2, telefono);
            pst.executeUpdate();
            System.out.println(pst.toString());
            return true;

        } catch (SQLException ex) {
            System.err.println("Error DELETE TelefonoCliente -> " + ex);
            mensaje("Error al eliminar TelefonoCliente", "DELETE ERROR");
        }
        return false;
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(int id_cliente, String telefonoNuevo, String telefonoAntiguo) {
        Connection cnx = getConexion();
        String sql = "UPDATE telefonocliente SET telefono = ? WHERE id_cliente = ? AND telefono = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setString(1, telefonoNuevo);
            pst.setInt(2, id_cliente);
            pst.setString(3, telefonoAntiguo);

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error UPDATE TelefonoCliente -> " + ex);
            mensaje("Error al actualizar TelefonoCliente", "UPDATE ERROR");
        }
        return false;
    }

    // CONSULTAR → SELECT
    public ArrayList consultar(Cliente cliente) {
        Connection cnx = getConexion();
        String sql = "SELECT * FROM telefonocliente WHERE id_cliente = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, cliente.getId());

            ResultSet rst = pst.executeQuery();

            while (rst.next()) {
                cliente.setId(rst.getInt("id_cliente"));
                cliente.getTelefonos().add(rst.getString("telefono"));
            }

        } catch (SQLException ex) {
            System.err.println("Error SELECT TelefonoCliente -> " + ex);
            mensaje("Error al consultar TelefonoCliente", "SELECT ERROR");
        }
        return cliente.getTelefonos();
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}

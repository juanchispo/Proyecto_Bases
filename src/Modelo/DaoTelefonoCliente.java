package Modelo;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class DaoTelefonoCliente extends Conexion {

    // AGREGAR → INSERT
    public boolean agregar(TelefonoCliente tc) {
        Connection cnx = getConexion();
        String sql = "INSERT INTO telefono_cliente (id_cliente, telefono) VALUES (?, ?)";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, tc.getId_cliente());
            pst.setString(2, tc.getTelefono());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error INSERT TelefonoCliente -> " + ex);
            mensaje("Error al agregar TelefonoCliente", "INSERT ERROR");
        }
        return false;
    }

    // ELIMINAR → DELETE
    public boolean eliminar(int id_cliente) {
        Connection cnx = getConexion();
        String sql = "DELETE FROM telefono_cliente WHERE id_cliente = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, id_cliente);

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error DELETE TelefonoCliente -> " + ex);
            mensaje("Error al eliminar TelefonoCliente", "DELETE ERROR");
        }
        return false;
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(TelefonoCliente tc) {
        Connection cnx = getConexion();
        String sql = "UPDATE telefono_cliente SET telefono = ? WHERE id_cliente = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setString(1, tc.getTelefono());
            pst.setInt(2, tc.getId_cliente());

            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Error UPDATE TelefonoCliente -> " + ex);
            mensaje("Error al actualizar TelefonoCliente", "UPDATE ERROR");
        }
        return false;
    }

    // CONSULTAR → SELECT
    public boolean consultar(TelefonoCliente tc) {
        Connection cnx = getConexion();
        String sql = "SELECT * FROM telefono_cliente WHERE id_cliente = ?";

        try {
            PreparedStatement pst = cnx.prepareStatement(sql);
            pst.setInt(1, tc.getId_cliente());

            ResultSet rst = pst.executeQuery();

            if (rst.next()) {
                tc.setId_cliente(rst.getInt("id_cliente"));
                tc.setTelefono(rst.getString("telefono"));
                return true;
            }

        } catch (SQLException ex) {
            System.err.println("Error SELECT TelefonoCliente -> " + ex);
            mensaje("Error al consultar TelefonoCliente", "SELECT ERROR");
        }
        return false;
    }

    // LISTAR TODOS → SELECT *
    public ArrayList<TelefonoCliente> listarTodos() {
        ArrayList<TelefonoCliente> lista = new ArrayList<>();
        Connection cnx = getConexion();
        String sql = "SELECT * FROM telefono_cliente";

        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                TelefonoCliente tc = new TelefonoCliente(
                    rs.getInt("id_cliente"),
                    rs.getString("telefono")
                );
                lista.add(tc);
            }

        } catch (SQLException ex) {
            System.err.println("Error LIST TelefonoCliente -> " + ex);
            mensaje("Error al listar TelefonoCliente", "LIST ERROR");
        }

        return lista;
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}

    package Modelo.Dao;

    import Modelo.Cliente;
import Modelo.Genero;
    import Modelo.Genero;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.ArrayList;
    import java.util.concurrent.atomic.AtomicInteger;
    import javax.swing.JOptionPane;

    public class DaoGenero extends Conexion {

    public ArrayList<Genero> listar() {
        ArrayList<Genero> lista = new ArrayList<>();
        
        String sql = 
            "SELECT * FROM genero";

        try (Connection cn = getConexion();
             PreparedStatement pst = cn.prepareStatement(sql)) {

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Genero nac = new Genero();
                nac.setId_genero(rs.getInt("id_genero"));
                nac.setGenero(rs.getString("genero"));
                lista.add(nac);
            }


        } catch (SQLException e) {
            System.err.println("Error SELECT Genero: " + e.getMessage());
        }
        return lista;
    }


        public void mensaje(String msg, String title) {
            JOptionPane.showMessageDialog(null, msg, title, 1);
        }
    }

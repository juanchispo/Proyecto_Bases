    package Modelo.Dao;

    import Modelo.Cliente;
import Modelo.Genero;
    import Modelo.Nacionalidad;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.ArrayList;
    import java.util.concurrent.atomic.AtomicInteger;
    import javax.swing.JOptionPane;

    public class DaoNacionalidad extends Conexion {

    public ArrayList<Nacionalidad> listar() {
        ArrayList<Nacionalidad> lista = new ArrayList<>();
        
        String sql = 
            "SELECT * FROM nacionalidad";

        try (Connection cn = getConexion();
             PreparedStatement pst = cn.prepareStatement(sql)) {

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Nacionalidad nac = new Nacionalidad();
                nac.setId_nacionalidad(rs.getInt("id_nacionalidad"));
                nac.setNacionalidad(rs.getString("nacionalidad"));
                lista.add(nac);
            }


        } catch (SQLException e) {
            System.err.println("Error SELECT Nacionalidad: " + e.getMessage());
        }
        return lista;
    }


        public void mensaje(String msg, String title) {
            JOptionPane.showMessageDialog(null, msg, title, 1);
        }
    }

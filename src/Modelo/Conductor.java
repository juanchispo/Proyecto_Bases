
package Modelo;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Conductor extends Persona{
    private String fotografia;

    public Conductor(String fotografia, int id, String direccion, Nacionalidad nacionalidad, Genero genero, String nombre, ArrayList<String> telefonos) {
        super(id, direccion, nacionalidad, genero, nombre, telefonos);
        this.fotografia = fotografia;
    }

    public Conductor(String fotografia) {
        this.fotografia = fotografia;
    }
    
    public Conductor() {
        this.fotografia = "";
    }
    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }
    

     @Override
    public Object[] getDatos(){
        Object[] datos = new Object[6];
        datos[0] = id;
        datos[1] = new JLabel(new ImageIcon(getClass().getResource("/img/" + fotografia)));
        datos[2] = nombre;
        datos[3] = direccion;
        datos[4] = genero.getGenero();
        datos[5] = nacionalidad.getNacionalidad();
        return datos;
    }

}


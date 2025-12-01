
package Modelo;

import java.util.ArrayList;

public class Cliente extends Persona{

    public Cliente(int id, String direccion, Nacionalidad nacionalidad, Genero genero, String nombre, ArrayList<String> telefonos) {
        super(id, direccion, nacionalidad, genero, nombre, telefonos);
    }
    
    public Cliente() {
        super();
    }    
    
    @Override
    public Object[] getDatos(){
        Object[] datos = new Object[5];
        datos[0] = id;
        datos[1] = nombre;
        datos[2] = direccion;
        datos[3] = genero.getGenero();
        datos[4] = nacionalidad.getNacionalidad();
        return datos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id + ", direccion=" + direccion + ", nacionalidad=" + nacionalidad + ", genero=" + genero + ", nombre=" + nombre + ", telefonos=" + telefonos + '}';
    }

}

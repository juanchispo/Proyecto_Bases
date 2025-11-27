
package Modelo;

public class Cliente {
    private int id_cliente;
    private String direccion;
    private String nacionalidad;
    private String genero;
    private String nombre;

    public Cliente(int id_cliente, String direccion, String nacionalidad, String genero, String nombre) {
        this.id_cliente = id_cliente;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.nombre = nombre;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
  
    
}

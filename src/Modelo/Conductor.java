
package Modelo;

public class Conductor {
    private int id_conductor;
    private String direccion;
    private String fotografia;
    private String Nacionalidad;
    private String genero;
    private String nombre;

    public Conductor(int id_conductor, String direccion, String fotografia, String Nacionalidad, String genero, String nombre) {
        this.id_conductor = id_conductor;
        this.direccion = direccion;
        this.fotografia = fotografia;
        this.Nacionalidad = Nacionalidad;
        this.genero = genero;
        this.nombre = nombre;
    }

    public int getId() {
        return id_conductor;
    }

    public void setId(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
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


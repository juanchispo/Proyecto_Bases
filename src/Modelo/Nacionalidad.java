package Modelo;

/**
 *
 * @author Dyl
 */
public class Nacionalidad {
    private int id_nacionalidad;
    private String nacionalidad;

    public Nacionalidad(int id_nacionalidad, String nacionalidad) {
        this.id_nacionalidad = id_nacionalidad;
        this.nacionalidad = nacionalidad;
    }
    
    public Nacionalidad() {
        this.id_nacionalidad = 0;
        this.nacionalidad = "";
    }

    public int getId_nacionalidad() {
        return id_nacionalidad;
    }

    public void setId_nacionalidad(int id_nacionalidad) {
        this.id_nacionalidad = id_nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
}

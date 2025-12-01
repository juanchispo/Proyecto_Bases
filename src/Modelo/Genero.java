package Modelo;

/**
 *
 * @author Dyl
 */
public class Genero {
    private int id_genero;
    private String genero;

    public Genero(int id_genero, String genero) {
        this.id_genero = id_genero;
        this.genero = genero;
    }

    public Genero() {
        this.id_genero = 0;
        this.genero = "";
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Genero{" + "id_genero=" + id_genero + ", genero=" + genero + '}';
    }
    
    
}

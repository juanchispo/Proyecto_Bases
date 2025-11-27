
package Modelo_Uber;


public class TipoServicio {
    
    private int id_conductor;
    private String telefono;

    public TipoServicio(int id_conductor, String telefono) {
        this.id_conductor = id_conductor;
        this.telefono = telefono;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}

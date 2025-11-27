
package Modelo;


public class TelefonoConductor {
    private String id_conductor;
    private String telefono;

    public TelefonoConductor(String id_conductor, String telefono) {
        this.id_conductor = id_conductor;
        this.telefono = telefono;
    }

    public String getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(String id_conductor) {
        this.id_conductor = id_conductor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}

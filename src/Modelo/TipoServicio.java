
package Modelo;


public class TipoServicio {
    
    private int id_servicio;
    private String nombreServicio;

    public TipoServicio(int id_servicio, String nombreServicio) {
        this.id_servicio = id_servicio;
        this.nombreServicio = nombreServicio;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

  
    
    
}

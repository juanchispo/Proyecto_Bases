package Modelo;

/**
 *
 * @author Dyl
 */
public class VehiculoTipoServicio {
    Vehiculo vehiculo;
    TipoServicio tipoServicio;

    public VehiculoTipoServicio(Vehiculo vehiculo, TipoServicio tipoServicio) {
        this.vehiculo = vehiculo;
        this.tipoServicio = tipoServicio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
    public Object[] getDatos(){
        Object[] datos = vehiculo.getDatos();
        datos[3] = tipoServicio.getNombreServicio();
        return datos;
    }
}

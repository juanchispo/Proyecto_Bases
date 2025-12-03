package Modelo;

public class VehiculoConductor {
    private Vehiculo vehiculo;
    private Conductor conductor;

    public VehiculoConductor(Vehiculo vehiculo, Conductor conductor) {
        this.vehiculo = vehiculo;
        this.conductor = conductor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public int getId_placa() {
        return vehiculo.getId();   
    }

    public int getId_conductor() {
        return conductor.getId();  
    }
}
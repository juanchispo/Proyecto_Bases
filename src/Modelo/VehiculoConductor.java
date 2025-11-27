
package Modelo;


public class VehiculoConductor {
    private int id_placa;
    private int id_conductor;

    public VehiculoConductor(int id_placa, int id_conductor) {
        this.id_placa = id_placa;
        this.id_conductor = id_conductor;
    }

    public int getId_placa() {
        return id_placa;
    }

    public void setId_placa(int id_placa) {
        this.id_placa = id_placa;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }
}

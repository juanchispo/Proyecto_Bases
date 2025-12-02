
package Modelo;

public class Vehiculo {
   private int placa;
   private String modelo;
   private Marca marca;
   private String tipo_servicio;

    public Vehiculo(int placa, String modelo, Marca marca, String tipo_servicio) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo_servicio = tipo_servicio;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

  

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }
   
   
}

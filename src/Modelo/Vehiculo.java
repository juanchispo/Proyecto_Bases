
package Modelo;

public class Vehiculo {
   private String placa;
   private String modelo;
   private Marca marca;

    public Vehiculo(String placa, String modelo, Marca marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Vehiculo() {
        this.placa = "";
        this.modelo = "";
        this.marca = null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
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
   
   
}

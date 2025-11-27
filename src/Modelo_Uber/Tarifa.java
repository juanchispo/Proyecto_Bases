/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_Uber;

/**
 *
 * @author juanc
 */
public class Tarifa {
    
    private int id_tarifa;
    private String nivel;
    private String valor_tarifa;

    public Tarifa(int id_tarifa, String nivel, String valor_tarifa) {
        this.id_tarifa = id_tarifa;
        this.nivel = nivel;
        this.valor_tarifa = valor_tarifa;
    }

    public int getId_tarifa() {
        return id_tarifa;
    }

    public void setId_tarifa(int id_tarifa) {
        this.id_tarifa = id_tarifa;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getValor_tarifa() {
        return valor_tarifa;
    }

    public void setValor_tarifa(String valor_tarifa) {
        this.valor_tarifa = valor_tarifa;
    }
    
    
    
}

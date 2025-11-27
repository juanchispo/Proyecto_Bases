/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_Uber;

/**
 *
 * @author juanc
 */
public class TelefonoCliente {
    private int id_cliente;
    private String telefono;

    public TelefonoCliente(int id_cliente, String telefono) {
        this.id_cliente = id_cliente;
        this.telefono = telefono;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
        
}

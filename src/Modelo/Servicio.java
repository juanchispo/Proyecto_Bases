
package Modelo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Servicio {
    
    private int id_servicio;
    private double valor_servicio;
    private String direccion_ori;
    private String direccion_des;
    private Conductor conductor;
    private Cliente cliente;
    private TipoServicio tipo_servicio;
    private MedioPago medio_pago;
    private Tarifa tarifa;

    public Servicio(int id_servicio, double valor_servicio, String direccion_ori, String direccion_des, Conductor conductor, Cliente cliente, TipoServicio tipo_servicio, MedioPago medio_pago, Tarifa tarifa) {
        this.id_servicio = id_servicio;
        this.valor_servicio = valor_servicio;
        this.direccion_ori = direccion_ori;
        this.direccion_des = direccion_des;
        this.conductor = conductor;
        this.cliente = cliente;
        this.tipo_servicio = tipo_servicio;
        this.medio_pago = medio_pago;
        this.tarifa = tarifa;
    }

   
    public Servicio() {
        this.id_servicio =  0;
        this.valor_servicio = 0;
        this.direccion_ori = "";
        this.direccion_des = "";
        this.conductor = null;
        this.cliente = null;
        this.tipo_servicio = null;
        this.medio_pago = null;
        this.tarifa = null;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public double getValor_servicio() {
        return valor_servicio;
    }

    public void setValor_servicio(double valor_servicio) {
        this.valor_servicio = valor_servicio;
    }

    public String getDireccion_ori() {
        return direccion_ori;
    }

    public void setDireccion_ori(String direccion_ori) {
        this.direccion_ori = direccion_ori;
    }

    public String getDireccion_des() {
        return direccion_des;
    }

    public void setDireccion_des(String direccion_des) {
        this.direccion_des = direccion_des;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    public TipoServicio getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(TipoServicio tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public MedioPago getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(MedioPago medio_pago) {
        this.medio_pago = medio_pago;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    
    public Object[] getDatos(){
        Object[] datos = new Object[6];
        datos[0] = id_servicio;
        datos[1] = tarifa.getValor_tarifa();
        datos[2] = direccion_ori;
        datos[3] = direccion_des;
        datos[4] = conductor.getNombre();
        datos[5] = cliente.getNombre();
        return datos;
    }

}

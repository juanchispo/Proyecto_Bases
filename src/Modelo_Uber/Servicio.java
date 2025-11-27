
package Modelo_Uber;

public class Servicio {
    
    private int id_servicio;
    private double valor_servicio;
    private String direccion_ori;
    private String direccion_des;
    private int id_conductor;
    private int id_cliente;
    private String tipo_servicio;
    private String medio_pago;
    private String tarifa;

    public Servicio(int id_servicio, double valor_servicio, String direccion_ori, String direccion_des, int id_conductor, int id_cliente, String tipo_servicio, String medio_pago, String tarifa) {
        this.id_servicio = id_servicio;
        this.valor_servicio = valor_servicio;
        this.direccion_ori = direccion_ori;
        this.direccion_des = direccion_des;
        this.id_conductor = id_conductor;
        this.id_cliente = id_cliente;
        this.tipo_servicio = tipo_servicio;
        this.medio_pago = medio_pago;
        this.tarifa = tarifa;
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

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public String getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(String medio_pago) {
        this.medio_pago = medio_pago;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }



}

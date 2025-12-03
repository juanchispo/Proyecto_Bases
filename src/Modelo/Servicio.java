package Modelo;

import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Servicio {

    private int id_servicio;
    private double valor_servicio;
    private String direccion_ori;
    private String direccion_des;
    private Date fecha_servicio;
    private Conductor conductor;
    private Cliente cliente;
    private TipoServicio tipo_servicio;
    private MedioPago medio_pago;
    private Tarifa tarifa;

    public Servicio(int id_servicio, double valor_servicio, String direccion_ori,
            String direccion_des, Date fecha_servicio, Conductor conductor,
            Cliente cliente, TipoServicio tipo_servicio, MedioPago medio_pago,
            Tarifa tarifa) {
        this.id_servicio = id_servicio;
        this.valor_servicio = valor_servicio;
        this.direccion_ori = direccion_ori;
        this.direccion_des = direccion_des;
        this.fecha_servicio = fecha_servicio;
        this.conductor = conductor;
        this.cliente = cliente;
        this.tipo_servicio = tipo_servicio;
        this.medio_pago = medio_pago;
        this.tarifa = tarifa;
    }

    // Constructor vacío
    public Servicio() {
        this.id_servicio = 0;
        this.valor_servicio = 0;
        this.direccion_ori = "";
        this.direccion_des = "";
        this.fecha_servicio = new Date();
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

    public Date getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(Date fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
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

    public Object[] getDatosCompletos() {
        Object[] datos = new Object[7]; // 7 columnas para la tabla principal
        datos[0] = id_servicio;
        datos[1] = getFechaFormateada();
        datos[2] = String.format("$%,.2f", valor_servicio);
        datos[3] = direccion_ori;
        datos[4] = direccion_des;
        datos[5] = conductor != null ? conductor.getNombre() : "No asignado";
        datos[6] = cliente != null ? cliente.getNombre() : "No asignado";
        return datos;
    }

    public String getFechaFormateada() {
        if (fecha_servicio != null) {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");
            return sdf.format(fecha_servicio);
        }
        return "";
    }
}

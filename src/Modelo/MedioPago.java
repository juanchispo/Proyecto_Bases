package Modelo;

/**
 *
 * @author Dyl
 */
public class MedioPago {
    int id_medio_pago;
    String nombre_medio_pago;

    public MedioPago(int id_medio_pago, String nombre_medio_pago) {
        this.id_medio_pago = id_medio_pago;
        this.nombre_medio_pago = nombre_medio_pago;
    }

    public int getId_medio_pago() {
        return id_medio_pago;
    }

    public void setId_medio_pago(int id_medio_pago) {
        this.id_medio_pago = id_medio_pago;
    }

    public String getNombre_medio_pago() {
        return nombre_medio_pago;
    }

    public void setNombre_medio_pago(String nombre_medio_pago) {
        this.nombre_medio_pago = nombre_medio_pago;
    }
    
    
}

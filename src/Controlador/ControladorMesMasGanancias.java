package Controlador;

import Modelo.Dao.DaoServicio;
import Vista.IFrmAdministrador;

public class ControladorMesMasGanancias extends Controlador {

    private IFrmAdministrador vista;

    public ControladorMesMasGanancias(IFrmAdministrador vista) {
        this.vista = vista;
    }

    @Override
    public void iniciar() {
        cargarMesMasGanancias();
    }

    private void cargarMesMasGanancias() {

        DaoServicio dao = new DaoServicio();
        String[] datos = dao.obtenerMesMasGanancias(); 

  
        if (datos != null) {
            vista.getTxtRecaudoUMes().setText(
                "Mes: " + datos[0] + "  |  Ganancias: $" + datos[1]
            );
        } else {
            vista.getTxtRecaudoUMes().setText("Sin datos disponibles");
        }
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) { }
}

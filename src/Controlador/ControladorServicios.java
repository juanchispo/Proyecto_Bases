package Controlador;

import Controlador.AddMod.ControladorAddCliente;
import Controlador.AddMod.ControladorModCliente;
import Modelo.Cliente;
import Modelo.Dao.DaoCliente;
import Modelo.Dao.DaoConductor;
import Modelo.Dao.DaoServicio;
import Modelo.Servicio;
import Vista.Crear.IFrmAddModCliente;
import Vista.IFrmAdministrador;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Dyl, juancho
 */
public class ControladorServicios extends ControladorAdministrador{
    private IFrmAdministrador ifrm;
    ArrayList<Servicio> servicios;
    int pgServicios;
    AtomicInteger rsServicios;
    
    public ControladorServicios(IFrmAdministrador ifrm) {
        this.ifrm = ifrm;
        this.rsServicios = new AtomicInteger();
    }
    
    public void actualizarTbServicios(){
        DaoServicio daoS = new DaoServicio();

        servicios = daoS.listar((pgServicios-1)*15, 15, rsServicios); 
        
        Object[][] datos = new Object[servicios.size()][4]; 

        for (int i = 0; i < servicios.size(); i++) {
            datos[i] = servicios.get(i).getDatos();
        }
        llenarTabla(ifrm.getTbServicios().getModel(), datos);
        ifrm.getTxtMostrandoServicios().setText("Mostrando " + pgServicios +" de "+ calcularPaginas(rsServicios, 15));
    }
   
    public void actualizarTbServiPri(){
        DaoServicio daoS = new DaoServicio();
        TableModel tb = ifrm.getTbServRec().getModel();
        tb = daoS.obtenerServiciosTableModel(tb);
        ifrm.getTbServRec().setModel(tb);
    }
    
    @Override
    public void iniciar() {
        actualizarTbServiPri();
        inicializarBotones(ifrm);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource().equals(ifrm.getBtnBuscarCliente())){
   
    }
    }
    
}

package Controlador;

import Controlador.AddMod.ControladorAddCliente;
import Controlador.AddMod.ControladorModCliente;
import Modelo.Cliente;
import Modelo.Dao.DaoCliente;
import Modelo.Dao.DaoConductor;
import Modelo.Dao.DaoServicio;
import Vista.Crear.IFrmAddModCliente;
import Vista.IFrmAdministrador;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dyl, juancho
 */
public class ControladorCliente extends ControladorAdministrador{
    private IFrmAdministrador ifrm;
    ArrayList<Cliente> clientes;
    int pgClientes;
    AtomicInteger rsClientes;
    
    public ControladorCliente(IFrmAdministrador ifrm) {
        this.ifrm = ifrm;
        this.rsClientes = new AtomicInteger();
        this.pgClientes = 0;
    }
    
    public void actualizarTbCliente(){
        DaoCliente daoc = new DaoCliente();
        clientes = daoc.listar((pgClientes-1)*15, 15, rsClientes);
        Object[][] datos = new Object[clientes.size()][5];
        for (int i = 0; i < clientes.size(); i++) {
            datos[i] = clientes.get(i).getDatos();
        }
        llenarTabla(ifrm.getTbClientes().getModel(), datos);
        ifrm.getTxtMostrandoClientes().setText("Mostrando " + pgClientes +" de "+ calcularPaginas(rsClientes, 15));
        
    }
   
    
    @Override
    public void iniciar() {
        inicializarBotones(ifrm);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource().equals(ifrm.getBtnBuscarCliente())){
            actualizarTbCliente();
        } else if (e.getSource().equals(ifrm.getBtnAnteriorCliente())){
            pgClientes = reducirPagina(pgClientes, rsClientes);
            actualizarTbCliente();
        } else if (e.getSource().equals(ifrm.getBtnSiguienteCliente())){
            pgClientes = aumentarPagina(pgClientes, rsClientes);
            actualizarTbCliente();
        } else if (e.getSource().equals(ifrm.getBtnBorrarCliente())){
            int indice = ifrm.getTbClientes().getSelectedRow();
            int confirmacion = JOptionPane.showConfirmDialog(ifrm, 
                    "¿Esta seguro que desea" +
                    "eliminar el cliente de id " +
                    String.valueOf(ifrm.getTbClientes().getValueAt(indice, 0)) +
                    " y de nombre " +
                    String.valueOf(ifrm.getTbClientes().getValueAt(indice, 1)) + 
                    "?"
            , "Confirmacion para eliminar Cliente", 0);
            if (confirmacion == 0) {
            DaoCliente daoc = new DaoCliente();
            boolean eliminar = daoc.eliminar(Integer.parseInt(String.valueOf(ifrm.getTbClientes().getValueAt(indice, 0))));
            String msg = eliminar ? "Eliminado correctamente." : "Error al eliminar.";
            ctrlP.frm.getLblAvisos().setText("Aviso -> "+ msg);
            actualizarTbCliente();
            }
        } else if (e.getSource().equals(ifrm.getBtnTelefonosCliente())){
            Cliente c = clientes.get(ifrm.getTbClientes().getSelectedRow());
            telefonos(c);
        } else if (e.getSource().equals(ifrm.getBtnEditarCliente())){
            int index = ifrm.getTbClientes().getSelectedRow();
            IFrmAddModCliente ifrmR = new IFrmAddModCliente();
            ControladorModCliente contC = new ControladorModCliente(ifrmR, ctrlP, clientes.get(index));
            contC.iniciar(); 
            actualizarTbCliente();
        } else if (e.getSource().equals(ifrm.getBtnCrearCliente())){
            IFrmAddModCliente ifrmR = new IFrmAddModCliente();
            ControladorAddCliente contC = new ControladorAddCliente(ifrmR, ctrlP);
            contC.iniciar(); 
        }
    }
    
}

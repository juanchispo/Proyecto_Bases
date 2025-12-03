/*
 * Controlador para IFrmAdministrador
 */
package Controlador;

import java.lang.Math;
import Modelo.Cliente;
import Vista.IFrmAdministrador;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Modelo.Dao.*;
import Modelo.Persona;
import Controlador.ControladorPrincipal;
import Modelo.Conductor;
import Modelo.Genero;
import Modelo.Nacionalidad;
import Modelo.Vehiculo;
import Modelo.VehiculoTipoServicio;
import Modelo.imagenes.ImgTabla;
import Vista.Crear.IFrmAddModCliente;
import Vista.Crear.IFrmAddModConductor;
import Vista.Crear.IFrmTelefonos;
import java.awt.Container;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dyl
 */
public class ControladorAdministrador extends Controlador{
    IFrmAdministrador ifrm;
    ControladorPrincipal ctrlP;
    ArrayList<Cliente> clientes;
    ArrayList<Conductor> conductores;
    ArrayList<Vehiculo> vehiculos;
    int pgClientes, pgConductores, pgVehiculos, pgServicios, pgBA;
    AtomicInteger rsClientes, rsConductores, rsVehiculos, rsServicios, rsBA;

    public ControladorAdministrador(ControladorPrincipal ctrlP,IFrmAdministrador ifrm, ArrayList<Cliente> clientes, ArrayList<Vehiculo> vehiculos, int pgClientes, int pgConductores, int pgVehiculos, int pgServicios, int pgBA, AtomicInteger rsClientes, AtomicInteger rsConductores, AtomicInteger rsVehiculos, AtomicInteger rsServicios, AtomicInteger rsBA) {
        this.ctrlP = ctrlP;
        this.ifrm = ifrm;
        this.clientes = clientes;
        this.vehiculos = vehiculos;
        this.pgClientes = pgClientes;
        this.pgConductores = pgConductores;
        this.pgVehiculos = pgVehiculos;
        this.pgServicios = pgServicios;
        this.pgBA = pgBA;
        this.rsClientes = rsClientes;
        this.rsConductores = rsConductores;
        this.rsVehiculos = rsVehiculos;
        this.rsServicios = rsServicios;
        this.rsBA = rsBA;
    }
    
    public void imagenesTabla(){
        
    }
    
    public ControladorAdministrador(ControladorPrincipal ctrlP, IFrmAdministrador ifrm) {
        this.ctrlP = ctrlP;
        this.ifrm = ifrm;
        this.clientes = new ArrayList<>();
        this.conductores = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.pgClientes = 1;
        this.pgConductores = 1;
        this.pgVehiculos = 1;
        this.pgServicios = 1;
        this.pgBA = 1;
        this.rsClientes = new AtomicInteger();
        this.rsConductores = new AtomicInteger();
        this.rsVehiculos = new AtomicInteger();
        this.rsServicios = new AtomicInteger();
        this.rsBA = new AtomicInteger();
    }
    
    public ControladorAdministrador() {
        this.ifrm = new IFrmAdministrador();
        this.clientes = new ArrayList<>();
        this.conductores = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.pgClientes = 1;
        this.pgConductores = 1;
        this.pgVehiculos = 1;
        this.pgServicios = 1;
        this.pgBA = 1;
        this.rsClientes = new AtomicInteger();
        this.rsConductores = new AtomicInteger();
        this.rsVehiculos = new AtomicInteger();
        this.rsServicios = new AtomicInteger();
        this.rsBA = new AtomicInteger();
    }
    
    public void llenarTabla(TableModel tbM, Object[][] datos) {
        ((DefaultTableModel) tbM).setRowCount(0);
        for (Object[] dato : datos) {
            ((DefaultTableModel)tbM).addRow(dato);
        }
    }
    
    public int calcularPaginas(AtomicInteger num, int div){
        return Math.ceilDiv(num.get(), div);
    }

    public void actualizarTablas(){
        Conexion con = new Conexion();
        if (con.getConexion() == null) {
            ctrlP.frm.getLblAvisos().setText("AVISO -> Fallo la conexion con la Base de Datos.");
        }else{
            ctrlP.frm.getLblAvisos().setText("AVISO -> Conexion exitosa con la Base de Datos.");
            actualizarTbCliente();
            actualizarTbConductores();
            actualizarTbVehiculos();
        }
    }

    public void actualizarTbVehiculos(){
        DaoVehiculo daoV = new DaoVehiculo();
        DaoVehiculoTipoServicio daoVTS = new DaoVehiculoTipoServicio();

        vehiculos = daoV.ConsultarTodos(); 

        rsVehiculos.set(vehiculos.size()); 

        Object[][] datos = new Object[vehiculos.size()][4]; 

        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);

            ArrayList<VehiculoTipoServicio> servicios = daoVTS.ConsultarPorPlaca(v.getPlaca());

            StringBuilder sbServicios = new StringBuilder();
            for (VehiculoTipoServicio vts : servicios) {
                sbServicios.append(vts.getTipoServicio().getNombreServicio()).append(", ");
            }
            String serviciosStr = (sbServicios.length() > 0) ? 
                                  sbServicios.substring(0, sbServicios.length() - 2) : 
                                  "N/A";

            datos[i][0] = v.getPlaca();
            datos[i][1] = v.getModelo();
            datos[i][2] = v.getMarca().getMarca(); 
            datos[i][3] = serviciosStr; 
        }

        llenarTabla(ifrm.getTbVehiculos().getModel(), datos);
        ifrm.getTxtMostrandoVehiculos().setText("Mostrando " + pgVehiculos +" de "+ calcularPaginas(rsVehiculos, 15)); // Asumo getTxtMostrandoVehiculos()
    }

    
    @Override
    public void iniciar() {        
        inicializarBotones(ifrm);
        actualizarTablas();
        ifrm.getTbConductores().setDefaultRenderer(Object.class, new ImgTabla());
        ifrm.getTbConductores().setRowHeight(100);
        ifrm.setVisible(true);
    }
    
    
    public int reducirPagina(int pg, AtomicInteger rs){
        if (pg > 1) {
            pg --;
            ctrlP.getFrm().getLblAvisos().setText("");
        } else ctrlP.getFrm().getLblAvisos().setText("AVISO -> No hay mas paginas anteriores.");
        return pg;
    }
    
    public int aumentarPagina(int pg, AtomicInteger rs){
        if (calcularPaginas(rs, 15) > pg){
            pg ++;          
            ctrlP.getFrm().getLblAvisos().setText("");
        } else ctrlP.getFrm().getLblAvisos().setText("AVISO -> No hay mas paginas siguientes.");
        return pg;
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
    public void actualizarTbConductores(){
        DaoConductor daoc = new DaoConductor();
        conductores = daoc.listar((pgConductores-1)*15, 15, rsConductores);
        Object[][] datos = new Object[conductores.size()][5];
        for (int i = 0; i < conductores.size(); i++) {
            datos[i] = conductores.get(i).getDatos();
        }
        llenarTabla(ifrm.getTbConductores().getModel(), datos);
        ifrm.getTxtMostrandoConductor().setText("Mostrando " + pgConductores +" de "+ calcularPaginas(rsConductores, 15));
        
    }

    
    private void telefonos(Persona p){
        IFrmTelefonos ifrmR = new IFrmTelefonos();
        ControladorTelefonos contR = new ControladorTelefonos(ifrmR, ctrlP, p);
        contR.iniciar();        
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
        } else if (e.getSource().equals(ifrm.getBtnBuscarConductor())){
            actualizarTbCliente();
        } else if (e.getSource().equals(ifrm.getBtnAnteriorConductor())){
            pgConductores = reducirPagina(pgConductores, rsConductores);
            actualizarTbConductores();
        } else if (e.getSource().equals(ifrm.getBtnSiguienteConductor())){
            pgConductores = aumentarPagina(pgConductores, rsConductores);
            actualizarTbConductores();
        } else if (e.getSource().equals(ifrm.getBtnBorrarConductor())){
            int indice = ifrm.getTbConductores().getSelectedRow();
            int confirmacion = JOptionPane.showConfirmDialog(ifrm, 
                    "¿Esta seguro que desea" +
                    "eliminar el cliente de id " +
                    String.valueOf(ifrm.getTbConductores().getValueAt(indice, 0)) +
                    " y de nombre " +
                    String.valueOf(ifrm.getTbConductores().getValueAt(indice, 1)) + 
                    "?"
            , "Confirmacion para eliminar Conductor", 0);
            if (confirmacion == 0) {
            DaoConductor daoc = new DaoConductor();
            boolean eliminar = daoc.eliminar(Integer.parseInt(String.valueOf(ifrm.getTbConductores().getValueAt(indice, 0))));
            String msg = eliminar ? "Eliminado correctamente." : "Error al eliminar.";
            ctrlP.frm.getLblAvisos().setText("Aviso -> "+ msg);
                actualizarTbConductores();
            }
        } else if (e.getSource().equals(ifrm.getBtnTelefonosConductor())){
            Conductor c = conductores.get(ifrm.getTbConductores().getSelectedRow());
            telefonos(c);
        } else if (e.getSource().equals(ifrm.getBtnEditarConductor())){
            int index = ifrm.getTbConductores().getSelectedRow();
            IFrmAddModConductor ifrmR = new IFrmAddModConductor();
            ControladorModConductor contC = new ControladorModConductor(ifrmR, ctrlP, conductores.get(index));
            contC.iniciar(); 
            actualizarTbConductores();
        } else if (e.getSource().equals(ifrm.getBtnCrearConductor())){
            IFrmAddModConductor ifrmR = new IFrmAddModConductor();
            ControladorAddConductor contC = new ControladorAddConductor(ifrmR, ctrlP);
            contC.iniciar(); 
        } else if (e.getSource().equals(ifrm.getBtnBuscarVehiculos())){ // Asumo getBtnBuscarVehiculo()
        actualizarTbVehiculos();
    } else if (e.getSource().equals(ifrm.getBtnAnteriorVehiculosVehiculos())){ // Asumo getBtnAnteriorVehiculo()
        pgVehiculos = reducirPagina(pgVehiculos, rsVehiculos);
        actualizarTbVehiculos();
    } else if (e.getSource().equals(ifrm.getBtnSiguienteVehiculos())){ // Asumo getBtnSiguienteVehiculo()
        pgVehiculos = aumentarPagina(pgVehiculos, rsVehiculos);
        actualizarTbVehiculos();
    } else if (e.getSource().equals(ifrm.getBtnCrearVehiculos())){ // Asumo getBtnCrearVehiculo()
        // NOTA: Debes crear IFrmAddModVehiculo y ControladorAddVehiculo
        // IFrmAddModVehiculo ifrmR = new IFrmAddModVehiculo();
        // ControladorAddVehiculo contV = new ControladorAddVehiculo(ifrmR, ctrlP);
        // contV.iniciar();
        // Simulación:
        ctrlP.frm.getLblAvisos().setText("AVISO -> Iniciar IFrmAddModVehiculo para CREAR.");
        actualizarTbVehiculos();
    } else if (e.getSource().equals(ifrm.getBtnEditarVehiculos())){ // Asumo getBtnEditarVehiculo()
        int index = ifrm.getTbVehiculos().getSelectedRow();
        if (index >= 0) {
            // NOTA: Debes crear IFrmAddModVehiculo y ControladorModVehiculo
            // IFrmAddModVehiculo ifrmR = new IFrmAddModVehiculo();
            // ControladorModVehiculo contV = new ControladorModVehiculo(ifrmR, ctrlP, vehiculos.get(index));
            // contV.iniciar();
            // Simulación:
            ctrlP.frm.getLblAvisos().setText("AVISO -> Iniciar IFrmAddModVehiculo para EDITAR.");
            actualizarTbVehiculos();
        } else {
            ctrlP.frm.getLblAvisos().setText("AVISO -> Seleccione una fila para editar.");
        }
    } else if (e.getSource().equals(ifrm.getBtnBorrarVehiculos())){ 
        int indice = ifrm.getTbVehiculos().getSelectedRow();
        if (indice >= 0) {
            String placa = String.valueOf(ifrm.getTbVehiculos().getValueAt(indice, 0));
            
            int confirmacion = JOptionPane.showConfirmDialog(ifrm, 
                    "¿Está seguro que desea eliminar el vehículo con placa " + placa + "?", 
                    "Confirmación para eliminar Vehículo", 0);
            
            if (confirmacion == 0) {
                DaoVehiculo daoV = new DaoVehiculo();
                boolean eliminado = daoV.Eliminar(placa);
                
                String msg = eliminado ? "Vehículo eliminado correctamente." : "Error al eliminar vehículo.";
                ctrlP.frm.getLblAvisos().setText("Aviso -> " + msg);
                actualizarTbVehiculos();
            }
        } else {
            ctrlP.frm.getLblAvisos().setText("AVISO -> Seleccione una fila para borrar.");
        }
    } 
    }
    
}

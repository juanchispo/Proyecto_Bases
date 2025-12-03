/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Dyl
 */
public class IFrmAdministrador extends javax.swing.JInternalFrame {

    public JSeparator getSeparadorTBA() {
        return SeparadorTBA;
    }

    public void setSeparadorTBA(JSeparator SeparadorTBA) {
        this.SeparadorTBA = SeparadorTBA;
    }

    public JSeparator getSeparadorTCliente() {
        return SeparadorTCliente;
    }

    public void setSeparadorTCliente(JSeparator SeparadorTCliente) {
        this.SeparadorTCliente = SeparadorTCliente;
    }

    public JSeparator getSeparadorTConductor() {
        return SeparadorTConductor;
    }

    public void setSeparadorTConductor(JSeparator SeparadorTConductor) {
        this.SeparadorTConductor = SeparadorTConductor;
    }

    public JSeparator getSeparadorTConfiguracion() {
        return SeparadorTConfiguracion;
    }

    public void setSeparadorTConfiguracion(JSeparator SeparadorTConfiguracion) {
        this.SeparadorTConfiguracion = SeparadorTConfiguracion;
    }

    public JSeparator getSeparadorTPrincipal() {
        return SeparadorTPrincipal;
    }

    public void setSeparadorTPrincipal(JSeparator SeparadorTPrincipal) {
        this.SeparadorTPrincipal = SeparadorTPrincipal;
    }

    public JSeparator getSeparadorTServicios() {
        return SeparadorTServicios;
    }

    public void setSeparadorTServicios(JSeparator SeparadorTServicios) {
        this.SeparadorTServicios = SeparadorTServicios;
    }

    public JSeparator getSeparadorTVehiculos() {
        return SeparadorTVehiculos;
    }

    public void setSeparadorTVehiculos(JSeparator SeparadorTVehiculos) {
        this.SeparadorTVehiculos = SeparadorTVehiculos;
    }

    public JTabbedPane getTabPane() {
        return TabPane;
    }

    public void setTabPane(JTabbedPane TabPane) {
        this.TabPane = TabPane;
    }

    public JButton getBtnAnteriorBA() {
        return btnAnteriorBA;
    }

    public void setBtnAnteriorBA(JButton btnAnteriorBA) {
        this.btnAnteriorBA = btnAnteriorBA;
    }

    public JButton getBtnAnteriorCliente() {
        return btnAnteriorCliente;
    }

    public void setBtnAnteriorCliente(JButton btnAnteriorCliente) {
        this.btnAnteriorCliente = btnAnteriorCliente;
    }

    public JButton getBtnAnteriorConductor() {
        return btnAnteriorConductor;
    }

    public void setBtnAnteriorConductor(JButton btnAnteriorConductor) {
        this.btnAnteriorConductor = btnAnteriorConductor;
    }

    public JButton getBtnAnteriorServicios() {
        return btnAnteriorServicios;
    }

    public void setBtnAnteriorServicios(JButton btnAnteriorServicios) {
        this.btnAnteriorServicios = btnAnteriorServicios;
    }

    public JButton getBtnAnteriorVehiculosVehiculos() {
        return btnAnteriorVehiculosVehiculos;
    }

    public void setBtnAnteriorVehiculosVehiculos(JButton btnAnteriorVehiculosVehiculos) {
        this.btnAnteriorVehiculosVehiculos = btnAnteriorVehiculosVehiculos;
    }

    public JButton getBtnBorrarCliente() {
        return btnBorrarCliente;
    }

    public void setBtnBorrarCliente(JButton btnBorrarCliente) {
        this.btnBorrarCliente = btnBorrarCliente;
    }

    public JButton getBtnBorrarConductor() {
        return btnBorrarConductor;
    }

    public void setBtnBorrarConductor(JButton btnBorrarConductor) {
        this.btnBorrarConductor = btnBorrarConductor;
    }

    public JButton getBtnBorrarServicios() {
        return btnBorrarServicios;
    }

    public void setBtnBorrarServicios(JButton btnBorrarServicios) {
        this.btnBorrarServicios = btnBorrarServicios;
    }

    public JButton getBtnBorrarVehiculos() {
        return btnBorrarVehiculos;
    }

    public void setBtnBorrarVehiculos(JButton btnBorrarVehiculos) {
        this.btnBorrarVehiculos = btnBorrarVehiculos;
    }

    public JButton getBtnBuscarCliente() {
        return btnBuscarCliente;
    }

    public void setBtnBuscarCliente(JButton btnBuscarCliente) {
        this.btnBuscarCliente = btnBuscarCliente;
    }

    public JButton getBtnBuscarConductor() {
        return btnBuscarConductor;
    }

    public void setBtnBuscarConductor(JButton btnBuscarConductor) {
        this.btnBuscarConductor = btnBuscarConductor;
    }

    public JButton getBtnBuscarConductorVehiculo() {
        return btnBuscarConductorVehiculo;
    }

    public void setBtnBuscarConductorVehiculo(JButton btnBuscarConductorVehiculo) {
        this.btnBuscarConductorVehiculo = btnBuscarConductorVehiculo;
    }

    public JButton getBtnBuscarServicios() {
        return btnBuscarServicios;
    }

    public void setBtnBuscarServicios(JButton btnBuscarServicios) {
        this.btnBuscarServicios = btnBuscarServicios;
    }

    public JButton getBtnBuscarUbicacion() {
        return btnBuscarUbicacion;
    }

    public void setBtnBuscarUbicacion(JButton btnBuscarUbicacion) {
        this.btnBuscarUbicacion = btnBuscarUbicacion;
    }

    public JButton getBtnBuscarVehiculos() {
        return btnBuscarVehiculos;
    }

    public void setBtnBuscarVehiculos(JButton btnBuscarVehiculos) {
        this.btnBuscarVehiculos = btnBuscarVehiculos;
    }

    public JButton getBtnCrearCliente() {
        return btnCrearCliente;
    }

    public void setBtnCrearCliente(JButton btnCrearCliente) {
        this.btnCrearCliente = btnCrearCliente;
    }

    public JButton getBtnCrearConductor() {
        return btnCrearConductor;
    }

    public void setBtnCrearConductor(JButton btnCrearConductor) {
        this.btnCrearConductor = btnCrearConductor;
    }

    public JButton getBtnCrearServicios() {
        return btnCrearServicios;
    }

    public void setBtnCrearServicios(JButton btnCrearServicios) {
        this.btnCrearServicios = btnCrearServicios;
    }

    public JButton getBtnCrearVehiculos() {
        return btnCrearVehiculos;
    }

    public void setBtnCrearVehiculos(JButton btnCrearVehiculos) {
        this.btnCrearVehiculos = btnCrearVehiculos;
    }

    public JButton getBtnEditarCliente() {
        return btnEditarCliente;
    }

    public void setBtnEditarCliente(JButton btnEditarCliente) {
        this.btnEditarCliente = btnEditarCliente;
    }

    public JButton getBtnEditarConductor() {
        return btnEditarConductor;
    }

    public void setBtnEditarConductor(JButton btnEditarConductor) {
        this.btnEditarConductor = btnEditarConductor;
    }

    public JButton getBtnEditarServicios() {
        return btnEditarServicios;
    }

    public void setBtnEditarServicios(JButton btnEditarServicios) {
        this.btnEditarServicios = btnEditarServicios;
    }

    public JButton getBtnEditarVehiculos() {
        return btnEditarVehiculos;
    }

    public void setBtnEditarVehiculos(JButton btnEditarVehiculos) {
        this.btnEditarVehiculos = btnEditarVehiculos;
    }

    public JButton getBtnMasDetallesServicios() {
        return btnMasDetallesServicios;
    }

    public void setBtnMasDetallesServicios(JButton btnMasDetallesServicios) {
        this.btnMasDetallesServicios = btnMasDetallesServicios;
    }

    public JButton getBtnSiguienteBA() {
        return btnSiguienteBA;
    }

    public void setBtnSiguienteBA(JButton btnSiguienteBA) {
        this.btnSiguienteBA = btnSiguienteBA;
    }

    public JButton getBtnSiguienteCliente() {
        return btnSiguienteCliente;
    }

    public void setBtnSiguienteCliente(JButton btnSiguienteCliente) {
        this.btnSiguienteCliente = btnSiguienteCliente;
    }

    public JButton getBtnSiguienteConductor() {
        return btnSiguienteConductor;
    }

    public void setBtnSiguienteConductor(JButton btnSiguienteConductor) {
        this.btnSiguienteConductor = btnSiguienteConductor;
    }

    public JButton getBtnSiguienteServicios() {
        return btnSiguienteServicios;
    }

    public void setBtnSiguienteServicios(JButton btnSiguienteServicios) {
        this.btnSiguienteServicios = btnSiguienteServicios;
    }

    public JButton getBtnSiguienteVehiculos() {
        return btnSiguienteVehiculos;
    }

    public void setBtnSiguienteVehiculos(JButton btnSiguienteVehiculos) {
        this.btnSiguienteVehiculos = btnSiguienteVehiculos;
    }

    public JButton getBtnTelefonosBA() {
        return btnBA;
    }

    public void setBtnTelefonosBA(JButton btnTelefonosBA) {
        this.btnBA = btnTelefonosBA;
    }

    public JButton getBtnTelefonosCliente() {
        return btnTelefonosCliente;
    }

    public void setBtnTelefonosCliente(JButton btnTelefonosCliente) {
        this.btnTelefonosCliente = btnTelefonosCliente;
    }

    public JButton getBtnTelefonosConductor() {
        return btnTelefonosConductor;
    }

    public void setBtnTelefonosConductor(JButton btnTelefonosConductor) {
        this.btnTelefonosConductor = btnTelefonosConductor;
    }

    public JButton getBtnVehiculosConductor() {
        return btnVehiculosConductor;
    }

    public void setBtnVehiculosConductor(JButton btnVehiculosConductor) {
        this.btnVehiculosConductor = btnVehiculosConductor;
    }

    public JComboBox<String> getCmbBusquedas() {
        return cmbBusquedas;
    }

    public void setCmbBusquedas(JComboBox<String> cmbBusquedas) {
        this.cmbBusquedas = cmbBusquedas;
    }

    public JLabel getLblBA() {
        return lblBA;
    }

    public void setLblBA(JLabel lblBA) {
        this.lblBA = lblBA;
    }

    public JLabel getLblClienServ() {
        return lblClienServ;
    }

    public void setLblClienServ(JLabel lblClienServ) {
        this.lblClienServ = lblClienServ;
    }

    public JLabel getLblCliente() {
        return lblCliente;
    }

    public void setLblCliente(JLabel lblCliente) {
        this.lblCliente = lblCliente;
    }

    public JLabel getLblConduServ() {
        return lblConduServ;
    }

    public void setLblConduServ(JLabel lblConduServ) {
        this.lblConduServ = lblConduServ;
    }

    public JLabel getLblConductor() {
        return lblConductor;
    }

    public void setLblConductor(JLabel lblConductor) {
        this.lblConductor = lblConductor;
    }

    public JLabel getLblConfiguracion() {
        return lblConfiguracion;
    }

    public void setLblConfiguracion(JLabel lblConfiguracion) {
        this.lblConfiguracion = lblConfiguracion;
    }

    public JLabel getLblGanancias() {
        return lblGanancias;
    }

    public void setLblGanancias(JLabel lblGanancias) {
        this.lblGanancias = lblGanancias;
    }

    public JLabel getLblGananciasAnio() {
        return lblGananciasAnio;
    }

    public void setLblGananciasAnio(JLabel lblGananciasAnio) {
        this.lblGananciasAnio = lblGananciasAnio;
    }

    public JLabel getLblPrincipal() {
        return lblPrincipal;
    }

    public void setLblPrincipal(JLabel lblPrincipal) {
        this.lblPrincipal = lblPrincipal;
    }

    public JLabel getLblRecaudoUMes() {
        return lblRecaudoUMes;
    }

    public void setLblRecaudoUMes(JLabel lblRecaudoUMes) {
        this.lblRecaudoUMes = lblRecaudoUMes;
    }

    public JLabel getLblServRec() {
        return lblServRec;
    }

    public void setLblServRec(JLabel lblServRec) {
        this.lblServRec = lblServRec;
    }

    public JLabel getLblServicios() {
        return lblServicios;
    }

    public void setLblServicios(JLabel lblServicios) {
        this.lblServicios = lblServicios;
    }

    public JLabel getLblUbicacion() {
        return lblUbicacion;
    }

    public void setLblUbicacion(JLabel lblUbicacion) {
        this.lblUbicacion = lblUbicacion;
    }

    public JLabel getLblVehiculos() {
        return lblVehiculos;
    }

    public void setLblVehiculos(JLabel lblVehiculos) {
        this.lblVehiculos = lblVehiculos;
    }

    public JPanel getPnlAdministrador() {
        return pnlAdministrador;
    }

    public void setPnlAdministrador(JPanel pnlAdministrador) {
        this.pnlAdministrador = pnlAdministrador;
    }

    public JPanel getPnlBusquedaAvanzada() {
        return pnlBusquedaAvanzada;
    }

    public void setPnlBusquedaAvanzada(JPanel pnlBusquedaAvanzada) {
        this.pnlBusquedaAvanzada = pnlBusquedaAvanzada;
    }

    public JPanel getPnlClientes() {
        return pnlClientes;
    }

    public void setPnlClientes(JPanel pnlClientes) {
        this.pnlClientes = pnlClientes;
    }

    public JPanel getPnlConductores() {
        return pnlConductores;
    }

    public void setPnlConductores(JPanel pnlConductores) {
        this.pnlConductores = pnlConductores;
    }

    public JPanel getPnlConfiguracion() {
        return pnlConfiguracion;
    }

    public void setPnlConfiguracion(JPanel pnlConfiguracion) {
        this.pnlConfiguracion = pnlConfiguracion;
    }

    public JPanel getPnlGanancias() {
        return pnlGanancias;
    }

    public void setPnlGanancias(JPanel pnlGanancias) {
        this.pnlGanancias = pnlGanancias;
    }

    public JPanel getPnlPrincipal() {
        return pnlPrincipal;
    }

    public void setPnlPrincipal(JPanel pnlPrincipal) {
        this.pnlPrincipal = pnlPrincipal;
    }

    public JPanel getPnlServicios() {
        return pnlServicios;
    }

    public void setPnlServicios(JPanel pnlServicios) {
        this.pnlServicios = pnlServicios;
    }

    public JPanel getPnlVehiculos() {
        return pnlVehiculos;
    }

    public void setPnlVehiculos(JPanel pnlVehiculos) {
        this.pnlVehiculos = pnlVehiculos;
    }

    public JRadioButton getRdbAvanzadas() {
        return rdbAvanzadas;
    }

    public void setRdbAvanzadas(JRadioButton rdbAvanzadas) {
        this.rdbAvanzadas = rdbAvanzadas;
    }

    public JRadioButton getRdbFrecuentes() {
        return rdbFrecuentes;
    }

    public void setRdbFrecuentes(JRadioButton rdbFrecuentes) {
        this.rdbFrecuentes = rdbFrecuentes;
    }

    public JScrollPane getScTablaBA() {
        return scTablaBA;
    }

    public void setScTablaBA(JScrollPane scTablaBA) {
        this.scTablaBA = scTablaBA;
    }

    public JScrollPane getScTablaClienServ() {
        return scTablaClienServ;
    }

    public void setScTablaClienServ(JScrollPane scTablaClienServ) {
        this.scTablaClienServ = scTablaClienServ;
    }

    public JScrollPane getScTablaClientes() {
        return scTablaClientes;
    }

    public void setScTablaClientes(JScrollPane scTablaClientes) {
        this.scTablaClientes = scTablaClientes;
    }

    public JScrollPane getScTablaConduServ() {
        return scTablaConduServ;
    }

    public void setScTablaConduServ(JScrollPane scTablaConduServ) {
        this.scTablaConduServ = scTablaConduServ;
    }

    public JScrollPane getScTablaConductores() {
        return scTablaConductores;
    }

    public void setScTablaConductores(JScrollPane scTablaConductores) {
        this.scTablaConductores = scTablaConductores;
    }

    public JScrollPane getScTablaServRec() {
        return scTablaServRec;
    }

    public void setScTablaServRec(JScrollPane scTablaServRec) {
        this.scTablaServRec = scTablaServRec;
    }

    public JScrollPane getScTablaServicios() {
        return scTablaServicios;
    }

    public void setScTablaServicios(JScrollPane scTablaServicios) {
        this.scTablaServicios = scTablaServicios;
    }

    public JScrollPane getScTablaVehiculos() {
        return scTablaVehiculos;
    }

    public void setScTablaVehiculos(JScrollPane scTablaVehiculos) {
        this.scTablaVehiculos = scTablaVehiculos;
    }

    public JSeparator getSeparadorBA() {
        return separadorBA;
    }

    public void setSeparadorBA(JSeparator separadorBA) {
        this.separadorBA = separadorBA;
    }

    public JSeparator getSeparadorCliente() {
        return separadorCliente;
    }

    public void setSeparadorCliente(JSeparator separadorCliente) {
        this.separadorCliente = separadorCliente;
    }

    public JSeparator getSeparadorConductor() {
        return separadorConductor;
    }

    public void setSeparadorConductor(JSeparator separadorConductor) {
        this.separadorConductor = separadorConductor;
    }

    public JSeparator getSeparadorConfiguracion() {
        return separadorConfiguracion;
    }

    public void setSeparadorConfiguracion(JSeparator separadorConfiguracion) {
        this.separadorConfiguracion = separadorConfiguracion;
    }

    public JSeparator getSeparadorPrincipal() {
        return separadorPrincipal;
    }

    public void setSeparadorPrincipal(JSeparator separadorPrincipal) {
        this.separadorPrincipal = separadorPrincipal;
    }

    public JSeparator getSeparadorServicios() {
        return separadorServicios;
    }

    public void setSeparadorServicios(JSeparator separadorServicios) {
        this.separadorServicios = separadorServicios;
    }

    public JSeparator getSeparadorVehiculos() {
        return separadorVehiculos;
    }

    public void setSeparadorVehiculos(JSeparator separadorVehiculos) {
        this.separadorVehiculos = separadorVehiculos;
    }

    public JTable getTbClienServ() {
        return tbClienServ;
    }

    public void setTbClienServ(JTable tbClienServ) {      
        this.tbClienServ = tbClienServ;       
    }

    public JTable getTbClientes() {
        return tbClientes;
    }

    public void setTbClientes(JTable tbClientes) {
        this.tbClientes = tbClientes;
    }

    public JButton getBtnBA() {
        return btnBA;
    }

    public void setBtnBA(JButton btnBA) {
        this.btnBA = btnBA;
    }

    public JTable getTbConsultas() {
        return tbConsultas;
    }

    public void setTbConsultas(JTable tbConsultas) {
        this.tbConsultas = tbConsultas;
    }



   

    public JTable getTbConduServ() {
        return tbConduServ;
    }

    public void setTbConduServ(JTable tbConduServ) {
        this.tbConduServ = tbConduServ;
    }

    public JTable getTbConductores() {
        return tbConductores;
    }

    public void setTbConductores(JTable tbConductores) {
        this.tbConductores = tbConductores;
    }

    public JTable getTbServRec() {
        return tbServRec;
    }

    public void setTbServRec(JTable tbServRec) {
        this.tbServRec = tbServRec;
    }

    public JTable getTbServicios() {
        return tbServicios;
    }

    public void setTbServicios(JTable tbServicios) {
        this.tbServicios = tbServicios;
    }

    public JTable getTbVehiculos() {
        return tbVehiculos;
    }

    public void setTbVehiculos(JTable tbVehiculos) {
        this.tbVehiculos = tbVehiculos;
    }

    public JTextField getTxtGanaciasAnio() {
        return txtGanaciasAnio;
    }

    public void setTxtGanaciasAnio(JTextField txtGanaciasAnio) {
        this.txtGanaciasAnio = txtGanaciasAnio;
    }

    public JLabel getTxtMostrandoBA() {
        return txtMostrandoBA;
    }

    public void setTxtMostrandoBA(JLabel txtMostrandoBA) {
        this.txtMostrandoBA = txtMostrandoBA;
    }

    public JLabel getTxtMostrandoClientes() {
        return txtMostrandoClientes;
    }

    public void setTxtMostrandoClientes(JLabel txtMostrandoClientes) {
        this.txtMostrandoClientes = txtMostrandoClientes;
    }

    public JLabel getTxtMostrandoConductor() {
        return txtMostrandoConductor;
    }

    public void setTxtMostrandoConductor(JLabel txtMostrandoConductor) {
        this.txtMostrandoConductor = txtMostrandoConductor;
    }

    public JLabel getTxtMostrandoServicios() {
        return txtMostrandoServicios;
    }

    public void setTxtMostrandoServicios(JLabel txtMostrandoServicios) {
        this.txtMostrandoServicios = txtMostrandoServicios;
    }

    public JLabel getTxtMostrandoVehiculos() {
        return txtMostrandoVehiculos;
    }

    public void setTxtMostrandoVehiculos(JLabel txtMostrandoVehiculos) {
        this.txtMostrandoVehiculos = txtMostrandoVehiculos;
    }

    public JTextField getTxtRecaudoUMes() {
        return txtRecaudoUMes;
    }

    public void setTxtRecaudoUMes(JTextField txtRecaudoUMes) {
        this.txtRecaudoUMes = txtRecaudoUMes;
    }

    public JTextField getTxtSQL() {
        return txtSQL;
    }

    public void setTxtSQL(JTextField txtSQL) {
        this.txtSQL = txtSQL;
    }

    public JTextField getTxtUbicacion() {
        return txtUbicacion;
    }

    public void setTxtUbicacion(JTextField txtUbicacion) {
        this.txtUbicacion = txtUbicacion;
    }

   

   


    /**
     * Creates new form IFrmAdministrador
     */
    public IFrmAdministrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAdministrador = new javax.swing.JPanel();
        TabPane = new javax.swing.JTabbedPane();
        pnlPrincipal = new javax.swing.JPanel();
        separadorPrincipal = new javax.swing.JSeparator();
        lblPrincipal = new javax.swing.JLabel();
        SeparadorTPrincipal = new javax.swing.JSeparator();
        scTablaServRec = new javax.swing.JScrollPane();
        tbServRec = new javax.swing.JTable();
        lblServRec = new javax.swing.JLabel();
        lblClienServ = new javax.swing.JLabel();
        scTablaClienServ = new javax.swing.JScrollPane();
        tbClienServ = new javax.swing.JTable();
        scTablaConduServ = new javax.swing.JScrollPane();
        tbConduServ = new javax.swing.JTable();
        lblConduServ = new javax.swing.JLabel();
        pnlGanancias = new javax.swing.JPanel();
        lblGanancias = new javax.swing.JLabel();
        lblRecaudoUMes = new javax.swing.JLabel();
        txtRecaudoUMes = new javax.swing.JTextField();
        lblGananciasAnio = new javax.swing.JLabel();
        txtGanaciasAnio = new javax.swing.JTextField();
        pnlClientes = new javax.swing.JPanel();
        scTablaClientes = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        txtMostrandoClientes = new javax.swing.JLabel();
        btnAnteriorCliente = new javax.swing.JButton();
        btnSiguienteCliente = new javax.swing.JButton();
        separadorCliente = new javax.swing.JSeparator();
        btnBuscarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnBorrarCliente = new javax.swing.JButton();
        btnCrearCliente = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        SeparadorTCliente = new javax.swing.JSeparator();
        btnTelefonosCliente = new javax.swing.JButton();
        pnlConductores = new javax.swing.JPanel();
        scTablaConductores = new javax.swing.JScrollPane();
        tbConductores = new javax.swing.JTable();
        txtMostrandoConductor = new javax.swing.JLabel();
        btnAnteriorConductor = new javax.swing.JButton();
        btnSiguienteConductor = new javax.swing.JButton();
        separadorConductor = new javax.swing.JSeparator();
        btnBuscarConductor = new javax.swing.JButton();
        btnEditarConductor = new javax.swing.JButton();
        btnBorrarConductor = new javax.swing.JButton();
        btnCrearConductor = new javax.swing.JButton();
        lblConductor = new javax.swing.JLabel();
        SeparadorTConductor = new javax.swing.JSeparator();
        btnTelefonosConductor = new javax.swing.JButton();
        btnVehiculosConductor = new javax.swing.JButton();
        pnlVehiculos = new javax.swing.JPanel();
        scTablaVehiculos = new javax.swing.JScrollPane();
        tbVehiculos = new javax.swing.JTable();
        txtMostrandoVehiculos = new javax.swing.JLabel();
        btnAnteriorVehiculosVehiculos = new javax.swing.JButton();
        btnSiguienteVehiculos = new javax.swing.JButton();
        separadorVehiculos = new javax.swing.JSeparator();
        btnBuscarVehiculos = new javax.swing.JButton();
        btnEditarVehiculos = new javax.swing.JButton();
        btnBorrarVehiculos = new javax.swing.JButton();
        btnCrearVehiculos = new javax.swing.JButton();
        lblVehiculos = new javax.swing.JLabel();
        SeparadorTVehiculos = new javax.swing.JSeparator();
        btnBuscarConductorVehiculo = new javax.swing.JButton();
        pnlServicios = new javax.swing.JPanel();
        scTablaServicios = new javax.swing.JScrollPane();
        tbServicios = new javax.swing.JTable();
        txtMostrandoServicios = new javax.swing.JLabel();
        btnAnteriorServicios = new javax.swing.JButton();
        btnSiguienteServicios = new javax.swing.JButton();
        separadorServicios = new javax.swing.JSeparator();
        btnBuscarServicios = new javax.swing.JButton();
        btnEditarServicios = new javax.swing.JButton();
        btnBorrarServicios = new javax.swing.JButton();
        btnCrearServicios = new javax.swing.JButton();
        lblServicios = new javax.swing.JLabel();
        SeparadorTServicios = new javax.swing.JSeparator();
        btnMasDetallesServicios = new javax.swing.JButton();
        pnlBusquedaAvanzada = new javax.swing.JPanel();
        btnAnteriorBA = new javax.swing.JButton();
        btnSiguienteBA = new javax.swing.JButton();
        separadorBA = new javax.swing.JSeparator();
        scTablaBA = new javax.swing.JScrollPane();
        tbConsultas = new javax.swing.JTable();
        lblBA = new javax.swing.JLabel();
        SeparadorTBA = new javax.swing.JSeparator();
        btnBA = new javax.swing.JButton();
        txtMostrandoBA = new javax.swing.JLabel();
        cmbBusquedas = new javax.swing.JComboBox<>();
        rdbFrecuentes = new javax.swing.JRadioButton();
        rdbAvanzadas = new javax.swing.JRadioButton();
        txtSQL = new javax.swing.JTextField();
        pnlConfiguracion = new javax.swing.JPanel();
        separadorConfiguracion = new javax.swing.JSeparator();
        lblConfiguracion = new javax.swing.JLabel();
        SeparadorTConfiguracion = new javax.swing.JSeparator();
        lblUbicacion = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        btnBuscarUbicacion = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("PANEL DE ADMINISTRADOR");

        pnlAdministrador.setBackground(new java.awt.Color(255, 255, 255));

        TabPane.setBackground(new java.awt.Color(81, 107, 122));
        TabPane.setForeground(new java.awt.Color(255, 255, 255));
        TabPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        TabPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        TabPane.setFocusable(false);
        TabPane.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        separadorPrincipal.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblPrincipal.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        lblPrincipal.setText("Principal");

        tbServRec.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        tbServRec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Conductor", "Cliente", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scTablaServRec.setViewportView(tbServRec);

        lblServRec.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblServRec.setText("Servicios Recientes");

        lblClienServ.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblClienServ.setText("Clientes con mas servicios");

        tbClienServ.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        tbClienServ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cant Servicios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scTablaClienServ.setViewportView(tbClienServ);

        tbConduServ.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        tbConduServ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cant Servicios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scTablaConduServ.setViewportView(tbConduServ);

        lblConduServ.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblConduServ.setText("Conductores con mas servicios");

        javax.swing.GroupLayout pnlGananciasLayout = new javax.swing.GroupLayout(pnlGanancias);
        pnlGanancias.setLayout(pnlGananciasLayout);
        pnlGananciasLayout.setHorizontalGroup(
            pnlGananciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlGananciasLayout.setVerticalGroup(
            pnlGananciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblGanancias.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblGanancias.setText("Ganancias");

        lblRecaudoUMes.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblRecaudoUMes.setText("Recaudado el ultimo mes:");

        txtRecaudoUMes.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        txtRecaudoUMes.setText("2.415.035 $");
        txtRecaudoUMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecaudoUMesActionPerformed(evt);
            }
        });

        lblGananciasAnio.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblGananciasAnio.setText("Mes con mas ganancia");

        txtGanaciasAnio.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        txtGanaciasAnio.setText("Marzo");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(separadorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SeparadorTPrincipal)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblServRec, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(scTablaServRec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblClienServ, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblGanancias, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addGap(229, 229, 229))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblConduServ, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scTablaConduServ, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scTablaClienServ, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                        .addComponent(lblGananciasAnio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGanaciasAnio))
                                    .addComponent(pnlGanancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                        .addComponent(lblRecaudoUMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRecaudoUMes)))))
                        .addContainerGap())))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorTPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblServRec)
                            .addComponent(lblClienServ)
                            .addComponent(lblGanancias))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scTablaServRec, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                        .addComponent(scTablaClienServ, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(pnlGanancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRecaudoUMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRecaudoUMes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGananciasAnio)
                                    .addComponent(txtGanaciasAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblConduServ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scTablaConduServ, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(separadorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TabPane.addTab("Panel Principal", pnlPrincipal);

        pnlClientes.setBackground(new java.awt.Color(255, 255, 255));

        scTablaClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        scTablaClientes.setFocusable(false);

        tbClientes.setAutoCreateRowSorter(true);
        tbClientes.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Direccion", "Genero", "Nacionalidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.setToolTipText("");
        tbClientes.setShowGrid(false);
        scTablaClientes.setViewportView(tbClientes);

        txtMostrandoClientes.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        txtMostrandoClientes.setText("Mostrando 1 de 50");

        btnAnteriorCliente.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnAnteriorCliente.setText("Anterior");

        btnSiguienteCliente.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnSiguienteCliente.setText("Siguiente");

        separadorCliente.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnBuscarCliente.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnBuscarCliente.setText("Buscar");

        btnEditarCliente.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnEditarCliente.setText("Editar");

        btnBorrarCliente.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnBorrarCliente.setText("Borrar");

        btnCrearCliente.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnCrearCliente.setText("Crear");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        lblCliente.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        lblCliente.setText("Clientes");

        btnTelefonosCliente.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnTelefonosCliente.setText("Teléfonos");
        btnTelefonosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelefonosClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addComponent(separadorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrearCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTelefonosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlClientesLayout.createSequentialGroup()
                                .addComponent(txtMostrandoClientes)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnteriorCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSiguienteCliente))
                            .addComponent(scTablaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)))
                    .addComponent(SeparadorTCliente))
                .addGap(17, 17, 17))
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTelefonosCliente))
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addComponent(scTablaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMostrandoClientes)
                            .addComponent(btnAnteriorCliente)
                            .addComponent(btnSiguienteCliente))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addComponent(separadorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TabPane.addTab("Clientes", pnlClientes);

        pnlConductores.setBackground(new java.awt.Color(255, 255, 255));

        scTablaConductores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        scTablaConductores.setFocusable(false);

        tbConductores.setAutoCreateRowSorter(true);
        tbConductores.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        tbConductores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Foto", "Nombre", "Direccion", "Genero", "Nacionalidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbConductores.setToolTipText("");
        tbConductores.setShowGrid(false);
        scTablaConductores.setViewportView(tbConductores);

        txtMostrandoConductor.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        txtMostrandoConductor.setText("Mostrando 1 de 50");

        btnAnteriorConductor.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnAnteriorConductor.setText("Anterior");

        btnSiguienteConductor.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnSiguienteConductor.setText("Siguiente");

        separadorConductor.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnBuscarConductor.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnBuscarConductor.setText("Buscar");

        btnEditarConductor.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnEditarConductor.setText("Editar");

        btnBorrarConductor.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnBorrarConductor.setText("Borrar");

        btnCrearConductor.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnCrearConductor.setText("Crear");
        btnCrearConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearConductorActionPerformed(evt);
            }
        });

        lblConductor.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        lblConductor.setText("Conductores");

        btnTelefonosConductor.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnTelefonosConductor.setText("Teléfonos");
        btnTelefonosConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelefonosConductorActionPerformed(evt);
            }
        });

        btnVehiculosConductor.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnVehiculosConductor.setText("Vehiculos");
        btnVehiculosConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculosConductorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConductoresLayout = new javax.swing.GroupLayout(pnlConductores);
        pnlConductores.setLayout(pnlConductoresLayout);
        pnlConductoresLayout.setHorizontalGroup(
            pnlConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConductoresLayout.createSequentialGroup()
                .addComponent(separadorConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConductoresLayout.createSequentialGroup()
                        .addComponent(lblConductor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlConductoresLayout.createSequentialGroup()
                        .addGroup(pnlConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarConductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarConductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrarConductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrearConductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTelefonosConductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVehiculosConductor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlConductoresLayout.createSequentialGroup()
                                .addComponent(txtMostrandoConductor)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnteriorConductor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSiguienteConductor))
                            .addComponent(scTablaConductores, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)))
                    .addComponent(SeparadorTConductor))
                .addGap(17, 17, 17))
        );
        pnlConductoresLayout.setVerticalGroup(
            pnlConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConductoresLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblConductor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorTConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConductoresLayout.createSequentialGroup()
                        .addComponent(btnCrearConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTelefonosConductor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVehiculosConductor))
                    .addGroup(pnlConductoresLayout.createSequentialGroup()
                        .addComponent(scTablaConductores, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMostrandoConductor)
                            .addComponent(btnAnteriorConductor)
                            .addComponent(btnSiguienteConductor))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlConductoresLayout.createSequentialGroup()
                .addComponent(separadorConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TabPane.addTab("Conductores", pnlConductores);

        pnlVehiculos.setBackground(new java.awt.Color(255, 255, 255));

        scTablaVehiculos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        scTablaVehiculos.setFocusable(false);

        tbVehiculos.setAutoCreateRowSorter(true);
        tbVehiculos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        tbVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Placa", "Modelo", "Marca", "Tipo de servicio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVehiculos.setToolTipText("");
        tbVehiculos.setShowGrid(false);
        scTablaVehiculos.setViewportView(tbVehiculos);

        txtMostrandoVehiculos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        txtMostrandoVehiculos.setText("Mostrando 1 de 50");

        btnAnteriorVehiculosVehiculos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnAnteriorVehiculosVehiculos.setText("Anterior");

        btnSiguienteVehiculos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnSiguienteVehiculos.setText("Siguiente");

        separadorVehiculos.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnBuscarVehiculos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnBuscarVehiculos.setText("Buscar");

        btnEditarVehiculos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnEditarVehiculos.setText("Editar");

        btnBorrarVehiculos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnBorrarVehiculos.setText("Borrar");

        btnCrearVehiculos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnCrearVehiculos.setText("Crear");
        btnCrearVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVehiculosActionPerformed(evt);
            }
        });

        lblVehiculos.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        lblVehiculos.setText("Vehículos");

        btnBuscarConductorVehiculo.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnBuscarConductorVehiculo.setText("Conductores");
        btnBuscarConductorVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConductorVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlVehiculosLayout = new javax.swing.GroupLayout(pnlVehiculos);
        pnlVehiculos.setLayout(pnlVehiculosLayout);
        pnlVehiculosLayout.setHorizontalGroup(
            pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVehiculosLayout.createSequentialGroup()
                .addComponent(separadorVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVehiculosLayout.createSequentialGroup()
                        .addComponent(lblVehiculos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlVehiculosLayout.createSequentialGroup()
                        .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrarVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrearVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarConductorVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVehiculosLayout.createSequentialGroup()
                                .addComponent(txtMostrandoVehiculos)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnteriorVehiculosVehiculos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSiguienteVehiculos))
                            .addComponent(scTablaVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)))
                    .addComponent(SeparadorTVehiculos))
                .addGap(17, 17, 17))
        );
        pnlVehiculosLayout.setVerticalGroup(
            pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVehiculosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblVehiculos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorTVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVehiculosLayout.createSequentialGroup()
                        .addComponent(btnCrearVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarConductorVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVehiculosLayout.createSequentialGroup()
                        .addComponent(scTablaVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMostrandoVehiculos)
                            .addComponent(btnAnteriorVehiculosVehiculos)
                            .addComponent(btnSiguienteVehiculos))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlVehiculosLayout.createSequentialGroup()
                .addComponent(separadorVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TabPane.addTab("Vehículos", pnlVehiculos);

        pnlServicios.setBackground(new java.awt.Color(255, 255, 255));

        scTablaServicios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        scTablaServicios.setFocusable(false);

        tbServicios.setAutoCreateRowSorter(true);
        tbServicios.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        tbServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Valor", "Origen", "Destino", "Conductor", "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbServicios.setToolTipText("");
        tbServicios.setShowGrid(false);
        scTablaServicios.setViewportView(tbServicios);

        txtMostrandoServicios.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        txtMostrandoServicios.setText("Mostrando 1 de 50");

        btnAnteriorServicios.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnAnteriorServicios.setText("Anterior");
        btnAnteriorServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorServiciosActionPerformed(evt);
            }
        });

        btnSiguienteServicios.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnSiguienteServicios.setText("Siguiente");

        separadorServicios.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnBuscarServicios.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnBuscarServicios.setText("Buscar");

        btnEditarServicios.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnEditarServicios.setText("Editar");

        btnBorrarServicios.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnBorrarServicios.setText("Borrar");

        btnCrearServicios.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnCrearServicios.setText("Crear");
        btnCrearServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearServiciosActionPerformed(evt);
            }
        });

        lblServicios.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        lblServicios.setText("Servicios");

        btnMasDetallesServicios.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnMasDetallesServicios.setText("Mas Detalles");
        btnMasDetallesServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasDetallesServiciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlServiciosLayout = new javax.swing.GroupLayout(pnlServicios);
        pnlServicios.setLayout(pnlServiciosLayout);
        pnlServiciosLayout.setHorizontalGroup(
            pnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlServiciosLayout.createSequentialGroup()
                .addComponent(separadorServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlServiciosLayout.createSequentialGroup()
                        .addComponent(lblServicios)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlServiciosLayout.createSequentialGroup()
                        .addGroup(pnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrarServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrearServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMasDetallesServicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlServiciosLayout.createSequentialGroup()
                                .addComponent(txtMostrandoServicios)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnteriorServicios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSiguienteServicios))
                            .addComponent(scTablaServicios, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)))
                    .addComponent(SeparadorTServicios))
                .addGap(17, 17, 17))
        );
        pnlServiciosLayout.setVerticalGroup(
            pnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlServiciosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblServicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorTServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlServiciosLayout.createSequentialGroup()
                        .addComponent(btnCrearServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMasDetallesServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlServiciosLayout.createSequentialGroup()
                        .addComponent(scTablaServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMostrandoServicios)
                            .addComponent(btnAnteriorServicios)
                            .addComponent(btnSiguienteServicios))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlServiciosLayout.createSequentialGroup()
                .addComponent(separadorServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TabPane.addTab("Servicios", pnlServicios);

        pnlBusquedaAvanzada.setBackground(new java.awt.Color(255, 255, 255));

        btnAnteriorBA.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnAnteriorBA.setText("Anterior");
        btnAnteriorBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorBAActionPerformed(evt);
            }
        });

        btnSiguienteBA.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnSiguienteBA.setText("Siguiente");

        separadorBA.setOrientation(javax.swing.SwingConstants.VERTICAL);

        scTablaBA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        scTablaBA.setFocusable(false);

        tbConsultas.setAutoCreateRowSorter(true);
        tbConsultas.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        tbConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Direccion", "Genero", "Nacionalidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbConsultas.setToolTipText("");
        tbConsultas.setShowGrid(false);
        scTablaBA.setViewportView(tbConsultas);

        lblBA.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        lblBA.setText("Busqueda Avanzada");

        btnBA.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnBA.setText("Consultar");
        btnBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBAActionPerformed(evt);
            }
        });

        txtMostrandoBA.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        txtMostrandoBA.setText("Mostrando 1 de 50");

        cmbBusquedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Valores totales de los servicios realizados diferenciando si corresponden a transporte de pasajeros o alimentos y la categoría a la que corresponde", "Cantidad de servicios de pasajeros y de alimentos por mes", "Datos de los clientes que han solicitado servicios durante un período de tiempo organizados de mayor a menor", "Valores totales de los servicios de acuerdo con su medio de pago", "Promedio de valor total de servicio de clientes dependiendo la nacionalidad", "Datos de conductores que han realizado servicios durante un periodo", "Cantidad de servicios de pasajeros de un género determinado" }));

        rdbFrecuentes.setText("Busquedas Frecuentes");

        rdbAvanzadas.setText("Consulta Avanzada (SQL)");
        rdbAvanzadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAvanzadasActionPerformed(evt);
            }
        });

        txtSQL.setText("SELECT * FROM empleados");

        javax.swing.GroupLayout pnlBusquedaAvanzadaLayout = new javax.swing.GroupLayout(pnlBusquedaAvanzada);
        pnlBusquedaAvanzada.setLayout(pnlBusquedaAvanzadaLayout);
        pnlBusquedaAvanzadaLayout.setHorizontalGroup(
            pnlBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaAvanzadaLayout.createSequentialGroup()
                .addComponent(separadorBA, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SeparadorTBA)
                    .addGroup(pnlBusquedaAvanzadaLayout.createSequentialGroup()
                        .addComponent(txtMostrandoBA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnteriorBA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguienteBA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(520, 520, 520))
                    .addComponent(lblBA)
                    .addGroup(pnlBusquedaAvanzadaLayout.createSequentialGroup()
                        .addGroup(pnlBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBusquedaAvanzadaLayout.createSequentialGroup()
                                .addComponent(rdbFrecuentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(37, 37, 37))
                            .addComponent(cmbBusquedas, 0, 1, Short.MAX_VALUE))
                        .addGap(239, 239, 239)
                        .addGroup(pnlBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBusquedaAvanzadaLayout.createSequentialGroup()
                                .addComponent(rdbAvanzadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(65, 65, 65))
                            .addComponent(txtSQL))
                        .addGap(161, 161, 161))
                    .addComponent(scTablaBA)
                    .addComponent(btnBA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnlBusquedaAvanzadaLayout.setVerticalGroup(
            pnlBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaAvanzadaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblBA)
                .addGap(18, 18, 18)
                .addComponent(SeparadorTBA, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbFrecuentes)
                    .addComponent(rdbAvanzadas))
                .addGap(7, 7, 7)
                .addGroup(pnlBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBusquedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scTablaBA, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(pnlBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMostrandoBA)
                    .addComponent(btnAnteriorBA)
                    .addComponent(btnSiguienteBA))
                .addGap(15, 15, 15))
            .addGroup(pnlBusquedaAvanzadaLayout.createSequentialGroup()
                .addComponent(separadorBA, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TabPane.addTab("Busqueda Avanzada", pnlBusquedaAvanzada);

        pnlConfiguracion.setBackground(new java.awt.Color(255, 255, 255));

        separadorConfiguracion.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblConfiguracion.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        lblConfiguracion.setText("Configuración");

        lblUbicacion.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblUbicacion.setText("Ubicación base de datos");

        txtUbicacion.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtUbicacion.setText("C:\\Users\\Usuario\\.PgAdmin\\");

            btnBuscarUbicacion.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
            btnBuscarUbicacion.setText("Buscar");

            javax.swing.GroupLayout pnlConfiguracionLayout = new javax.swing.GroupLayout(pnlConfiguracion);
            pnlConfiguracion.setLayout(pnlConfiguracionLayout);
            pnlConfiguracionLayout.setHorizontalGroup(
                pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                    .addComponent(separadorConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                            .addComponent(lblConfiguracion)
                            .addGap(0, 689, Short.MAX_VALUE))
                        .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                            .addComponent(SeparadorTConfiguracion)
                            .addGap(17, 17, 17))
                        .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                            .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUbicacion)
                                .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscarUbicacion)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            );
            pnlConfiguracionLayout.setVerticalGroup(
                pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(lblConfiguracion)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(SeparadorTConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblUbicacion)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarUbicacion))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                    .addComponent(separadorConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            TabPane.addTab("Configuración", pnlConfiguracion);

            javax.swing.GroupLayout pnlAdministradorLayout = new javax.swing.GroupLayout(pnlAdministrador);
            pnlAdministrador.setLayout(pnlAdministradorLayout);
            pnlAdministradorLayout.setHorizontalGroup(
                pnlAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TabPane, javax.swing.GroupLayout.Alignment.TRAILING)
            );
            pnlAdministradorLayout.setVerticalGroup(
                pnlAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAdministradorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(TabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnlAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnTelefonosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelefonosClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTelefonosClienteActionPerformed

    private void btnCrearConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearConductorActionPerformed

    private void btnTelefonosConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelefonosConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTelefonosConductorActionPerformed

    private void btnVehiculosConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculosConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVehiculosConductorActionPerformed

    private void btnCrearVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVehiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearVehiculosActionPerformed

    private void btnBuscarConductorVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConductorVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarConductorVehiculoActionPerformed

    private void btnAnteriorServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorServiciosActionPerformed

    private void btnCrearServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearServiciosActionPerformed

    private void btnMasDetallesServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasDetallesServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMasDetallesServiciosActionPerformed

    private void btnBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBAActionPerformed

    private void rdbAvanzadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAvanzadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbAvanzadasActionPerformed

    private void btnAnteriorBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorBAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorBAActionPerformed

    private void txtRecaudoUMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecaudoUMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecaudoUMesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator SeparadorTBA;
    private javax.swing.JSeparator SeparadorTCliente;
    private javax.swing.JSeparator SeparadorTConductor;
    private javax.swing.JSeparator SeparadorTConfiguracion;
    private javax.swing.JSeparator SeparadorTPrincipal;
    private javax.swing.JSeparator SeparadorTServicios;
    private javax.swing.JSeparator SeparadorTVehiculos;
    private javax.swing.JTabbedPane TabPane;
    private javax.swing.JButton btnAnteriorBA;
    private javax.swing.JButton btnAnteriorCliente;
    private javax.swing.JButton btnAnteriorConductor;
    private javax.swing.JButton btnAnteriorServicios;
    private javax.swing.JButton btnAnteriorVehiculosVehiculos;
    private javax.swing.JButton btnBA;
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnBorrarConductor;
    private javax.swing.JButton btnBorrarServicios;
    private javax.swing.JButton btnBorrarVehiculos;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarConductor;
    private javax.swing.JButton btnBuscarConductorVehiculo;
    private javax.swing.JButton btnBuscarServicios;
    private javax.swing.JButton btnBuscarUbicacion;
    private javax.swing.JButton btnBuscarVehiculos;
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnCrearConductor;
    private javax.swing.JButton btnCrearServicios;
    private javax.swing.JButton btnCrearVehiculos;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarConductor;
    private javax.swing.JButton btnEditarServicios;
    private javax.swing.JButton btnEditarVehiculos;
    private javax.swing.JButton btnMasDetallesServicios;
    private javax.swing.JButton btnSiguienteBA;
    private javax.swing.JButton btnSiguienteCliente;
    private javax.swing.JButton btnSiguienteConductor;
    private javax.swing.JButton btnSiguienteServicios;
    private javax.swing.JButton btnSiguienteVehiculos;
    private javax.swing.JButton btnTelefonosCliente;
    private javax.swing.JButton btnTelefonosConductor;
    private javax.swing.JButton btnVehiculosConductor;
    private javax.swing.JComboBox<String> cmbBusquedas;
    private javax.swing.JLabel lblBA;
    private javax.swing.JLabel lblClienServ;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblConduServ;
    private javax.swing.JLabel lblConductor;
    private javax.swing.JLabel lblConfiguracion;
    private javax.swing.JLabel lblGanancias;
    private javax.swing.JLabel lblGananciasAnio;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JLabel lblRecaudoUMes;
    private javax.swing.JLabel lblServRec;
    private javax.swing.JLabel lblServicios;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lblVehiculos;
    private javax.swing.JPanel pnlAdministrador;
    private javax.swing.JPanel pnlBusquedaAvanzada;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlConductores;
    private javax.swing.JPanel pnlConfiguracion;
    private javax.swing.JPanel pnlGanancias;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlServicios;
    private javax.swing.JPanel pnlVehiculos;
    private javax.swing.JRadioButton rdbAvanzadas;
    private javax.swing.JRadioButton rdbFrecuentes;
    private javax.swing.JScrollPane scTablaBA;
    private javax.swing.JScrollPane scTablaClienServ;
    private javax.swing.JScrollPane scTablaClientes;
    private javax.swing.JScrollPane scTablaConduServ;
    private javax.swing.JScrollPane scTablaConductores;
    private javax.swing.JScrollPane scTablaServRec;
    private javax.swing.JScrollPane scTablaServicios;
    private javax.swing.JScrollPane scTablaVehiculos;
    private javax.swing.JSeparator separadorBA;
    private javax.swing.JSeparator separadorCliente;
    private javax.swing.JSeparator separadorConductor;
    private javax.swing.JSeparator separadorConfiguracion;
    private javax.swing.JSeparator separadorPrincipal;
    private javax.swing.JSeparator separadorServicios;
    private javax.swing.JSeparator separadorVehiculos;
    private javax.swing.JTable tbClienServ;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbConduServ;
    private javax.swing.JTable tbConductores;
    private javax.swing.JTable tbConsultas;
    private javax.swing.JTable tbServRec;
    private javax.swing.JTable tbServicios;
    private javax.swing.JTable tbVehiculos;
    private javax.swing.JTextField txtGanaciasAnio;
    private javax.swing.JLabel txtMostrandoBA;
    private javax.swing.JLabel txtMostrandoClientes;
    private javax.swing.JLabel txtMostrandoConductor;
    private javax.swing.JLabel txtMostrandoServicios;
    private javax.swing.JLabel txtMostrandoVehiculos;
    private javax.swing.JTextField txtRecaudoUMes;
    private javax.swing.JTextField txtSQL;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}

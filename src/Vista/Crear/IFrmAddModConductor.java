/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista.Crear;

import Vista.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Dyl
 */
public class IFrmAddModConductor extends javax.swing.JInternalFrame {

    public JLabel getLblFotografia() {
        return lblFotografia;
    }

    public void setLblFotografia(JLabel lblFotografia) {
        this.lblFotografia = lblFotografia;
    }

    public JTextField getTxtFotografia() {
        return txtFotografia;
    }

    public void setTxtFotografia(JTextField txtFotografia) {
        this.txtFotografia = txtFotografia;
    }

    public JSeparator getSeparadorAddMod() {
        return SeparadorAddMod;
    }

    public void setSeparadorAddMod(JSeparator SeparadorAddMod) {
        this.SeparadorAddMod = SeparadorAddMod;
    }

    public JButton getBtnAddMod() {
        return btnAddMod;
    }

    public void setBtnAddMod(JButton btnAddMod) {
        this.btnAddMod = btnAddMod;
    }

    public JButton getBtnAddTelefonos() {
        return btnAddTelefonos;
    }

    public void setBtnAddTelefonos(JButton btnAddTelefonos) {
        this.btnAddTelefonos = btnAddTelefonos;
    }

    public JButton getBtnBorrarTelefonos() {
        return btnBorrarTelefonos;
    }

    public void setBtnBorrarTelefonos(JButton btnBorrarTelefonos) {
        this.btnBorrarTelefonos = btnBorrarTelefonos;
    }

    public JButton getBtnEditTelefonos() {
        return btnEditTelefonos;
    }

    public void setBtnEditTelefonos(JButton btnEditTelefonos) {
        this.btnEditTelefonos = btnEditTelefonos;
    }

    public JComboBox<String> getCmbGenero() {
        return cmbGenero;
    }

    public void setCmbGenero(JComboBox<String> cmbGenero) {
        this.cmbGenero = cmbGenero;
    }

    public JComboBox<String> getCmbNacionalidad() {
        return cmbNacionalidad;
    }

    public void setCmbNacionalidad(JComboBox<String> cmbNacionalidad) {
        this.cmbNacionalidad = cmbNacionalidad;
    }

    public JComboBox<String> getCmbTelefonos() {
        return cmbTelefonos;
    }

    public void setCmbTelefonos(JComboBox<String> cmbTelefonos) {
        this.cmbTelefonos = cmbTelefonos;
    }

    public JLabel getLblAddModConductor() {
        return lblAddModConductor;
    }

    public void setLblAddModConductor(JLabel lblAddModConductor) {
        this.lblAddModConductor = lblAddModConductor;
    }

    public JLabel getLblDireccion() {
        return lblDireccion;
    }

    public void setLblDireccion(JLabel lblDireccion) {
        this.lblDireccion = lblDireccion;
    }

    public JLabel getLblGenero() {
        return lblGenero;
    }

    public void setLblGenero(JLabel lblGenero) {
        this.lblGenero = lblGenero;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNacionalidad() {
        return lblNacionalidad;
    }

    public void setLblNacionalidad(JLabel lblNacionalidad) {
        this.lblNacionalidad = lblNacionalidad;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JList<String> getLsTelefonos() {
        return lsTelefonos;
    }

    public void setLsTelefonos(JList<String> lsTelefonos) {
        this.lsTelefonos = lsTelefonos;
    }

    public JPanel getPnlAddModConductor() {
        return pnlAddModConductor;
    }

    public void setPnlAddModConductor(JPanel pnlAddModConductor) {
        this.pnlAddModConductor = pnlAddModConductor;
    }

    public JScrollPane getScLsTelefonos() {
        return scLsTelefonos;
    }

    public void setScLsTelefonos(JScrollPane scLsTelefonos) {
        this.scLsTelefonos = scLsTelefonos;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtNueNumero() {
        return txtNueNumero;
    }

    public void setTxtNueNumero(JTextField txtNueNumero) {
        this.txtNueNumero = txtNueNumero;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }


    /**
     * Creates new form IFrmAddModGenerico
     */
    public IFrmAddModConductor() {
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

        pnlAddModConductor = new javax.swing.JPanel();
        lblAddModConductor = new javax.swing.JLabel();
        SeparadorAddMod = new javax.swing.JSeparator();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNacionalidad = new javax.swing.JLabel();
        cmbNacionalidad = new javax.swing.JComboBox<>();
        btnAddMod = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        txtNueNumero = new javax.swing.JTextField();
        cmbTelefonos = new javax.swing.JComboBox<>();
        btnBorrarTelefonos = new javax.swing.JButton();
        btnAddTelefonos = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        btnEditTelefonos = new javax.swing.JButton();
        scLsTelefonos = new javax.swing.JScrollPane();
        lsTelefonos = new javax.swing.JList<>();
        lblFotografia = new javax.swing.JLabel();
        txtFotografia = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        pnlAddModConductor.setBackground(new java.awt.Color(255, 255, 255));

        lblAddModConductor.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        lblAddModConductor.setText("Crear Conductor");

        lblId.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblId.setText("Id");

        txtId.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblNacionalidad.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblNacionalidad.setText("Nacionalidad");

        cmbNacionalidad.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        btnAddMod.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnAddMod.setText("CREAR");

        lblNombre.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblNombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        lblDireccion.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblDireccion.setText("Direccion");

        txtDireccion.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        lblGenero.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblGenero.setText("Genero");

        cmbGenero.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        txtNueNumero.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        txtNueNumero.setToolTipText("Nuevo Numero");

        cmbTelefonos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        btnBorrarTelefonos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnBorrarTelefonos.setText("Borrar Telefono");
        btnBorrarTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTelefonosActionPerformed(evt);
            }
        });

        btnAddTelefonos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnAddTelefonos.setText("Agregar Telefono");
        btnAddTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTelefonosActionPerformed(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        btnEditTelefonos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnEditTelefonos.setText("Editar Telefono");
        btnEditTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTelefonosActionPerformed(evt);
            }
        });

        lsTelefonos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        scLsTelefonos.setViewportView(lsTelefonos);

        lblFotografia.setText("Fotografia");

        javax.swing.GroupLayout pnlAddModConductorLayout = new javax.swing.GroupLayout(pnlAddModConductor);
        pnlAddModConductor.setLayout(pnlAddModConductorLayout);
        pnlAddModConductorLayout.setHorizontalGroup(
            pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddModConductorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddModConductorLayout.createSequentialGroup()
                        .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SeparadorAddMod)
                            .addGroup(pnlAddModConductorLayout.createSequentialGroup()
                                .addComponent(lblAddModConductor)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddModConductorLayout.createSequentialGroup()
                        .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddModConductorLayout.createSequentialGroup()
                                .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNueNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBorrarTelefonos, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(btnEditTelefonos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbTelefonos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTelefono))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scLsTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFotografia)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddModConductorLayout.createSequentialGroup()
                                .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAddModConductorLayout.createSequentialGroup()
                                        .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlAddModConductorLayout.createSequentialGroup()
                                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(pnlAddModConductorLayout.createSequentialGroup()
                                                .addComponent(btnAddTelefonos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(6, 6, 6)))
                                        .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtId)
                                            .addComponent(cmbNacionalidad, javax.swing.GroupLayout.Alignment.LEADING, 0, 149, Short.MAX_VALUE))
                                        .addGap(18, 18, 18))
                                    .addGroup(pnlAddModConductorLayout.createSequentialGroup()
                                        .addComponent(lblNacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(176, 176, 176)))
                                .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddModConductorLayout.createSequentialGroup()
                                .addComponent(txtNombre)
                                .addGap(20, 20, 20))
                            .addGroup(pnlAddModConductorLayout.createSequentialGroup()
                                .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(cmbGenero, javax.swing.GroupLayout.Alignment.LEADING, 0, 138, Short.MAX_VALUE)
                                    .addComponent(txtFotografia, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(19, 19, 19))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddModConductorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddMod)
                .addGap(225, 225, 225))
        );
        pnlAddModConductorLayout.setVerticalGroup(
            pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddModConductorLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblAddModConductor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorAddMod, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNacionalidad)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addGap(11, 11, 11)
                .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddModConductorLayout.createSequentialGroup()
                        .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddTelefonos)
                            .addComponent(lblGenero)
                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddModConductorLayout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrarTelefonos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditTelefonos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNueNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddModConductorLayout.createSequentialGroup()
                                .addGroup(pnlAddModConductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFotografia)
                                    .addComponent(txtFotografia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(scLsTelefonos))
                .addGap(18, 18, 18)
                .addComponent(btnAddMod)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAddModConductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAddModConductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnBorrarTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTelefonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarTelefonosActionPerformed

    private void btnAddTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTelefonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddTelefonosActionPerformed

    private void btnEditTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTelefonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditTelefonosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator SeparadorAddMod;
    private javax.swing.JButton btnAddMod;
    private javax.swing.JButton btnAddTelefonos;
    private javax.swing.JButton btnBorrarTelefonos;
    private javax.swing.JButton btnEditTelefonos;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbNacionalidad;
    private javax.swing.JComboBox<String> cmbTelefonos;
    private javax.swing.JLabel lblAddModConductor;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFotografia;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JList<String> lsTelefonos;
    private javax.swing.JPanel pnlAddModConductor;
    private javax.swing.JScrollPane scLsTelefonos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFotografia;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNueNumero;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

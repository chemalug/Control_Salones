/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.vista;

import control_salones.controlador.DAO_Especialidad;
import control_salones.controlador.DAO_catalogoEventos;
import control_salones.datos.ConectorJoshua;
import control_salones.modelo.CatalogoEvento;
import control_salones.modelo.Especialidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author efi
 */
public class frmAddEvento extends javax.swing.JFrame {

    DefaultComboBoxModel<Especialidad> modeloCombo = new DefaultComboBoxModel();

    /**
     * Creates new form frmAgregarEvento
     */
    public frmAddEvento() {
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

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoEvento = new javax.swing.JTextField();
        cmbEspecialidad = new javax.swing.JComboBox<>();
        txtNombreEvento = new javax.swing.JTextField();
        cmbTipoEvento = new javax.swing.JComboBox<>();
        txtNivelCompetencia = new javax.swing.JTextField();
        txtDuracionModulo = new javax.swing.JTextField();
        cmbEstadoModulo = new javax.swing.JComboBox<>();
        bntGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir Evento");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel7.setText("Código Evento");

        jLabel8.setText("Especialidad");

        jLabel1.setText("Insertar Nuevo Evento");

        jLabel2.setText("Nombre de Evento");

        jLabel3.setText("Tipo de Evento");

        jLabel4.setText("Nivel de Competencia");

        jLabel5.setText("Duración de Módulo");

        jLabel6.setText("Estado de Módulo");

        cmbEspecialidad.setModel(modeloCombo);
        cmbEspecialidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEspecialidadItemStateChanged(evt);
            }
        });
        cmbEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEspecialidadActionPerformed(evt);
            }
        });
        cmbEspecialidad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbEspecialidadPropertyChange(evt);
            }
        });

        bntGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/control_salones/media/if_multimedia-27_809537.png"))); // NOI18N
        bntGuardar.setText("Guardar");
        bntGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/control_salones/media/if_ic_cancel_48px_352263.png"))); // NOI18N
        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(bntGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(txtNivelCompetencia)
                            .addComponent(txtDuracionModulo)
                            .addComponent(txtCodigoEvento)
                            .addComponent(cmbTipoEvento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbEstadoModulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNivelCompetencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDuracionModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmbEstadoModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarActionPerformed
        CatalogoEvento catalogoEvento = new CatalogoEvento();
        catalogoEvento.setCodigo(Integer.parseInt(txtCodigoEvento.getText()));
        catalogoEvento.setCodigo_especialidad(codigoEspecialidad);
        catalogoEvento.setNombre_evento(txtNombreEvento.getText());
        catalogoEvento.setTipo_evento(Integer.parseInt(this.cmbTipoEvento.getSelectedItem().toString()));
        catalogoEvento.setNivel_competencia(Integer.parseInt(txtNivelCompetencia.getText()));
        catalogoEvento.setDuracion_modulo(Integer.parseInt(txtDuracionModulo.getText()));
        if (this.cmbEstadoModulo.getSelectedItem().equals("Activo")) {
            int estado_modulo = 1;
            catalogoEvento.setEstado_modulo(estado_modulo);
        } else {
            int estado_modulo = 2;
            catalogoEvento.setEstado_modulo(estado_modulo);
        }

//catalogoEvento.setEstado_modulo(Integer.parseInt(txtEstadoModulo.getText()));
        DAO_catalogoEventos datos = new DAO_catalogoEventos();
        datos.insertarDatos(catalogoEvento);


    }//GEN-LAST:event_bntGuardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarEstadoModulo();
        cargarEspecialidad();
    }//GEN-LAST:event_formWindowOpened

    private void cmbEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEspecialidadActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbEspecialidadActionPerformed

    private void cmbEspecialidadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbEspecialidadPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbEspecialidadPropertyChange
    int codigoEspecialidad = 0;
    private void cmbEspecialidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEspecialidadItemStateChanged
        // TODO add your handling code here:

        codigoEspecialidad = ((Especialidad) evt.getItem()).getCodigo();
        System.out.println(codigoEspecialidad);

    }//GEN-LAST:event_cmbEspecialidadItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAddEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAddEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAddEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAddEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAddEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGuardar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<Especialidad> cmbEspecialidad;
    private javax.swing.JComboBox<String> cmbEstadoModulo;
    private javax.swing.JComboBox<String> cmbTipoEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCodigoEvento;
    private javax.swing.JTextField txtDuracionModulo;
    private javax.swing.JTextField txtNivelCompetencia;
    private javax.swing.JTextField txtNombreEvento;
    // End of variables declaration//GEN-END:variables

    public void cargarEstadoModulo() {
        this.cmbEstadoModulo.addItem("--Seleccione uno--");
        this.cmbEstadoModulo.addItem("Activo");
        this.cmbEstadoModulo.addItem("Inactivo");
    }

    public void cargarEspecialidad() {

        DAO_Especialidad especialidad = new DAO_Especialidad();
        for (Especialidad aux : especialidad.obtenerDatos()) {
            modeloCombo.addElement(aux);
        }

    }

    public void cargarTipoEvento() {
        DefaultComboBoxModel modeloTipoEvento = new DefaultComboBoxModel();

        ConectorJoshua db = new ConectorJoshua();
        db.conectar();
        ResultSet resultadoTipoEvento = db.consulta("Select nombre_tipo_evento from tbl_tipo_evento;");
        try {
            while (resultadoTipoEvento.next()) {
                modeloTipoEvento.addElement(resultadoTipoEvento);
            }
            this.cmbTipoEvento.setModel(modeloTipoEvento);
        } catch (SQLException e2) {
            System.err.println(e2);
        }
    }

}
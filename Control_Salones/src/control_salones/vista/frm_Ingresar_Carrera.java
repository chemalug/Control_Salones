/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.vista;
import control_salones.controlador.Carreracontrolador;
import control_salones.modelo.Carrera;
/**
 *
 * @author EFI
 */
public class frm_Ingresar_Carrera extends javax.swing.JFrame {

    /**
     * Creates new form frm_Ingresar_Carrera
     */
    public frm_Ingresar_Carrera() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxTipocarrera = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtVersion = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAgregarnuevo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txttipo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ingresar Nueva Carrera");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel2.setText("Versión:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 383, -1, -1));

        jLabel3.setText("Tipo de Carrera:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 253, -1, -1));

        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 303, -1, -1));

        jLabel5.setText("Estado:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 343, -1, 10));

        cbxTipocarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipocarreraActionPerformed(evt);
            }
        });
        getContentPane().add(cbxTipocarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 250, 30));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 293, 250, 30));
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 333, 250, 30));
        getContentPane().add(txtVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 373, 250, 30));

        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 433, 100, 40));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 436, 100, 40));

        btnAgregarnuevo.setText("Agregar nuevo tipo");
        btnAgregarnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 243, 140, -1));

        jLabel6.setText("Codigo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 250, 30));
        getContentPane().add(txttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 250, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipocarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipocarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipocarreraActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
//    Carreracontrolador np = new Carreracontrolador();
//        np.nuevaCarrera(Integer.parseInt(this.txtCodigo.getText()), this.txttipo.getText(), this.txtNombre.getText(),this.txtEstado.getText(), this.txtVersion.getText());      
Carrera p = new Carrera(Integer.parseInt(this.txtCodigo.getText()), this.txttipo.getText(), this.txtNombre.getText(), this.txtEstado.getText(), this.txtVersion.getText());
  p.insertar();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarnuevoActionPerformed
        frm_Ingresar_Tipo_Carrera tipocarrera = new frm_Ingresar_Tipo_Carrera();
        tipocarrera.setVisible(true);
        
              
    }//GEN-LAST:event_btnAgregarnuevoActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Ingresar_Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Ingresar_Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Ingresar_Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Ingresar_Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Ingresar_Carrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarnuevo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxTipocarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVersion;
    private javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables
}
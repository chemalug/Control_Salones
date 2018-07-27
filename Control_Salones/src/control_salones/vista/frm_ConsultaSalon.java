package control_salones.vista;

import control_salones.controlador.SalonControlador;
import javax.swing.SpinnerNumberModel;

public class frm_ConsultaSalon extends javax.swing.JFrame {

    public frm_ConsultaSalon() {
        initComponents();
    }

    SalonControlador sc = new SalonControlador();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgInstructor = new javax.swing.ButtonGroup();
        btgProyector = new javax.swing.ButtonGroup();
        btgPizarron = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdbPcIns1 = new javax.swing.JRadioButton();
        rdbPcIns0 = new javax.swing.JRadioButton();
        rdbProyector1 = new javax.swing.JRadioButton();
        rdbProyector0 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        rdbPizarron1 = new javax.swing.JRadioButton();
        rdbPizarron0 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        spnPcParticipantes = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion del Salon"));

        jLabel6.setText("Codigo:");

        txtCodigo.setEditable(false);

        jLabel2.setText(" Nombre:");

        txtNombre.setEditable(false);
        txtNombre.setText(" ");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Capacidad:");

        txtCapacidad.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre)
                    .addComponent(txtCapacidad))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 150));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipamiento de Salones"));
        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("PC Instructor:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, -1));

        jLabel8.setText("Proyector:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 27, -1, -1));

        btgInstructor.add(rdbPcIns1);
        rdbPcIns1.setText("Si");
        jPanel2.add(rdbPcIns1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 45, -1, -1));

        btgInstructor.add(rdbPcIns0);
        rdbPcIns0.setText("No");
        jPanel2.add(rdbPcIns0, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 45, -1, -1));

        btgProyector.add(rdbProyector1);
        rdbProyector1.setText("Si");
        jPanel2.add(rdbProyector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 45, -1, -1));

        btgProyector.add(rdbProyector0);
        rdbProyector0.setText("No");
        jPanel2.add(rdbProyector0, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 45, -1, -1));

        jLabel9.setText("Pizarron:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 70, -1, -1));

        btgPizarron.add(rdbPizarron1);
        rdbPizarron1.setText("Si");
        jPanel2.add(rdbPizarron1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 90, -1, -1));

        btgPizarron.add(rdbPizarron0);
        rdbPizarron0.setText("No");
        jPanel2.add(rdbPizarron0, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 90, -1, -1));

        jLabel10.setText("PC Participantes:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 70, -1, -1));
        jPanel2.add(spnPcParticipantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 95, 57, -1));

        jLabel11.setText("Observaciones:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 126, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 220, 170));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SALONES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 230, 50));

        txtObservaciones.setEditable(false);
        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane2.setViewportView(txtObservaciones);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 308, 150));

        btnCancelar.setText("Salir");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 70, 40));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONSULTA DE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 230, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        rdbPcIns0.setEnabled(false);
        rdbPcIns1.setEnabled(false);
        rdbPizarron0.setEnabled(false);
        rdbPizarron1.setEnabled(false);
        rdbProyector0.setEnabled(false);
        rdbProyector1.setEnabled(false);
        spnPcParticipantes.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frm_ConsultaSalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ConsultaSalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ConsultaSalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ConsultaSalon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ConsultaSalon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgInstructor;
    private javax.swing.ButtonGroup btgPizarron;
    private javax.swing.ButtonGroup btgProyector;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbPcIns0;
    private javax.swing.JRadioButton rdbPcIns1;
    private javax.swing.JRadioButton rdbPizarron0;
    private javax.swing.JRadioButton rdbPizarron1;
    private javax.swing.JRadioButton rdbProyector0;
    private javax.swing.JRadioButton rdbProyector1;
    private javax.swing.JSpinner spnPcParticipantes;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getTxtCodigo() {
        return txtCodigo;
    }

    public void setTxtCodigo(String dato) {
        this.txtCodigo.setText(dato);
    }

    public javax.swing.JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(String dato) {
        this.txtNombre.setText(dato);
    }

    public javax.swing.JTextField getTxtCapacidad() {
        return txtCapacidad;
    }

    public void setTxtCapacidad(String dato) {
        this.txtCapacidad.setText(dato);
    }

    public javax.swing.JRadioButton getRdbPcIns1() {
        return rdbPcIns1;
    }

    public void setrdbPcIns1() {
        this.rdbPcIns1.setSelected(true);
    }
    
    public javax.swing.JRadioButton getRdbPcIns0() {
        return rdbPcIns0;
    }

    public void setrdbPcIns0() {
        this.rdbPcIns0.setSelected(true);
    }
    
    public javax.swing.JRadioButton getPizarron0() {
        return rdbPizarron0;
    }

    public void setrdbPizarron0() {
        this.rdbPizarron0.setSelected(true);
    }
    
    public javax.swing.JRadioButton getPizarron1() {
        return rdbPizarron1;
    }

    public void setrdbPizarron1() {
        this.rdbPizarron1.setSelected(true);
    }
    
    public javax.swing.JRadioButton getProyector0() {
        return rdbProyector0;
    }

    public void setrdbProyector0() {
        this.rdbProyector0.setSelected(true);
    }
    
    public javax.swing.JRadioButton getProyector1() {
        return rdbProyector1;
    }

    public void setrdbProyector1() {
        this.rdbProyector1.setSelected(true);
    }
    
    public javax.swing.JSpinner getPcParticipantes() {
        return spnPcParticipantes;
    }

    public void setspnPcParticipantes(int dato) {
        SpinnerNumberModel snm = new SpinnerNumberModel();
        spnPcParticipantes.setValue(dato);
        
    }
    
    public javax.swing.JTextArea getTxtObservaciones() {
        return txtObservaciones;
    }

    public void setTxtObservaciones(String dato) {
        this.txtObservaciones.setText(dato);
    }
}
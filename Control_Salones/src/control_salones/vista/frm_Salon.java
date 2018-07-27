package control_salones.vista;

import control_salones.controlador.SalonControlador;
import control_salones.modelo.Salon;
import javax.swing.JOptionPane;

public class frm_Salon extends javax.swing.JFrame {

    public frm_Salon() {
        initComponents();
    }
    
    SalonControlador sc = new SalonControlador();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgInstructor = new javax.swing.ButtonGroup();
        btgProyector = new javax.swing.ButtonGroup();
        btgPizarron = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSalones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblSalones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblSalones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 1050, 520));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE SALONES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 290, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipamiento de Salones"));
        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N

        jLabel7.setText("PC Instructor:");

        jLabel8.setText("Proyector:");

        btgInstructor.add(rdbPcIns1);
        rdbPcIns1.setText("Si");

        btgInstructor.add(rdbPcIns0);
        rdbPcIns0.setText("No");

        btgProyector.add(rdbProyector1);
        rdbProyector1.setText("Si");

        btgProyector.add(rdbProyector0);
        rdbProyector0.setText("No");

        jLabel9.setText("Pizarron:");

        btgPizarron.add(rdbPizarron1);
        rdbPizarron1.setText("Si");

        btgPizarron.add(rdbPizarron0);
        rdbPizarron0.setText("No");

        jLabel10.setText("PC Participantes:");

        jLabel11.setText("Observaciones:");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane2.setViewportView(txtObservaciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 233, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdbPcIns1)
                                .addGap(7, 7, 7)
                                .addComponent(rdbPcIns0))
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdbPizarron1)
                                .addGap(7, 7, 7)
                                .addComponent(rdbPizarron0)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdbProyector1)
                                .addGap(7, 7, 7)
                                .addComponent(rdbProyector0))
                            .addComponent(jLabel10)
                            .addComponent(spnPcParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbPcIns1)
                            .addComponent(rdbPcIns0))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbPizarron1)
                            .addComponent(rdbPizarron0)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(4, 4, 4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rdbProyector1)
                                .addComponent(rdbProyector0))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10)
                            .addGap(31, 31, 31))
                        .addComponent(spnPcParticipantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 340, 290));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion del Salon"));

        jLabel6.setText("Codigo:");

        txtCodigo.setEditable(false);

        jLabel2.setText(" Nombre:");

        txtNombre.setText(" ");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Capacidad:");

        txtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadKeyTyped(evt);
            }
        });

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
                .addGap(0, 42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 160));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Botones"));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnConsulta)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnBorrar)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsulta)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 350, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tblSalones.setModel(sc.mostrarSalon("SELECT * FROM tbl_salon"));
    }//GEN-LAST:event_formWindowOpened

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Salon salon = new Salon();
        
        salon.setNombre_salon(txtNombre.getText());
        salon.setCapacidad_salon(Integer.parseInt(txtCapacidad.getText()));
        if (rdbPcIns1.isSelected()==true){
            salon.setPc_instructor(1);
        } else if (rdbPcIns0.isSelected()==true){
            salon.setPc_instructor(0);
        }
        if (rdbPizarron1.isSelected()==true){
            salon.setPizarron(1);
        } else if (rdbPizarron0.isSelected()==true){
            salon.setPizarron(0);
        }
        if (rdbProyector1.isSelected()==true){
            salon.setProyector(1);
        } else if (rdbProyector0.isSelected()==true){
            salon.setProyector(0);
        }
        salon.setPc_participantes(spnPcParticipantes.getValue().toString());
        salon.setObservaciones(txtObservaciones.getText());
        
        sc.insertarSalon(salon);
        this.tblSalones.setModel(sc.mostrarSalon("SELECT * FROM tbl_salon"));
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        Salon salon = new Salon();
        String dato = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),0));
        salon.setCodigo(Integer.parseInt(dato));
        if(JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de borrar el salon? Esta accion no se puede revertir...") == JOptionPane.YES_OPTION){
            sc.borrarSalon(salon);
            this.tblSalones.setModel(sc.mostrarSalon("SELECT * FROM tbl_salon"));
        }
                
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        this.tblSalones.setModel(sc.mostrarSalon("SELECT * FROM tbl_salon"));
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String codigo = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),0));
        String nombre_salon = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),1));
        String capacidad_salon = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),2));
        String pc_instructor = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),3));
        String proyector = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),4));
        String pizarron = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),5));
        String pc_participantes = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),6));
        String otros_equipos = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),7));
        
        frm_ModificarSalon modificar = new frm_ModificarSalon();
        modificar.setTxtCodigo(codigo);
        modificar.setTxtNombre(nombre_salon);
        modificar.setTxtCapacidad(capacidad_salon);
        if ("1".equals(pc_instructor)){
            modificar.setrdbPcIns1();
        } else if ("0".equals(pc_instructor))
            modificar.setrdbPcIns0();
        if ("1".equals(proyector)){
            modificar.setrdbProyector1();
        } else if ("0".equals(proyector))
            modificar.setrdbProyector0();
        if ("1".equals(pizarron)){
            modificar.setrdbPizarron1();
        } else if ("0".equals(pizarron))
            modificar.setrdbPizarron0();
        modificar.setspnPcParticipantes(Integer.parseInt(pc_participantes));
        modificar.setTxtObservaciones(otros_equipos);
        modificar.setVisible(true);
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        String codigo = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),0));
        String nombre_salon = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),1));
        String capacidad_salon = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),2));
        String pc_instructor = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),3));
        String proyector = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),4));
        String pizarron = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),5));
        String pc_participantes = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),6));
        String otros_equipos = String.valueOf(tblSalones.getValueAt(tblSalones.getSelectedRow(),7));
        frm_ConsultaSalon consulta = new frm_ConsultaSalon();
        consulta.setTxtCodigo(codigo);
        consulta.setTxtNombre(nombre_salon);
        consulta.setTxtCapacidad(capacidad_salon);
        if ("1".equals(pc_instructor)){
            consulta.setrdbPcIns1();
        } else if ("0".equals(pc_instructor))
            consulta.setrdbPcIns0();
        if ("1".equals(proyector)){
            consulta.setrdbProyector1();
        } else if ("0".equals(proyector))
            consulta.setrdbProyector0();
        if ("1".equals(pizarron)){
            consulta.setrdbPizarron1();
        } else if ("0".equals(pizarron))
            consulta.setrdbPizarron0();
        consulta.setspnPcParticipantes(Integer.parseInt(pc_participantes));
        consulta.setTxtObservaciones(otros_equipos);
        consulta.setVisible(true);
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void txtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
        
        String caracteres = txtCapacidad.getText();
        if(caracteres.length()>=2){
            evt.consume();
        }
    }//GEN-LAST:event_txtCapacidadKeyTyped

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
            java.util.logging.Logger.getLogger(frm_Salon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Salon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Salon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Salon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Salon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgInstructor;
    private javax.swing.ButtonGroup btgPizarron;
    private javax.swing.ButtonGroup btgProyector;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbPcIns0;
    private javax.swing.JRadioButton rdbPcIns1;
    private javax.swing.JRadioButton rdbPizarron0;
    private javax.swing.JRadioButton rdbPizarron1;
    private javax.swing.JRadioButton rdbProyector0;
    private javax.swing.JRadioButton rdbProyector1;
    private javax.swing.JSpinner spnPcParticipantes;
    private javax.swing.JTable tblSalones;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables
}

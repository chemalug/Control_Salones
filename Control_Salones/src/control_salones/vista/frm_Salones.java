package control_salones.vista;

import com.github.lgooddatepicker.components.TimePickerSettings;
import control_salones.controlador.AsignacionEventoControllador;
import control_salones.modelo.Fechas;
import control_salones.modelo.Horario;
import control_salones.modelo.Salon;
import java.time.LocalDate;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class frm_Salones extends javax.swing.JFrame {

    public frm_Salones() {
        initComponents();

    }
    private DefaultComboBoxModel<Salon> modeloCombo;
    private DefaultComboBoxModel<Horario> modeloComboHorario;
    DefaultTableModel tm = new DefaultTableModel(0, 1) {
        @Override
        public boolean isCellEditable(int row, int column) {
            if (0 == column) {
                return false;
            }
            return super.isCellEditable(row, column);
        }
    };
    TimePickerSettings timeSettings = new TimePickerSettings();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboSalones = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dt_FechaI = new com.github.lgooddatepicker.components.DatePicker();
        dt_FechaF = new com.github.lgooddatepicker.components.DatePicker();
        btn_Consultar = new javax.swing.JButton();
        cmbHorario_1 = new javax.swing.JComboBox<>();
        cmbHorario_2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable(tm){
            @Override
            public void changeSelection(int rowIndex, int columnIndex,
                boolean toggle, boolean extend) {
                if (columnIndex == 0)
                super.changeSelection(rowIndex, columnIndex + 1, toggle,
                    extend);
                else
                super.changeSelection(rowIndex, columnIndex, toggle,
                    extend);
            }
        };
        ;
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Salones:");

        modeloCombo = new DefaultComboBoxModel(new Salon [] {});
        comboSalones.setModel(modeloCombo);
        comboSalones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSalonesItemStateChanged(evt);
            }
        });

        jLabel2.setText("Asignar evento");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel3.setText("Fecha de inicio:");

        jLabel4.setText("Fecha final:");

        jLabel5.setText("Hora de inicio:");

        jLabel6.setText("Hora final:");

        dt_FechaI.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dt_FechaIPropertyChange(evt);
            }
        });

        btn_Consultar.setText("Consultar salón");
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });

        modeloComboHorario = new DefaultComboBoxModel(new Horario [] {});
        cmbHorario_1.setModel(modeloComboHorario);
        cmbHorario_1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbHorario_1ItemStateChanged(evt);
            }
        });

        modeloComboHorario = new DefaultComboBoxModel(new Horario [] {});
        cmbHorario_2.setModel(modeloComboHorario);
        cmbHorario_2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbHorario_2ItemStateChanged(evt);
            }
        });

        table.setModel(tm);
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setCellRenderer(
            table.getTableHeader().getDefaultRenderer());
        jScrollPane1.setViewportView(table);

        jButton1.setText("Leer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(191, 191, 191)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboSalones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dt_FechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_Consultar)
                                        .addComponent(cmbHorario_1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbHorario_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dt_FechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboSalones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dt_FechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dt_FechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cmbHorario_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbHorario_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_Consultar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        tm.setColumnIdentifiers(new String[] { "" });
        dt_FechaI.setDateToToday();
        dt_FechaF.setDateToToday();
        AsignacionEventoControllador aec = new AsignacionEventoControllador();
        for (Salon obtenerSalone : aec.obtenerSalones()) {
            //modeloCombo.addElement(obtenerSalone.getNombre_salon());
            comboSalones.addItem(obtenerSalone);
        }
        
        for (Horario horario : aec.obtenerHorario()) {
            cmbHorario_1.addItem(horario);
            cmbHorario_2.addItem(horario);
        }
    }//GEN-LAST:event_formWindowActivated
    int codigo_salon = 0;
    private void comboSalonesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSalonesItemStateChanged
        // TODO add your handling code here:
        //System.out.println(((Salon)comboSalones.getSelectedItem()).getCodigo());
        codigo_salon = ((Salon) evt.getItem()).getCodigo();
    }//GEN-LAST:event_comboSalonesItemStateChanged

    private void dt_FechaIPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dt_FechaIPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_dt_FechaIPropertyChange

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        //Object[] newRow={"Pepe", "Grillo","Tenis", new Integer(5), new Boolean(false), "Pera"};
        //tm.addRow(newRow);
        AsignacionEventoControllador ae = new AsignacionEventoControllador();
        
        for (Fechas fecha : ae.obtenerFechas(dt_FechaI.getDate(),dt_FechaF.getDate())) {
            tm.addColumn(fecha.getFecha());
        }
        
        for(Horario horario: ae.obtenerHorario(cmbHorario_1.getSelectedItem().toString(),cmbHorario_2.getSelectedItem().toString())){
            Object[] newRow = {horario.getCodigo() + "-" + horario.getHora_inicio()};      
            tm.addRow(newRow);
        }
        ae.obtenerCalendarioSalon(codigo_salon, dt_FechaI.getDate(), dt_FechaF.getDate(), cmbHorario_1.getSelectedItem().toString(), cmbHorario_2.getSelectedItem().toString());
        
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void cmbHorario_1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbHorario_1ItemStateChanged
        // TODO add your handling code here:
        System.out.println(((Horario) evt.getItem()).getCodigo());
    }//GEN-LAST:event_cmbHorario_1ItemStateChanged

    private void cmbHorario_2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbHorario_2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHorario_2ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < tm.getRowCount(); i++){
            System.out.println(tm.getValueAt(i, 1));
            tm.setValueAt("sa", i, 2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Salones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Salones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Salones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Salones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Salones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JComboBox<Horario> cmbHorario_1;
    private javax.swing.JComboBox<Horario> cmbHorario_2;
    private javax.swing.JComboBox<Salon> comboSalones;
    private com.github.lgooddatepicker.components.DatePicker dt_FechaF;
    private com.github.lgooddatepicker.components.DatePicker dt_FechaI;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

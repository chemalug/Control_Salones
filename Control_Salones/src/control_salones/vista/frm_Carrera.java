/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.vista;
import control_salones.controlador.Carrera_modulocontrolador;
import control_salones.controlador.Carreracontrolador;
import control_salones.datos.Conector;
import control_salones.modelo.Carrera;
import control_salones.modelo.Carrera_Modulo;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author LouFlores
 */
public class frm_Carrera extends javax.swing.JFrame {

    private TableModel ModeloTabla;
     Carreracontrolador carrcontrol = new Carreracontrolador();
    String codigo = "";

    /**
     * Creates new form frm_Carrera
     */
    public frm_Carrera() {
        initComponents();
        
      
 
 
 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnRefrescar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_modulo = new javax.swing.JTable();
        btnModificar1 = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrera = new javax.swing.JTable();
        btnBuscar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Módulos de Carrera");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 430, -1, -1));

        jLabel2.setText("Codigo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 160, -1, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 150, 280, 30));

        btnRefrescar.setText("Buscar");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 80, 30));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 350, 80, 30));

        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 630, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Catálogo de Carrera");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 60, -1, -1));

        tbl_modulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_modulo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 890, 130));

        btnModificar1.setText("Modificar");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 350, 90, 30));

        btnAgregar1.setText("Agregar");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 630, 80, 30));

        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 350, 80, 30));

        tblCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarreraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCarrera);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 810, 140));

        btnBuscar1.setText("Refrescar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       
        frm_Ingresar_Carrera ingresar = new frm_Ingresar_Carrera();
        ingresar.setVisible(true);
 
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
     
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
      frm_Modificar_Carrera modificar = new frm_Modificar_Carrera();
     

   
          
        
        // PASA LOS DATOS DEL JTABLE AL JTEXTFIELD DEL FORM FRM_MOFICIAR_CARRERA
        
     if (tblCarrera.getSelectedRowCount()>0){
   modificar.txtCodigo.setText(tblCarrera.getValueAt(tblCarrera.getSelectedRow(), 0).toString());
   modificar.cbxTipocarrera.setSelectedItem(tblCarrera.getValueAt(tblCarrera.getSelectedRow(), 1).toString());
      modificar.txtNombre.setText(tblCarrera.getValueAt(tblCarrera.getSelectedRow(), 2).toString());
      modificar.txtEstado.setText(tblCarrera.getValueAt(tblCarrera.getSelectedRow(), 3).toString());
        modificar.txtVersion.setText(tblCarrera.getValueAt(tblCarrera.getSelectedRow(), 4).toString());
         modificar.setVisible(true);
     } else{
         JOptionPane.showMessageDialog(null,
        "Debe seleccionar una fila de la tabla" ); 
     }                                         

    






    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    
        
     
     
    }//GEN-LAST:event_formWindowActivated

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
  Carreracontrolador car = new Carreracontrolador();
  car.buscarCarrera(this.txtCodigo.getText());
  buscar();
      
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
     frm_Eliminar_Carrera eliminar = new frm_Eliminar_Carrera();
        if (tblCarrera.getSelectedRowCount()>0){
   eliminar.txtcodigo.setText(tblCarrera.getValueAt(tblCarrera.getSelectedRow(), 0).toString());
   eliminar.txtnombre.setText(tblCarrera.getValueAt(tblCarrera.getSelectedRow(), 2).toString());
eliminar.setVisible(true);
     } else{
         JOptionPane.showMessageDialog(null,
        "Debe seleccionar una fila de la tabla" ); 
     }                                         
       
     
       
       
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
     Mostrar();

    }//GEN-LAST:event_formWindowGainedFocus

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
Mostrar();          
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void tblCarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarreraMouseClicked
        MostrarModulos();
    }//GEN-LAST:event_tblCarreraMouseClicked
public void buscar() {
       //definir nombres de columna
        Object [] cols = { "codigo", "tipo_carrera", "nombre", "estado", " version"};
        //crear arrayList
      ArrayList<Carrera> miLista = new ArrayList<Carrera>();
      Carreracontrolador control = new Carreracontrolador();
      miLista = control.buscarCarrera(txtCodigo.getText());
      tblCarrera.getModel();
      //creamos Object para agregar las filas de datos 
      Object[][] data = new Object[miLista.size()][cols.length];
        int rowCount = 0;
        for(Carrera c : miLista){
            data[rowCount][0] = c.getCodigo();
            data[rowCount][1] = c.getTipo_carrera();
            data[rowCount][2] = c.getNombre();
            data[rowCount][3] = c.getEstado();
            data[rowCount][4] = c.getVersion();
            rowCount++;
        }
        DefaultTableModel model = new DefaultTableModel(data, cols);
        tblCarrera.setModel(model);
        
        model.addTableModelListener(new TableModelListener() {
         @Override
         public void tableChanged(TableModelEvent e) {
             System.out.println(tblCarrera.getModel().getValueAt(tblCarrera.getSelectedRow(), 0));
         }
     });
    
    }
public void Mostrar(){
    Object [] cols = { "codigo", "tipo_carrera", "nombre", "estado", " version"};
        //crear arrayList
      ArrayList<Carrera> miLista = new ArrayList<Carrera>();
      Carreracontrolador control = new Carreracontrolador();
      miLista = control.ConsultarCarrera();
      tblCarrera.getModel();
      //creamos Object para agregar las filas de datos 
      Object[][] data = new Object[miLista.size()][cols.length];
        int rowCount = 0;
        for(Carrera c : miLista){
            data[rowCount][0] = c.getCodigo();
            data[rowCount][1] = c.getTipo_carrera();
            data[rowCount][2] = c.getNombre();
            data[rowCount][3] = c.getEstado();
            data[rowCount][4] = c.getVersion();
            rowCount++;
        }
        DefaultTableModel model = new DefaultTableModel(data, cols);
        tblCarrera.setModel(model);
        
        model.addTableModelListener(new TableModelListener() {
         @Override
         public void tableChanged(TableModelEvent e) {
             System.out.println(tblCarrera.getModel().getValueAt(tblCarrera.getSelectedRow(), 0));
         }
     });
}
public void MostrarModulos(){
    Object [] cols = { "codigo", "especialidad", "Nombre Evento", "Tipo", " Nivel Competencia", "Duracion", "Estado", "Carrera"};
        //crear arrayList
      ArrayList<Carrera_Modulo> miLista = new ArrayList<Carrera_Modulo>();
      Carrera_modulocontrolador control = new Carrera_modulocontrolador();
      DefaultTableModel tm = (DefaultTableModel) tblCarrera.getModel();



//        String dato=String.valueOf(tm.getValueAt(tblCarrera.getSelectedRow(),0));
//   miLista = control.ConsultarModulo(fila);
      tbl_modulo.getModel();
      //creamos Object para agregar las filas de datos 
      Object[][] data = new Object[miLista.size()][cols.length];
        int rowCount = 0;
        for(Carrera_Modulo c : miLista){
            data[rowCount][0] = c.getCodigo();
            data[rowCount][1] = c.getCodigo_especialidad();
            data[rowCount][2] = c.getNombre_evento();
            data[rowCount][3] = c.getTipo_evento();
            data[rowCount][4] = c.getNivel_competencia();
            data[rowCount][4] = c.getDuracion_modulo();
            data[rowCount][4] = c.getEstado_modulo();
            data[rowCount][4] = c.getCodigo_carrera();
            rowCount++;
        }
        DefaultTableModel model = new DefaultTableModel(data, cols);
        tbl_modulo.setModel(model);
        
        model.addTableModelListener(new TableModelListener() {
         @Override
         public void tableChanged(TableModelEvent e) {
             System.out.println(tbl_modulo.getModel().getValueAt(tbl_modulo.getSelectedRow(), 0));
         }
     });}
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
            java.util.logging.Logger.getLogger(frm_Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Carrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCarrera;
    private javax.swing.JTable tbl_modulo;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}

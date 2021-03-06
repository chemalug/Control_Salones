/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.vista;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hym
 */
public class MainAppView extends javax.swing.JFrame {

    /**
     * Creates new form mainAppView
     */
    public MainAppView() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuBtnSalir = new javax.swing.JMenuItem();
        menuUsarios = new javax.swing.JMenu();
        menuBtnCarreras = new javax.swing.JMenuItem();
        menuBtnCatalogoEventos = new javax.swing.JMenuItem();
        menuBtnInstructores = new javax.swing.JMenuItem();
        menuBtnSalones = new javax.swing.JMenuItem();
        menuBtnAsignacionAulas = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        menuBtnReporteSemanalSalon = new javax.swing.JMenuItem();
        menuBtnReporteEvento = new javax.swing.JMenuItem();
        menuBtnReporteInstructor = new javax.swing.JMenuItem();
        menuConfiguracion = new javax.swing.JMenu();
        menuBtnHarioGeneral = new javax.swing.JMenuItem();
        menuBtnCalendarioGeneral = new javax.swing.JMenuItem();
        menuBtnUsuarios = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuBtnAcercaDe = new javax.swing.JMenuItem();
        menuBtnManualUsuario = new javax.swing.JMenuItem();
        menuTesting = new javax.swing.JMenu();
        menuBtnPrueba = new javax.swing.JMenuItem();
        menuBtnCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control Asignación Salones - EFI 5ta Promoción");

        menuArchivo.setText("Archivo");

        menuBtnSalir.setText("Salir");
        menuBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuBtnSalir);

        jMenuBar1.add(menuArchivo);

        menuUsarios.setText("Editar");

        menuBtnCarreras.setText("Carreras");
        menuBtnCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnCarrerasActionPerformed(evt);
            }
        });
        menuUsarios.add(menuBtnCarreras);

        menuBtnCatalogoEventos.setText("Catalogo evento");
        menuUsarios.add(menuBtnCatalogoEventos);

        menuBtnInstructores.setText("Instructores");
        menuUsarios.add(menuBtnInstructores);

        menuBtnSalones.setText("Salones");
        menuUsarios.add(menuBtnSalones);

        menuBtnAsignacionAulas.setText("Asignación Aulas");
        menuUsarios.add(menuBtnAsignacionAulas);

        jMenuBar1.add(menuUsarios);

        menuReportes.setText("Reportes");

        menuBtnReporteSemanalSalon.setText("Calendario semanal de salón");
        menuReportes.add(menuBtnReporteSemanalSalon);

        menuBtnReporteEvento.setText("Calendario x evento");
        menuReportes.add(menuBtnReporteEvento);

        menuBtnReporteInstructor.setText("Calendario x instructor");
        menuReportes.add(menuBtnReporteInstructor);

        jMenuBar1.add(menuReportes);

        menuConfiguracion.setText("Configuración");

        menuBtnHarioGeneral.setText("Horario general");
        menuConfiguracion.add(menuBtnHarioGeneral);

        menuBtnCalendarioGeneral.setText("Calendario general");
        menuConfiguracion.add(menuBtnCalendarioGeneral);

        menuBtnUsuarios.setText("Usuarios");
        menuConfiguracion.add(menuBtnUsuarios);

        jMenuBar1.add(menuConfiguracion);

        menuAyuda.setText("Ayuda");

        menuBtnAcercaDe.setText("Acerca de");
        menuAyuda.add(menuBtnAcercaDe);

        menuBtnManualUsuario.setText("Manual usuario");
        menuAyuda.add(menuBtnManualUsuario);

        jMenuBar1.add(menuAyuda);

        menuTesting.setText("Testing");

        menuBtnPrueba.setText("Prueba");
        menuBtnPrueba.setToolTipText("Ejemplo de como llamar a otra Ventana(JFrame)");
        menuBtnPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnPruebaActionPerformed(evt);
            }
        });
        menuTesting.add(menuBtnPrueba);

        menuBtnCliente.setText("Prueba Cliente");
        menuBtnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnClienteActionPerformed(evt);
            }
        });
        menuTesting.add(menuBtnCliente);

        jMenuBar1.add(menuTesting);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuBtnSalirActionPerformed

    private void menuBtnPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnPruebaActionPerformed
        abrirVentana(new VentanaPrueba());
    }//GEN-LAST:event_menuBtnPruebaActionPerformed

    private void menuBtnCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnCarrerasActionPerformed
        
    }//GEN-LAST:event_menuBtnCarrerasActionPerformed

    private void menuBtnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnClienteActionPerformed
        abrirVentana(new frm_Cliente());
    }//GEN-LAST:event_menuBtnClienteActionPerformed

        
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
            java.util.logging.Logger.getLogger(MainAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                MainAppView view = new MainAppView();
                view.setLayout(new BorderLayout());
                view.setContentPane(new JLabel(new ImageIcon(getClass().getResource("/control_salones/image/fondo_Main.png"))));
                view.setVisible(true);
                view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuBtnAcercaDe;
    private javax.swing.JMenuItem menuBtnAsignacionAulas;
    private javax.swing.JMenuItem menuBtnCalendarioGeneral;
    private javax.swing.JMenuItem menuBtnCarreras;
    private javax.swing.JMenuItem menuBtnCatalogoEventos;
    private javax.swing.JMenuItem menuBtnCliente;
    private javax.swing.JMenuItem menuBtnHarioGeneral;
    private javax.swing.JMenuItem menuBtnInstructores;
    private javax.swing.JMenuItem menuBtnManualUsuario;
    private javax.swing.JMenuItem menuBtnPrueba;
    private javax.swing.JMenuItem menuBtnReporteEvento;
    private javax.swing.JMenuItem menuBtnReporteInstructor;
    private javax.swing.JMenuItem menuBtnReporteSemanalSalon;
    private javax.swing.JMenuItem menuBtnSalir;
    private javax.swing.JMenuItem menuBtnSalones;
    private javax.swing.JMenuItem menuBtnUsuarios;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuTesting;
    private javax.swing.JMenu menuUsarios;
    // End of variables declaration//GEN-END:variables

    private void abrirVentana(JFrame frame){
        this.setExtendedState(JFrame.ICONIFIED);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.addWindowListener(listenerOnCloseJFrame);
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
        
    }
    
    private final WindowAdapter listenerOnCloseJFrame = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent we) {
            setState(JFrame.NORMAL);
        }
        
    };
    
    static class PanelFondo extends JPanel{

        public PanelFondo() {
            
        }

        @Override
        protected void paintComponent(Graphics grphcs) {
             Image fondo = new ImageIcon(getClass().getResource("/control_salones/image/fondo_Main.png")).getImage();
             grphcs.drawImage(fondo, 600, 400, null);
             setOpaque(false);
             super.paintComponent(grphcs);
        }
        
    }
    
}

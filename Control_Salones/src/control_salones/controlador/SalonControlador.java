package control_salones.controlador;

import control_salones.datos.Conector;
import control_salones.modelo.Salon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SalonControlador {

    private PreparedStatement ps;
    private Connection conn;
    Conector con = new Conector();

    public class noEditable extends DefaultTableModel {

        @Override
        public boolean isCellEditable(int fila, int columna) {
            if (columna == 6) {
                return true;
            }
            return false;
        }
    }

    public noEditable mostrarSalon(String sql) {
        noEditable modelo = new noEditable();
        ResultSet st = con.consultarDatos(sql);
        modelo.setColumnIdentifiers(new Object[]{"Codigo Salon", "Numero Salon", "Nombre", "Capacidad", "Estado"});
        try {
            while (st.next()) {
                modelo.addRow(new Object[]{st.getString("codigo"), st.getString("no_salon"), st.getString("nombre_salon"), st.getString("capacidad_salon"), st.getString("estado_salon")});
            }

        } catch (SQLException e) {
            System.out.print(e);
        }

        return modelo;
    }

    public boolean insertarSalon(Salon salon) {

        int resultado;
        String sql = "INSERT INTO tbl_salon(codigo, no_salon, nombre_salon, capacidad_salon, estado_salon) VALUES (?,?,?,?,?);";

        try {
            ps = con.preparar(sql);
            ps.setInt(1, salon.getCodigo());
            ps.setInt(2, salon.getNo_salon());
            ps.setString(3, salon.getNombre_salon());
            ps.setInt(4, salon.getCapacidad());
            ps.setInt(5, salon.getEstado_salon());
            resultado = this.ps.executeUpdate();

        } catch (SQLException e) {
            con.mensajeError = e.getMessage();
            return false;
        }
        return (resultado > 0);
    }
    
    public boolean borrarSalon(Salon salon){
        int resultado;
        String sql = "DELETE FROM tbl_salon WHERE codigo = ?;";
        ps = con.preparar(sql);
        try {
            ps.setInt(1, salon.getCodigo());
            resultado = this.ps.executeUpdate();
        } catch (SQLException ex) {
            con.mensajeError = ex.getMessage();
            return false;
        }
        return (resultado > 0);
    }

}

package control_salones.controlador;

import control_salones.datos.ConectorMario;
import control_salones.modelo.Salon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SalonControlador {

    private PreparedStatement ps;
    private Connection conn;
    ConectorMario con = new ConectorMario();

    public class noEditable extends DefaultTableModel {

        @Override
        public boolean isCellEditable(int fila, int columna) {
            if (columna == 8) {
                return true;
            }
            return false;
        }
    }

    public noEditable mostrarSalon(String sql) {
        noEditable modelo = new noEditable();
        ResultSet st = con.consultarDatos(sql);
        modelo.setColumnIdentifiers(new Object[]{"Codigo Salon", "Nombre Salon", "Capacidad", "PC Instructor", "Proyector", "Pizarron", 
            "PC Participantes", "Observaciones(mas equipo)"});
        try {
            while (st.next()) {
                modelo.addRow(new Object[]{st.getString("codigo"), st.getString("nombre_salon"), st.getString("capacidad_salon"), 
                    st.getString("pc_instructor"), st.getString("proyector"), st.getString("pizarron"), st.getString("pc_participantes"), 
                    st.getString("otros_equipos")});
            }

        } catch (SQLException e) {
            System.out.print(e);
        }

        return modelo;
    }

    public boolean insertarSalon(Salon salon) {

        int resultado;
        String sql = "INSERT INTO tbl_salon(nombre_salon, capacidad_salon, pc_instructor, proyector, pizarron, pc_participantes, "
                + "otros_equipos) VALUES (?,?,?,?,?,?,?);";

        try {
            ps = con.preparar(sql);
            ps.setString(1, salon.getNombre_salon());
            ps.setInt(2, salon.getCapacidad_salon());
            ps.setInt(3, salon.getPc_instructor());
            ps.setInt(4, salon.getProyector());
            ps.setInt(5, salon.getPizarron());
            ps.setString(6, salon.getPc_participantes());
            ps.setString(7, salon.getObservaciones());
            resultado = this.ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Se agrego el salon");
        } catch (SQLException e) {
            con.mensajeError = e.getMessage();
            return false;
        }
        return (resultado > 0);
    }
    
    public boolean modificarSalon(Salon salon) {

        int resultado;
        String sql = "UPDATE tbl_salon SET nombre_salon = ?, capacidad_salon = ?, pc_instructor = ?, proyector = ?, pizarron = ?, pc_participantes = ?, otros_equipos = ? "
                + "WHERE codigo = ?;";

        try {
            ps = con.preparar(sql);
            ps.setString(1, salon.getNombre_salon());
            ps.setInt(2, salon.getCapacidad_salon());
            ps.setInt(3, salon.getPc_instructor());
            ps.setInt(4, salon.getProyector());
            ps.setInt(5, salon.getPizarron());
            ps.setString(6, salon.getPc_participantes());
            ps.setString(7, salon.getObservaciones());
            ps.setInt(8, salon.getCodigo());
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

package control_salones.controlador;

import control_salones.datos.Conector;
import control_salones.modelo.Equipo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class EquipoControlador {
    Conector con = new Conector();
    
    public class noEditable extends DefaultTableModel{
        @Override
        public boolean isCellEditable (int fila, int columna){
            if (columna == 6)
                return true;
            return false;
        }
    }
    
    public noEditable mostrarEquipo(String sql){
        noEditable modelo = new noEditable();
        ResultSet st = con.consultarDatos(sql);
        modelo.setColumnIdentifiers(new Object[]{"Codigo Salon","Codigo Equipo", "Nombre", "Descripcion", "Cantidad"});
        try {
            while (st.next()) {
                modelo.addRow(new Object[]{st.getString("codigo"),st.getString("es.codigo_equipo"), st.getString("e.nombre"), st.getString("es.cantidad")});
            }

        } catch (SQLException e) {
            System.out.print(e);
        }
        
        return modelo;
    }
    
    public List<Equipo> getDatos() {
        return null;
    }
}

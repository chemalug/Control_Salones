package control_salones.controlador;

import control_salones.datos.ConectorMario;
import control_salones.modelo.EquipoSalon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class EquipoSalonControlador {

    ConectorMario con = new ConectorMario();
    
    public class noEditable extends DefaultTableModel{
        @Override
        public boolean isCellEditable (int fila, int columna){
            if (columna == 6)
                return true;
            return false;
        }
    }
    
    public noEditable mostrarEquipoSalon(String sql){
        noEditable modelo = new noEditable();
        ResultSet st = con.consultarDatos(sql);
        modelo.setColumnIdentifiers(new Object[]{"Codigo Salon","Numero Salon", "Nombre", "Capacidad", "Estado"});
        try {
            while (st.next()) {
                modelo.addRow(new Object[]{st.getString("codigo"),st.getString("no_salon"), st.getString("nombre_salon"), st.getString("capacidad_salon"), st.getString("estado_salon")});
            }

        } catch (SQLException e) {
            System.out.print(e);
        }
        
        return modelo;
    }
    
    public List<EquipoSalon> getDatos() {
        return null;
    }

}

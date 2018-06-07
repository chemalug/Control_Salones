package control_salones.controlador;

import control_salones.datos.Conector;
import control_salones.modelo.EquipoSalon;
import control_salones.modelo.Salon;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class SalonControlador {
    
    Conector con = new Conector();
    
    public class noEditable extends DefaultTableModel{
        @Override
        public boolean isCellEditable (int fila, int columna){
            if (columna == 6)
                return true;
            return false;
        }
    }
    
    public noEditable mostrarSalon(String sql){
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
    
    public void insertarDatos(Salon salon) {
        Conector c = new Conector();
        c.conectar();
        c.insertar("INSERT INTO tbl_salon(codigo, no_salon, nombre_salon, capacidad_salon, estado_salon) VALUES (NULL," + salon.getNo_salon() + ",'" + salon.getNombre_salon() + "', " + salon.getCapacidad() + ", " + salon.getEstado_salon() + ");");
        c.desconectar();
    }
}

package control_salones.controlador;

import control_salones.datos.Conector;
import control_salones.modelo.Salon;

import java.sql.ResultSet;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class SalonControlador {

    public ResultSet mostrarDatos() {
        ResultSet result = null;
        Conector c = new Conector();
        c.conectar();
        String sql = "SELECT * FROM tbl_salon;";
        result = c.consultaRegistro(sql);
        return result;
    }
    
    public DefaultTableModel mostrarSalon(){
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet st = mostrarDatos();
        modelo.setColumnIdentifiers(new Object[]{"Numero Salon","Nombre","Capacidad","Estado"});
        try{
            while (st.next()){
                modelo.addRow(new Object[]{st.getString("no_salon"),st.getString("nombre_salon"),st.getString("capacidad_salon"),st.getString("estado_salon")});
            }
            
        }catch(Exception e){
            System.out.print(e);
        }
        return modelo;
    }
    
    public List<Salon> getDatos(){
        return null;
    }
}

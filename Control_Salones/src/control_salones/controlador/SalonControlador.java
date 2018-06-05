package control_salones.controlador;

import control_salones.datos.Conector;
import control_salones.modelo.Salon;

import java.sql.ResultSet;
import java.util.List;

public class SalonControlador {

    public ResultSet mostrarDatos() {
        ResultSet result = null;
        Conector c = new Conector();
        c.conectar();
        String sql = "SELECT * FROM tbl_salon;";
        result = c.consultaRegistro(sql);
        return result;
    }
    
    public List<Salon> getDatos(){
        return null;
    }
}

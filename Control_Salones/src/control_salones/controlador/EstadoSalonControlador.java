package control_salones.controlador;

import control_salones.datos.Conector;
import control_salones.modelo.EstadoSalon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class EstadoSalonControlador {

    public ResultSet datosCombo() {
        ResultSet result = null;
        Conector c = new Conector();
        c.conectar();
        String sql = "SELECT * FROM tbl_estado_salon;";
        result = c.consultaRegistro(sql);
        return result;
    }

    public Vector<EstadoSalon> listaObjetos() {
        ResultSet datos = null;
        datos = this.datosCombo();
        Vector<EstadoSalon> lista = new Vector<>();
        try {
            if (datos.next()) {
                do {
                    EstadoSalon lt = new EstadoSalon(datos.getInt(1), datos.getString(2));
                    lista.addElement(lt);
                } while (datos.next());
                return lista;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
}

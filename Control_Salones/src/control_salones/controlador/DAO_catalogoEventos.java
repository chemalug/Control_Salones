package control_salones.controlador;

import control_salones.datos.ConectorJosh;
import control_salones.modelo.CatalogoEvento;
import control_salones.modelo.Instructor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class DAO_catalogoEventos {

    public ArrayList<CatalogoEvento> obtenerDatos() {
        ConectorJosh db = new ConectorJosh();
        db.conectar();
        ArrayList<CatalogoEvento> listado = new ArrayList<>();
        ResultSet resultado = db.consulta("select * from tbl_catalogo_evento");
        try {
            while (resultado.next()) {
                CatalogoEvento aux = new CatalogoEvento();
                aux.setCodigo(resultado.getInt(1));
                aux.setCodigo_especialidad(resultado.getInt(2));
                aux.setNombre_evento(resultado.getString(3));
                aux.setTipo_evento(resultado.getInt(4));
                aux.setNivel_competencia(resultado.getInt(5));
                aux.setDuracion_modulo(resultado.getInt(6));
                aux.setEstado_modulo(resultado.getInt(7));
                listado.add(aux);
            }
            db.desconectar();
        } catch (SQLException e) {

        }
        return listado;
    }

    public void insertarDatos(CatalogoEvento datosE) {
        ConectorJosh c = new ConectorJosh();
        c.conectar();
        String sql = ("INSERT INTO tbl_catalogo_evento (codigo, codigo_especialidad,nombre_evento, tipo_evento, nivel_competencia, duracion_modulo, estado_modulo) "
                + "VALUES(" + datosE.getCodigo() + "," + datosE.getCodigo_especialidad() + ",'" + datosE.getNombre_evento() + "'," + datosE.getTipo_evento() + "," + datosE.getNivel_competencia() + ","
                + datosE.getDuracion_modulo() + "," + datosE.getEstado_modulo() + ");");
        c.insertar(sql);
        c.desconectar();
    }

}

package control_salones.controlador;

import control_salones.datos.ConectorJosh;
import control_salones.modelo.Especialidad;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO_Especialidad {

    public ArrayList<Especialidad> obtenerDatos() {
        ConectorJosh db = new ConectorJosh();
        db.conectar();
        ArrayList<Especialidad> listado = new ArrayList<>();
        ResultSet resultado = db.consulta("select * from tbl_especialidad");
        try {
            while (resultado.next()) {
                Especialidad aux = new Especialidad();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre_especialidad(resultado.getString(2));
                listado.add(aux);
            }
            db.desconectar();
        } catch (SQLException e) {

        }
        return listado;
    }

    public void insertarDatos(Especialidad especialidad) {
        ConectorJosh c = new ConectorJosh();
        c.conectar();
        c.insertar("INSERT INTO tbl_especialidad (codigo, nombre_especialidad) VALUES (" + especialidad.getCodigo() + ","
                + "'" + especialidad.getNombre_especialidad() + "');");

        c.desconectar();
    }

    public void borrarDatos(Especialidad delEspecialidad) {
        ConectorJosh c = new ConectorJosh();
        c.conectar();
        String sql = "DELETE FROM tbl_Especialidad WHERE codigo =" + delEspecialidad.getCodigo() + ";";
        c.delDatos(sql);

    }

    public void updateDatos(Especialidad datosE) {
        ConectorJosh c = new ConectorJosh();
        c.conectar();
        c.insertar("UPDATE tbl_Especialidad SET nombre_especialidad =" + "'"
                + datosE.getNombre_especialidad() + "'" + " WHERE codigo =" + datosE.getCodigo() + ";");

    }

    public ArrayList<Especialidad> buscarDatos(String codigo) {
        ConectorJosh db = new ConectorJosh();
        db.conectar();
        ArrayList<Especialidad> listado = new ArrayList<>();
        ResultSet resultado = db.consulta("SELECT * FROM tbl_Especialidad WHERE codigo LIKE '%" + codigo + "%'");
        try {
            while (resultado.next()) {
                Especialidad aux = new Especialidad();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre_especialidad(resultado.getString(2));
                listado.add(aux);
            }
            db.desconectar();
        } catch (SQLException e) {

        }
        return listado;
    }

}

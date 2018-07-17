/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.controlador;

import control_salones.datos.ConectorJosh;
import control_salones.modelo.Especialidad;
import control_salones.modelo.TipoEvento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author efi
 */
public class DAO_TipoEvento {

    public ArrayList<TipoEvento> obtenerDatos() {
        ConectorJosh db = new ConectorJosh();
        db.conectar();
        ArrayList<TipoEvento> listado = new ArrayList<>();
        ResultSet resultado = db.consulta("select * from tbl_tipo_evento");
        try {
            while (resultado.next()) {
                TipoEvento aux = new TipoEvento();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre_tipo_evento(resultado.getString(2));
                listado.add(aux);
            }
            db.desconectar();
        } catch (SQLException e) {

        }
        return listado;
    }

    public void insertarDatos(TipoEvento evento) {
        ConectorJosh c = new ConectorJosh();
        c.conectar();
        c.insertar("INSERT INTO tbl_tipo_evento (codigo, nombre_tipo_evento) VALUES (" + evento.getCodigo() + ","
                + "'" + evento.getNombre_tipo_evento() + "');"
        );
        c.desconectar();
    }

    public void borrarDatos(TipoEvento delEvento) {
        ConectorJosh c = new ConectorJosh();
        c.conectar();
        String sql = "DELETE FROM tbl_tipo_evento WHERE codigo =" + delEvento.getCodigo() + ";";
        c.delDatos(sql);

    }

    public void updateDatos(TipoEvento datosE) {
        ConectorJosh c = new ConectorJosh();
        c.conectar();
        c.insertar("UPDATE tbl_tipo_evento SET nombre_tipo_evento='" + datosE.getNombre_tipo_evento() + "' WHERE codigo =" + datosE.getClass() + ";");
    }

    public ArrayList<TipoEvento> buscarDatos(String codigo) {
        ConectorJosh db = new ConectorJosh();
        db.conectar();
        ArrayList<TipoEvento> listado = new ArrayList<>();
        ResultSet resultado = db.consulta("SELECT * FROM tbl_tipo_evento WHERE codigo LIKE '%" + codigo + "%'");
        try {
            while (resultado.next()) {
                TipoEvento aux = new TipoEvento();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre_tipo_evento(resultado.getString(2));
                listado.add(aux);
            }
            db.desconectar();
        } catch (SQLException e) {

        }
        return listado;
    }

}

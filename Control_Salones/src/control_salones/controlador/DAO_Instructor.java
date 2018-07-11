/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.controlador;

import control_salones.datos.conexion;

import control_salones.modelo.Instructor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author efi
 */
public class DAO_Instructor {

    public ArrayList<Instructor> obtenerDatos() {
        conexion db = new conexion();
        db.conectar();
        ArrayList<Instructor> listado = new ArrayList<>();
        ResultSet resultado = db.consulta("select * from tbl_Instructor");
        try {
            while (resultado.next()) {
                Instructor aux = new Instructor();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre_instructor(resultado.getString(2));
                aux.setRenglon_presupuestario(resultado.getString(3));
                aux.setEstado(resultado.getInt(4));
                aux.setNit_instructor(resultado.getString(5));
                aux.setCorreo_instructor(resultado.getString(6));
                listado.add(aux);
            }
            db.desconectar();
        } catch (SQLException e) {

        }
        return listado;
    }

    public void insertarDatos(Instructor datosI) {
        conexion c = new conexion();
        c.conectar();
        c.insertar("INSERT INTO tbl_instructor (codigo, nombre_instructor, reglon_presupuestario,estado, nit_instructor, correo_instructor)"
                + "VALUES (" + datosI.getCodigo() + ",'" + datosI.getNombre_instructor() + "'," + "'" + datosI.getRenglon_presupuestario() + "'"
                + "," + datosI.getEstado() + ",'" + datosI.getNit_instructor() + "'," + "'" + datosI.getCorreo_instructor() + "');"
        );

        c.desconectar();
    }

    public void updateDatos(Instructor datosI) {
        conexion c = new conexion();
        c.conectar();
        c.insertar("UPDATE tbl_instructor SET nombre_instructor =" + "'" + datosI.getNombre_instructor() + "'" + ", reglon_presupuestario=" + "'" + datosI.getRenglon_presupuestario() + "'"
                + ", estado=" + datosI.getEstado() + ", nit_instructor= " + "'" + datosI.getNit_instructor() + "'" + ", correo_instructor=" + "'" + datosI.getCorreo_instructor() + "'"
                + " WHERE codigo =" + datosI.getCodigo() + ";");

    }

    public void borrarDatos(Instructor delInstructor) {
        conexion c = new conexion();
        c.conectar();
        String sql = "DELETE FROM tbl_instructor WHERE codigo =" + delInstructor.getCodigo() + ";";
        c.delDatos(sql);

    }

    public ArrayList<Instructor> buscarDatos(String codigo) {
        conexion db = new conexion();
        db.conectar();
        ArrayList<Instructor> listado = new ArrayList<>();
        ResultSet resultado = db.consulta("SELECT * FROM tbl_Instructor WHERE codigo LIKE '%" + codigo + "%'");
        try {
            while (resultado.next()) {
                Instructor aux = new Instructor();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre_instructor(resultado.getString(2));
                aux.setRenglon_presupuestario(resultado.getString(3));
                aux.setEstado(resultado.getInt(4));
                aux.setNit_instructor(resultado.getString(5));
                aux.setCorreo_instructor(resultado.getString(6));
                listado.add(aux);
            }
            db.desconectar();
        } catch (SQLException e) {

        }
        return listado;
    }

}

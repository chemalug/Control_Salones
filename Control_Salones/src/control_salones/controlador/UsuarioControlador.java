/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.controlador;

import control_salones.datos.J_Conector;
import control_salones.modelo.Usuario;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author u-jona
 */
public class UsuarioControlador {

    public ArrayList<Usuario> consultarUsuario() {
        ArrayList<Usuario> listado = new ArrayList();
        J_Conector con = new J_Conector();
        con.conectar();
        ResultSet rs = con.consultar("SELECT * FROM tbl_usuario");

        try {
            while (rs.next()) {
                Usuario aux = new Usuario();
                aux.setCodigo(rs.getInt(1));
                aux.setNombre(rs.getString(2));
                aux.setUsuario(rs.getString(3));
                aux.setPassword(rs.getString(4));
                aux.setEstado_usuario(rs.getInt(5));
                listado.add(aux);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            con.desconectar();
        }
        return listado;
    }

    public void insertarUsuario(Usuario usr) {
        J_Conector con = new J_Conector();
        con.conectar();
        con.consultaG("INSERT INTO tbl_usuario (nombre, usuario, password, estado_usuario) VALUES (" + 
        "'" + usr.getNombre() + "','" + usr.getUsuario() + "','" + usr.getPassword() + 
        "','" + String.valueOf(usr.getEstado_usuario()) + "');");
        con.desconectar();
    }
      public void eliminarUsuario(String codigo) {
        J_Conector con = new J_Conector();
        con.conectar();
        con.consultaG("DELETE codigo FROM tbl_usuario WHERE"+"'"+codigo+"';");
        con.desconectar();
    }
}

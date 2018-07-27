/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.controlador;

import control_salones.datos.J_Conector;
import control_salones.modelo.Login;
import control_salones.modelo.Usuario;

/**
 *
 * @author u-jona
 */
public class LoginControlador {
     public boolean login(Usuario lg){
         J_Conector con = new J_Conector();
         con.conectar();
         String sql = "SELECT codigo, nombre, usuario, password, estado_usuario FROM tbl_usuario WHERE usuario ="+ 
                        lg.getUsuario() +"AND password="+ lg.getPassword()+"";
         con.consultar(sql);
         String pass = lg.getPassword();
         if(lg.getPassword().equals(pass)){
             lg.getUsuario();
             lg.getNombre();
             lg.getCodigo();
         }
         return false;
    }
}

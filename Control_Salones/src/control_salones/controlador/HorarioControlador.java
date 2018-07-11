/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.controlador;

import control_salones.datos.Conector;
import control_salones.modelo.Horario;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;


/**
 *
 * @author u-jona
 */
public class HorarioControlador {
    public ArrayList<Horario> consultarHorario(){
        ArrayList<Horario> listado = new ArrayList();
        Conector con = new Conector();
        con.conectar();
        ResultSet rs = con.consultar("SELECT * FROM tbl_horario;");
        
        try {
            while(rs.next()){
                Horario h = new Horario();
                h.setCodigo(rs.getInt(1));
                h.setHora_inicio(rs.getTime(2));
                h.setHora_fin(rs.getTime(3));
                listado.add(h);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        con.desconectar();
    
        return listado;
    }
}

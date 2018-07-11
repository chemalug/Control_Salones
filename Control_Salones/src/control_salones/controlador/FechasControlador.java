/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.controlador;

import control_salones.datos.Conector;
import control_salones.modelo.Fecha;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author u-jona
 */
public class FechasControlador {
    
     public ArrayList<Fecha> consultarFechas(){
        ArrayList<Fecha> listado = new ArrayList();
        Conector con = new Conector();
        con.conectar();
        ResultSet rs = con.consultar("SELECT * FROM tbl_fechas LIMIT 366;");
        
        try {
            while(rs.next()){
                Fecha f = new Fecha();
                f.setCodigo(rs.getInt(1));
                f.setFecha(rs.getDate(2));
                f.setEstado(rs.getInt(3));
                f.setNombre_fecha(rs.getString(4));
     
                listado.add(f);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.desconectar();
    
        return listado;
    }
}

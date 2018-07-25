/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.controlador;

import control_salones.datos.Database;
import control_salones.datos.J_Conector;
import control_salones.modelo.Fecha;
import control_salones.modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author u-jona
 */
public class FechasControlador {
    
     public ArrayList<Fecha> consultarFechas(){
        ArrayList<Fecha> listado = new ArrayList();
        J_Conector con = new J_Conector();
        con.conectar();
        ResultSet rs = con.consultar("SELECT * FROM tbl_fechas ;");
        
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
     public ArrayList<Fecha> buscarFechas(String fecha){
        ArrayList<Fecha> listado = new ArrayList();
        J_Conector con = new J_Conector();
        con.conectar();
        ResultSet rs = con.consultar("SELECT * FROM tbl_fechas WHERE fecha = '" + fecha + "';");
        
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
      public void llenarFechas(int anio){
        
        GregorianCalendar calendario = new GregorianCalendar();
        int totaldias = 0;
        if(calendario.isLeapYear(totaldias)){
        totaldias = 366;
                }else{
        totaldias = 365;
        }
    
        for(int i = 1; i<=totaldias; i++ ){
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar tr = new GregorianCalendar(anio, 0, 1);
            tr.add(Calendar.DAY_OF_YEAR, i-1);
            String currentTime = sdf.format(tr.getTime());
            ArrayList<Object> args = new ArrayList<>();
            args.add(i);
            args.add(currentTime);
            args.add(0);
            args.add("");
            Database.procedimiento("sp_insertar_fechas", args);
       }
        
    
    }
      public boolean anio(short anio){
        J_Conector con = new J_Conector();
        con.conectar();
        ResultSet rs = con.consultar("SELECT COUNT(*) FROM tbl_fechas WHERE YEAR(fecha)='"+ anio +"';");
        boolean resultado = false;
          try {
              while(rs.next()){
            resultado = true;
        }
          } catch (SQLException e) {
              
               Logger.getLogger(UsuarioControlador.class.getName()).log(Level.SEVERE, null, e);
          }
        con.desconectar();
        return resultado;
  
      }
        public void modifFecha(Fecha fh) {
        J_Conector con = new J_Conector();
        con.conectar();
        String sql = "UPDATE tbl_fechas SET estado=" + fh.getEstado()+ ", nombre_fecha="+"'"+fh.getNombre_fecha()+"'  WHERE codigo="+""+fh.getCodigo()+";";
        con.consultaG(sql);
        con.desconectar();
    }
        
        public boolean anio2(int anio){
        Database db  = new Database();
        String sql = "Select * from tbl_fechas where fecha >= '"+ anio +"-1-1';" ;
        ResultSet rs =  db.consultar(sql);
        boolean resultado=true;
        int encontrado = 0;
        try {
        while(rs.next())    {
            encontrado++;
        }
        } catch (Exception e) {
        }
        
        if(encontrado == 0){
        resultado = true; 
        }else{
                resultado = false;}
        return resultado;        }
}

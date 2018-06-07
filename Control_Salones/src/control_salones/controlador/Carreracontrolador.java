/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
 
import javax.swing.JOptionPane;
 
import control_salones.modelo.Carrera;
import control_salones.datos.Conector;
import control_salones.modelo.Tipo_Carrera;




import java.sql.PreparedStatement;


import javax.swing.JComboBox;

/**
 *
 * @author LouFlores
 */


// CONSULTA LAS CARRERAS PARA MOSTRARLAS EN EL JTABLE
public class Carreracontrolador {
    public ArrayList<Carrera> ConsultarCarrera() {
 //establecer conexion con bd
  Conector conex = new Conector();
  conex.conectar();
  ArrayList<Carrera> miLista = new ArrayList<Carrera>();
  //crear consulta SQL mediante Resulset
 ResultSet rs = conex.consulta("SELECT * FROM tbl_carrera;");
 //crear Try catch con bucle while para que agregre los datos 
  try {
   while (rs.next()) {
   Carrera aux = new Carrera();
    aux.setCodigo(Integer.parseInt(rs.getString("codigo")));
    aux.setTipo_carrera(rs.getString("codigo_tipo_carrera"));
     aux.setNombre(rs.getString("nombre_carrera"));
    aux.setEstado(rs.getString("estado_carrera"));
    aux.setVersion(rs.getString("version"));
    
    miLista.add(aux);
   }
   rs.close();
   
   conex.desconectar();
 
  } catch (SQLException e) {
   System.out.println(e.getMessage());
   JOptionPane.showMessageDialog(null, "Error al consultar", "Error",
     JOptionPane.ERROR_MESSAGE);
 
  }
  return miLista;
 }
    

//CONSULTA LOS TIPOS DE DATO PARA LLENAR EL JCOMBOBOX
public void consultar_tipo(JComboBox cbxTipocarrera){

//Creamos objeto tipo Connection  para establecer conexion con bd  
java.sql.Connection conectar = null;    
PreparedStatement pst = null;

Conector conex = new Conector();
  conex.conectar();
//Creamos la Consulta SQL

   ResultSet rs = conex.consulta("SELECT codigo, descripcion FROM tbl_tipo_carrera ORDER BY descripcion ASC;");
//Establecemos bloque try-catch-finally
try {      
   //LLenamos nuestro ComboBox
   cbxTipocarrera.addItem("Seleccione una opción");
    Tipo_Carrera tipoCarrera;
   while(rs.next()){   
       
       cbxTipocarrera.addItem(new Tipo_Carrera(rs.getInt(1), rs.getString(2)));
   }    
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e);   
}finally{
    if(conectar!=null){        
        try {       
            conectar.close();
            rs.close();            
            conectar=null;
            rs=null;
            
        } catch (SQLException ex) {            
            JOptionPane.showMessageDialog(null, ex);    
        }
    }
}
}


    
}

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
import control_salones.datos.Conector;




import java.sql.PreparedStatement;


import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
   //INSERTAR DATOS

public void Insertar(Carrera modCarrera){


 Conector c = new Conector();
     c.conectar();
//     String prueba="";
//     prueba = ( "INSERT INTO  tbl_carrera (codigo, codigo_tipo_carrera, nombre_carrera, estado_carrera, version) VALUE  ("+modCarrera.getCodigo()+", "+modCarrera.getTipo_carrera()+",'"+modCarrera.getNombre()+"','"+modCarrera.getEstado()+"', "+modCarrera.getVersion()+");");
//    
  c.insertar( "INSERT INTO  tbl_carrera (codigo, codigo_tipo_carrera, nombre_carrera, estado_carrera, version) VALUE  ("+modCarrera.getCodigo()+", "+modCarrera.getTipo_carrera()+",'"+modCarrera.getNombre()+"','"+modCarrera.getEstado()+"', "+modCarrera.getVersion()+");");
  

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




//CONSULTA EL CODIGO DE LA TABLA TIPO DE CARRERA PARA LLENAR EL JTXTFIELD
public void llenar_jtxtfield(JTextField txtCodigo){

//Creamos objeto tipo Connection  para establecer conexion con bd  
java.sql.Connection conectar = null;    
PreparedStatement pst = null;

Conector conex = new Conector();
  conex.conectar();
//Creamos la Consulta SQL

   ResultSet rs = conex.consulta("SELECT MAX(codigo) + 1 FROM tbl_tipo_carrera;");
//Establecemos bloque try-catch-finally
try {      
   //LLenamos nuestro ComboBox
 
    Tipo_Carrera tipoCarrera;
   while(rs.next()){   
       
       txtCodigo.setText(rs.getString(1));
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

//MODIFICA LOS DATOS DE LA CARRERA SELECCIONADA

public void Actualizar(Carrera modCarrera){


 Conector c = new Conector();
     c.conectar();
     String prueba="";
   c.insertar( "UPDATE tbl_carrera SET  codigo_tipo_carrera= "+modCarrera.getTipo_carrera()+",nombre_carrera= '"+modCarrera.getNombre()+"',estado_carrera='"+modCarrera.getEstado()+"', version= "+modCarrera.getVersion()+"  WHERE codigo ="+modCarrera.getCodigo()+";");
  

}



//BUSCAR POR CODIGO EN JTABLE

public ArrayList<Carrera> buscarCarrera(String codigo) {
 //establecer conexion con bd
  Conector conex = new Conector();
  conex.conectar();
  ArrayList<Carrera> miLista = new ArrayList<Carrera>();
  //crear consulta SQL mediante Resulset
 ResultSet rs = conex.consulta("SELECT * FROM tbl_carrera WHERE codigo LIKE '%"+ codigo +"%'");
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
// ELIMINA DATOS DE LA TABLA CARRERA


public void Eliminar(Carrera deCarrera){
    Conector c = new Conector();
     c.conectar();
     String sql = "DELETE FROM tbl_carrera WHERE codigo ="+deCarrera.getCodigo()+";";
     c.delDatos(sql);
     
 }







}

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

//ACTUALIZA LOS DATOS DE LA CARRERA SELECCIONADA

public void Actualizar(int codigo, String tipo_carrera, String nombre, String estado, String version){

int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
if(confirmar == JOptionPane.YES_OPTION){
    //Creamos objeto tipo Connection  para establecer conexion con bd  
java.sql.Connection conectar = null;    
PreparedStatement pst = null;

Conector conex = new Conector();
  conex.conectar();
//Creamos la Consulta SQL
//   ResultSet rs = conex.consulta("UPDATE tbl_carrera SET codigo_tipo_carrera=?, nombre_carrera=?, estado_carrera=?, version=? "
//                    + "WHERE codigo=?");
//Establecemos bloque try-catch-finally   
    try {     
        String Ssql = "UPDATE tbl_carrera SET codigo_tipo_carrera=?, nombre_carrera=?, estado_carrera=?, version=? "
                 + "WHERE codigo=?";       
        pst = conectar.prepareStatement(Ssql);        
        pst.setInt(1, codigo);
        pst.setString(2, tipo_carrera);
        pst.setString(3, nombre);
        pst.setString(4, estado);
        pst.setString(5, version);
              
        if(pst.executeUpdate() > 0){       
            JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa", 
                                          JOptionPane.INFORMATION_MESSAGE);            
        }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos\n"
                                          + "Inténtelo nuevamente.", "Error en la operación", 
                                          JOptionPane.ERROR_MESSAGE);       
        }   } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos\n"
                                          + "Inténtelo nuevamente.\n"
                                          + "Error: "+e, "Error en la operación", 
                                          JOptionPane.ERROR_MESSAGE); }finally{
        if(conex!=null){  
            try {
                
                conectar.close();
            
            } catch (SQLException e) {
            
                JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión."
                                          + "Error: "+e, "Error en la operación", 
                                          JOptionPane.ERROR_MESSAGE);
}}}}}



//BUSCAR POR CODIGO EN JTABLE

DefaultTableModel ModeloTabla;
    
public void Buscar(String valor,  JTable tblcarrera){

    String [] columnas={"Codigo","Tipo Carrera","Nombre","Estado","Version"};
    String [] registro=new String[7];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    String SSQL;
  java.sql.Connection conectar = null; 
    
        SSQL= "SELECT codigo, codigo_tipo_carrera, nombre_carrera, estado_carrera, version FROM tbl_carrera WHERE codigo=  '%"+valor+"%'";
    
    try {
Conector conex = new Conector();
  conex.conectar();
     PreparedStatement pst = conectar.prepareStatement(SSQL);
 
        ResultSet rs = pst.executeQuery();

        while (rs.next()){
          
            registro[0]=rs.getString("codigo");
            registro[1]=rs.getString("codigo_tipo_carrera");
            registro[2]=rs.getString("nombre_carrera");
            registro[3]=rs.getString("estado_carrera");
            registro[4]=rs.getString("version");
           
            ModeloTabla.addRow(registro);
           
        }
        
        tblcarrera.setModel(ModeloTabla);

    } catch (SQLException e) {


        JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
    
    
    }finally{

        if(conectar!=null){
        
            try {

                conectar.close();

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);

            }
        
        }
        
    }

}










}

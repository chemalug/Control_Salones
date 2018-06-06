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
 
import control_salones.modelo.dao_Carrera;
import control_salones.datos.Conector;
/**
 *
 * @author EFI
 */
public class Carreracontrolador {
    public ArrayList<dao_Carrera> buscarUsuariosConMatriz() {
 
  Conector conex = new Conector();
  conex.conectar();
  ArrayList<dao_Carrera> miLista = new ArrayList<dao_Carrera>();
 ResultSet rs = conex.consulta("SELECT * FROM TBL_CARRERA ");
  try {
   while (rs.next()) {
   dao_Carrera aux = new dao_Carrera();
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
}

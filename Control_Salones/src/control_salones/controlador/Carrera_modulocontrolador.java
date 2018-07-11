/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.controlador;

import control_salones.datos.Conector;
import control_salones.modelo.Carrera;
import control_salones.modelo.Carrera_Modulo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author EFI
 */
public class Carrera_modulocontrolador {
    // CONSULTA LAS CARRERAS PARA MOSTRARLAS EN EL JTABLE

    public ArrayList<Carrera_Modulo> ConsultarModulo(int codigo) {
 //establecer conexion con bd
  Conector conex = new Conector();
  conex.conectar();

  ArrayList<Carrera_Modulo> miLista = new ArrayList<Carrera_Modulo>();
  //crear consulta SQL mediante Resulset

ResultSet rs = conex.consulta("SELECT evento.codigo_especialidad, evento.nombre_evento, evento.tipo_evento, evento.nivel_competencia, evento.duracion_modulo, evento.estado_modulo, car.nombre_carrera FROM tbl_carrera as car INNER JOIN  tbl_carrera_modulo as modulo ON car.codigo= modulo.codigo_carrera INNER JOIN tbl_catalogo_evento as evento ON evento.codigo =modulo.codigo  WHERE car.codigo  LIKE '%"+ codigo +"%'");
String cod = "SELECT evento.codigo_especialidad, evento.nombre_evento, evento.tipo_evento, evento.nivel_competencia, evento.duracion_modulo, evento.estado_modulo, car.nombre_carrera FROM tbl_carrera as car INNER JOIN  tbl_carrera_modulo as modulo ON car.codigo= modulo.codigo_carrera INNER JOIN tbl_catalogo_evento as evento ON evento.codigo =modulo.codigo  WHERE car.codigo  LIKE '%"+ codigo +"%'";
        System.out.println(cod);
//crear Try catch con bucle while para que agregre los datos 
  try {
   while (rs.next()) {
   Carrera_Modulo aux = new Carrera_Modulo();
    
    aux.setCodigo_especialidad(Integer.parseInt(rs.getString("codigo_especialidad")));
     aux.setNombre_evento(rs.getString("nombre_evento"));
     aux.setTipo_evento(Integer.parseInt(rs.getString("tipo_evento")));
     aux.setNivel_competencia(Integer.parseInt(rs.getString("nivel_competencia")));
      aux.setDuracion_modulo(Integer.parseInt(rs.getString("duracion_modulo")));
       aux.setEstado_modulo(Integer.parseInt(rs.getString("estado_modulo")));
        aux.setNombre_carrera(rs.getString("nombre_carrera"));
    
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

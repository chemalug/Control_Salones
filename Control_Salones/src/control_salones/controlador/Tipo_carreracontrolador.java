/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.controlador;

import control_salones.datos.ConectorLourdes;
import control_salones.modelo.Tipo_Carrera;

/**
 *
 * @author EFI
 */
public class Tipo_carreracontrolador {
    
    
    //INSERTAR DATOS
    public void Insertar(Tipo_Carrera modCarrera){


 ConectorLourdes c = new ConectorLourdes();
     c.conectar();

  c.insertar( "INSERT INTO  tbl_tipo_carrera (codigo, descripcion) VALUE  ("+modCarrera.getCodigo()+", '"+modCarrera.getDescripcion()+"');");
  

} 
}

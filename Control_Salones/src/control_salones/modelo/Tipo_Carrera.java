/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.modelo;

import control_salones.datos.Conector;
import java.sql.PreparedStatement;


/**
 *
 * @author EFI
 */
public class Tipo_Carrera {
    public int codigo;
    public String descripcion;

    public Tipo_Carrera() {
    }

    public Tipo_Carrera(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Tipo_Carrera(String descripcion ) {
        this.descripcion=descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion ;
    }
    
    public void insertar(){
        String Sql = this.toSqlInsert();
        Conector c1 = new Conector();
         c1.consultaVacia(Sql);
        
    }


    private String toSqlInsert() {
        String resultado = "INSERT INTO tbl_tipo_carrera(codigo, descripcion) VALUES ('" + this.codigo+  "','" + this.descripcion+  "');";
        return resultado;
    }
     
}

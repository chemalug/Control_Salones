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
public class Carrera {
    public int codigo;
    public String tipo_carrera;
    public String nombre;
     public String estado;
      public String version;

    public Carrera() {
    }
      
      

    public Carrera(int codigo, String tipo_carrera, String nombre, String estado, String version) {
        this.codigo = codigo;
        this.tipo_carrera = tipo_carrera;
        this.nombre = nombre;
        this.estado = estado;
        this.version = version;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo_carrera() {
        return tipo_carrera;
    }

    public void setTipo_carrera(String tipo_carrera) {
        this.tipo_carrera = tipo_carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "dao_Carrera{" + "codigo=" + codigo + ", tipo_carrera=" + tipo_carrera + ", nombre=" + nombre + ", estado=" + estado + ", version=" + version + '}';
    }
      
      
    public void insertar(){
        String Sql = this.toSqlInsert();
        Conector c1 = new Conector();
         c1.consultaVacia(Sql);
        
    }


    private String toSqlInsert() {
        String resultado = "INSERT INTO tbl_carrera( codigo, codigo_tipo_carrera, nombre_carrera, estado_carrera, version) VALUES ('" + this.codigo+"','" + this.tipo_carrera+ "','" + this.nombre+ "','" + this.estado + "','"+ this.version+ "');";
        return resultado;
    }

    
}

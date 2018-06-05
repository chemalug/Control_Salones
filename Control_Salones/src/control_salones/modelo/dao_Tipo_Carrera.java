/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.modelo;



/**
 *
 * @author EFI
 */
public class dao_Tipo_Carrera {
    public int codigo;
    public String descripcion;

    public dao_Tipo_Carrera() {
    }

    public dao_Tipo_Carrera(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
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
        return "dao_Tipo_Carrera{" + "codigo=" + codigo + ", descripcion=" + descripcion + '}';
    }
    
     
}

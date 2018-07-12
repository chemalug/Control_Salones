/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.modelo;

/**
 *
 * @author efiapp
 */
public class Instructor {

    private int codigo;
    private String nombre_instructor;
    private String reglon_presupuestario;
    private int estado;
    private String nit_instructor;
    private String correo_instructor;

    public Instructor() {
    }

    public Instructor(int codigo, String nombre_instructor, String reglon_presupuestario, int estado, String nit_instructor, String correo_instructor) {
        this.codigo = codigo;
        this.nombre_instructor = nombre_instructor;
        this.reglon_presupuestario = reglon_presupuestario;
        this.estado = estado;
        this.nit_instructor = nit_instructor;
        this.correo_instructor = correo_instructor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_instructor() {
        return nombre_instructor;
    }

    public void setNombre_instructor(String nombre_instructor) {
        this.nombre_instructor = nombre_instructor;
    }

    public String getReglon_presupuestario() {
        return reglon_presupuestario;
    }

    public void setReglon_presupuestario(String reglon_presupuestario) {
        this.reglon_presupuestario = reglon_presupuestario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNit_instructor() {
        return nit_instructor;
    }

    public void setNit_instructor(String nit_instructor) {
        this.nit_instructor = nit_instructor;
    }

    public String getCorreo_instructor() {
        return correo_instructor;
    }

    public void setCorreo_instructor(String correo_instructor) {
        this.correo_instructor = correo_instructor;
    }

    @Override
    public String toString() {
        return nombre_instructor;
    }
    
    
}

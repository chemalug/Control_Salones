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
public class Cliente {
    private int codigo;
    private String nombre;
    private String nit;

    public Cliente() {
    }

    public Cliente(int codigo, String nombre, String nit) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nit = nit;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", nit=" + nit + '}';
    }
    
    
    
}

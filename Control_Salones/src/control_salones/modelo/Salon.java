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
public class Salon {
    private int codigo;
    private int no_salon;
    private String nombre_salon;
    private int capacidad_salon;
    private int estado_salon;

    public Salon() {
    }

    public Salon(int codigo, int no_salon, String nombre_salon, int capacidad_salon, int estado_salon) {
        this.codigo = codigo;
        this.no_salon = no_salon;
        this.nombre_salon = nombre_salon;
        this.capacidad_salon = capacidad_salon;
        this.estado_salon = estado_salon;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNo_salon() {
        return no_salon;
    }

    public void setNo_salon(int no_salon) {
        this.no_salon = no_salon;
    }

    public String getNombre_salon() {
        return nombre_salon;
    }

    public void setNombre_salon(String nombre_salon) {
        this.nombre_salon = nombre_salon;
    }

    public int getCapacidad_salon() {
        return capacidad_salon;
    }

    public void setCapacidad_salon(int capacidad_salon) {
        this.capacidad_salon = capacidad_salon;
    }

    public int getEstado_salon() {
        return estado_salon;
    }

    public void setEstado_salon(int estado_salon) {
        this.estado_salon = estado_salon;
    }

    @Override
    public String toString() {
        return  nombre_salon + " -- No. Salón: " + no_salon;
    }
    
            
}

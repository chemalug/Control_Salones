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
public class Evento {

    private int codigo;
    private int codigo_especialidad;
    private String nombre_evento;
    private int tipo_evento;
    private int nivel_comentencia;
    private int duracion_modulo;
    private int estado_modulo;

    public Evento() {
    }

    public Evento(int codigo, int codigo_especialidad, String nombre_evento, int tipo_evento, int nivel_comentencia, int duracion_modulo, int estado_modulo) {
        this.codigo = codigo;
        this.codigo_especialidad = codigo_especialidad;
        this.nombre_evento = nombre_evento;
        this.tipo_evento = tipo_evento;
        this.nivel_comentencia = nivel_comentencia;
        this.duracion_modulo = duracion_modulo;
        this.estado_modulo = estado_modulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo_especialidad() {
        return codigo_especialidad;
    }

    public void setCodigo_especialidad(int codigo_especialidad) {
        this.codigo_especialidad = codigo_especialidad;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public int getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(int tipo_evento) {
        this.tipo_evento = tipo_evento;
    }

    public int getNivel_comentencia() {
        return nivel_comentencia;
    }

    public void setNivel_comentencia(int nivel_comentencia) {
        this.nivel_comentencia = nivel_comentencia;
    }

    public int getDuracion_modulo() {
        return duracion_modulo;
    }

    public void setDuracion_modulo(int duracion_modulo) {
        this.duracion_modulo = duracion_modulo;
    }

    public int getEstado_modulo() {
        return estado_modulo;
    }

    public void setEstado_modulo(int estado_modulo) {
        this.estado_modulo = estado_modulo;
    }

    @Override
    public String toString() {
        return nombre_evento;
    }
    
}

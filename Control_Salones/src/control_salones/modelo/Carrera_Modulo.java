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
public class Carrera_Modulo {
    public int codigo;
    public int codigo_carrera;
    public int codigo_especialidad;
    public String nombre_evento;
    public int tipo_evento;
    public int nivel_competencia;
    public int duracion_modulo;
    public int estado_modulo;
    public String nombre_carrera;
    

    public Carrera_Modulo() {
    }

    public Carrera_Modulo(int codigo, int codigo_carrera, int codigo_especialidad, String nombre_evento, int tipo_evento, int nivel_competencia, int duracion_modulo, int estado_modulo, String nombre_carrera) {
        this.codigo = codigo;
        this.codigo_carrera = codigo_carrera;
        this.codigo_especialidad = codigo_especialidad;
        this.nombre_evento = nombre_evento;
        this.tipo_evento = tipo_evento;
        this.nivel_competencia = nivel_competencia;
        this.duracion_modulo = duracion_modulo;
        this.estado_modulo = estado_modulo;
        this.nombre_carrera=nombre_carrera;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(int codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
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

    public int getNivel_competencia() {
        return nivel_competencia;
    }

    public void setNivel_competencia(int nivel_competencia) {
        this.nivel_competencia = nivel_competencia;
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
        return "Carrera_Modulo{" + "codigo=" + codigo + ", codigo_carrera=" + codigo_carrera + ", codigo_especialidad=" + codigo_especialidad + ", nombre_evento=" + nombre_evento + ", tipo_evento=" + tipo_evento + ", nivel_competencia=" + nivel_competencia + ", duracion_modulo=" + duracion_modulo + ", estado_modulo=" + estado_modulo + '}';
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.modelo;

import java.util.Date;

/**
 *
 * @author u-jona
 */
public class Fechas {
   private int codigo;
    private Date fecha;
    private int estado ;
    private String nombre_fecha;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre_fecha() {
        return nombre_fecha;
    }

    public void setNombre_fecha(String nombre_fecha) {
        this.nombre_fecha = nombre_fecha;
    }

    public Fechas() {
    }

    public Fechas(int codigo, Date fecha, int estado, String nombre_fecha) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.estado = estado;
        this.nombre_fecha = nombre_fecha;
    }

    @Override
    public String toString() {
        return "Fechas{" + "codigo=" + codigo + ", fecha=" + fecha + ", estado=" + estado + ", nombre_fecha=" + nombre_fecha + '}';
    }
 
}

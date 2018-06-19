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
public class CalendarioSalon {
    private int codigo_salon;
    private int codigo_fecha;
    private int codigo_horario;
    private int codigo_asignacion_evento;

    public int getCodigo_salon() {
        return codigo_salon;
    }

    public void setCodigo_salon(int codigo_salon) {
        this.codigo_salon = codigo_salon;
    }

    public int getCodigo_fecha() {
        return codigo_fecha;
    }

    public void setCodigo_fecha(int codigo_fecha) {
        this.codigo_fecha = codigo_fecha;
    }

    public int getCodigo_horario() {
        return codigo_horario;
    }

    public void setCodigo_horario(int codigo_horario) {
        this.codigo_horario = codigo_horario;
    }

    public int getCodigo_asignacion_evento() {
        return codigo_asignacion_evento;
    }

    public void setCodigo_asignacion_evento(int codigo_asignacion_evento) {
        this.codigo_asignacion_evento = codigo_asignacion_evento;
    }

    public CalendarioSalon() {
    }

    public CalendarioSalon(int codigo_salon, int codigo_fecha, int codigo_horario, int codigo_asignacion_evento) {
        this.codigo_salon = codigo_salon;
        this.codigo_fecha = codigo_fecha;
        this.codigo_horario = codigo_horario;
        this.codigo_asignacion_evento = codigo_asignacion_evento;
    }

    @Override
    public String toString() {
        return "CalendarioSalon{" + "codigo_salon=" + codigo_salon + ", codigo_fecha=" + codigo_fecha + ", codigo_horario=" + codigo_horario + ", codigo_asignacion_evento=" + codigo_asignacion_evento + '}';
    }
    
}

package control_salones.modelo;

import java.util.Date;

public class AsignacionEvento {
    private String codigo;
    private int codigo_salon;
    private int codigo_usuario;
    private int codigo_modulo;
    private String dias_se_imparte;
    private int codigo_instructor;
    private int codigo_estado_evento;
    private Date fecha_inicio;
    private Date fecha_fin;
    private int horas_x_sesion;
    private int hora_inicio;
    private int hora_fin;

    public AsignacionEvento() {
    }

    public AsignacionEvento(String codigo, int codigo_salon, int codigo_usuario, int codigo_modulo, String dias_se_imparte, int codigo_instructor, int codigo_estado_evento, Date fecha_inicio, Date fecha_fin, int horas_x_sesion, int hora_inicio, int hora_fin) {
        this.codigo = codigo;
        this.codigo_salon = codigo_salon;
        this.codigo_usuario = codigo_usuario;
        this.codigo_modulo = codigo_modulo;
        this.dias_se_imparte = dias_se_imparte;
        this.codigo_instructor = codigo_instructor;
        this.codigo_estado_evento = codigo_estado_evento;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.horas_x_sesion = horas_x_sesion;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCodigo_salon() {
        return codigo_salon;
    }

    public void setCodigo_salon(int codigo_salon) {
        this.codigo_salon = codigo_salon;
    }

    public int getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(int codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public int getCodigo_modulo() {
        return codigo_modulo;
    }

    public void setCodigo_modulo(int codigo_modulo) {
        this.codigo_modulo = codigo_modulo;
    }

    public String getDias_se_imparte() {
        return dias_se_imparte;
    }

    public void setDias_se_imparte(String dias_se_imparte) {
        this.dias_se_imparte = dias_se_imparte;
    }

    public int getCodigo_instructor() {
        return codigo_instructor;
    }

    public void setCodigo_instructor(int codigo_instructor) {
        this.codigo_instructor = codigo_instructor;
    }

    public int getCodigo_estado_evento() {
        return codigo_estado_evento;
    }

    public void setCodigo_estado_evento(int codigo_estado_evento) {
        this.codigo_estado_evento = codigo_estado_evento;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getHoras_x_sesion() {
        return horas_x_sesion;
    }

    public void setHoras_x_sesion(int horas_x_sesion) {
        this.horas_x_sesion = horas_x_sesion;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(int hora_fin) {
        this.hora_fin = hora_fin;
    }

    @Override
    public String toString() {
        return "AsignacionEvento{" + "codigo=" + codigo + ", codigo_salon=" + codigo_salon + ", codigo_usuario=" + codigo_usuario + ", codigo_modulo=" + codigo_modulo + ", dias_se_imparte=" + dias_se_imparte + ", codigo_instructor=" + codigo_instructor + ", codigo_estado_evento=" + codigo_estado_evento + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", horas_x_sesion=" + horas_x_sesion + ", hora_inicio=" + hora_inicio + ", hora_fin=" + hora_fin + '}';
    }
}

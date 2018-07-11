
package control_salones.modelo;
public class CatalogoEvento {
int codigo =0;
int codigo_especialidad =0;
String nombre_evento ="";
int tipo_evento =0;
int nivel_competencia =0;
int duracion_modulo=0;
int estado_modulo=0;

    @Override
    public String toString() {
        return "CatalogoEvento{" + "codigo=" + codigo + ", codigo_especialidad=" + codigo_especialidad + ", nombre_evento=" + nombre_evento + ", tipo_evento=" + tipo_evento + ", nivel_competencia=" + nivel_competencia + ", duracion_modulo=" + duracion_modulo + ", estado_modulo=" + estado_modulo + '}';
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

    
}

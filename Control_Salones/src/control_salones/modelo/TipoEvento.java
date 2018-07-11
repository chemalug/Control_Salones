
package control_salones.modelo;


public class TipoEvento {

int codigo =0;
String nombre_tipo_evento ="";

    @Override
    public String toString() {
        return "TipoEvento{" + "codigo=" + codigo + ", nombre_tipo_evento=" + nombre_tipo_evento + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_tipo_evento() {
        return nombre_tipo_evento;
    }

    public void setNombre_tipo_evento(String nombre_tipo_evento) {
        this.nombre_tipo_evento = nombre_tipo_evento;
    }





}

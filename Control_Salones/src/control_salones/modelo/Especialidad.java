
package control_salones.modelo;

public class Especialidad {
    int codigo =0;
    String nombre_especialidad ="";

    @Override
    public String toString() {
        return nombre_especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_especialidad() {
        return nombre_especialidad;
    }

    public void setNombre_especialidad(String nombre_especialidad) {
        this.nombre_especialidad = nombre_especialidad;
    }
    
    
    
}

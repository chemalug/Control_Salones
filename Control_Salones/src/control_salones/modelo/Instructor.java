
package control_salones.modelo;

public class Instructor {
int codigo =0;
String nombre_instructor="";
String renglon_presupuestario="";
int estado =0;
String nit_instructor="";
String correo_instructor="";

    @Override
    public String toString() {
        return "Instructor{" + "codigo=" + codigo + ", nombre_instructor=" + nombre_instructor + ", renglon_presupuestario=" + renglon_presupuestario + ", estado=" + estado + ", nit_instructor=" + nit_instructor + ", correo_instructor=" + correo_instructor + '}';
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_instructor() {
        return nombre_instructor;
    }

    public void setNombre_instructor(String nombre_instructor) {
        this.nombre_instructor = nombre_instructor;
    }

    public String getRenglon_presupuestario() {
        return renglon_presupuestario;
    }

    public void setRenglon_presupuestario(String renglon_presupuestario) {
        this.renglon_presupuestario = renglon_presupuestario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

  
   

    public String getNit_instructor() {
        return nit_instructor;
    }

    public void setNit_instructor(String nit_instructor) {
        this.nit_instructor = nit_instructor;
    }

    public String getCorreo_instructor() {
        return correo_instructor;
    }

    public void setCorreo_instructor(String correo_instructor) {
        this.correo_instructor = correo_instructor;
    }




    
}

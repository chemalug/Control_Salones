package control_salones.modelo;

public class EquipoSalon {
    private int codigo;
    private int no_salon;
    private String nombre_salon;
    private int capacidad;
    private int estado_salon;

    public EquipoSalon() {
    }

    public EquipoSalon(int codigo, int no_salon, String nombre_salon, int capacidad, int estado_salon) {
        this.codigo = codigo;
        this.no_salon = no_salon;
        this.nombre_salon = nombre_salon;
        this.capacidad = capacidad;
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getEstado_salon() {
        return estado_salon;
    }

    public void setEstado_salon(int estado_salon) {
        this.estado_salon = estado_salon;
    }

    @Override
    public String toString() {
        return "Salon{" + "codigo=" + codigo + ", " + "no_salon=" + no_salon + ", nombre_salon=" + nombre_salon + ", capacidad=" + capacidad + ", estado_salon=" + estado_salon + '}';
    }
    
}
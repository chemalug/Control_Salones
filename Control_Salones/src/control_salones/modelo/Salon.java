package control_salones.modelo;

public class Salon {
    private int codigo;
    private int no_salon;
    private String nombre_salon;
    private int capacidad_salon;
    private int estado_salon;
    private int pc_instructor;
    private int pizarron;
    private int proyector;
    private String pc_participantes;
    private String observaciones;

    public Salon() {
    }

    public Salon(int codigo, int no_salon, String nombre_salon, int capacidad_salon, int estado_salon, int pc_instructor, int pizarron, int proyector, String pc_participantes, String observaciones) {
        this.codigo = codigo;
        this.no_salon = no_salon;
        this.nombre_salon = nombre_salon;
        this.capacidad_salon = capacidad_salon;
        this.estado_salon = estado_salon;
        this.pc_instructor = pc_instructor;
        this.pizarron = pizarron;
        this.proyector = proyector;
        this.pc_participantes = pc_participantes;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return  nombre_salon + " -- No. Salón: " + no_salon;
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

    public int getCapacidad_salon() {
        return capacidad_salon;
    }

    public void setCapacidad_salon(int capacidad_salon) {
        this.capacidad_salon = capacidad_salon;
    }

    public int getEstado_salon() {
        return estado_salon;
    }

    public void setEstado_salon(int estado_salon) {
        this.estado_salon = estado_salon;
    }

    public int getPc_instructor() {
        return pc_instructor;
    }

    public void setPc_instructor(int pc_instructor) {
        this.pc_instructor = pc_instructor;
    }

    public int getPizarron() {
        return pizarron;
    }

    public void setPizarron(int pizarron) {
        this.pizarron = pizarron;
    }

    public int getProyector() {
        return proyector;
    }

    public void setProyector(int proyector) {
        this.proyector = proyector;
    }

    public String getPc_participantes() {
        return pc_participantes;
    }

    public void setPc_participantes(String pc_participantes) {
        this.pc_participantes = pc_participantes;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
            
}

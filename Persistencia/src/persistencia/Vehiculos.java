/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author efiapp
 */
public class Vehiculos {
    private int id;
    private String placa;
    private String numero_motor;
    private String numero_chasis;
    private String modelo;
    private String marca;
    private String color;
    private String linea;

    public Vehiculos() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNumero_motor() {
        return numero_motor;
    }

    public void setNumero_motor(String numero_motor) {
        this.numero_motor = numero_motor;
    }

    public String getNumero_chasis() {
        return numero_chasis;
    }

    public void setNumero_chasis(String numero_chasis) {
        this.numero_chasis = numero_chasis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "id=" + id + ", placa=" + placa + ", numero_motor=" + numero_motor + ", numero_chasis=" + numero_chasis + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", linea=" + linea + "}\n";
    }
    public String toCSV(){
        return id + "," + placa + "," + numero_motor + "," + numero_chasis + ","+ modelo + "," + marca + "," + color + "," + linea;
    }
    public String toJSON(){
        return "Vehiculos{" + "\"id\":" + id + ", \"placa\":" + placa + ", \"numero_motor\":" + numero_motor + ", \"numero_chasis\":" + numero_chasis + ", \"modelo\":" + modelo + ", \"marca\":" + marca + ", \"color\":" + color + ", linea:" + linea + '}';
    }
    public String toXML(){
        return "<vehiculos>" + 
                "<id>" + id + "</id>" + 
                "<placa>" + placa +"</placa>" + 
                "<numero_motor>" + numero_motor + "</numero_motor>" + 
                "<numero_chasis>" + numero_chasis +"</numero_chasis>" + 
                "<modelo>" + modelo +"</modelo>" + 
                "<marca>" + marca + "</marca>" + 
                "<color>" + color + "</color>" + 
                "<linea>" + linea + "</linea></vehiculos>";
    }
}

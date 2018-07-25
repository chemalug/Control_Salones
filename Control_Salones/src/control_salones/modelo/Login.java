/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.modelo;
/**/
/**
 *
 * @author u-jona
 */
public class Login {
    private int codigo;
    private String nombre;
    private String usuario;
    private String password;
    private int estado_usuario;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(int estado_usuario) {
        this.estado_usuario = estado_usuario;
    }
    
    public String toString(){
        return "tbl_usuario{" + "codigo=" + codigo + ", nombre=" + nombre + ", password" + 
                password + ", usuario" + usuario + ", estado usuario=" + estado_usuario + "" + "}";
 
    }

}

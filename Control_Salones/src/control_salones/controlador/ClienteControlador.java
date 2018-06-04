/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.controlador;

import control_salones.datos.Conector;
import control_salones.modelo.Cliente;

/**
 *
 * @author efiapp
 */
public class ClienteControlador {
    public void agregarCliente(Cliente cliente){
        Conector c = new Conector();
        c.conectar();
        c.insertar("Insert into tbl_clientes (codigo, nombre,nit) values (" + String.valueOf(cliente.getCodigo()) + ",'" + cliente.getNombre()  +"','" + cliente.getNit() + "');");
        c.desconectar();
    }
}

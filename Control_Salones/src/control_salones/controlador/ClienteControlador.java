package control_salones.controlador;

import control_salones.datos.Database;
import control_salones.datos.Conector;
import control_salones.modelo.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClienteControlador {
    public void agregarCliente(Cliente cliente){
        Conector c = new Conector();
        c.conectar();
        //c.insertar("Insert into tbl_clientes (codigo, nombre,nit) values (" + String.valueOf(cliente.getCodigo()) + ",'" + cliente.getNombre()  +"','" + cliente.getNit() + "');");
        c.desconectar();
        System.out.println("Hola mundo");
        
    }
}

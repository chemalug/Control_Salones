package control_salones.controlador;

import control_salones.datos.Database;
import control_salones.modelo.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClienteControlador {
    public void agregarCliente() throws SQLException{
        ArrayList<Object> args = new ArrayList<Object>();
        args.add("Yaque");
        args.add("44778899");
        args.add(14);    
        Database.procedimiento("sp_insertar_cliente", args);
        
    }
}

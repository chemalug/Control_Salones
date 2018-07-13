
package control_salones.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConectorJoshua {
private static final String CLASE = "com.mysql.cj.jdbc.Driver";

    private final String host = "35.232.63.100";
    private final String usuario = "efi";
    private final String clave = "Hola1234";
    private final String nombre = "db_control_salones";
    private final String url;

    private Connection link;
    private Statement statement;

    private String mensajeError;


    public ConectorJoshua() {
        this.mensajeError = "";
        this.url = "jdbc:mysql://" + this.host + "/" + this.nombre;
    }

    public boolean conectar() {
        try {
            Class.forName(CLASE).newInstance();
            this.link = DriverManager.getConnection(this.url, this.usuario, this.clave);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            this.mensajeError = e.getMessage();
            return false;
        }
        return true;
    }
       
    public ResultSet consulta(String consulta){
        ResultSet resultado;
        try {
            this.statement = this.link.createStatement();
            resultado = this.statement.executeQuery(consulta);

        } catch (SQLException e) {
            this.mensajeError = e.getMessage();
            return null;
        }
        return resultado;
    }
    public ArrayList<String> obtener(String consulta) {
        ArrayList<String> listado = new ArrayList<>();
        ResultSet resultado;
        try {
            this.statement = this.link.createStatement();
            resultado = this.statement.executeQuery(consulta);

        } catch (SQLException e) {
            this.mensajeError = e.getMessage();
            return null;
        }
        try {
            while (resultado.next()) {

                listado.add(resultado.toString());

            }
        } catch (SQLException e) {
            this.mensajeError = e.getMessage();
            return null;
        }
        return listado;
    }

    public boolean desconectar() {
        try {
            this.link.close();
        } catch (SQLException e) {
            this.mensajeError = e.getMessage();
            return false;
        }
        return true;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    
    public boolean insertar(String consulta) {

        int resultado;

        try {

            this.statement = this.link.createStatement();
            resultado = this.statement.executeUpdate(consulta);

        } catch (SQLException e) {
            this.mensajeError = e.getMessage();
            return false;
        }
        return (resultado > 0);
    }
    
    
    public boolean delDatos (String consulta){
        int resultado;

        try {

            this.statement = this.link.createStatement();
            resultado = this.statement.executeUpdate(consulta);

        } catch (SQLException e) {
            this.mensajeError = e.getMessage();
            return false;
        }
        return (resultado > 0);
    }
    

    
}

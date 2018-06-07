package control_salones.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conector {

    private static final String CLASE = "com.mysql.jdbc.Driver";

    private final String host = "35.232.63.100";
    private final String usuario = "efi";
    private final String clave = "Hola1234";
    private final String nombre = "db_control_salones";
    private final String url;

    private Connection link;
    private Statement statement;
    public ResultSet resultado;
    
    private String mensajeError;

    public Conector() {
        this.mensajeError = "";
        this.url = "jdbc:mysql://" + this.host + "/" + this.nombre;
    }

    public void conectar() {
        try {
            Class.forName(CLASE).newInstance();
            this.link = DriverManager.getConnection(this.url, this.usuario, this.clave);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            this.mensajeError = e.getMessage();
        }
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

    public ResultSet consultaRegistro(String sql) {
        try {
            this.statement = this.link.createStatement();
            resultado = this.statement.executeQuery(sql);
        } catch (SQLException ex) {
            this.mensajeError = ex.getMessage();
        }
        return resultado;
    }
    
    public ResultSet consultarDatos(String sql) {
        ResultSet result = null;
        Conector c = new Conector();
        c.conectar();
        result = c.consultaRegistro(sql);
        return result;
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

}

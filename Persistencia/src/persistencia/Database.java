package persistencia;
import java.sql.*;
import java.util.ArrayList;


public class Database {

    private static final String CLASE = "com.mysql.jdbc.Driver";

    private final String host = "35.193.251.160";
    private final String usuario = "qadmin";
    private final String clave = "2eo24oChema";
    private final String nombre = "persistencia";
    private final String url;

    private Connection link;
    private Statement statement;

    private String mensajeError;


    public Database() {
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

}
package control_salones.datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.NativeArray.map;

public class Database {

    private static final String CLASE = "com.mysql.jdbc.Driver";

    private static String host = "35.232.63.100.xip.io";
    private static String usuario = "root";
    private static String clave = "Hola1234";
    private static String nombre = "db_salones";
    //private static String host = "localhost";
    //private static String clave = "";
    //private static String nombre = "persistencia";

    private static String url;

    private static Connection link;
    private static Statement statement;

    private static String mensajeError;

    public static void Database() {
        mensajeError = "";
        url = "jdbc:mysql://" + host + "/" + nombre;
        try {
            Class.forName(CLASE).newInstance();
            link = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            mensajeError = e.getMessage();
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

    public static ResultSet consultar(String consulta) {
        try {
            Database();
            ResultSet respuesta = null;
            statement = link.createStatement();
            respuesta = statement.executeQuery(consulta);
            return respuesta;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void procedimiento(String procedimiento, ArrayList<Object> args) {

        String parametros = "";

        for (int i = 0; i < args.size(); i++) {
            parametros += "?,";
        }
        parametros = parametros.substring(0, parametros.length() - 1);
        String sentencia = "{call " + procedimiento + "(" + parametros + ")}";
        System.out.println(sentencia);
        Database();
        CallableStatement ctm;
        try {
            ctm = link.prepareCall(sentencia);
            int contador = 1;
            for (Object arg : args) {
                ctm.setObject(contador, arg);
                contador++;
            }
            ctm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        desconectar();

    }

    public static ResultSet procedimientoConsulta (String procedimiento, ArrayList<Object> args) {

        String parametros = "";

        for (int i = 0; i < args.size(); i++) {
            parametros += "?,";
        }
        parametros = parametros.substring(0, parametros.length() - 1);
        String sentencia = "{call " + procedimiento + "(" + parametros + ")}";
        ResultSet respuesta = null;
        Database();
        CallableStatement ctm;
        try {
            ctm = link.prepareCall(sentencia);
            
            int contador = 1;
            for (Object arg : args) {
                ctm.setObject(contador, arg.toString());
                contador++;
            }
            ctm.execute();
            respuesta = ctm.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        return respuesta;
    }

    public static void desconectar() {
        try {
            link.close();
        } catch (SQLException e) {
            mensajeError = e.getMessage();

        }
    }

    public String getMensajeError() {
        return mensajeError;
    }

}

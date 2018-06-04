/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.google.gson.Gson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class DAO_Vehiculos {

    public ArrayList<Vehiculos> obtenerDatos() {
        Database db = new Database();
        db.conectar();
        ArrayList<Vehiculos> listado = new ArrayList<>();
        ResultSet resultado = db.consulta("select * from vehiculo");
        try {
            while (resultado.next()) {
                Vehiculos aux = new Vehiculos();
                aux.setId(resultado.getInt(1));
                aux.setPlaca(resultado.getString(2));
                aux.setNumero_motor(resultado.getString(3));
                aux.setNumero_chasis(resultado.getString(4));
                aux.setModelo(resultado.getString(5));
                aux.setMarca(resultado.getString(6));
                aux.setColor(resultado.getString(7));
                aux.setLinea(resultado.getString(8));
                listado.add(aux);
            }
            db.desconectar();
        } catch (SQLException e) {

        }
        return listado;
    }

    public String obtener_Vehiculo_XML() {
        XMLTransformer transformer = XMLTransformer.getInstance();
        return transformer.toXMLString(obtenerDatos());
    }

    public String obtener_Vehiculo_JSON() {
        return new Gson().toJson(obtenerDatos());
    }
}

package persistencia;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class Persistencia {

    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        DAO_Vehiculos v = new DAO_Vehiculos();
        System.out.println(v.obtener_Vehiculo_XML());
        System.out.println(v.obtener_Vehiculo_JSON());
    }    
}

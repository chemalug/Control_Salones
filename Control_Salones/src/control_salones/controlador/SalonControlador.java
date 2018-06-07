package control_salones.controlador;

import control_salones.datos.Conector;
import control_salones.modelo.Salon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class SalonControlador {

    public ResultSet mostrarDatos() {
        ResultSet result = null;
        Conector c = new Conector();
        c.conectar();
        String sql = "SELECT s.codigo, s.no_salon, s.nombre_salon, s.capacidad_salon, s.estado_salon, e.codigo, e.nombre, e.descripcion, es.cantidad FROM tbl_salon s INNER JOIN tbl_equipo_salon es ON s.codigo = es.codigo_salon INNER JOIN tbl_equipo e ON e.codigo = es.codigo_equipo;";
        result = c.consultaRegistro(sql);
        return result;
    }

    public class noEditable extends DefaultTableModel{
        @Override
        public boolean isCellEditable (int fila, int columna){
            if (columna == 6)
                return true;
            return false;
        }
    }
    
    public noEditable mostrarSalon() {
        noEditable modelo = new noEditable();
        ResultSet st = mostrarDatos();
        modelo.setColumnIdentifiers(new Object[]{"Codigo Salon","Numero Salon", "Nombre", "Capacidad", "Estado","Codigo Equipo","Nombre Equipo","Descripcion","Cantidad"});
        try {
            while (st.next()) {
                modelo.addRow(new Object[]{st.getString("codigo"),st.getString("no_salon"), st.getString("nombre_salon"), st.getString("capacidad_salon"), st.getString("estado_salon"), st.getString("e.codigo"), st.getString("nombre"), st.getString("descripcion"), st.getString("cantidad")});
            }

        } catch (SQLException e) {
            System.out.print(e);
        }
        
        return modelo;
    }
    
    

    public void insertarDatos(Salon salon) {
        Conector c = new Conector();
        c.conectar();
        c.insertar("INSERT INTO tbl_salon(codigo, no_salon, nombre_salon, capacidad_salon, estado_salon) VALUES (NULL," + salon.getNo_salon() + ",'" + salon.getNombre_salon() + "', " + salon.getCapacidad() + ", " + salon.getEstado_salon() + ");");
        c.desconectar();
    }

    public List<Salon> getDatos() {
        return null;
    }

}

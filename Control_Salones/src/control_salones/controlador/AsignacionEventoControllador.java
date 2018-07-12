package control_salones.controlador;


import control_salones.datos.Database;
import control_salones.modelo.CalendarioSalon;
import control_salones.modelo.EstadoEvento;
import control_salones.modelo.Evento;
import control_salones.modelo.Fechas;
import control_salones.modelo.Horario;
import control_salones.modelo.Instructor;
import control_salones.modelo.Salon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AsignacionEventoControllador {

    public ArrayList<Salon> obtenerSalones() {
        ArrayList<Salon> listado = new ArrayList<>();
        ResultSet rs = Database.consultar("Select * from tbl_salon");
        try {
            while (rs.next()) {
                Salon aux = new Salon();
                aux.setCodigo(rs.getInt(1));
                aux.setNo_salon(rs.getInt(2));
                aux.setNombre_salon(rs.getString(3));
                listado.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AsignacionEventoControllador.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.desconectar();
        System.out.println(listado);
        return listado;
    }

    public ArrayList<Horario> obtenerHorario() {
        ArrayList<Horario> listado = new ArrayList<>();
        ResultSet rs = Database.consultar("Select * from tbl_horario");
        try {
            while (rs.next()) {
                Horario aux = new Horario(rs.getInt(1),
                        rs.getTime(2), rs.getTime(3));
                listado.add(aux);
            }
            System.out.println(listado);
        } catch (SQLException ex) {
            Logger.getLogger(AsignacionEventoControllador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    public ArrayList<Horario> obtenerHorario(String tiempo_1, String tiempo_2) {
        ArrayList<Horario> listado = new ArrayList<>();
        String sql = "Select * from tbl_horario where hora_inicio between '" + tiempo_1 + "' and '" + tiempo_2 + "'";
        System.out.println(sql);
        ResultSet rs = Database.consultar(sql);
        try {
            while (rs.next()) {
                Horario aux = new Horario(rs.getInt(1),
                        rs.getTime(2), rs.getTime(3));
                listado.add(aux);
            }
            System.out.println(listado);
        } catch (SQLException ex) {
            Logger.getLogger(AsignacionEventoControllador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }

    public ArrayList<Fechas> obtenerFechas() {
        ArrayList<Fechas> listado = new ArrayList<>();
        ResultSet rs = Database.consultar("Select * from tbl_fechas");
        try {
            while (rs.next()) {
                Fechas aux = new Fechas(rs.getInt(1),
                        rs.getDate(2), rs.getInt(3),rs.getString(4));
                listado.add(aux);
            }
            System.out.println(listado);
        } catch (SQLException ex) {
            Logger.getLogger(AsignacionEventoControllador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    public ArrayList<CalendarioSalon> obtenerCalendarioSalon(int codigo_salon,LocalDate fechaI, LocalDate fechaF, String horaI, String horaF){
        ArrayList<CalendarioSalon> listado = new ArrayList<CalendarioSalon>();
        ArrayList<Object> args = new ArrayList<>();
        args.add(codigo_salon);
        args.add(fechaI);
        args.add(fechaF);
        args.add(horaI);
        args.add(horaF);
        ResultSet rs = Database.procedimientoConsulta("sp_consultar_calendario_salon",args);
        try {
            while (rs.next()) {
                CalendarioSalon aux = new CalendarioSalon(rs.getInt(1),
                        rs.getInt(2), rs.getInt(3),rs.getInt(4));
                listado.add(aux);
            }
            System.out.println(listado);
        } catch (SQLException ex) {
            Logger.getLogger(AsignacionEventoControllador.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.desconectar();
        System.out.println(listado);
        return listado;
    }
    public ArrayList<Fechas> obtenerFechas(LocalDate fechaI, LocalDate fechaF) {
        ArrayList<Fechas> listado = new ArrayList<>();
        ArrayList<Object> args = new ArrayList<>();
        args.add(fechaI);
        args.add(fechaF);
        ResultSet rs = Database.procedimientoConsulta("sp_consultarFechas",args);
        try {
            while (rs.next()) {
                Fechas aux = new Fechas(rs.getInt(1),
                        rs.getDate(2), rs.getInt(3),rs.getString(4));
                listado.add(aux);
            }
            System.out.println(listado);
        } catch (SQLException ex) {
            Logger.getLogger(AsignacionEventoControllador.class.getName()).log(Level.SEVERE, null, ex);
        }
        Database.desconectar();
        return listado;
    }
    public ArrayList<Evento> obtenerEventos(){
        ArrayList<Evento> listado = new ArrayList<>();
        ResultSet rs = Database.consultar("Select * from tbl_catalogo_evento");
        try {
            while (rs.next()) {
                Evento aux = new Evento(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7));
                listado.add(aux);
            }
            System.out.println(listado);
        } catch (SQLException ex) {
            Logger.getLogger(AsignacionEventoControllador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    public ArrayList<Instructor> obtenerInstructor(){
        ArrayList<Instructor> listado = new ArrayList<>();
        ResultSet rs = Database.consultar("Select * from tbl_instructor");
        try {
            while (rs.next()) {
                Instructor aux = new Instructor(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6));
                listado.add(aux);
            }
            System.out.println(listado);
        } catch (SQLException ex) {
            Logger.getLogger(AsignacionEventoControllador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }
    public ArrayList<EstadoEvento> obtenerEstadoEvento(){
        ArrayList<EstadoEvento> listado = new ArrayList<>();
        ResultSet rs = Database.consultar("Select * from tbl_estado_evento");
        try{
            while(rs.next()){
                EstadoEvento aux = new EstadoEvento(rs.getInt(1), rs.getString(2));
                listado.add(aux);
            }
            System.out.println(listado);
        } catch(SQLException ex){
            
        }
        return listado;
    }
    public void llenarFechas(){
                
        for(int i = 1; i<=365; i++ ){
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar tr = new GregorianCalendar(2018, 0, 1);
            tr.add(Calendar.DAY_OF_YEAR, i-1);
            String currentTime = sdf.format(tr.getTime());
            ArrayList<Object> args = new ArrayList<>();
            args.add(i);            
            args.add(currentTime);
            args.add(0);
            args.add("");
            Database.procedimiento("sp_insertar_fechas", args);
        }
    }
}

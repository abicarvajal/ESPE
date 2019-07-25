/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.parqueadero;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Cheshire
 */
public class AsignacionPlaza {
    private Integer Numero_plaza;
    private Date Fecha;
    private Time Hora_Asignacion;
    
    ArrayList<AsignacionPlaza> array = new ArrayList();

    public AsignacionPlaza(Integer Numero_plaza, Date Fecha, Time Hora_Asignacion, boolean estado) {
        this.Numero_plaza = Numero_plaza;
        this.Fecha = Fecha;
        this.Hora_Asignacion = Hora_Asignacion;
    }
    
    public void llenarP(Integer num_plaza){
        /*for(int i=0;i<parqueaderoAdministrativo.getParqueadero_cantidad();i++){
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            System.out.println("Hora y fecha: "+hourdateFormat.format(date));
            //AsignacionPlaza asignoPlaza = new AsignacionPlaza(i,date,);
        }*/
    }
    
    public void imprimirP(Integer num_plaza){
       
    }

    public Integer getNumero_plaza() {
        return Numero_plaza;
    }

    public Date getFecha() {
        return Fecha;
    }

    public Time getHora_Asignacion() {
        return Hora_Asignacion;
    }

    public void setNumero_plaza(Integer Numero_plaza) {
        this.Numero_plaza = Numero_plaza;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public void setHora_Asignacion(Time Hora_Asignacion) {
        this.Hora_Asignacion = Hora_Asignacion;
    }

    @Override
    public String toString() {
        return "AsignacionPlaza{" + "Numero_plaza=" + Numero_plaza + ", Fecha=" + Fecha
                + ", Hora_Asignacion=" + Hora_Asignacion + '}';
    }
    
    
    public void cantidadPlazas(){
        
    }
    
}

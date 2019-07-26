/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.parqueadero;

import controlador.parqueadero.CRUD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.parqueadero.Conexion;

/**
 *
 * @author Santiago Vivas
 */
public class AsignacionDAO {

    private Conexion conexion;
    private Scanner teclado = new Scanner(System.in);
    CRUD crud = new CRUD();
    
    public AsignacionDAO() {
        
    }

    public ArrayList<String> obtenerDatos(String id) {
        ArrayList<String> datosCliente = new ArrayList<String>();
        Connection con = conexion.getConnection();
        Statement st;
        ResultSet rs;
        //String sql = "SELECT * FROM PARQUEADERO WHERE ID = " + id + " AND lugar = " + lugar;
        String sql = "SELECT CLIENTE_APELLIDOS, CLIENTE_NOMBRES, CLIENTE_DISCAPACIDAD, CLIENTE_SECCION "
                + "FROM CLIENTE WHERE CLIENTE_ID_BANNER= '" + id + "'";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                //System.out.println(" CI: " + rs.getString(1));
                //System.out.println(" NOMBRE: " + rs.getString(2));
               // System.out.println(" UNIDAD DE TRABAJO: " + rs.getString(3));
                //System.out.println(" MOVILIDAD REDUCIDA: " + rs.getString(4));
                //System.out.println(" =================================\n");
                datosCliente.add(rs.getString(1)); //Nombre
                datosCliente.add(rs.getString(2)); //Apellido
                datosCliente.add(rs.getString(3)); //Movilidad Reducida
                datosCliente.add(rs.getString(4)); //Seccion Trabajo 
                
            }
            //cerrar la conexion
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, " <<ERROR>>\n <<NO SE PUDO ACCEDER A LOS DATOS>>\n");
        }
        System.out.println(datosCliente.get(2));
        return datosCliente;
    }
    
    public ArrayList<String> asignarPlaza(ArrayList<String> datosCliente){
        Integer plaza=-1;
        ArrayList<String> datosAsignacion = new ArrayList<String>();
        String seccion = datosCliente.get(3);
        String lugarParqueo="";
        System.out.println(datosCliente.get(3));
        Integer discapacidad=-1;
        datosAsignacion.add(seccion);
        if (datosCliente.get(2).compareTo("S") == 1) { //Si tiene discapacidad
            System.out.println(seccion);
            discapacidad=1;
            switch(seccion){
                case "ADMISIÓN Y REGISTRO":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "BIENESTAR ESTUDIANTIL":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "DPTO. CIENCIAS ECON.  ADMIN. COMER":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "DPTO. CIENCIAS EXACTAS":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "DPTO. CIENCIAS HUMANAS Y SOCIALES":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;    
                case "DPTO. SEGURIDAD Y DEFENSA":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break; 
                case "EDUCACIÓN PRESENCIAL":
                       plaza=asignarPlaza("DOCENCIA",discapacidad);
                       lugarParqueo="DOCENCIA";
                       datosAsignacion.add(lugarParqueo);
                       datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "UNIDAD ADMISION REGISTRO":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break; 
                 case "BIBLIOTECA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "CENTRO DE NANOCIENCIA Y NANOTEC.":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "CENTRO DE POSTGRADOS":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "CENTRO EDUCACIÓN CONTINUA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "DPTO. CIENCIAS DE LA COMPUTACION":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;    
                case "DPTO. DE CIENCIAS DE LA VIDA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break; 
                case "DPTO.CIENCIAS ENERGIA Y MECANICA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "DPTO. ELECTRICA Y ELECTRONICA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break; 
                case "INSTITUTO DE IDIOMAS":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break; 
                case "TECNOLOGIA DE INF.Y COMUNICACIONES":
                       plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                       lugarParqueo="BIBLIOTECA";
                       datosAsignacion.add(lugarParqueo);
                       datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "RECTORADO":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "SECRETARIA GENERAL":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "SERVICIOS UNIVERSITARIOS":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "TALENTO HUMANO":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "UNIDAD DE ASESORÍA JURÍDICA":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "UNIDAD FINANCIERA":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "VICERRECTORADO ACADÉMICO GENERAL":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "VICERRECTORADO ADMINISTRATIVO":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "VICERRECTORADO DE DOCENCIA":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                break;
                case "VICERRECTORADO DE INVESTIGACIÓN":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                break;
                
                }      
        }else if(datosCliente.get(2).compareTo("N") == 1){
            System.out.println(seccion);
            discapacidad =0;
            switch(seccion){
                case "ADMISIÓN Y REGISTRO":
                       plaza=asignarPlaza("DOCENCIA",discapacidad);
                       lugarParqueo="DOCENCIA";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "BIENESTAR ESTUDIANTIL":
                       plaza=asignarPlaza("DOCENCIA",discapacidad);
                       lugarParqueo="DOCENCIA";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "DPTO. CIENCIAS ECON.  ADMIN. COMER":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "DPTO. CIENCIAS EXACTAS":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "DPTO. CIENCIAS HUMANAS Y SOCIALES":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;    
                case "DPTO. SEGURIDAD Y DEFENSA":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break; 
                case "EDUCACIÓN PRESENCIAL":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "UNIDAD ADMISION REGISTRO":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break; 
                 case "BIBLIOTECA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "CENTRO DE NANOCIENCIA Y NANOTEC.":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "CENTRO DE POSTGRADOS":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "CENTRO EDUCACIÓN CONTINUA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "DPTO. CIENCIAS DE LA COMPUTACION":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;    
                case "DPTO. DE CIENCIAS DE LA VIDA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break; 
                case "DPTO.CIENCIAS ENERGIA Y MECANICA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "DPTO. ELECTRICA Y ELECTRONICA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break; 
                case "INSTITUTO DE IDIOMAS":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break; 
                case "TECNOLOGIA DE INF.Y COMUNICACIONES":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                        datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "RECTORADO":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "SECRETARIA GENERAL":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "SERVICIOS UNIVERSITARIOS":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "TALENTO HUMANO":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "UNIDAD DE ASESORÍA JURÍDICA":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "UNIDAD FINANCIERA":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "VICERRECTORADO ACADÉMICO GENERAL":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "VICERRECTORADO ADMINISTRATIVO":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                    break;
                case "VICERRECTORADO DE DOCENCIA":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                break;
                case "VICERRECTORADO DE INVESTIGACIÓN":
                       plaza=asignarPlaza("ADMINISTRATIVO",discapacidad);
                       lugarParqueo="ADMINISTRATIVO";
                       datosAsignacion.add(lugarParqueo);
                        datosAsignacion.add(String.valueOf(plaza));
                break;
                } 
            
        }
        return datosAsignacion;
    }
    
    public void cambiarDisponibilidad(String id_plaza){
        crud.cambiarDisponibilidad(id_plaza, 0);
    }
    
    public Integer obtenerPlazasAsignadas(){
        int contador;
        contador=crud.retornaNumeroPlazas();
        //System.out.println("PLAZAS ASIGNADAS AL MOMENTO = "+contador);
        return contador;
    }
    
    public void insertarAsignacion(Integer id_num_plaza,String cliente_id_banner,Integer id_plaza,Date fecha,Date hora){
        crud.asignarQuery(id_num_plaza,cliente_id_banner,id_plaza,fecha,hora);
    }
    
    public Integer asignarPlaza(String seccion,Integer disponibilidad){
        Integer plaza=0;    
        plaza=crud.asignaPlaza(seccion,1,disponibilidad);
        return plaza;
    }
    
    public ArrayList<String> busqueda(Integer plaza){
        ArrayList<String> datosCliente = new ArrayList<String>();
        datosCliente=crud.busqueda(plaza);
        return datosCliente;
    }
}   
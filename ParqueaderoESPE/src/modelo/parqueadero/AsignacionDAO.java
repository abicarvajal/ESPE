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
                    break;
                case "DPTO. CIENCIAS ECON.  ADMIN. COMER":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                    break;
                case "DPTO. CIENCIAS EXACTAS":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                    break;
                case "DPTO. CIENCIAS HUMANAS Y SOCIALES":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                    break;    
                case "DPTO. SEGURIDAD Y DEFENSA":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                    break; 
                case "EDUCACIÓN PRESENCIAL":
                       plaza=asignarPlaza("DOCENCIA",discapacidad);
                       lugarParqueo="DOCENCIA";
                    break;
                case "UNIDAD ADMISION REGISTRO":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                    break; 
                 case "BIBLIOTECA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break;
                case "CENTRO DE NANOCIENCIA Y NANOTEC.":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break;
                case "CENTRO DE POSTGRADOS":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break;
                case "CENTRO EDUCACIÓN CONTINUA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break;
                case "DPTO. CIENCIAS DE LA COMPUTACION":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break;    
                case "DPTO. DE CIENCIAS DE LA VIDA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break; 
                case "DPTO.CIENCIAS ENERGIA Y MECANICA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break;
                case "DPTO. ELECTRICA Y ELECTRONICA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break; 
                case "INSTITUTO DE IDIOMAS":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break; 
                case "TECNOLOGIA DE INF.Y COMUNICACIONES":
                       plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                       lugarParqueo="BIBLIOTECA";
                    break;
                }      
        }else if(datosCliente.get(2).compareTo("N") == 1){
            System.out.println(seccion);
            discapacidad =0;
            switch(seccion){
                case "ADMISIÓN Y REGISTRO":
                       plaza=asignarPlaza("DOCENCIA",discapacidad);
                       lugarParqueo="DOCENCIA";
                    break;
                case "BIENESTAR ESTUDIANTIL":
                       plaza=asignarPlaza("DOCENCIA",discapacidad);
                       lugarParqueo="DOCENCIA";
                    break;
                case "DPTO. CIENCIAS ECON.  ADMIN. COMER":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                    break;
                case "DPTO. CIENCIAS EXACTAS":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                    break;
                case "DPTO. CIENCIAS HUMANAS Y SOCIALES":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                    break;    
                case "DPTO. SEGURIDAD Y DEFENSA":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                    break; 
                case "EDUCACIÓN PRESENCIAL":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                    break;
                case "UNIDAD ADMISION REGISTRO":
                        plaza=asignarPlaza("DOCENCIA",discapacidad);
                        lugarParqueo="DOCENCIA";
                    break; 
                 case "BIBLIOTECA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break;
                case "CENTRO DE NANOCIENCIA Y NANOTEC.":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break;
                case "CENTRO DE POSTGRADOS":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break;
                case "CENTRO EDUCACIÓN CONTINUA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break;
                case "DPTO. CIENCIAS DE LA COMPUTACION":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break;    
                case "DPTO. DE CIENCIAS DE LA VIDA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break; 
                case "DPTO.CIENCIAS ENERGIA Y MECANICA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break;
                case "DPTO. ELECTRICA Y ELECTRONICA":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break; 
                case "INSTITUTO DE IDIOMAS":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break; 
                case "TECNOLOGIA DE INF.Y COMUNICACIONES":
                        plaza=asignarPlaza("BIBLIOTECA",discapacidad);
                        lugarParqueo="BIBLIOTECA";
                    break;
                } 
            
        }
        return datosAsignacion;
    }
    
    public void cambiarDisponibilidad(String id_plaza){
        crud.cambiarDisponibilidad(id_plaza, 0);
    }
    
    public Integer obtenerPlazasAsignadas(){
        int contador=0;
        contador=crud.retornaNumeroPlazas();
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
}   

 /*  } else if (datosCliente.get(3).compareTo("BIBLIOTECA") == 1 || datosCliente.get(3).compareTo("CENTRO DE NANOCIENCIA Y NANOTEC.") == 1
                    || datosCliente.get(3).compareTo("CENTRO DE POSTGRADOS") == 1 || datosCliente.get(3).compareTo("CENTRO EDUCACIÓN CONTINUA") == 1
                    || datosCliente.get(3).compareTo("DPTO. CIENCIAS DE LA COMPUTACION") == 1 || datosCliente.get(3).compareTo("DPTO. DE CIENCIAS DE LA VIDA") == 1
                    || datosCliente.get(3).compareTo("DPTO.CIENCIAS ENERGIA Y MECANICA") == 1 || datosCliente.get(3).compareTo("DPTO. ELECTRICA Y ELECTRONICA") == 1 
                    || datosCliente.get(3).compareTo("INSTITUTO DE IDIOMAS" ) == 1|| datosCliente.get(3).compareTo("TECNOLOGIA DE INF.Y COMUNICACIONES") == 1
                    || datosCliente.get(3).compareTo("") == 1) {
                //Asignacion  en la biblioteca para personas con discapacidad
                System.out.println("ENTRO AQUI");
                System.out.println(datosCliente.get(2));
                datosParqueadero.add("Parqueadero Biblioteca");
                datosParqueadero.add("14");//Numero de plaza

            } else if (datosCliente.get(3).compareTo("RECTORADO") == 1 || datosCliente.get(3).compareTo("SECRETARIA GENERAL") == 1
                    || datosCliente.get(3).compareTo("SERVICIOS UNIVERSITARIOS") == 1 || datosCliente.get(3).compareTo("TALENTO HUMANO") == 1
                    || datosCliente.get(3).compareTo("UNIDAD DE ASESORÍA JURÍDICA") == 1 || datosCliente.get(3).compareTo("UNIDAD FINANCIERA") == 1
                    || datosCliente.get(3).compareTo("VICERRECTORADO ACADÉMICO GENERAL") == 1 || datosCliente.get(3).compareTo("VICERRECTORADO ADMINISTRATIVO") == 1 
                    || datosCliente.get(3).compareTo("VICERRECTORADO DE DOCENCIA" ) == 1|| datosCliente.get(3).compareTo("VICERRECTORADO DE INVESTIGACIÓN") == 1) {
                //Asginacion en el parqueadero administrativo
                datosParqueadero.add("Parqueadero Administrativo");
                datosParqueadero.add("12"); //Numero de plaza
            }
        } else if (datosCliente.get(2) == "N") { //Si no tiene discapacidad
            datosParqueadero.add("Asignacion de Parqueadero");
            if (datosCliente.get(3).compareTo("ADMISIÓN Y REGISTRO") == 1 || datosCliente.get(3).compareTo("BIENESTAR ESTUDIANTIL") == 1
                    || datosCliente.get(3).compareTo("DPTO. CIENCIAS ECON.  ADMIN. COMER.") == 1 || datosCliente.get(3).compareTo("DPTO. CIENCIAS EXACTAS") == 1 
                    || datosCliente.get(3).compareTo("DPTO. CIENCIAS HUMANAS Y SOCIALES") == 1 || datosCliente.get(3).compareTo("DPTO. CIENCIAS TIERRA Y CONSTRUCC.") == 1 
                    || datosCliente.get(3).compareTo("DPTO. SEGURIDAD Y DEFENSA") == 1 || datosCliente.get(3).compareTo("EDUCACION CONTINUA") == 1
                    || datosCliente.get(3).compareTo("EDUCACIÓN PRESENCIAL") == 1 || datosCliente.get(3).compareTo("FINANCIERO") == 1
                    || datosCliente.get(3).compareTo("UNIDAD ADMISION REGISTRO") == 1) {
                //Asignacion en el BAR
                datosParqueadero.add("Parqueadero de Docencia");
                datosParqueadero.add("11"); //Numero de plaza

            } else if (datosCliente.get(3).compareTo("BIBLIOTECA") == 1 || datosCliente.get(3).compareTo("CENTRO DE NANOCIENCIA Y NANOTEC.") == 1
                    || datosCliente.get(3).compareTo("CENTRO DE POSTGRADOS") == 1 || datosCliente.get(3).compareTo("CENTRO EDUCACIÓN CONTINUA") == 1
                    || datosCliente.get(3).compareTo("DPTO. CIENCIAS DE LA COMPUTACION") == 1 || datosCliente.get(3).compareTo("DPTO. DE CIENCIAS DE LA VIDA") == 1
                    || datosCliente.get(3).compareTo("DPTO.CIENCIAS ENERGIA Y MECANICA") == 1 || datosCliente.get(3).compareTo("DPTO. ELECTRICA Y ELECTRONICA") == 1 
                    || datosCliente.get(3).compareTo("INSTITUTO DE IDIOMAS" ) == 1|| datosCliente.get(3).compareTo("TECNOLOGIA DE INF.Y COMUNICACIONES") == 1
                    || datosCliente.get(3).compareTo("") == 1) {
                //Asignacion en la biblioteca
                datosParqueadero.add("Parqueadero Biblioteca");
                datosParqueadero.add("9"); //Numero de plaza

            } else if (datosCliente.get(3).compareTo("RECTORADO") == 1 || datosCliente.get(3).compareTo("SECRETARIA GENERAL") == 1
                    || datosCliente.get(3).compareTo("SERVICIOS UNIVERSITARIOS") == 1 || datosCliente.get(3).compareTo("TALENTO HUMANO") == 1
                    || datosCliente.get(3).compareTo("UNIDAD DE ASESORÍA JURÍDICA") == 1 || datosCliente.get(3).compareTo("UNIDAD FINANCIERA") == 1
                    || datosCliente.get(3).compareTo("VICERRECTORADO ACADÉMICO GENERAL") == 1 || datosCliente.get(3).compareTo("VICERRECTORADO ADMINISTRATIVO") == 1 
                    || datosCliente.get(3).compareTo("VICERRECTORADO DE DOCENCIA" ) == 1|| datosCliente.get(3).compareTo("VICERRECTORADO DE INVESTIGACIÓN") == 1) {
                //Asignacion en el parqueadero administrativo
                datosParqueadero.add("Parqueadero Administrativo");
                datosParqueadero.add("10"); //Numero de plaza
            }
        }*/
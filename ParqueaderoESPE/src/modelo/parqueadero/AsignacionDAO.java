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
import java.util.ArrayList;
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
        ArrayList<String> datosParqueadero = new ArrayList<>();
        AsignacionDAO registrarAsignacion = new AsignacionDAO();
        String seccion = datosCliente.get(3);
        System.out.println(datosCliente.get(3));
        Integer discapacidad=-1;
        if (datosCliente.get(2).compareTo("S") == 1) { //Si tiene discapacidad
            datosParqueadero.add("Parqueadero con Preferencia");
            System.out.println(seccion);
            discapacidad=1;
            switch(seccion){
                case "ADMISIÓN Y REGISTRO":
                        System.out.println("ENTRA");
                        datosParqueadero.add("Docencia");
                        asignarPlaza("DOCENCIA",discapacidad);
                    break;
                case "BIENESTAR ESTUDIANTIL":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Docencia");
                        asignarPlaza(datosParqueadero.get(2),discapacidad);
                    break;
                case "DPTO. CIENCIAS ECON.  ADMIN. COMER":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Docencia");
                    break;
                case "DPTO. CIENCIAS EXACTAS":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Docencia");
                    break;
                case "DPTO. CIENCIAS HUMANAS Y SOCIALES":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Docencia");
                    break;    
                case "DPTO. SEGURIDAD Y DEFENSA":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Docencia");
                    break; 
                case "EDUCACIÓN PRESENCIAL":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Parqueadero de Docencia");
                    break;
                case "UNIDAD ADMISION REGISTRO":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Parqueadero de Docencia");
                    break; 
                 case "BIBLIOTECA":
                        System.out.println("ENTRA");
                        datosParqueadero.add("Parqueadero Biblioteca");
                        //datosParqueadero.add();
                    break;
                case "CENTRO DE NANOCIENCIA Y NANOTEC.":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Parqueadero Biblioteca");
                    break;
                case "CENTRO DE POSTGRADOS":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Parqueadero Biblioteca");
                    break;
                case "CENTRO EDUCACIÓN CONTINUA":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break;
                case "DPTO. CIENCIAS DE LA COMPUTACION":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break;    
                case "DPTO. DE CIENCIAS DE LA VIDA":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break; 
                case "DPTO.CIENCIAS ENERGIA Y MECANICA":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break;
                case "DPTO. ELECTRICA Y ELECTRONICA":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break; 
                case "INSTITUTO DE IDIOMAS":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Parqueadero Biblioteca");
                    break; 
                case "TECNOLOGIA DE INF.Y COMUNICACIONES":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Parqueadero Biblioteca");
                    break;
                }      
        }else if(datosCliente.get(2).compareTo("N") == 1){
            datosParqueadero.add("Parqueadero sin Preferencia");
            System.out.println(seccion);
            switch(seccion){
                case "ADMISIÓN Y REGISTRO":
                        System.out.println("ENTRA");
                        datosParqueadero.add("Parqueadero de Docencia");
                        //datosParqueadero.add();
                    break;
                case "BIENESTAR ESTUDIANTIL":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Parqueadero de Docencia");
                    break;
                case "DPTO. CIENCIAS ECON.  ADMIN. COMER":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Parqueadero de Docencia");
                    break;
                case "DPTO. CIENCIAS EXACTAS":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Parqueadero de Docencia");
                    break;
                case "DPTO. CIENCIAS HUMANAS Y SOCIALES":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Parqueadero de Docencia");
                    break;    
                case "DPTO. SEGURIDAD Y DEFENSA":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Parqueadero de Docencia");
                    break; 
                case "EDUCACIÓN PRESENCIAL":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Docencia");
                    break;
                case "UNIDAD ADMISION REGISTRO":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Docencia");
                    break; 
                 case "BIBLIOTECA":
                        System.out.println("ENTRA");
                        datosParqueadero.add("Biblioteca");
                        //datosParqueadero.add();
                    break;
                case "CENTRO DE NANOCIENCIA Y NANOTEC.":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break;
                case "CENTRO DE POSTGRADOS":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break;
                case "CENTRO EDUCACIÓN CONTINUA":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break;
                case "DPTO. CIENCIAS DE LA COMPUTACION":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break;    
                case "DPTO. DE CIENCIAS DE LA VIDA":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break; 
                case "DPTO.CIENCIAS ENERGIA Y MECANICA":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break;
                case "DPTO. ELECTRICA Y ELECTRONICA":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break; 
                case "INSTITUTO DE IDIOMAS":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break; 
                case "TECNOLOGIA DE INF.Y COMUNICACIONES":
                        System.out.println("ENTRA 2");
                        datosParqueadero.add("Biblioteca");
                    break;
                } 
        }
        return datosParqueadero;
        
    }
    
    public Integer asignarPlaza(String seccion,Integer disponibilidad){
        Integer plaza=0;
        CRUD crud = new CRUD();
        plaza=crud.asignaPlaza(seccion,1,disponibilidad);
        //System.out.println("plaza ="+plaza);
        return plaza;
    }
}   


        
        

/*if (((datosCliente.get(3).compareTo("ADMISIÓN Y REGISTRO") == 1))) || (datosCliente.get(3).compareTo("BIENESTAR ESTUDIANTIL") == 1)))
                    || (datosCliente.get(3).compareTo("DPTO. CIENCIAS ECON.  ADMIN. COMER.") == 1) 
                    || (datosCliente.get(3).compareTo("DPTO. CIENCIAS EXACTAS") == 1)
                    || (datosCliente.get(3).compareTo("DPTO. CIENCIAS HUMANAS Y SOCIALES") == 1) || (datosCliente.get(3).compareTo("DPTO. CIENCIAS TIERRA Y CONSTRUCC.") == 1) 
                    || (datosCliente.get(3).compareTo("DPTO. SEGURIDAD Y DEFENSA") == 1) || (datosCliente.get(3).compareTo("EDUCACION CONTINUA") == 1)
                    || (datosCliente.get(3).compareTo("EDUCACIÓN PRESENCIAL") == 1) || (datosCliente.get(3).compareTo("FINANCIERO") == 1)
                    || (datosCliente.get(3).compareTo("UNIDAD ADMISION REGISTRO") == 1))) {
                //Asignacion  en el Bar para personas con discapacidad
                System.out.println("ENTRO AQUI");
                datosParqueadero.add("Parqueadero de Docencia");
                datosParqueadero.add("5"); //Numero de plaza*/
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
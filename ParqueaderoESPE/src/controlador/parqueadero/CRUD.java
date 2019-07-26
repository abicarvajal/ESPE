/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.parqueadero;

import modelo.parqueadero.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.parqueadero.Cliente;

/**
 *
 * @author ╔Diego Huerta╗
 */
public class CRUD {
    
    private Conexion conexion;
    private Scanner teclado = new Scanner(System.in);

    public CRUD() {
        
    }

    public void actualizarUsuario(String id, Cliente cliente) {
        Connection con = conexion.getConnection();
        Statement st;
        
        String sql = "UPDATE CLIENTE SET CLIENTE_APELLIDOS = '" + cliente.getCliente_Apellido() +  "',CLIENTE_NOMBRES = '" +cliente.getCliente_Nombre()+ "',CLIENTE_SECCION = '" + cliente.getCliente_Ubicacion() + "',CLIENTE_DISCAPACIDAD ='" + cliente.getCliente_Discapacidad() + "' "
                + "WHERE CLIENTE_ID_BANNER = '"+ id+"'";
        System.out.println(sql);
        try {
            st = con.createStatement();
            
            int confirmar = st.executeUpdate(sql);
            if (confirmar == 1) {
                System.out.println("\n <<REGISTRO MODIFICADO CON EXITO>>\n");
                ControladorArchivos controlArchivo = new ControladorArchivos();
                controlArchivo.generarPDF(cliente.toString());
            } else {
                System.out.println(" <<ERROR>>\n <<REGISTRO NO PUDO SER MODIFICADO>>\n");
            }
            //cerrar la conexion
            st.close();
            con.close();
            System.out.println("\n <<REGISTRO MODIFICADO CON EXITO>>\n");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " <<ERROR>>\n <<NO SE PUDO ACTUALIZAR EL USUARIO>>\n");
        }
    }

    public void consultarParqueadero(String id, String lugar) {

        Connection con = conexion.getConnection();
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM CLIENTE WHERE CLIENTE_ID_BANNER = '"+id+"'";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(" CI: " + rs.getString(1));
                System.out.println(" NOMBRE: " + rs.getString(2));
                System.out.println(" UNIDAD DE TRABAJO: " + rs.getString(3));
                System.out.println(" MOVILIDAD REDUCIDA: " + rs.getString(4));
                System.out.println(" =================================\n");
            }
            //cerrar la conexion
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, " <<ERROR>>\n <<NO SE PUDO ACCEDER A LOS DATOS>>\n");
        }

    }
    
    public void eliminarParqueadero(String id){
        Connection con = conexion.getConnection();
        Statement st;

        String sql = "DELETE FROM CLIENTE WHERE CLIENTE_ID_BANNER = '" + id+"'";
        try {
            st = con.createStatement();
            System.out.println(sql);
            int confirmar = st.executeUpdate(sql);
            
            if (confirmar == 1) {
                System.out.println("\n <<REGISTRO ELIMINADO CON EXITO>>\n");
            } else {
                System.out.println(" <<ERROR>>\n <<REGISTRO NO PUDO SER ELIMINADO>>\n");
            }
            //cerrar la conexion
            st.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " <<ERROR>>\n <<NO SE PUDO ELIMINAR LOS DATOS>>\n");
        }
        
    }
    
    public Integer asignaPlaza(String seccion,Integer disponibilidad,Integer discapacidad){
        Integer plaza = 0;
        Connection con = conexion.getConnection();
        Statement st;
        ResultSet rs;
        String sql = "SELECT ID_PLAZA FROM PLAZA,PARQUEADERO"
                + " WHERE PARQUEADERO_NOMBRE='"+seccion+"' AND PLAZA.DISPONIBILIDAD= "+disponibilidad
                +" AND PLAZA.PLAZADISCAPACIDAD= "+discapacidad+" AND plaza.parqueadero_id=parqueadero.parqueadero_id";
        System.out.println(sql);
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println(rs.next());
            plaza = Integer.valueOf(rs.getString(1));
            System.out.println(plaza);
            
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, " <<ERROR>>\n <<NO SE PUDO ACCEDER A LOS DATOS>>\n");
        }
        if(plaza==null){
            plaza=-1;
        }
        return plaza;
    }
    
    public ArrayList<String> busqueda(Integer plaza){
        ArrayList<String> datosCliente = new ArrayList<String>();
        String resultado="";
        Connection con = conexion.getConnection();
        Statement st;
        ResultSet rs;
        String sql = "SELECT CLIENTE.CLIENTE_ID_BANNER,CLIENTE.CLIENTE_APELLIDOS,CLIENTE.CLIENTE_NOMBRES,CLIENTE.CLIENTE_SECCION,CLIENTE.CLIENTE_DISCAPACIDAD"
                + " FROM CLIENTE,ASIGNACION_PLAZA "
                + "WHERE ASIGNACION_PLAZA.ID_PLAZA="+plaza+" AND ASIGNACION_PLAZA.CLIENTE_ID_BANNER=CLIENTE.CLIENTE_ID_BANNER";
        System.out.println(sql);
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(" CI: " + rs.getString(1));
                System.out.println(" NOMBRE: " + rs.getString(2));
                System.out.println(" UNIDAD DE TRABAJO: " + rs.getString(3));
                System.out.println(" MOVILIDAD REDUCIDA: " + rs.getString(4));
                System.out.println(" =================================\n");
                resultado=rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4);
                datosCliente.add(rs.getString(1));
                datosCliente.add(rs.getString(2));
                datosCliente.add(rs.getString(3));
                datosCliente.add(rs.getString(4));
                datosCliente.add(rs.getString(5));
            }
            //cerrar la conexion
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, " <<ERROR>>\n <<NO SE PUDO ACCEDER A LOS DATOS>>\n");
        }
        return datosCliente;
    }
    
    
    public void cambiarDisponibilidad(String id_plaza,Integer disponibilidad){
        Connection con = conexion.getConnection();
        Statement st;
        
        String sql = "UPDATE PLAZA SET DISPONIBILIDAD =" + disponibilidad +  " WHERE ID_PLAZA = "+ id_plaza+"";
        System.out.println(sql);
        try {
            st = con.createStatement();
            
            int confirmar = st.executeUpdate(sql);
            if (confirmar == 1) {
                System.out.println("\n <<REGISTRO MODIFICADO CON EXITO>>\n");
            } else {
                System.out.println(" <<ERROR>>\n <<REGISTRO NO PUDO SER MODIFICADO>>\n");
            }
            //cerrar la conexion
            st.close();
            con.close();
            System.out.println("\n <<REGISTRO MODIFICADO CON EXITO>>\n");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " <<ERROR>>\n <<NO SE PUDO ACTUALIZAR EL USUARIO>>\n");
        }
    }
    
    public Integer retornaNumeroPlazas(){
        Integer contador=0;
        Connection con = conexion.getConnection();
        Statement st;
        ResultSet rs;
        String sql = "SELECT COUNT(AS_NUMERO_PLAZA) FROM ASIGNACION_PLAZA";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println(rs.next());
            contador=Integer.valueOf(rs.getString(1));
            //System.out.println("AQUI EL CONTADOR="+contador);
            //cerrar la conexion
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, " <<ERROR>>\n <<NO SE PUDO ACCEDER A LOS DATOS>>\n");
        }
        return contador;
    }
    
    public void asignarQuery(Integer id_num_plaza,String cliente_id_banner,Integer id_plaza,Date fecha,Date hora){
        //cargar la conexion
        Connection con = conexion.getConnection();
        Statement st;

        //Crear sentencia sql
        String sql = "INSERT INTO ASIGNACION_PLAZA VALUES ((SELECT COUNT(AS_NUMERO_PLAZA) FROM ASIGNACION_PLAZA)+1,'" + cliente_id_banner + "'," + id_plaza + ",(select current_date from dual),(select systimestamp from dual))";
        System.out.println(sql);
        try {
            st = con.createStatement();
            st.executeUpdate(sql);

            //cerrar la conexion
            st.close();
            con.close();
            System.out.println("\n <<REGISTRO INSERTADO CON EXITO>>\n");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " <<ERROR>>\n <<NO SE PUDO INSERTAR>>\n");
        }
    }
    
    public String recuperarPassword(String loginUser){
        Connection con = conexion.getConnection();
        String guardado = "";
        Statement st;
        ResultSet rs;
        String sql = "SELECT LOGIN_PASSWORD FROM LOGIN WHERE LOGIN_USER = '"+loginUser+"'";
        System.out.println(sql);
         try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                guardado=rs.getString(1);
                //System.out.println(" LoginUser: " + rs.getString(1));
            }
            //cerrar la conexion
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, " <<ERROR>>\n <<NO SE PUDO ACCEDER A LOS DATOS>>\n");
        }
        return guardado;
                
    }
}

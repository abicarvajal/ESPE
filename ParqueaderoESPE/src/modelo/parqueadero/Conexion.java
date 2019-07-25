/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.parqueadero;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ╔Diego Huerta╗
 */
public class Conexion {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl"; //"jdbc:oracle:thin:@localhost:1521:xe"
    private static final String USERNAME = "DbaParqueadero";
    private static final String PASSWORD = "12345";
    
    public static Connection getConnection(){
            
        Connection connection = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println(" <<CONEXION REALIZADA CON EXITO>>\n");
        }catch(Exception e){
            System.out.println(e);
            System.out.println(" <<ERROR>>\n <<CONEXION FALLIDA>>\n");
        }
        return connection;
    }
}

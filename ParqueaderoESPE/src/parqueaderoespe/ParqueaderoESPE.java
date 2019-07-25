/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueaderoespe;

import controlador.parqueadero.CRUD;
import modelo.parqueadero.Conexion;
import controlador.parqueadero.ControladorArchivos;
import controlador.parqueadero.controladorLogin;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import vista.parqueadero.Login;

/**
 *
 * @author Cheshire
 */
public class ParqueaderoESPE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
        Login login = new Login();
        login.show();
    }
    
}

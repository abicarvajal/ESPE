/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.parqueadero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import vista.parqueadero.*;

/**
 *
 * @author Abi
 */
public class controladorBotones implements ActionListener {

    private vista.parqueadero.Home vista;
    private vista.parqueadero.Elimina vistaE;
    private vista.parqueadero.Asigna vistaA;;
    
    public controladorBotones(vista.parqueadero.Home vista) {
        this.vista = vista;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        System.out.println(comando);
        switch(comando){
            case "Inicio":
                
                break;
            case "Asignar":
                vistaA.show();
                break;
            case "Eliminar":
                vistaE.show();
                break;
            case "Busqueda":
                break;
            case "Editar":
                break;
        }
    }

    
    
    
}

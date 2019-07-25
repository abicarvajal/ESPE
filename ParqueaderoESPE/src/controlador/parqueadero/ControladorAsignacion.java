/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.parqueadero;

import modelo.parqueadero.AsignacionDAO;
import java.util.ArrayList;

/**
 *
 * @author Santiago Vivas
 */
public class ControladorAsignacion {

    public ControladorAsignacion() {
    }

    public ArrayList<String> obtenerDatosCliente(String id) {
        AsignacionDAO asignacion = new AsignacionDAO();
        ArrayList<String> listaDatosCliente = new ArrayList<>();
        listaDatosCliente = asignacion.obtenerDatos(id);
        System.out.println(listaDatosCliente.get(2));
        return listaDatosCliente;
    }


}

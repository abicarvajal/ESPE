/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.parqueadero;

/**
 *
 * @author Cheshire
 */
public class Parqueadero {
    
    private Integer Parqueadero_Id;
    private Integer Parqueadero_cantidad;
    private Integer Parqueadero_cant_disponible;
    private char Parqueadero_Nombre;
    
    public Parqueadero() {
        
    }

    public void setParqueadero_Id(Integer Parqueadero_Id) {
        this.Parqueadero_Id = Parqueadero_Id;
    }

    public void setParqueadero_cantidad(Integer Parqueadero_cantidad) {
        this.Parqueadero_cantidad = Parqueadero_cantidad;
    }

    public void setParqueadero_cant_disponible(Integer Parqueadero_cant_disponible) {
        this.Parqueadero_cant_disponible = Parqueadero_cant_disponible;
    }

    public void setParqueadero_Nombre(char Parqueadero_Nombre) {
        this.Parqueadero_Nombre = Parqueadero_Nombre;
    }
    
    
    
    public Integer getParqueadero_Id() {
        return Parqueadero_Id;
    }

    public Integer getParqueadero_cantidad() {
        return Parqueadero_cantidad;
    }

    public Integer getParqueadero_cant_disponible() {
        return Parqueadero_cant_disponible;
    }

    public char getParqueadero_Nombre() {
        return Parqueadero_Nombre;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.parqueadero;

/**
 *
 * @author Abi
 */
public class Plaza {
    
    private Integer id_plaza;
    private boolean disponibilidad;
    private boolean plazadiscapacidad;

    public Integer getId_plaza() {
        return id_plaza;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public boolean isPlazadiscapacidad() {
        return plazadiscapacidad;
    }

    public void setId_plaza(Integer id_plaza) {
        this.id_plaza = id_plaza;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setPlazadiscapacidad(boolean plazadiscapacidad) {
        this.plazadiscapacidad = plazadiscapacidad;
    }
    
}

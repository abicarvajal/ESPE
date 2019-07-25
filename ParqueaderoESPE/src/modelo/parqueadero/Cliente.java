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
public class Cliente {
    private char Cliente_Id_Banner;
    private Integer Cliente_Ci;
    private String Cliente_Nombre;
    private String Cliente_Apellido;
    private char Cliente_Discapacidad;
    private int Cliente_Ptje_Disc;
    private Integer Cliente_Num_Cam_Disc;
    private char Cliente_Tipo_Disc;
    private String Cliente_Ubicacion;

    
    public void setCliente_Discapacidad(char Cliente_Discapacidad) {
        this.Cliente_Discapacidad = Cliente_Discapacidad;
    }

    public char getCliente_Discapacidad() {
        return Cliente_Discapacidad;
    }
    public void setCliente_Nombre(String Cliente_Nombre) {
        this.Cliente_Nombre = Cliente_Nombre;
    }

    public void setCliente_Apellido(String Cliente_Apellido) {
        this.Cliente_Apellido = Cliente_Apellido;
    }
    
    public String getCliente_Nombre() {
        return Cliente_Nombre;
    }

    public String getCliente_Apellido() {
        return Cliente_Apellido;
    }
    private char Cliente_Departamento;
    private char Cliente_Campus;

    public void setCliente_Id_Banner(char Cliente_Id_Banner) {
        this.Cliente_Id_Banner = Cliente_Id_Banner;
    }

    public void setCliente_Ci(Integer Cliente_Ci) {
        this.Cliente_Ci = Cliente_Ci;
    }


    public void setCliente_Ptje_Disc(int Cliente_Ptje_Disc) {
        this.Cliente_Ptje_Disc = Cliente_Ptje_Disc;
    }

    public void setCliente_Num_Cam_Disc(Integer Cliente_Num_Cam_Disc) {
        this.Cliente_Num_Cam_Disc = Cliente_Num_Cam_Disc;
    }

    public void setCliente_Tipo_Disc(char Cliente_Tipo_Disc) {
        this.Cliente_Tipo_Disc = Cliente_Tipo_Disc;
    }
    

    public void setCliente_Departamento(char Cliente_Departamento) {
        this.Cliente_Departamento = Cliente_Departamento;
    }

    public void setCliente_Campus(char Cliente_Campus) {
        this.Cliente_Campus = Cliente_Campus;
    }

    public char getCliente_Id_Banner() {
        return Cliente_Id_Banner;
    }

    public Integer getCliente_Ci() {
        return Cliente_Ci;
    }

    public int getCliente_Ptje_Disc() {
        return Cliente_Ptje_Disc;
    }

    public Integer getCliente_Num_Cam_Disc() {
        return Cliente_Num_Cam_Disc;
    }

    public char getCliente_Tipo_Disc() {
        return Cliente_Tipo_Disc;
    }

    public char getCliente_Departamento() {
        return Cliente_Departamento;
    }

    public char getCliente_Campus() {
        return Cliente_Campus;
    }

    public String getCliente_Ubicacion() {
        return Cliente_Ubicacion;
    }

    public void setCliente_Ubicacion(String Cliente_Ubicacion) {
        this.Cliente_Ubicacion = Cliente_Ubicacion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Cliente_Id_Banner=" + Cliente_Id_Banner + 
                ", Cliente_Nombre=" + Cliente_Nombre + ", Cliente_Apellido=" + Cliente_Apellido + 
                ", Cliente_Discapacidad=" + Cliente_Discapacidad +
                ", Cliente_Ptje_Disc=" + Cliente_Ptje_Disc + ", Cliente_Num_Cam_Disc=" + Cliente_Num_Cam_Disc  +
                ", Cliente_Ubicacion=" + Cliente_Ubicacion + ", Cliente_Campus=" + Cliente_Campus + '}';
    }
    
    
}

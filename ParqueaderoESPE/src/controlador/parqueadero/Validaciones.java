/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.parqueadero;

/**
 *
 * @author Santiago Vivas
 */
public class Validaciones {
    
    public Validaciones (){};
    public boolean validarID(int cedula) {
        int A[] = new int[10];
        boolean control;
        int AUX[] = new int[10];
        int cociente = 0, suma = 0, ds = 0, validar = 0;
        if (cedula == 0000000000 || cedula == 1010101010 || cedula == 1111111116) {
            System.out.println("CÉDULA NO VALIDA...\t");
            control = false;
            return control;
        } else {
            for (int i = 9; i >= 0; i--) {
                A[i] = cedula % 10;
                cociente = cedula / 10;
                cedula = cociente;
            }
            for (int i = 0; i < A.length; i += 2) {
                AUX[i] = A[i] * 2;
                if (AUX[i] > 9) {
                    AUX[i] = AUX[i] - 9;
                }
            }
            for (int i = 1; i < A.length; i += 2) {
                AUX[i] = A[i];
            }
            suma = 0;
            for (int i = 0; i < AUX.length - 1; i++) {
                suma += AUX[i];
            }
            ds = ((suma / 10) + 1) * 10;
            validar = ds - suma;
            if (validar == 10) {
                validar = 0;
            }
            if (validar == A[9]) {
                System.out.println("CÉDULA VALIDA...");
                control = true;
                return control;
            } else {
                System.out.println("CÉDULA NO VALIDA...");
                control = false;
                return control;
            }
        }
    }

    public boolean soloLetras(String palabra) {
        int i, cont = 0;
        boolean letras;
        for (i = 0; i < palabra.length(); i++) {
            if (Character.isLetter(palabra.charAt(i))) {
                cont++;
            } else {
                cont--;
            }
        }
        if (cont == palabra.length()) {
            letras = true;
        } else {
            letras = false;
        }
        return letras;
    }
    
    public boolean campoVacio(String palabra){
        if(palabra.isEmpty())
            return true;
        else
            return false;
                   
    }

}

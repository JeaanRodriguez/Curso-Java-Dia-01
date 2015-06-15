/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationclase1;

/**
 *
 * @author laboratorio
 */
public class JavaApplicationClase1 {

    private int contador;
    

    public static void main(String[] args) {
        JavaApplicationClase1 jp1 = new JavaApplicationClase1();

        for (jp1.contador = 0; jp1.contador < 10; jp1.contador++) {
            System.out.println("Imprimiendo el contador \n\n\n "+ jp1.contador);
        }

    }

}

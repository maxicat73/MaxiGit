/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion.a.java;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicio4_aprendizaje {

    /**
     * +
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
     * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double centigrados;
        double farenheit;
        System.out.println("Ingrese los grados centigrados");
        centigrados = leer.nextDouble();
        farenheit = 32 + (9 * centigrados / 5);
        System.out.println("los grados en farenheit son: " + farenheit);

    }

}

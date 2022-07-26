/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion.a.java;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejaprendizaje3 {

    /**
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y
     * después toda en minúsculas. Nota: investigar la función toUpperCase() y
     * toLowerCase() en Java.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();

        System.out.println("su nombre en mayusculas es " + nombre.toUpperCase());
        System.out.println("su nombre en minusculas es " + nombre.toLowerCase());

    }

}

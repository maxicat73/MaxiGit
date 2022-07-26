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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese la cantidad de asteriscos");
        int cantidad = leer.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("   ");
            for (int j = 1; j <= cantidad; j++) {
                if (i == 1 || i == cantidad) {
                    System.out.print("* ");
                } else if (j == 1 || j == cantidad) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

        }
    }

}

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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el valor limite");
        int limite = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("ingrese el numero: ");
            int num = leer.nextInt();
            suma = suma + num;
        } while (suma <= limite);
        {
            System.out.println("la suma es mayor al limite");
        }
    }
}

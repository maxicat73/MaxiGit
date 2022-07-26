/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion.a.java;

import java.util.Scanner;

/**
 * //*Escribir un programa que pida dos números enteros por teclado y calcule la
 * suma de los dos. El programa deberá después mostrar el resultado de la suma
 *
 * @author Maxi
 *
 *
 */
public class Ej_aprendizaje {

    public static void main(String[] args) {

        //Ejercicio 1
        int num1;
        int num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma de los numeros es: " + suma);

    }

}

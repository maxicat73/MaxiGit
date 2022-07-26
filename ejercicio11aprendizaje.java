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
public class ejercicio11aprendizaje {

    /**    // Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:
* El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner leer=new Scanner(System.in);
             System.out.println("ingrese el numero 1(entero y positivo");
             int num1=leer.nextInt();
             System.out.println("ingrese el numero 2(entero y positivo");
             int num2=leer.nextInt();
        
    }
    
}

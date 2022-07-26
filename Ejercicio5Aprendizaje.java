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
public class Ejercicio5Aprendizaje {

    /**
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        double num;
        double doble;
        double triple;
        double raiz;
        System.out.println("ingrese un numero ");
        num=leer.nextFloat();
        doble=2*num;
        System.out.println("el doble del numero es "+doble);
        triple=3*num;
        System.out.println("el triple del numero es " + triple);
        raiz=Math.sqrt(num);
        System.out.println("la raiz cuadrada de numero es "+raiz);
    }
    
}

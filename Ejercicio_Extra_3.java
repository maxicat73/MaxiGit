/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_Extra_3 {


    public static void main(String[] args) {
       
        Scanner Leer = new Scanner (System.in);
        
        System.out.println("ingrese una letra");
        String letra = Leer.next();   
        
        DetectarVocal(letra);
        
    }
    public static void DetectarVocal(String letra){
        
        if ( letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
            
            System.out.println("la letra ingresada es una vocal");
        }else {
            
            System.out.println("la letra ingresada no es una vocal");
        }
        
    }
     
}

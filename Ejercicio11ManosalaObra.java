/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion.a.java;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.L;

/**
 *
 * @author Maxi
 */
public class Ejercicio11ManosalaObra {

    /**
     * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
     * @param args
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
* 
     */
 
    public static void main(String[] args) {
    
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("ingrese una frase");
        
        String frase = leer.nextLine();
        
        
        String retorno = codificar (frase);
        
        System.out.print(retorno);
        
        }   
    public static String codificar(String frase) {
        
    String frase2 = "";
    int Largo=frase.length();
    
        for (int i = 0; i < Largo; i++) {
            
          String L;
        L = frase.substring(i);
          
      
           switch (L) {

               case "a": 
                   
                   L = "@";
                   break;
                   
               case "e":
                   
                   L = "#";
                   break;
                   
               case "i":
                   
                   L = "$";
                   break;
                   
               case "o":
                    L = "%";
                    break;
                   
               case "u":
                   
                   L = "*";
                   break;
   
                     
           default:  L = L;

                   
                   }
                           
                frase2=frase2+L;
                 
        }
        
        return frase2;
    }
}
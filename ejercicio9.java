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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String frase;
        System.out.println("ingrese una frase");
        frase=leer.next();
        String letra=frase.substring(0,1);    
        
        if(letra.equalsIgnoreCase("A")){
            System.out.println("la palabra comienza con A es correcto");
        }else{
            System.out.println("la palabra no comienza con A es incorrecta");
        }
      
       
    }
    
}

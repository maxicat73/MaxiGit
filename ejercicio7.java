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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer=new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase");
        frase=leer.nextLine();
        if(frase.equalsIgnoreCase("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("incorrecto");
        }
        
    }
    
}

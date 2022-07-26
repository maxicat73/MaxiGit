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
public class eje10Manosalaobra {

    /**
     * 
     * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer=new Scanner(System.in);
        int num;
        String asterisco="*";
        System.out.println("ingrese 4 numeros:");
        for (int i = 0; i < 5; i++) {
            
            num=leer.nextInt();
            if(num<=20 || num>0){
            
                System.out.print(num);
        }
          
            for (int j = 0; j < num; j++) {
              
               System.out.print("*");
          
            }
              System.out.println(" ");
    }
         
         
}
}
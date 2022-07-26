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
public class Ej1Extra {

    /**
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int minutos=0;
                
        CalcularTiempo(minutos);
    }
    
    public static void CalcularTiempo(int minutos){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos a Calcular");
        minutos=leer.nextInt();
        double b=0;
        double c=0;
        int dia=0;
       
        b=minutos/60;
        b= Math.floor(b);
              
        while(b>=24){
            dia=dia+1;
              b=b-24;
        }
        
       
        System.out.println("La cantidad es: "+ dia +" dias " + ", " + b +" horas");

      
       

        
        
        
    }
    
}

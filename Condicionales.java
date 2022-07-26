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
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer=new Scanner(System.in);
        System.out.println("Califique la pelicula de 1 a 5 estrellas");
        opinion=leer.nextInt();
        
        if(opinion>=1 && opinion<=5){
            switch (opinion){
                case 1:
                case 2:
                    System.out.println("Lo sentimos que no hayas disfrutado la pelicula");
                    break;
                case 3:
                    System.out.println("Has calificado la pelicula como buena");
                    break;
                case 4:
                    
                    System.out.println("Has calificado la pelicula como Muy buena");
                    break;
                case 5:   
                    System.out.println("Has calificado la pelicula como Excelente");
                    break;
            }
        }
            else if(opinion<0){
                    System.out.println("una opinion negativa? Tan mala fue la pelicula?");
                    }
            else if(opinion==0){            
                System.out.println("lo sentimos el valor "+opinion+" no es correcto");
                
           
        }
            else{
                 System.out.println("WOW se te fue la mano con la calificacion");
            }
        System.out.println("hasta la Proxima");
    }
    
    
}

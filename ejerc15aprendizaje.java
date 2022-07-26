/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion.a.java;

/**
 *
 * @author Maxi
 */
public class ejerc15aprendizaje {

    /**
     * Realizar un algoritmo que rellene un vector cn orden descendente.on los 100 primeros números enteros y los
muestre por pantalla e
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int [] vector1=new int [100];
        
        for (int i = 0; i < 100; i++) {
            
            vector1[i]=i+1;
            
        }
        for (int i =100-1; i>=0; i--) {
           
            System.out.print(" [ "+vector1[i]+ " ] ");
        }
        System.out.println(" ");
       
    }
    
    
}

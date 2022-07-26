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
public class eje16Aprendizaje {

    /**
     * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño del Vector");
        int n=leer.nextInt();
        
        
        int [] vector1=new int [n];
        
        for (int i = 0; i < n; i++) {
            
            vector1[i]=(int) (Math.random() * 100);
            
        }
        
        for (int i = 0; i < n; i++) {
            
            System.out.println(vector1[i]);
            
        }
        System.out.println("Ingrese el numero a buscar");
        int n2=leer.nextInt();
            int cont=0;
        for (int i = 0; i < n; i++) {
            if(vector1[i]==n2){
               cont=cont+1;
             System.out.println("el numero ingresado se encuentra en la posicion "+ i);
        }
        
    }
           
                System.out.println("El numero ingresado se encontro "+ cont + " Vece/s");
    
}
}



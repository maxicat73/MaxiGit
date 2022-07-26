/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio_20 {

    public static void main(String[] args) {
        
        
        
        int [] [] Matriz;
        Matriz = new int [3][3];
        
        CargarMatriz (Matriz);
        VerificarCuadradoMagico(Matriz);
        
    }
    
    public static void CargarMatriz (int Matriz [][]){
        
        Scanner Leer = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.println("ingrese un numero");
                int aux = Leer.nextInt();
                
                while (!(aux>0) && !(aux<10)) {    
                
                    System.out.println("ingrese un numero valido");
                    aux = Leer.nextInt();
                }
                Matriz [i] [j] = aux;
            }
  
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                                System.out.print("[" +Matriz [i][j] + "]");
            }
        }
 
               
        
    }
    
    public static void VerificarCuadradoMagico(int Matriz [][]){
        
        int fila=0;
        int col=0;
        int diagonal=0;
        
        for (int i = 1; i < 3; i++) {
            
            for (int j = 1; j < 3; j++) {
             
            fila += Matriz [0] [j]; 
            col += Matriz [i] [0];
            diagonal += Matriz [i] [i];
            
            }
            
        }
        
         if (fila == col && col==diagonal ) {
             System.out.println("este cuadrado es mágico");
        }else{
             System.out.println("este cuadrado no es mágico");
         }
    
    }
}

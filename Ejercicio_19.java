/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package javaguia6;

import java.util.Scanner;

public class Ejercicio_19 {

    
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];
        System.out.println("Iniciar Matriz........");
        
        InicializarMatriz(matriz);
        ImprimirMatriz(matriz);
        MatrizSimetrica(matriz);
       
    }
    
    public static void InicializarMatriz(int[][] matriz){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                int numero = leer.nextInt();
                matriz[i][j] = numero;
                
            }
        }
    }
    
     public static void ImprimirMatriz(int[][] matriz){
         
           for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print("["+matriz[i][j]+"]");
                
            }
               System.out.println("");
        }
     }
     
     public static void MatrizSimetrica(int[][] matriz){
         
         for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print("["+(matriz[j][i])*(-1)+"]");
                
            }
             System.out.println("");
        }
     }
    
}

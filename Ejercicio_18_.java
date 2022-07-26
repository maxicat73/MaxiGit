/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author Damian
 */
public class Ejercicio_18_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                int [] [] Matriz ;
                Matriz = new int [4] [4];
                
                for (int i = 0; i < 4; i++) {
                    System.out.println();
                    for (int j = 0; j < 4; j++) {
                        Matriz [i] [j]  =  (int) (Math.random()*10);
                        System.out.print("[");
                        System.out.print(Matriz [i] [j]);
                        System.out.print("]");
        } 
        }
                System.out.println();
                for (int i = 0; i < 4; i++) {
                    System.out.println();
                    for (int j = 0; j < 4; j++) {
                        System.out.print("[");
                        System.out.print(Matriz [j] [i]);
                        System.out.print("]");
        }
            
        }
    }
    
}

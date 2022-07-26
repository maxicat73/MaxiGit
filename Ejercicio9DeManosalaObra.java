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
public class Ejercicio9DeManosalaObra {

    private static int contador;

    /**++
     * 
     * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar l mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
     * @param args the command line argumentse
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("A continuacion ingrese 20 numeros ");
            int suma;
            suma=0;
            int contador1;
            contador1=0;
        do {
            
            int numero = leer.nextInt();
            contador1 ++;
        
            if (numero == 0) {
                 break;
            }

          
       
        else if(numero<0){
            continue;
                    }
            
            suma=suma+numero;
          
        } while(contador1 < 20);
        
          System.out.println("el resultado de la suma es : " + suma);
        
    }
      
}

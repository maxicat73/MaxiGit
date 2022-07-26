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
public class Ej14Aporendizaje {

    /**
     * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a Calcular");
       double euro=leer.nextDouble();
       System.out.println("Ingrese la moneda a convertir");
       String moneda=leer.next();
       
       Calculo(euro, moneda);
        
    }
    
    public static void Calculo(double euro, String moneda){
        
           
        switch(moneda){
            case "libra":System.out.println("la cantidad de libras es " + euro*0.86);
            break;
            case "dolar": System.out.println("la cantidad de dolares es " + euro*1.28611);
            break;
            case "yen": System.out.println("la cantidad de yenes es " + euro*129.852);
            break;
            default:System.out.println(" moneda incorrecta");
        }
        
        
    }
    
}

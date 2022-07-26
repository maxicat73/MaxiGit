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
public class Ejercicio17Aprendizaje {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño del Vector");
        int n=leer.nextInt();
        
        
        int [] vector1=new int [n];
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        
        System.out.println("ingrese los numeros");
        for (int i = 0; i < n; i++) {
            int numeros=leer.nextInt();
            vector1[i]=numeros;
        }
        
        for (int i = 0; i < n; i++) {
            if(vector1[i]<10){
                cont1=cont1+1;
            }
            else if(vector1[i]>=10 && vector1[i]<100 ){
                cont2=cont2+1;
        }
            else if(vector1[i]>=100 && vector1[i]<1000 ){
            cont3=cont3+1;
    }
            else if(vector1[i]>=1000 && vector1[i]<10000 ){
                cont4=cont4+1;
}
            else {
                cont5=cont5+1;
            }
        }
        
        System.out.println("cantidad de numeros de 1 digito "+cont1);
    System.out.println("cantidad de numeros de 2 digitos "+cont2);
    System.out.println("cantidad de numeros de 3 digitos "+cont3);
    System.out.println("cantidad de numeros de 4 digitos "+cont4);
    System.out.println("cantidad de numeros de 5 digitos "+cont5);
    
    
}   
}
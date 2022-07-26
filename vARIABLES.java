/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion.a.java;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class vARIABLES {

   
    public static void main(String[] args) throws IOException {
       //ejercicio 1
        int num,num2;
        String nombre;
        float num3;
        double num4;
        char frase;
        boolean logico;
        //ejercicio 2
        nombre="maximiliano";
        num=5;
        num2=2;
        num3=2/4;
        num4=2.4;
        logico=true;
        frase='/';
        //ejercicio 3
        int suma;
        suma = num+num2;
        System.out.println("el resultado de la suma es "+ suma);
        
        double resta;
        resta = num4-num4;
        System.out.println("el resultado de la resta es "+ resta);
        
        num++;
        System.out.println("el valor de num "+ num);
        
        num--;
            System.out.println("el valor de num "+ num);
            
         boolean resultado;
         resultado=num>3;
         System.out.println("el valor de resultado es "+ resultado);
           
         resultado=num<2;
         System.out.println("el valor de resultado es "+ resultado);
         //ejercicio 4
         String nombre1;
         nombre1="PAblo M";
         int edad=33;
         System.out.println("MI NOMBRE ES: "+ nombre1 + " y mi edad es: "+edad);
         
         //ejercicio 5
         
         Scanner leer=new Scanner(System.in);
         System.out.println("Ingrese el valor de num4");
         num4=leer.nextDouble();
          System.out.println(" el valor de num4 es "+num4);
         
         boolean logico2;
         System.out.println("Ingrese un valor booleano");
         
         logico2=leer.nextBoolean();
               System.out.println("el valor de logico 2 es "+logico2);
         
         char v2;
         System.out.println("Ingrese un caracter");
         v2=(char)System.in.read();
          System.out.println(" caracter v2 es :" + v2);
         
               
    }
    
}

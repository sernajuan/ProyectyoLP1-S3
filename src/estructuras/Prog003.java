/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Scanner;

/**
 *
 * @author Eddy
 */
public class Prog003 {
     public static void main(String[] args){
     
      Scanner teclado=new Scanner(System.in);
      String cadena;
        System.out.println("**** MANEJO DE CADENAS ****");
        
        System.out.println("Leer Cadena con nextLine(): ");
      cadena= teclado.nextLine();
         System.out.println("Valor inicial ingesado es: "+cadena);
         System.out.println("Mayuscula con toUpperCase(): "+cadena.toUpperCase());
          System.out.println("Minuscula con toLowerCase(): "+cadena.toLowerCase());
          System.out.println("Elimina espacios con trim: "+cadena.trim());
          System.out.println("Subcadena con substring(int): "+cadena.substring(5));
          System.out.println("Subcadena con substring(int,int): "+cadena.substring(5,10));
          System.out.println("Tamaño de una cadena: "+cadena.length());
          System.out.println("Extraer letra: "+cadena.charAt(0));
           System.out.println("Extraer letra: "+cadena.charAt(1));
            System.out.println("Extraer letra: "+cadena.charAt(2));
             System.out.println("Extraer letra: "+cadena.charAt(3));
             System.out.println("Extraer letra: "+cadena.charAt(4));
             System.out.println("Extraer letra: "+cadena.charAt(5));
             System.out.println("Extraer letra: "+cadena.charAt(6));
             System.out.println("Ultima letra: "+cadena.charAt(cadena.length()-1));
             teclado.close();   
    }   
}

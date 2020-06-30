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
public class Prog004 {
      public static void main(String[] args){
     
      Scanner teclado=new Scanner(System.in);
      int num=1;
      String mensaje= "Cristo viene pronto - Preparate";
      while(num<=10){
          System.out.println(mensaje);
          num++;
      }
       
      teclado.close();   
    }   
}

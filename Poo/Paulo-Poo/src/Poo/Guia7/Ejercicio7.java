/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Guia7;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
          String palabra;
          
          Scanner leer = new Scanner(System.in);
          
          System.out.println("Ingrese una frase");
          palabra=leer.nextLine();
          
          if(palabra.equals("eureka")){
              System.out.println("Correcto");
          }else{
               System.out.println("Incorrecto");
          }
    }
    
}

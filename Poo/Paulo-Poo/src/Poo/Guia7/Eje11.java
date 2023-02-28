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
public class Eje11 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        String frase= null;
        
        do {
        System.out.println("Ingrese una palabra");
        frase = read.nextLine();
        } while (!frase.substring(frase.length()-1, frase.length()).equals("."));
                  
              
        
        String retorno = cambio(frase);   
    }
    
        public static String cambio (String frase){
            
            String palabra = "";
            
        for (int i = 0; i < frase.length(); i++) {
                     
            palabra = frase.substring(i,i + 1);
            
            switch(palabra){
                case "a":
                    System.out.print("@");
                    break;
                case "e":
                    System.out.print("#");
                    break;
                case "i":
                    System.out.print("$");
                    break;
                case "o":
                    System.out.print("%");
                    break;  
                case "u":
                    System.out.print("*");
                    break;
                default:
                    System.out.print(palabra);
            } 
        }
        System.out.println("");
       return palabra; 
        }
}
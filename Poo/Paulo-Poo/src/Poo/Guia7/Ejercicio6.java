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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
     int numero;
     
     Scanner leer= new Scanner(System.in);
     
     System.out.print("Ingrese un número: ");
     numero=leer.nextInt();
     
     if (numero%2==0){
          System.out.print("El numero " + numero + " es par");
     }else{
                   System.out.print("El numero " + numero + " es impar");
                  }
    }
    
}

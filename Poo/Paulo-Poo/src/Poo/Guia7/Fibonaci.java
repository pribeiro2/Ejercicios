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

   import java.util.Scanner;

/**
 *
 * Realizar un programa que complete un vector con los N primeros nÃºmeros de la sucesiÃ³n
   de Fibonacci. Recordar que la sucesiÃ³n de Fibonacci es la sucesiÃ³n de los siguientes
   nÃºmeros:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * @author luisc
 */
public class Fibonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese los numeeros a pintar :");
        int iNumero =leer.nextInt();
        int antecesor, actual, siguiente, contador;
        antecesor=0;
        actual=1;
        System.out.println(" " + antecesor);
        System.out.println(" " +  actual);
        for(contador=2;contador<iNumero;contador++){
            siguiente=antecesor+actual;
            System.out.println(siguiente + " = " + antecesor + " "+actual);
            antecesor=actual;
            actual=siguiente;
        }
        
        
    }
    
}

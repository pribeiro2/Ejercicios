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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra;
        //char letra = 'A';
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        palabra = leer.nextLine();
        if (palabra.substring(0,1).equals("A")){
            System.out.println("Correcto");
        }else{    
            System.out.println("Incorrecto");
        }
    }
    
}

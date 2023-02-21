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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, n2;
        int suma = 0;
        Scanner leer = new Scanner(System.in);
        do {
        System.out.println("Ingrese un número positivo: ");
        n = leer.nextInt();
        } while (n <= 0);
        do {
            System.out.println("Ingrese un número: ");
        n2 = leer.nextInt();
        suma = suma + n2;
        } while (suma < n);
        System.out.println("Suma total es : "+suma);
    }
    
}

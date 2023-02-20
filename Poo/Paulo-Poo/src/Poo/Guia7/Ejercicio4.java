
package Poo.Guia7;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
       double grado;
       Scanner leer = new Scanner (System.in);
       
        System.out.print("Ingrese grados centigrados °C: ");
        grado=leer.nextDouble();
        
        System.out.println("Los grados Fahrenheit es: " + (32+(9*grado/5)));

    }
    
}

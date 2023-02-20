package paulo.prueba;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandrocruz
 */
public class Ejercicio1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1;
        int n2;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números: ");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        System.out.println("La suma de " + n1 + " + " + n2 + " es igual a: " + (n1+n2));
    }
    
}

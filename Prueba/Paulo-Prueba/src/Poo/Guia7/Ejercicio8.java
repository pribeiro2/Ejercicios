/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paulo.prueba;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres: ");
        frase = leer.nextLine();
        if (frase.length() == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}

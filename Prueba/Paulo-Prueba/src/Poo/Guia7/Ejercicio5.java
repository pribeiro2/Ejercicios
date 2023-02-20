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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        num=leer.nextInt();
        System.out.println("La raíz cuadrada es: "+ Math.sqrt(num) +" Doble: "+num*2 + " Triple: "+num*3);
    }
    
}

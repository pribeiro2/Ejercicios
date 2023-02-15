/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paulo.prueba;

import java.util.Scanner;
public class PauloPrueba {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresar tu nombre:");
        nombre = leer.next();
        System.out.println("hola mundo soy " + nombre + " y estoy programando en java");
    }
    
}

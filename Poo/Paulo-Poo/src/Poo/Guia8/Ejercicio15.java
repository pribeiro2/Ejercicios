package Poo.Guia8;

/**
 *
 * @author DELL
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] numeros = new int[100]; // Creamos un vector de 100 elementos
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 99 - i; // Rellenamos el vector con los 100 primeros números enteros de forma descendente
        }
        
        System.out.println("Números en orden descendente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " "); // Mostramos los números en orden descendente
        }
    }
}

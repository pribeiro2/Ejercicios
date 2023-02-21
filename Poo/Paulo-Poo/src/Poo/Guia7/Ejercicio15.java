package Poo.Guia7;
public class Ejercicio15 {
 public static void main(String[] args) {
    /*
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
    muestre por pantalla en orden descendente.
    */
       int[] vector = new int[100];
       crear_vector(vector);
       imprimir_vector(vector);
    }
    public static int[] crear_vector(int[] vector){
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }
        return vector;
    }
    public static void imprimir_vector(int[] vector){
        for (int i = 99; i > -1; i--) {
           System.out.print(vector[i] + "| "); 
        }
    }
}

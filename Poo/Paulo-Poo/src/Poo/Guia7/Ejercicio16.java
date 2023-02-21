package Poo.Guia7;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        /*
        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
        usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        numero y si se encuentra repetido
         */
        int n, a_buscar;
        System.out.println("Ingrese el tamaño de array: ");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        int[] vector = new int[n];
        carga_vector(vector, n);
        System.out.println("Ingrese numero a buscar: ");
        a_buscar = leer.nextInt();
        busca_en_vector(vector, a_buscar, n);
    }

// Funciones    
// Carga vector    
    public static void carga_vector(int[] vector, int _n) {
        for (int i = 0; i < _n; i++) {
            int numero = (int) (Math.random() * 11);
            vector[i] = numero;
            //System.out.println(numero);
        }
    }

// Busca en vector 
    public static void busca_en_vector(int[] vector, int _a_buscar, int _n) {
        int cuentaOcurrencias = 0;
        for (int i = 0; i < _n; i++) {
            if (vector[i] == _a_buscar) {
                cuentaOcurrencias++;
            }
        }
        if (cuentaOcurrencias != 0) {
            System.out.println("El numero " + _a_buscar + " aparece " + cuentaOcurrencias + " veces en el vector");
        } else {
            System.out.println("El numero " + _a_buscar + " no aparece en el vector");
        }
    }
}

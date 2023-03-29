/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio10;

import java.util.Arrays;

/**
 *
 * @author Paulo
 */
public class Guia8ejercicio10 {

    public static void main(String[] args) {

        int a[] = new int[50];
        int b[] = new int[20];
        int n = 50;
        int nn = 20;
        carga_vector(a, n);
        muestra_vector(a, n);
        ordena_vector(a, n);
        muestra_vector(a, n);
        arma_nuevo_vector(a, n, b, nn);
        muestra_vector(b, nn);
    }

// Carga vector    
    public static void carga_vector(int[] vector, int _n) {
        for (int i = 0; i < _n; i++) {
            vector[i] = (int) (Math.floor(Math.random() * 100));
        }
    }

    
    
// Ordena Vector (usando la clase Arrays)
    public static void ordena_vector(int[] vector, int _n) {
        Arrays.sort(vector);
    }
//  (haciendo el ordenamiento manual)
//    -------------------------------------------------------
//    public static void ordena_vector(int[] vector, int _n) {
//        for (int i = 0; i < _n; i++) {
//            int aux;
//            for (int j = 0; j < _n - 1; j++) {
//                aux = vector[j];
//                if (vector[j + 1] < vector[j]) {
//                    vector[j] = vector[j + 1];
//                    vector[j + 1] = aux;
//                }
//            }
//        }
//    }
// ----------------------------------------------------------
    // muestra vector    
    public static void muestra_vector(int[] vector, int _n) {
        for (int i = 0; i < _n; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("");
    }

    // arma nuevo vector
    public static void arma_nuevo_vector(int[] vector, int _n, int[] nvector, int _nn) {
        System.arraycopy(vector, 0, nvector, 0, 10);
        Arrays.fill(nvector, 10,20,5);
        
        //for (int i = 11 ; i < _nn; i++) {
        //    nvector[i]=5;
        //}
    }
    
}

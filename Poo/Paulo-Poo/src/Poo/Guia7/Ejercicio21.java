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
public class Ejercicio21 {

    private static int M[][];
    private static int P[][];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[][] M = new int[10][10];
        //int[][] P = new int[3][3];
        M = new int[][]{{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
        {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
        {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
        {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
        {32, 76, 79, 01, 36, 05, 67, 96, 12, 11},
        {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
        {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
        {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
        {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
        {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        P = new int[][]{{11, 12, 13},
        {56, 78, 87},
        {41, 87, 24}};
        P = new int[][]{{24, 56, 97},
        {79, 1, 36},
        {54, 88, 89}};
        P = new int[][] {{16,19,18},
                               {89,93,24},
                              {41,65,12}};
        P = new int[][] {{12,87,67},
                               {42,64,35},
                              {96,12,11}};
         P = new int[][] {{81,95,10},
                               {20,10,61},
                              {12,87,67}};
        
        Scanner leer = new Scanner(System.in);
        //cargaMatriz(M);
        printMatriz(M);
        //cargaMatrizde3(P, leer);
        //printMatriz(M);
        System.out.println("");
        printMatriz2(P);
        comparaMatrices(M, P);
    }

    public static void cargaMatriz(int[][] M) {
        /**
         * for (int i = 0; i < 10; i++) { for (int j = 0; j < 10; j++) { M[i][j]
         * = (int) (Math.random() * 10); //Llenar la matriz o un vector con
         * numeros aleatorios
         *
         * }
         *
         * }
         */

    }

    public static void printMatriz(int[][] M) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(M[i][j] + " ");

            }
            System.out.println(" ");
        }
    }

    public static void cargaMatrizde3(int[][] P, Scanner leer) {

        System.out.println("Ingrese numeros para llenar la matriz P de 3X3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("fila " + i + " Coluna " + j + " :");
                P[i][j] = leer.nextInt();
                System.out.println("");
            }

        }
    }

    public static void printMatriz2(int[][] P) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(P[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

    public static void comparaMatrices(int[][] M, int[][] P) {
        /*int a = 0;
    for (int i = 0; i < 7; i++) {
            //int aux = 0;
            for (int j = 0; j < 7; j++) {
                System.out.println(M[i][j]);
                for (int k = 0; k < 3; k++) {
                    
                }
                if(M[i][j] == P[i][j]){
                    System.out.println(M[i][j]);
                    System.out.println(P[i][j]);
         */
        boolean encontro = false;
        int posI = 0;
         for (int i = 0; i < M.length - P.length +1 ; i++) {
           for (int j = 0; j < M.length - P.length +1 ; j++) {
                if (buscaEnLaMatriz(M, P, i, j)) {
                    System.out.println("La matriz P está contenida en la matriz M. La submatriz comienza en la fila " + i + " y la columna " + j + ".");
                }
            }
        }
//        if (!found) {
        //          System.out.println("La matriz P no está contenida en la matriz M.");
        //    }
    }

    public static boolean buscaEnLaMatriz(int[][] M, int[][] P, int i, int j) {
        int cont = 0;
        int tamMatirz = P.length * P.length;
        for (int k = 0; k < P.length; k++) {
            for (int l = 0; l < P.length; l++) {
                
                if (M[i + k][j + l] == P[k][l]) {
                    cont++;
                }
                if (cont == tamMatirz) {
                    System.out.println("se cumple que son: " + cont);
                    //cont = 0;
                    return true;
                }
            }
        }
        return false;
    }

}

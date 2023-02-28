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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
        int[][] M = new int[10][10];
        int[][] P = new int[3][3];
        Scanner leer = new Scanner(System.in);
        cargaMatriz(M);
        printMatriz(M);
        cargaMatrizde3(P, leer);
        printMatriz(M);
        System.out.println("");
        printMatriz2(P);
        comparaMatrices(M, P);
    }

    public static void cargaMatriz(int[][] M) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j] = (int) (Math.random() * 10); //Llenar la matriz o un vector con numeros aleatorios

            }

        }
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

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese numeros para llenar la matriz P de 3X3");
                P[i][j] = leer.nextInt();
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
        boolean found = false;
        int cont = 0;
        for (int i = 0; i < M.length - P.length - 1; i++) {
            for (int j = 0; j < M[i].length - P.length - 1; j++) {
                for (int k = 0; k < P.length; k++) {
                    for (int l = 0; l < P.length; l++) {
                        if (M[i + l][j + k] == P[l][k]) {
                         //   found = true;
                            cont++;
                        }
                        if (cont == P.length) {
                            System.out.println("La matriz P está contenida en la matriz M. La submatriz comienza en la fila " + (i+l) + " y la columna " + (j+k) + ".");
                            System.out.println(cont);
                            //cont=0;
                            break;
                        }
                    }
                }
            }
        }
//        if (!found) {
  //          System.out.println("La matriz P no está contenida en la matriz M.");
    //    }
    }
}

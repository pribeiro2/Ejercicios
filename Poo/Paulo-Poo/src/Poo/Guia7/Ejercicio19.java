/*
Realice un programa que compruebe si una matriz1 dada es anti simétrica. Se dice que una
matriz1 A es anti simétrica cuando ésta es igual a su propia antiSimetrica, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz1 antiSimetrica de una matriz1 A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Poo.Guia7;

public class Ejercicio19 {

    public static void main(String[] args) {
        int n = 3, m = 3;
        int[][] matriz1 = new int[n][m];
        int[][] transpuesta = new int[n][m];
        carga_matriz1(matriz1, n, m);
        System.out.println("-----------------");
        imprime_matriz1(matriz1, n, m);
        System.out.println("-----------------");
        antiSimetrica(transpuesta, matriz1, n, m);
    }

    public static void carga_matriz1(int[][] matriz1, int n, int m) {
        //    for (int i = 0; i < n; i++) {
        //        for (int j = 0; j < m; j++) {
        //            matriz1[i][j] = (int) (Math.floor(Math.random() * 100) + 1) ;
        //        }
        matriz1[0][0] = -0;
        matriz1[0][1] = -2;
        matriz1[0][2] = 4;
        matriz1[1][0] = 2;
        matriz1[1][1] = 0;
        matriz1[1][2] = 2;
        matriz1[2][0] = -4;
        matriz1[2][1] = -2;
        matriz1[2][2] = 0;

    }

    public static void imprime_matriz1(int[][] matriz1, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void antiSimetrica(int[][] transpuesta, int[][] matriz1, int n, int m) {
        boolean esOk = true;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                transpuesta[i][j] = matriz1[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(((transpuesta[i][j]))+" ");
                if (((transpuesta[i][j]) * -1) != (matriz1[i][j])) {
                    esOk = false;
                }
            }

            System.out.println("");
        }
        if (esOk == true) {
            System.out.println("La matriz es Anti-Simetrica");
        } else {
            System.out.println("La matriz NO es Anti-Simetrica");
        }
    }
}

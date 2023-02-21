package Poo.Guia7;

public class Ejercicio18 {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
     * A se denota por B y se obtiene cambiando sus filas por columnas (o
     * viceversa).
     * @param args
     */
    public static void main(String[] args) {
        int n = 5, m = 5;
        int[][] matriz = new int[n][m];
        carga_matriz(matriz,n,m);
         System.out.println("-----------------");
        imprime_matriz(matriz, n, m);
         System.out.println("-----------------");
        traspuesta(matriz,n,m);

        // TODO code application logic here
    }

    public static void carga_matriz(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.floor(Math.random() * 100) + 1) ;
                //System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void imprime_matriz(int[][] matriz,int n,int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void traspuesta(int[][] matriz,int n,int m) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }

}

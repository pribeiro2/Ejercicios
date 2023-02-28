/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Poo.Guia7;

public class Ejercicio20 {

    public static void main(String[] args) {
        // TODO code application logic here
        int n=3,m=3;
        int[][] lista = new int[2][9];
        int[][] matriz = new int[n][m];

        // inicializar lista (la posicion [1,x] vamos a poner el status de uso 
        lista[0][0] = 1;
        lista[0][1] = 2;
        lista[0][2] = 3;
        lista[0][3] = 4;
        lista[0][4] = 5;
        lista[0][5] = 6;
        lista[0][6] = 7;
        lista[0][7] = 8;
        lista[0][8] = 9;
        lista[1][0] = 0;
        lista[1][1] = 0;
        lista[1][2] = 0;
        lista[1][3] = 0;
        lista[1][4] = 0;
        lista[1][5] = 0;
        lista[1][6] = 0;
        lista[1][7] = 0;
        lista[1][8] = 0;        
        
        
        // Cargamos la matiz por teclado
        cargaMatriz(lista, matriz, n, m);
        
    }
// Funcion para cargar la matriz
        public static void cargaMatriz(int[][] lista, int[][] matriz,int n,int m){
            int num=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    //num=buscoNumero(lista);
                    //--------------------
                        System.out.println("i y j "+i+" "+j);
                        boolean lo_tomo=true;
                        num = ((int) (Math.floor(Math.random() * 9)+1));
                        for (int k = 0; k < 9; k++) {
                        //System.out.println("random: "+ num);
                            if (lista[0][k]==num && lista[1][k]==0 && lo_tomo){
                                lista[1][k]=1;
                                lo_tomo=false;
                                System.out.println("Tomamos el numero: "+num+ " lo_tomo "+lo_tomo+" "+i+" "+j);
                            } 
                        }
                    }
                    
                    
                    
                    //--------------------
                      
                    
                    
                    
                }
            }
            
            

        }
/*
// Funcion busca numero
    public static int buscoNumero(int[][] lista){
        boolean lo_tomo=true;
        int num_=0;
        for (int i = 0; i < 9; i++) {
        num_ = ((int) (Math.floor(Math.random() * 9)+1));
        //System.out.println("random: "+num_);
      
            if (lista[0][i]==num_ && lista[1][i]==0 && lo_tomo){
                lista[1][i]=1;
                lo_tomo=false;
            } 
        }
    return num_;    
    }
*/


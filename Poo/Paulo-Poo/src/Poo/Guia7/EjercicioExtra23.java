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
public class EjercicioExtra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
        String[] palabra = new String[5];
        String[][] sopa = new String[20][20];
        System.out.println("Ingrese la palabra min 3 max 5 caracteres");
        int i;
        for (i = 0; i < 5; i++) {
            do {
                System.out.println("ingrese la palabra " + (i + 1));
                //palabra[i] = leer.nextLine();
               // System.out.println("tamaño " + palabra[i].length());
               palabra[0] = "JUAN";
               palabra[1] = "PEDRO";
               palabra[2] = "LAURA";
               palabra[3] = "RATON";
               palabra[4] = "ZORRO";

            } while (palabra[i].length() < 3 || palabra[i].length() > 5);
            //continue;
        }
        muestraPalabra (palabra) ; 
        llenarMatriz (sopa);
        muestraMatriz (sopa);
        insertarPalabras (palabra,sopa);
        muestraMatriz (sopa);
    }
    public static void muestraPalabra (String[] palabra){
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println(palabra[i]);
        }
        
     }
    public static void llenarMatriz(String[][] sopa){
        
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j]=String.valueOf((int)(Math.random() * 10));
            }
        }
        
    }
    public static void muestraMatriz(String[][] sopa){
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
    public static void insertarPalabras(String [] palabra, String [][] sopa){
        System.out.println("");
        int h=0, columnaH;
        
        //for (int i = 0; i < 20; i++) {
            //for (int j = 0; j < 20; j++) {
                for (int k = 0; k < 5; k++) {
                    h = 0 + (int) (Math.random() * 19); // Fila
                    columnaH = 0 + (int) (Math.random() * 14); // Columna a desplazar
                    System.out.println("Linea: "+h);
                    System.out.println("Columna: "+columnaH);
                    for (int l = 0; l <  palabra[k].length(); l++) {
                        System.out.print(" "+(palabra[k].substring(l,l+1)));
                        
                        sopa[h][columnaH]=(palabra[k].substring(l,l+1));
                        columnaH++;
                        
                    }
                    System.out.println("");
                    
                }
            //}
            
        //}
        
    }
}
  
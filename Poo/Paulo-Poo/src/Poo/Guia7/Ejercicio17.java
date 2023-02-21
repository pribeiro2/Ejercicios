/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
package Poo.Guia7;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        int n;
        System.out.println("Ingrese el tamaño de array: ");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        int[] vector = new int[n];
        carga_vector(vector, n);
        cuenta_digitos(vector,n);
        

    }

// Funciones    
// Carga vector    
    public static void carga_vector(int[] vector, int _n) {
        for (int i = 0; i < _n; i++) {
            int numero = (int) (Math.floor(Math.random() * 10000) + 1 );
            vector[i] = numero;
            //System.out.println(numero);
        }
    }    
// Cuenta digitos
    public static void cuenta_digitos(int[] vector, int _n) {
        int[] cuentaNumero = new int[6];
        System.out.println("-----------------------------");
        for (int i = 0; i < _n; i++) {
            //System.out.println(String.valueOf(vector[i]).length());
            switch (String.valueOf(vector[i]).length()){
                case 1:
                cuentaNumero[1]++;
                break;
                case 2:
                cuentaNumero[2]++;
                break;
                case 3:
                cuentaNumero[3]++;
                break;
                case 4:
                cuentaNumero[4]++;
                break;
                case 5:
                cuentaNumero[5]++;
                break;
                default:
                cuentaNumero[0]++;
                
            }
                
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Cantidades en "+i+" digitos: "+cuentaNumero[i]);
        }
        
    }
    
}

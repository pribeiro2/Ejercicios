/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package Poo.Guia7;
import java.util.Scanner;
 class Ejercicios14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double euros;
        int moneda;
        System.out.println("Ingresar la cantidad de euros:");
        
        euros = leer.nextDouble();
        System.out.println("¿A qué tipo de moneda desea realizar el cambio?");
        System.out.println("Opción 1: Libras");
        System.out.println("Opción 2: Dólares");
        System.out.println("Opción 3: Yenes");
        moneda = leer.nextInt();
        
        tasa_cambio(euros, moneda);
    }
    public static void tasa_cambio(double euros, int moneda){   
        double result;
        double[] vector = new double[3];
        vector[0] = 0.86; //Libras
        vector[1] = 1.28611; //Dólares
        vector[2] = 129.852; //Yenes
        
        switch (moneda){
            case 1:
                result = euros * vector[0];
                System.out.println("La conversión de los " + euros + " euros a libras es: " + result);
                break;
            case 2:
                result = euros * vector[1];
                System.out.println("La conversión de los " + euros + " euros a dólares es: " + result);
                break;
            case 3:
                result = euros * vector[2];
                System.out.println("La conversión de los " + euros + " euros a yenes es: " + result);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
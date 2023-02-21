package Poo.Guia7;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        int num1, num2, opcion;
        String seguir,respuesta;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Igrese un numero: ");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        System.out.print("Igrese otro numero: ");
        num2 = leer.nextInt();
        do {
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = leer.nextInt();
          //  System.out.print("Opcion elegida :" + opcion);
        switch (opcion) {
            case 1:
                System.out.println("Suma de "+num1+"+"+num2+"="+(num1+num2));
                System.out.println("Press Enter key to continue...");
                seguir = teclado.nextLine();
                break;
            case 2:
                System.out.println("Resta de "+num1+"-"+num2+"="+(num1-num2));
                System.out.println("Press Enter key to continue...");
                seguir = teclado.nextLine();
                break;
            case 3:
                System.out.println("Multiplicacion de "+num1+"*"+num2+"="+(num1*num2));
                System.out.println("Press Enter key to continue...");
                seguir = teclado.nextLine();
                break;
            case 4:
                if (num2==0){
                    System.out.println("Division de "+num1+"/"+num2+" No es posible");
                } else {
                System.out.println("Division de "+num1+"/"+num2+"="+(num1/num2));
                        }
                System.out.println("Press Enter key to continue...");
                seguir = teclado.nextLine();
                break;
            case 5:
                System.out.print("Esta seguro que quiere salir 'S/N': ");
                    respuesta=teclado.nextLine();
               if (respuesta.equalsIgnoreCase("S")) {
                   break;
               }else {
                   opcion=0;
                   break;        
                       }
            default:
                break;
                        }
            } while (opcion != 5 );
    }
}

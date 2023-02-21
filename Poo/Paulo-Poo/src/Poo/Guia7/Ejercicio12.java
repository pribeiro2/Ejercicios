package Poo.Guia7;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        String cadena; 
        int cuentaCorrectas = 0, cuentaIncorrectas = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingres cadena de 5 caracteres: ");
         cadena = leer.nextLine(); 
        while (!"&&&&&".equals(cadena))
                {        
            if (cadena.length() >= 5)
             {
                if ("X".equals(cadena.substring(0,1)) && "O".equals(cadena.substring(4,5)) && (cadena.length() == 5)) {
                    cuentaCorrectas++;
                } else {
                    cuentaIncorrectas++;
                }
             } else { cuentaIncorrectas++;
                    }
                System.out.print("Ingres cadena de 5 caracteres: ");
                cadena = leer.nextLine();     
                }
        System.out.println("Salio por recibir la cadena: " + cadena);
        System.out.println("Cadenas Correctas : " + cuentaCorrectas);
        System.out.println("Cadenas Inccorrectas : " + cuentaIncorrectas);
    }
}

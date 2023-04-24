/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.en the template in the editor.
 */
package eje1_perro;

import java.util.ArrayList;
import java.util.Scanner;

public class Eje1Perro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> raza = new ArrayList<>();

        int opt;
        do {
            System.out.println("Menu");
            System.out.println("1- Agregar raza");
            System.out.println("2- Listar razas");
            System.out.println("3- Salir");
            System.out.print("Opcion: ");
            opt = leer.nextInt();
            switch (opt) {
                case 1:
                    raza.add("Dogo");
                    raza.add("Caniche");
                    raza.add("Doberman");
                case 2:
                    for (String R : raza) {
                        System.out.println(R);
                    }
                    break;
                case 3:

                    break;
                default:
                    break;
            }
        } while (opt >= 1 && opt <= 2);

    }

}

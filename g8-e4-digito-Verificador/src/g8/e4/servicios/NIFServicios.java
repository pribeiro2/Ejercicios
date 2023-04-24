/*
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo. 
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package g8.e4.servicios;

import g8e4.entidades.NIF;
import java.util.Scanner;

public class NIFServicios {

    String array[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    Scanner leer = new Scanner(System.in);
    NIF nif = new NIF();

    public void crearNif() {
        int calculo;
        System.out.print("Ingrese DNI: ");
        nif.setDNI(leer.nextLong());

        calculo = (int) nif.getDNI() % 23;
        nif.setLetra(array[calculo]);
    }

    public void mostrar() {
        System.out.println("El numero NIF es: " + nif.getDNI() +"-"+ nif.getLetra());
    }
}

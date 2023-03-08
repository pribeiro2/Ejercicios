package mascotapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {

    private Scanner leer = new Scanner(System.in);

    public Mascota crearMascota() {

        System.out.print("Introducir nombre: ");
        String nombre = leer.nextLine();
        System.out.println("");
        System.out.print("Introducir apodo: ");
        String apodo = leer.nextLine();
        System.out.println("");
        System.out.print("Introducir tipo: ");
        String tipo = leer.nextLine();

        return new Mascota(nombre, apodo, tipo);

    }

}

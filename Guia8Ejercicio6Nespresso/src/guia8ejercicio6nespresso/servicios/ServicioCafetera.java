/*
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package guia8ejercicio6nespresso.servicios;

import guia8ejercicio6nespresso.entidades.Cafetera;
import java.util.Scanner;

/**
 * private long capacidadMaxima; private long cantidadActual;
 */
public class ServicioCafetera {

    private Cafetera laCafetera = new Cafetera();
    private Scanner leer = new Scanner(System.in);

    public void llenarCafetera() {
        laCafetera.setCantidadActual(laCafetera.getCapacidadMaxima());
    }

    public void servirTaza() {
        long taza = 0;

        System.out.print("Que tamaño de taza quiere server: ");
        taza = leer.nextLong();
        System.out.println("");
        if (laCafetera.getCantidadActual() - taza < 0) {
            System.out.println("No alcanza el cafe para la taza se sirvió solo: "
                    + laCafetera.getCantidadActual());
            laCafetera.setCantidadActual(0);
        } else {
            laCafetera.setCantidadActual(laCafetera.getCantidadActual() - taza);
        }

    }

    public void muestraCafetera() {
        System.out.println(laCafetera.toString());
    }

    public void vaciarCafetera() {
        laCafetera.setCantidadActual(0);
    }

    public void recargaCafe() {
        long relleno = 0;
        System.out.println("Recargue Cafe, maximo: " + laCafetera.getCapacidadMaxima() + " a rellenar");
        System.out.print("Cuanto carga? ");
        relleno = leer.nextLong();
        System.out.println("");
        if ((relleno + laCafetera.getCantidadActual()) > laCafetera.getCapacidadMaxima()) {
            System.out.println("No puede cargar con esa cantidad el maximo posible es: "
                    + (laCafetera.getCapacidadMaxima() - laCafetera.getCantidadActual()));
        } else {
            laCafetera.setCantidadActual(relleno + laCafetera.getCantidadActual());
            System.out.println("Se acaba de cargar " + relleno + "completando un total de "
                    + laCafetera.getCantidadActual());
        }

    }

    public boolean menu() {

        boolean sale = true;
        int opcion;

        do {
            System.out.println("Menu Cafetera");
            System.out.println("---------------");
            System.out.println("1- Llena con cafe");
            System.out.println("2- Servir taza");
            System.out.println("3- Vaciar cafetera");
            System.out.println("4- Agregar cafe");
            System.out.println("5- Consultar cafetera");
            System.out.println("6- Salir");
            System.out.println("----------------");
            System.out.print("Opcion? ");
            opcion = leer.nextInt();
        } while (opcion < 1 || opcion > 6);

        switch (opcion) {
            case 1:
                llenarCafetera();
                break;
            case 2:
                servirTaza();
                break;
            case 3:
                vaciarCafetera();
                break;
            case 4:
                recargaCafe();
                break;
            case 5:
                muestraCafetera();
                break;
            case 6:
                sale = false;
        }
        return sale;
    }
}

/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.n the template in the editor.
 */
package guia8ejercicio4.servicios;

import guia8ejercicio4.entidad.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in);

    public Rectangulo ingresaNumero() {
        Rectangulo numeros = new Rectangulo();
        System.out.print("Ingrese Base del Rectangulo: ");
        numeros.setBase(leer.nextInt());
        System.out.println("");
        System.out.print("Ingrese Altura del Rectangulo: ");
        numeros.setAltura(leer.nextInt());
        return numeros;
    }

    public int superficie(Rectangulo r) {
        return (r.getBase() * r.getAltura());
    }

    public int perimetro(Rectangulo r) {
        return ((2 * r.getBase()) + (2 * r.getAltura()));
    }

    public void mostrarRec(Rectangulo r) {

        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if (i == 0 || j == 0 || i == r.getAltura() - 1 || j == r.getBase() - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}

/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no. open the template in the editor.
 */
package guia8ejercicio8cadena;

import guia8ejercicio8cadena.entidades.Cadena;
import guia8ejercicio8cadena.servicios.ServicioCadena;
import java.util.Scanner;

public class Guia8Ejercicio8Cadena {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena frase = new Cadena();
        ServicioCadena SerCadena = new ServicioCadena();

        System.out.print("Ingrese Frase: ");
        frase.setFrase(leer.next());
        System.out.println("");
        frase.setLongitud(frase.getFrase().length());
        System.out.println("La frase ingresada es: " + frase.getFrase());
        System.out.println("El largo de la frase es: " + frase.getLongitud());

        System.out.println("La frase tiene : " + SerCadena.mostrarVocales(frase.getFrase(), frase.getLongitud()) + " Voclale[s]");
        SerCadena.invertirFrase(frase.getFrase(), frase.getLongitud());
        char letra;
        System.out.print("Ingrese Letra a buscar: ");
        letra = leer.next().charAt(0);
        System.out.println("");
        System.out.println("La frase tiene repetida : " + SerCadena.vecesRepetido(letra, frase.getFrase(), frase.getLongitud())
                + " letra[s]:" + "'" + letra + "'.");

        String frase2;
        System.out.print("Ingrese otra Frase: ");
        frase2 = leer.next();
        System.out.println("");
        System.out.println("La segunda frase ingresada es: " + frase2);
        if (SerCadena.compararLongitud(frase.getFrase(), frase.getLongitud(), frase2)) {
            System.out.println("Las frases son de igual longitud");

        } else {
            System.out.println("Las frases son de distinta longitud");
        }
        
        SerCadena.unirFrases(frase.getFrase(),frase2);
        
        System.out.print("Ingrese caracter a reemplazar a la letra A : ");
        letra = leer.next().charAt(0);
        System.out.println("");
        SerCadena.reemplazar(letra, frase.getFrase(), frase.getLongitud());
        
        System.out.print("Ingrese caracter a buscar : ");
        letra = leer.next().charAt(0);
        System.out.println("");
        
        if (SerCadena.contiene(letra, frase.getFrase())) {
            System.out.println("La letra "+ letra+ " se encuentra en la frase");
        }
        else {
            System.out.println("La letra "+ letra+ " NO se encuentra en la frase");
        }
        
    }
}

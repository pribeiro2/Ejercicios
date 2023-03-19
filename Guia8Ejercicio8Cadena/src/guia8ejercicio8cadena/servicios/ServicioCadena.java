/*
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
 Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
g) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no. open the template in the editor.
 */
package guia8ejercicio8cadena.servicios;

//import guia8ejercicio8cadena.entidades.Cadena;

public class ServicioCadena {

    //Cadena frase = new Cadena();

    /*
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
     */
    public int mostrarVocales(String frase, int longitud) {
        int cuenta = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.charAt(i) == 'A' || frase.charAt(i) == 'a'
                    || frase.charAt(i) == 'E' || frase.charAt(i) == 'e'
                    || frase.charAt(i) == 'I' || frase.charAt(i) == 'i'
                    || frase.charAt(i) == 'O' || frase.charAt(i) == 'o'
                    || frase.charAt(i) == 'U' || frase.charAt(i) == 'u') {
                cuenta++;
            }
        }
        return cuenta;
    }

    /*
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    public void invertirFrase(String frase, int longitud) {
        for (int i = longitud - 1; i >= 0; i--) {

            System.out.print(frase.charAt(i));

        }
        System.out.println("");
    }

    /*
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
 Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */

    public int vecesRepetido(char letra, String frase, int longitud) {
        int cuenta = 0;
        for (int i = 0; i < longitud; i++) {

            if (frase.charAt(i) == letra) {
                cuenta++;
            }
        }
        return cuenta;
    }

    /**
     * d) Método compararLongitud(String frase), deberá comparar la longitud de
     * la frase que compone la clase con otra nueva frase ingresada por el
     * usuario.
     */
    public boolean compararLongitud(String frase, int longitud, String segundaFrase) {
        return (longitud == segundaFrase.length());
    }

    /**
     * e) Método unirFrases(String frase), deberá unir la frase contenida en la
     * clase Cadena con una nueva frase ingresada por el usuario y mostrar la
     * frase resultante.
     */
    public void unirFrases(String frase, String segundaFrase) {
        System.out.println("Las 2 frases unidas:");
        System.out.println(frase.concat(segundaFrase));
    }

    /**
     * f) Método reemplazar(String letra), deberá reemplazar todas las letras
     * “a” que se encuentren en la frase, por algún otro carácter seleccionado
     * por el usuario y mostrar la frase resultante.
     */
    
    public void reemplazar(char letra, String frase, int longitud) {
        
        System.out.println("La nueva frase con el caracter cambiado es:");
        System.out.println(frase.replace('a',letra));
    }
    /**
g) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no. 
     */

    public boolean contiene(char letra, String frase) {
        return frase.contains(String.valueOf(letra));
       }
    


    
}

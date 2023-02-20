package paulo.prueba;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio3 {
  
    public static void main(String[] args) {
       String palabra;
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una palabra: ");
       palabra = leer.nextLine();
       
       System.out.println("La palabra en mayuscula es: "+ toUpperCase(palabra) );
       System.out.println("La palabra en Minuscula es: "+ toLowerCase(palabra) );
    }
}

package servicios;

import java.util.Scanner;
import entidades.ahorcado;

public class ahorcadoServicios {

//    private String[][] palabraABuscar;
//    private int cantidadEncontradas = 0;
//    private int jugadasMaximas;
    Scanner leer = new Scanner(System.in);
    ahorcado A1 = new ahorcado();

    public void crearJuego() {
        String palabra;
        System.out.print("Ingrese la cantidad de Jugadas Maximas: ");
        A1.setJugadasMaximas(leer.nextInt());
        System.out.print("Ingrese palabra a encontrar: ");
        palabra = leer.next();
        String matriz[][] = new String[palabra.length()][2];
        for (int i = 0; i < palabra.length(); i++) {
            matriz[i][0] = palabra.substring(i, i + 1);
            matriz[i][1] = "0";
        }
        A1.setPalabraABuscar(matriz);
    }

    public void buscar(String letra) {
        int cont=0;
        String[][] matriz = A1.getPalabraABuscar();
        for (int i = 0; i < matriz.length; i++) {
            if (letra.equals(matriz[i][0])) {
                cont++;
                matriz[i][1]="1";
            }
        }
        if (cont==0) {
            A1.setJugadasMaximas(A1.getJugadasMaximas()-1);
                }
        System.out.println("Sigue intentanto, te quedan "+A1.getJugadasMaximas()+" intentos.");
        A1.setPalabraABuscar(matriz);
        
    }
    
  public void imprEncontradas() {

        String[][] matr3 = A1.getPalabraABuscar();

        for (int i = 0; i < matr3.length; i++) {
            if (matr3[i][1].equals("1")) {
                System.out.print(matr3[i][0] + " ");

            } else {
                System.out.print(" - ");
            }

        }
        System.out.println("");

    }    
    
public void juego() {
        crearJuego();

        do {
            System.out.print("Ingrese una letra:");

            buscar(leer.next());

            imprEncontradas();
            System.out.println("");
        } while (A1.getJugadasMaximas() >= 0);

    }
    
  
  
    
}

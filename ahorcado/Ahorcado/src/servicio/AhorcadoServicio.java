package servicio;

import entidad.Ahorcados;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Riky
 */
public class AhorcadoServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Ahorcados ahorcado = new Ahorcados();

    public void crearJuego() {
        System.out.println("Ingrese la palabra");
        String palabraServ = sc.next();
        String matr[][] = new String[palabraServ.length()][2];
        for (int i = 0; i < palabraServ.length(); i++) {
            matr[i][0] = palabraServ.substring(i, i + 1);
            matr[i][1] = "0";
        }

        ahorcado.setPalabra(matr);
        System.out.println("Ingrese jugadas maximas");
        ahorcado.setJugadasMaximas(sc.nextInt());

    }

    public void buscar(String letra) {

        String[][] matr2 = ahorcado.getPalabra();
        //boolean validador = true;
          int cont=0;
        for (int i = 0; i < matr2.length; i++) {
          
            if (letra.equalsIgnoreCase(matr2[i][0])) {
                //validador = true;
                cont++;
                System.out.println("Enocntraste una letra");

                matr2[i][1] = "1";
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);

            } 
        }
        System.out.println("");
        if (cont==0) {
            ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas() - 1);
            System.out.println("Sigue intentando, te quedan  " + ahorcado.getJugadasMaximas() + "  intentos");

        } else {
            ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas());
            System.out.println("Sigue intentando, te quedan  " + ahorcado.getJugadasMaximas() + "  intentos");

        }
        ahorcado.setPalabra(matr2);
    }

    public void imprEncontradas() {

        String[][] matr3 = ahorcado.getPalabra();

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
            System.out.println("Ingrese una letra:");

            buscar(sc.next());

            imprEncontradas();

        } while (ahorcado.getJugadasMaximas() > 0);

    }

}

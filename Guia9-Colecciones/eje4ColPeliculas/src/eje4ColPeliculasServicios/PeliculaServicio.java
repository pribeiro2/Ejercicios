/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
    private String titulo;
    private String director;
    private double horas=0;
 */
package eje4ColPeliculasServicios;

import comparator.Comparadores;
import eje4ColPeliculasEntidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Pelicula pl;
    List<Pelicula> pelis = new ArrayList<>();

    /*
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */
    public void menu() {
        int opt = 0;
        boolean sale = true;
        do {
            System.out.println("Menu");
            System.out.println("-----");
            System.out.println("1- Ingresar Peliculas");
            System.out.println("2- Listar Peliculas");
            System.out.println("3- Peliculas con duracion mayor a 1hs");
            System.out.println("4- Peliculas ordenadas por duracion (Menor a Mayor)");
            System.out.println("5- Peliculas ordenadas por titulo Alfabeticamente");
            System.out.println("6- Peliculas ordenadas por director Alfabeticamente");
            System.out.println("7- Salir");
            System.out.print("Ingrese opcion: ");
            opt = leer.nextInt();
            switch (opt) {
                case 1:
                    cargaPelicula();
                    break;
                case 2:
                    listarPeliculas();
                    break;
                case 3:
                    listarMayorUnaHora();
                    break;
                case 4:
                    listarDuracion();
                    break;
                case 5:
                    listarTitulos();
                    break;
                case 6:
                    listarDirectores();
                    break;
                case 7:
                    sale = false;
                    break;
                default:
                    break;
            }
        } while (sale);
    }

    public void cargaPelicula() {
        pl = new Pelicula();
        System.out.print("Ingrese Titulo: ");
        pl.setTitulo(leer.next());
        System.out.print("Ingrese Director: ");
        pl.setDirector(leer.next());
        System.out.print("Ingrese duracion (en horas [hh.mm]): ");
        pl.setHoras(leer.nextDouble());
        pelis.add(pl);

    }

    /*
    private String titulo;
    private String director;
    private double horas=0;
     */
    private void listarPeliculas() {
        for (Pelicula peli : pelis) {
            System.out.println(peli);
        }
    }
    
    private void listarMayorUnaHora() {
        System.out.println("Titulo     Director    Duracion");
        System.out.println("-------------------------------");
                
        for (int i = 0; i < pelis.size() ; i++) {
            if (pelis.get(i).getHoras()>=1.0) {
                     
                System.out.print(pelis.get(i).getTitulo());
                System.out.print("       ");
                System.out.print(pelis.get(i).getDirector());
                System.out.print("       ");
                System.out.print(pelis.get(i).getHoras());
                System.out.println("");
            }
        }

    }

    private void listarDuracion() {
        ordenarPorDuracion((ArrayList<Pelicula>) pelis);
        listarPeliculas();
    }

    private void listarTitulos() {
        ordenarPorTitulo((ArrayList<Pelicula>) pelis);
        listarPeliculas();
    }

    private void listarDirectores() {
        ordenarPorDirector((ArrayList<Pelicula>) pelis);
        listarPeliculas();
    }
    
    public void ordenarPorDuracion(ArrayList<Pelicula> m) {
    m.sort(Comparadores.cDuracion);
}    
      public void ordenarPorTitulo(ArrayList<Pelicula> m) {
    m.sort(Comparadores.cTitulo);
}    
        public void ordenarPorDirector(ArrayList<Pelicula> m) {
    m.sort(Comparadores.cDirector);
}    
}

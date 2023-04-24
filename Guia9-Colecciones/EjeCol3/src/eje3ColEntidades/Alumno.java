/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.

 */
package eje3ColEntidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {

    private String nombre;
    private ArrayList<Integer> nota;
    private int cantidadDeNotas = 3;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno() {
        System.out.println("Ingres Nombre del Alumno: ");
        this.nombre = leer.next();
        this.nota = new ArrayList<>();
        for (int i = 0; i < cantidadDeNotas; i++) {
            System.out.println("Ingrese nota #" + (i + 1));
            nota.add(leer.nextInt());
        }
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.nota = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    public int getCantidadDeNotas() {
        return cantidadDeNotas;
    }

    public void setCantidadDeNotas(int cantidadDeNotas) {
        this.cantidadDeNotas = cantidadDeNotas;
    }

}

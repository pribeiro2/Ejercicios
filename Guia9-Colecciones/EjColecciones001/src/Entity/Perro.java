/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Comparator;

/**
 *
 * @author Daiyerson
 */
public class Perro implements Comparable<Perro>  {
    private String nombre;
    private String raza;
    private Integer edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "[" + "Nombre:" + nombre + ", Raza:" + raza + ", Edad:" + edad + ']';
    }

    @Override
    public int compareTo(Perro t) {
        return this.nombre.compareTo(t.getNombre());
    }
    
  
}



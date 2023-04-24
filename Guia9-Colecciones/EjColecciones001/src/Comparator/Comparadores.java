/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;

import Entity.Perro;
import java.util.Comparator;

/**
 *
 * @author Daiyerson
 */
public class Comparadores {
    public static Comparator<Perro> cNombre = new Comparator<Perro>(){
        @Override
        public int compare(Perro p1, Perro p2){
            return p1.getNombre().compareTo(p2.getNombre());
        }
    };
    
    public static Comparator<Perro> cRaza = new Comparator<Perro>(){
        @Override
        public int compare(Perro p1, Perro p2){
            return p1.getRaza().compareTo(p2.getRaza());
        }
    };
    
    public static Comparator<Perro> cEdad = new Comparator<Perro>(){
        @Override
        public int compare(Perro p1, Perro p2){
            return p1.getEdad().compareTo(p2.getEdad());
        }
    };
}

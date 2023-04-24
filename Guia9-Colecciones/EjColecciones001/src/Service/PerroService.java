/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Perro;
import Comparator.Comparadores;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
/**
 *
 * @author Daiyerson
 */
public class PerroService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro(){
        String a,b;
        int c;
        
        System.out.println("Ingresar el nombre del perro:");
        a = read.next();
        System.out.println("Ingresar la raza del perro:");
        b = read.next();
        System.out.println("Ingresar la edad del perro:");
        c = read.nextInt();
        return new Perro(a,b,c);
    }
   
public void ordenarPorNombre(ArrayList<Perro> m) {
    m.sort(Comparadores.cNombre);
}    

public void ordenarPorRaza(ArrayList<Perro> m) {
    m.sort(Comparadores.cRaza);
}    

public void ordenarPorEdad(ArrayList<Perro> m) {
    m.sort(Comparadores.cEdad);
}    


}

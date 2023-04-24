/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcolecciones001;

import Entity.Perro;
import java.util.Scanner;
import java.util.ArrayList;
import Service.PerroService;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Daiyerson
 */
public class EjColecciones001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerroService ps = new PerroService();
        TreeSet<Perro> perros = new TreeSet();
        perros.add(ps.crearPerro());
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        boolean exit = false;
        String opc;
        do {
            System.out.println("¿Desea añadir otro perro? S/N");
            opc = read.next();
            switch (opc.toUpperCase()) {
                case "S":
                    perros.add(ps.crearPerro());
                    break;
                case "N":
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida...");
            }
        } while (!exit);
        System.out.println(perros);
        System.out.println("------");
        for (Perro per : perros) {
            System.out.println(per);
        }

        System.out.println("Ingrese nombre del perro a eliminar: ");
        opc = read.next();
        Iterator<Perro> it = perros.iterator();
        while (it.hasNext()) {
            if (opc.equals(it.next().getNombre())) {
                it.remove();
            }
        }
        for (Perro per : perros) {
            System.out.println(per);
        }
        
        ArrayList<Perro> perroList = new ArrayList(perros);
        System.out.println("Imprimir tipo ArrayList.....");
        for (Perro p1 : perroList) {
            System.out.println(p1);
        }
        System.out.println(".............Edad");
        ps.ordenarPorEdad(perroList);
        for (Perro p1 : perroList) {
            System.out.println(p1);
        }
        System.out.println(".............Raza");
        ps.ordenarPorRaza(perroList);
        for (Perro p1 : perroList) {
            System.out.println(p1);
        }
        System.out.println(".............Nombre");
        ps.ordenarPorNombre(perroList);
        for (Perro p1 : perroList) {
            System.out.println(p1);
        }
        
        // perros.sort(Perro.compararRaza);
        // System.out.println(perros);
    }
}

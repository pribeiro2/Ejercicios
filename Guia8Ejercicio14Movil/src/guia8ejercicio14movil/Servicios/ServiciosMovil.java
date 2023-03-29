/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio14movil.Servicios;

import java.util.Scanner;
import guia8ejercicio14movil.Entidades.Movil;


public class ServiciosMovil {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Movil movil = new Movil();
    private Movil moviles[];

    public ServiciosMovil() {
    }
    
    public ServiciosMovil(int cantidadDeMoviles) {
        this.moviles = new Movil[cantidadDeMoviles];
        for (int i = 0; i < this.moviles.length; i++) {
            System.out.println("\nDatos del movil " + (i+1) + "...");
            this.moviles[i] = new Movil();
            this.setMovil(this.cargarCelular(this.moviles[i]));
        }
    }
    
    public Movil cargarCelular(Movil nuevoMovil){
        System.out.println("\nCargando datos de movil...");
        System.out.print("Digite la marca: ");
        nuevoMovil.setMarca(leer.next());
        System.out.print("Digite el precio: ");
        nuevoMovil.setPrecio(leer.nextDouble());
        System.out.print("Digite el modelo: ");
        nuevoMovil.setModelo(leer.next());
        System.out.print("Digite la memoria ram: ");
        nuevoMovil.setRam(leer.nextInt());
        System.out.print("Digite el almacenamiento: ");
        nuevoMovil.setAlmacenamimento(leer.nextInt());
        nuevoMovil.setCodigo();
        
        return nuevoMovil;
    }
    
    public void cargarCelular(){
        System.out.println("\nCargando datos de movil...");
        System.out.print("Digite la marca: ");
        this.movil.setMarca(leer.next());
        System.out.print("Digite el precio: ");
        this.movil.setPrecio(leer.nextDouble());
        System.out.print("Digite el modelo: ");
        this.movil.setModelo(leer.next());
        System.out.print("Digite la memoria ram: ");
        this.movil.setRam(leer.nextInt());
        System.out.print("Digite el almacenamiento: ");
        this.movil.setAlmacenamimento(leer.nextInt());
        this.movil.setCodigo();
    }
    
    public void mostrarArregloDeMoviles(){
        System.out.println("\nMostrando el arreglo de moviles...");
        for (int i = 0; i < moviles.length; i++) {
            System.out.println(moviles[i].toString());
        }
    }

    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librerias_servicios;

import java.util.Scanner;
import libreria_entidades.Libros;
import libreria_entidades.Autores;
import libreria_entidades.Clientes;
import libreria_entidades.Personas;
import libreria_entidades.Libreria;

public class LibreriaServicios {
    
    // Generar Libros
//    private int ISBN;
//    private String titulo;
//    private Autores autor;
//    private String editorial;
//    private int edicion; // Año
//    private int numPaginas;
//    private String pais;
//    private String idioma;
//    private String materia;
//    private int stock;
    
//     public Libros(int ISBN, String titulo, Autores autor, String editorial, int edicion, int numPaginas, String pais, String idioma, String materia, int stock) {
//        this.ISBN = ISBN;
//        this.titulo = titulo;
//        this.autor = autor;
//        this.editorial = editorial;
//        this.edicion = edicion;
//        this.numPaginas = numPaginas;
//        this.pais = pais;
//        this.idioma = idioma;
//        this.materia = materia;
//        this.stock = stock;
//    
     Scanner in = new Scanner(System.in);
     Libros lb = new Libros();
     
     public Libros crearLibros() {
     lb.setISBN(1000);
     lb.setTitulo("El Pricipito");
     lb.setAutor(autor);
             
             
         return lb;
         
     }             
        
     
     
}

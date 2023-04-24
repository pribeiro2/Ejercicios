/**
Un ejercicio interesante propuesto por el mentor experto, para pensar
Tenemos una librería en donde entra un cliente buscando un libro, este cliente puede buscar por nombre de autor, 
o nombre de libro, si selecciona por autor, debe mostrar los libros del autor, 
si busca por titulo de libro debe mostrar el autor y el precio del libro.
Los libros tendrán las características de un libro como en el ejercicio 1(ISBN, Título, Autor, 
Número de páginas), y tendrá un atributo adicional llamado costo.
El cliente tiene como atributo nombre, apellido y saldo.
El autor tendrá nombre, apellido y libros asociados.
la transcripción la hice yo, no esta al 100% como lo dijo por que hablaba rapido
*/
package libreria_entidades;

import java.util.Date;

public class Libreria {

private Date fecha;
private double ventas;
private Clientes cliente;
private Libros[] librosComprados;

    public Libreria() {
    }

    public Libreria(Date fecha, double ventas, Clientes cliente, Libros[] librosComprados) {
        this.fecha = fecha;
        this.ventas = ventas;
        this.cliente = cliente;
        this.librosComprados = librosComprados;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Libros[] getLibrosComprados() {
        return librosComprados;
    }

    public void setLibrosComprados(Libros[] librosComprados) {
        this.librosComprados = librosComprados;
    }



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_entidades;

/**
 *
 * @author Paulo
 */
public class Autores {
    
    private int idAutor;
    private String direccion;
    private String localidad;
    private String telefono;
    private Personas datos;
    private Libros[] librosbAsociados; 

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Personas getDatos() {
        return datos;
    }

    public void setDatos(Personas datos) {
        this.datos = datos;
    }

    public Libros[] getLibrosbAsociados() {
        return librosbAsociados;
    }

    public void setLibrosbAsociados(Libros[] librosbAsociados) {
        this.librosbAsociados = librosbAsociados;
    }

    public Autores(int idAutor, String direccion, String localidad, String telefono, Personas datos, Libros[] librosbAsociados) {
        this.idAutor = idAutor;
        this.direccion = direccion;
        this.localidad = localidad;
        this.telefono = telefono;
        this.datos = datos;
        this.librosbAsociados = librosbAsociados;
    }

    public Autores() {
    }


}

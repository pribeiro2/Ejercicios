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
public class Clientes {
    
    private int numCliente;
    private String direccion;
    private String localidad;
    private String telefono;
    private double saldo;
    private Personas datos;

    public Clientes() {
    }

    public Clientes(int numCliente, String direccion, String localidad, String telefono, double saldo, Personas datos) {
        this.numCliente = numCliente;
        this.direccion = direccion;
        this.localidad = localidad;
        this.telefono = telefono;
        this.saldo = saldo;
        this.datos = datos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  
    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
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
    
    
    
}

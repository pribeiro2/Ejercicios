/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio14movil.Entidades;

import java.util.Scanner;

public class Movil {
    private String marca;
    private double precio;
    private String modelo;
    private int ram;
    private int almacenamimento;
    private int codigo[] = new int[7];

    public Movil() {
    }

    public Movil(String marca, double precio, String modelo, int ram, int almacenamimento) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamimento = almacenamimento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamimento() {
        return almacenamimento;
    }

    public void setAlmacenamimento(int almacenamimento) {
        this.almacenamimento = almacenamimento;
    }

    public int[] getCodigo() {
        return codigo;
    }
    
    public String getCodigoCadena() {
        String cod="";
        
        for (int i = 0; i < codigo.length; i++) {
            cod+= codigo[i];
        }
        
        return cod;
    }

    public void setCodigo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String cod;
        do {
            System.out.print("\nDigite el codigo de 7 digitos: ");
            cod = leer.next();
            if(cod.length()!=7)
                System.out.println("\nError, el codigo debe de ser de 7 digitos.");
        } while (cod.length()!=7);
        
        for (int i = 0; i < codigo.length; i++) {
            codigo[i] = Integer.parseInt(cod.substring(i,i+1));
        }
    }    

    @Override
    public String toString() {
        return "\nDatos del movil... \nMarca: " + marca + "\nPrecio: " + precio + "\nModelo: " + modelo + "\nRam: " + ram + "\nAlmacenamimento: " + almacenamimento 
                + "\nCodigo: " + getCodigoCadena();
    }
    
    
            
}
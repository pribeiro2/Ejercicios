/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio11;

import guia8ejercicio11entidades.Fechas;
import guia8ejercicio11servicios.FechasServicios;

/**
 *
 * @author Paulo
 */
public class Guia8ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       FechasServicios fs = new FechasServicios();
       Fechas fe = fs.ingresaFechas();
        
        System.out.println(fe.toString());
        
        fs.CalculaAnio(fe);
    }
    
}

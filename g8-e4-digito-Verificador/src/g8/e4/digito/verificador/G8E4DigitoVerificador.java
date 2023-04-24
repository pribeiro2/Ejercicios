/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8.e4.digito.verificador;

import g8.e4.servicios.NIFServicios;

public class G8E4DigitoVerificador {
    public static void main(String[] args) {

        NIFServicios NS = new NIFServicios();
        
        NS.crearNif();
        NS.mostrar();
                
    }
    
}

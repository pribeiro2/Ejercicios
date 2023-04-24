/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.TarjetaDeCredito;
import entidades.Ticket;
import static entidades.EjePosnet.*;

/**
 *
 * @author Paulo
 */
public class EjePosnetServicios {
 
      public Ticket efectuarpago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas) {
          Ticket elTicket = null;
          if (datosValidos(tarjeta,montoAAbonar,cantCuotas)) {
              double montoFinal = montoAAbonar+ montoAAbonar*recargoSegunCuotas(cantCuotas);
              if (tarjeta.tieneSaldoDisponible(montoFinal)) {
                  tarjeta.descontar(montoFinal);
                  String nobApe = tarjeta.nombreCompletoDelTitular();
                  double montoPorCuota = montoFinal/cantCuotas;
                  elTicket = new Ticket(nobApe, montoFinal, montoPorCuota);
              }
          }
          
         
          
         return elTicket;
    }
 
private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cuotas) {
    boolean esTarjetaValida = tarjeta !=null;
    boolean esMontoValido = monto >0;
    boolean canCuotasValidas = cuotas >= MIN_CANT_CUOTAS && cuotas <= MAX_CANT_CUOTAS;
    
    return esTarjetaValida && esMontoValido && canCuotasValidas;
}

private double recargoSegunCuotas(int cuotas) {
    return (cuotas-1)*RECRGO_POR_CUOTA;
}

      
}

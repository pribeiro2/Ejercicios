package ejeposnet;

import entidades.*;
import Servicios.EjePosnetServicios;

public class EjePosnetPricipal {

    public static void main(String[] args) {
        EjePosnetServicios posnetServicios = new EjePosnetServicios();
        //EjePosnet posnet = new EjePosnet();
        //Ticket tk = new Ticket();
        Persona per = new Persona("21699466", "Paulo", "Ribeiro", "15151515", "priberio2@gmail.com");
        TarjetaDeCredito Tc = new TarjetaDeCredito("BBVA", "45646456464", 15000, EntidadFinanciera.Visa, per);

        System.out.println("Tarejta antes de pagar ");
        System.out.println(Tc);

        System.out.println("Efectuar el pago");
        Ticket ticketGenerado = posnetServicios.efectuarpago(Tc, 1000, 3);

        System.out.println("Ticket generado");

        System.out.println(ticketGenerado);

        System.out.println(Tc);

    }

}

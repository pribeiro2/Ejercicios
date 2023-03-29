/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package guia8ejercicio11servicios;

import guia8ejercicio11entidades.Fechas;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class FechasServicios {

    Scanner leer = new Scanner(System.in);
    Fechas f1 = new Fechas();

    public Fechas ingresaFechas() {

        System.out.print("Ingrese Año: ");
        f1.setAnio(leer.nextInt());
        System.out.print("Ingrese Mes: ");
        f1.setMes(leer.nextInt());
        System.out.print("Ingrese Dia: ");
        f1.setDia(leer.nextInt());

        return f1;
    }

    public void CalculaAnio(Fechas f1) {

        Date fechaIngresada = new Date(f1.getAnio()-1900, f1.getMes()-1, f1.getDia());
        Date hoy = new Date();

        System.out.println("Año actual: " + (hoy.getYear()+1900));
        System.out.println("Año Ingresado: " + (fechaIngresada.getYear()+1900));
        System.out.println("Cantidad de años entre las 2 fechas son: " + (hoy.getYear() - fechaIngresada.getYear()));

        
        System.out.println("Dia: "+fechaIngresada.getDay());
        System.out.println("Mes: "+fechaIngresada.getMonth());
        System.out.println("Año: "+fechaIngresada.getYear());
    }

}

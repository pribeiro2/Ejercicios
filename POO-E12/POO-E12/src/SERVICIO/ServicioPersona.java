/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento 
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos:  
 Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto. 
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual. 
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra 
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario. 
 Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.
 */
package SERVICIO;

import ENTIDAD.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author fdmar
 */
public class ServicioPersona {

    Scanner in = new Scanner(System.in);

    Persona per = new Persona();

    public Persona crearPersona() {
        Date fecha = new Date();
        System.out.println("Ingrese el nombre de la persona");
        per.setNombre(in.next());
        System.out.println("Ingrese el Año de nacimiento");
        fecha.setYear(in.nextInt() - 1900);
        System.out.println("Ingrese el Mes de nacimiento");
        fecha.setMonth(in.nextInt() - 1);
        System.out.println("Ingrese el Dia de nacimiento");
        fecha.setDate(in.nextInt());

        per.setFechaN(fecha);

        return per;
    }

//        public class Persona {
//        private String nombre;
//        private Date fechaN;
//        private int edad;
    
    public void calcularedad(Persona per) {
        Date fechaA = new Date();

        if (per.getFechaN().getMonth() < fechaA.getMonth()) {
            per.setEdad(fechaA.getYear() - per.getFechaN().getYear());
        } else if (per.getFechaN().getMonth() == fechaA.getMonth()) {
            if (per.getFechaN().getDay() > fechaA.getDay()) {
                per.setEdad(fechaA.getYear() - per.getFechaN().getYear() - 1);
            } else {
                per.setEdad(fechaA.getYear() - per.getFechaN().getYear());
            }
        } else {
            per.setEdad(fechaA.getYear() - per.getFechaN().getYear() - 1);
        }

    }

    public boolean menosQue(Persona per, int edad) {

        boolean menorq = false;
        menorq = per.getEdad() < edad;

        return menorq;
    }

    private Object Date() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

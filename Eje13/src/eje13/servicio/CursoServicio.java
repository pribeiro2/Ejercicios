/*
método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package eje13.servicio;

import eje13.entidad.Curso;
import java.util.Scanner;

public class CursoServicio {

    Curso c1 = new Curso();
    Scanner leer = new Scanner(System.in);

    public Curso cargarAlumnos() {
        //String[] alumnos = new String[5];    
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese nombre del alumno #" + i + ": ");
            c1.setAlumnos(leer.next(), i);
            System.out.println("");
        }
        return c1;
    }

    
//    private String nombreCurso;
//    private int cantidadHorasPorDia;
//    private int cantidadDiasPorSemana;
//    private String turno;
//    private double precioPorHora;
//    private String[] alumnos = new String[5]; 
     public Curso crearCurso() {
       
         System.out.print("Ingresar nombre del Curso: ");
         c1.setNombreCurso(leer.next());
         System.out.println("");
         System.out.print("Ingresar Horas por dia : ");
         c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("");
         System.out.print("Ingresar Dias por semana : ");
         c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("");
         System.out.print("Ingresar Turno [Mañana-Tarde]: ");
         c1.setTurno(leer.next());
         System.out.println("");
         System.out.print("Precio por hora: ");
         c1.setPrecioPorHora(leer.nextDouble());
         System.out.println("");
         
         cargarAlumnos();
         
         return c1;
         
         
     } 
     
    
    
}

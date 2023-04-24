/*
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main
 */
package alumnosServicios;

import eje3ColEntidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoServicio {

    public List<Alumno> alumnos = new ArrayList<>();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        int opt = 0;
        while (opt != 4) {
            System.out.println("Menu Alumno");
            System.out.println("1-Ingresar Alumno");
            System.out.println("2-Calular nota Final");
            System.out.println("3-Cambiar candiad de notas");
            System.out.println("4-Salir");
            opt = leer.nextInt();
            switch (opt) {
                case 1:
                    alumnos.add(new Alumno());
                    break;
                case 2:
                    buscarAlumno();
                    break;
                case 3:
                    modificarCantidaDeNotas();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida ");
            }
        }
    
    }
  
  private void buscarAlumno() {
     String al;
     boolean existe=false;
      System.out.println("Ingrese alumno a buscar: ");
      al = leer.next();
      for (Alumno alumno : alumnos) {
          if (alumno.getNombre().equals(al)) {
              calcularNotaFina(alumno);
              existe=true;
              break;
          } 
          
      }
      if (!existe) {
          System.out.println("El alumno no se encotro en la lista");
      }
          
      
  }  

    private void calcularNotaFina(Alumno alumno) {
        double sumaNotas=0;
        for (Integer nota : alumno.getNota()) {
            sumaNotas+=nota;
        }
        System.out.println("Nota final de "+alumno.getNombre()+ " es:"+sumaNotas/alumno.getNota().size());
    }
    
    private void modificarCantidaDeNotas() {
        int nuevaCantidad=0;
        System.out.println("Ingrese Cantida de notas: ");
        nuevaCantidad=leer.nextInt();
        nuevaCantidad-=alumnos.get(0).getCantidadDeNotas();
        if (nuevaCantidad>0) {
            for (Alumno alu : alumnos) {
                for (int i = 1; i <= nuevaCantidad; i++) {
                    
                    System.out.println("Ingrese nota #" + (alumnos.get(0).getCantidadDeNotas()+i)+ " del alumno "+alu.getNombre());
                    alu.getNota().add(leer.nextInt());
                    
                }
                alu.setCantidadDeNotas(nuevaCantidad+alumnos.get(0).getCantidadDeNotas());
            }
            
        } else {
            System.out.println("Ingrese nota a eliminar [0-"+ (alumnos.get(0).getNota().size()-1)+"] :" );
            nuevaCantidad=leer.nextInt();
            if (nuevaCantidad>=0 && nuevaCantidad<=(alumnos.get(0).getNota().size()-1)) {
                for (Alumno alumno : alumnos) {
                    alumno.getNota().remove(nuevaCantidad);
                    alumno.setCantidadDeNotas(nuevaCantidad+alumnos.get(0).getCantidadDeNotas());
                }
            } 
            
        }
    }
    
}

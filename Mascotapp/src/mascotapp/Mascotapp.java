
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

public class Mascotapp {

    public static void main(String[] args) {
        
    //ServicioMascota sm = new ServicioMascota();
    //Mascota m1 = sm.crearMascota();
    //System.out.println(m1.toString());
    //m1 = null; //Elimina la variable que no se usa para liberar la memoria - garbage collector
        
        
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
//        //Mascota m2 = new Mascota();
        Mascota m1 = new Mascota("Fernando Pepe", leer.next(), "Perro", "marron", 0, true, "salchicha");
        m1.setNombre("Pepe con Set");

 //       m1.pasear(500);
           m1.pasear(100,7);
//    
        System.out.println(m1.getNombre());
//        System.out.println(m1.toString());
          System.out.println(m1);
        //System.out.println(m2);
    
    
    
//    m1.apodo = "Chiquito";
//    //m1.nombre = "Fernando Chiquito";
//    m1.nombre = leer.nextLine();
//    m1.tipo = "Perro";
//    m1.edad = 14;
//    m1.raza = "Beagle";
//    m1.cola = true;
//    m1.color = "Tricolor";
        //Mascota m2 = new Mascota();
    //System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo+" "+m1.nombre+" ");
    
    
    
    
    }

}


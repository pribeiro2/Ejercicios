
package pruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.Map;
import java.util.TreeSet;

public class Pruebas {
    public static void main(String[] args) {
       
//
//ArrayList<String> lista = new ArrayList();
//lista.add("A");
//lista.add("B");
//
//Iterator iteractor = lista.iterator();
//        System.out.println("Elementos de la Lista: ");
//while (iteractor.hasNext()) {
//    System.out.print(iteractor.next()+ " ");
//}
//        System.out.println();


ArrayList<String> palabra = new ArrayList<>();
palabra.add("juan");
palabra.add("Hola");
palabra.add("perro");
palabra.add("Mesa");
palabra.add("Luis");

Iterator<String> it = palabra.iterator();
while (it.hasNext()) {
    if (it.next().equals("Hola")) {
        it.remove();
    }

    System.out.println(palabra);
    
}










//    ArrayList<Integer> numerosA = new ArrayList();
//    Integer x =20;
//    numerosA.add(20);
//    numerosA.add(12);
//    numerosA.add(3);
//        System.out.println(numerosA);
//        //System.out.println(numerosA.size());
//                numerosA.remove(x);
//        System.out.println("--");
//        System.out.println(numerosA);
//        
//        
//        System.out.println("---------------------------");
//    HashSet<Integer> numerosB = new HashSet();
//    numerosB.add(10);
//    numerosB.add(53);
//    numerosB.add(1);
//    numerosB.add(1);
//    numerosB.add(100);
//        System.out.println(numerosB);
//        numerosB.remove(53);
//        System.out.println("--");
//        System.out.println(numerosB);
//        
//        
//        
//          System.out.println("---------------------------");
//        HashMap<Integer,String> alumnos = new HashMap();
//     alumnos.put(202122,"Pepe");
//     alumnos.put(201099,"Ramon");
//     alumnos.put(201099,"Ramon");
//     alumnos.put(105445,"Maria");
//     System.out.println(alumnos);
//     for (HashMap.Entry<Integer, String> entry : alumnos.entrySet() ) {
//         System.out.println("Documento: " + entry.getKey()
//         + ", nombre: "+ entry.getValue());   
//        }
//     System.out.println("--");
//     
//        
//        alumnos.remove(201099);
//        System.out.println("--");
//        System.out.println(alumnos);
//        
     
     
          
     
     
//    
//    LinkedList<Integer> numerosB = new LinkedList();
//        
//    
//    
//        ArrayList<Integer> listado = new ArrayList();
//        TreeSet<String> variable = new TreeSet();
//        HashMap<Integer,String> personas = new HashMap<>();
//        
//        
//HashMap<Integer,String> personas = new HashMap<>();
//
//String n1 = "Albus";
//String n2 = "Severus";
//personas.put(111,n1);
//personas.put(222,n2);
//
//
    }
    
}

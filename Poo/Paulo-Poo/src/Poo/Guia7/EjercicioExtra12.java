
package Poo.Guia7;

/**
 *
 * Necesitamos mostrar un contador con 3 dÃ­gitos (X-X-X), que muestre los nÃºmeros del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
 * 
 * 
 * @author luisc
 */
public class EjercicioExtra12 {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        String aux;
        for (i = 0 ; i < 1000; i++ ){
            aux= Integer.toString(i);
            aux=aux.replaceAll("3","E");
            switch(aux.length()){
                case 1: System.out.println("0-0-"+aux);break;
                case 2: System.out.println("0-"+aux.charAt(0)+"-"+aux.charAt(1));break;
                case 3: System.out.println(aux.charAt(0)+"-"+aux.charAt(1)+"-"+aux.charAt(2));break;
                
            }
        }
        
    }
    
}

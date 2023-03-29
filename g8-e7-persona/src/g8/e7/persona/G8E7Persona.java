
//------------------------------------------

package g8.e7.persona;

import entidades.Persona;
import personaServicios.personaServicios;
import java.util.Scanner;

/**
 *
 * @author veronica
 */
public class G8E7Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//persona es mayor de edad.

//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
        
        Scanner leer = new Scanner(System.in);
        Persona[] ps = new Persona[4];
        personaServicios pSer =new personaServicios();
        
        int pesoBajo = 0;
        int pesoIdeal = 0;
        int sobrePeso = 0;
        int mayor = 0;
        int menor = 0;
        
        for (int i=0 ; i<4 ; i++){
            ps[i] = pSer.crearPersona();
            switch (pSer.calcularIMC(ps[i])){
                case -1:
                    pesoBajo++;
                    break;
                case 0:
                    pesoIdeal++;
                    break;
                case 1:
                    sobrePeso++;
                    break;
            }
            if (pSer.esMayorDeEdad(ps[i])){
                mayor++;
            }
            else{
                menor++;
            } 
        }
        
        System.out.println("El porcentaje de personas bajo su peso ideal es: "+pSer.porcentaje(pesoBajo)+"%");
        System.out.println("El porcentaje de personas con peso ideal es: "+pSer.porcentaje(pesoIdeal)+"%");
        System.out.println("El porcentaje de personas con sobrepeso es: "+pSer.porcentaje(sobrePeso)+"%");
        System.out.println("El porcentaje de personas mayores es: "+pSer.porcentaje(mayor)+"%");
        System.out.println("El porcentaje de personas menores es: "+pSer.porcentaje(menor)+"%");
                
    }
    
}





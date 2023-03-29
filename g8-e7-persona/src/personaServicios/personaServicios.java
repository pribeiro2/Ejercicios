


package personaServicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author veronica
 */
public class personaServicios {
    
    Scanner leer = new Scanner(System.in);
    Persona p = new Persona();
    
    
//Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
    
    public Persona crearPersona(){
 
//    private String nombre;
//    private int edad;
//    private char sexo;
//    private int peso;
//    private int altura;

        System.out.println("Ingrese el nombre:");
        p.setNombre(leer.next());
        System.out.println("Ingrese la edad:");
        p.setEdad(leer.nextInt());
        
        boolean s;
        do{
        System.out.println("Ingrese el sexo: [ H | M | O ]");
        p.setSexo(leer.next().toUpperCase());
        s = ( (p.getSexo().equals("H")) || (p.getSexo().equals("M")) || (p.getSexo().equals("O")) );
        }
        while (!s);
        
        System.out.println("Ingrese el peso en kilogramos:");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura en metros:");
        p.setAltura(leer.nextDouble());
        
        return p;
    }
    
//Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
//significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
//Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
//persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
    
    public int calcularIMC(Persona p){
        
        double imc = p.getPeso()/Math.pow(p.getAltura(),2);
        
        if (imc<20){
            return -1;
        }
        else if(imc>=20 && imc<=25){
            return 0;
        }
        else{
            return 1;
        }
    }
    
//Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
    
    public boolean esMayorDeEdad(Persona p){  
        return p.getEdad() >= 18;  
    }
    
    public double porcentaje(int a){
        return (a*100)/4;
    }
     
}

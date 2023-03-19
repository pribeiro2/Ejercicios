/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Guia8Ejercicio9.Entidades;

public class Matematica {

private double numero1;
private double numero2;
private double mayor;
private double menor;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2, double mayor, double menor) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.mayor = mayor;
        this.menor = menor;
        
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getMayor() {
        return mayor;
    }
    
    public double getMenor() {
        return menor;
    }

    public void setMayor(double mayor) {
        this.mayor = mayor;
    }

    public void setMenor(double menor) {
        this.menor = menor;
    }

   


    
}

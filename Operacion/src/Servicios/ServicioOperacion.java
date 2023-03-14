/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
/**
 *
 * @author Paulo
 */
public class ServicioOperacion {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        Operacion Op = new Operacion();
        System.out.println("Ingrese Numero1: ");
        Op.setNumero1(leer.nextInt());
        System.out.println("Ingrese Numero2: ");
        Op.setNumero2(leer.nextInt());
        return Op;
    }

    public int sumar(Operacion n) {
        return (n.getNumero1() + n.getNumero2());
    }

    public int resta(Operacion n) {
        return (n.getNumero1() - n.getNumero2());
    }

    public int multiplica(Operacion n) {
        int calculo = 1;

        if (n.getNumero1() == 0 || n.getNumero2() == 0) {
            System.out.println("Error estamos multimplcando por Cero");
            calculo = 0;
        } else {
            calculo = (n.getNumero1() * n.getNumero2());
        }

        return calculo;
    }

    public int dividir(Operacion n) {
        int calculo = 1;

        if (n.getNumero1() == 0 || n.getNumero2() == 0) {
            System.out.println("Error estamos multimplcando por Cero");
            calculo = 0;
        } else {
            calculo = (n.getNumero1() / n.getNumero2());
        }

        return calculo;
    }

    
}

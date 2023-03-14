/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package guia8ejercicio5.servicios;

import guia8ejercicio5.entidades.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {

    private Scanner leer = new Scanner(System.in);
    private Cuenta cuentaBancaria = new Cuenta();

    public void crearCuenta() {
        //Cuenta altaCuenta = new Cuenta(); (lo instanciamos en ServicioCuenta)
        cuentaBancaria.setSaldo(0);
        System.out.print("Ingrese Numero de cuenta: ");
        cuentaBancaria.setNumeroCuenta(leer.nextInt());
        System.out.println("");
        System.out.print("Ingrese DNI: ");
        cuentaBancaria.setDNI(leer.nextLong());
        System.out.println("");
        System.out.print("Ingrese Saldo inicial de la cuenta: ");
        cuentaBancaria.setSaldo(leer.nextDouble());
        System.out.println("");
    }

    public void deposito() {
        //  double saldoActual;
        System.out.print("Ingrese monto a ingresar en su cuenta: ");
        cuentaBancaria.setSaldo(leer.nextDouble() + cuentaBancaria.getSaldo());
    }

    public void retiro() {
        double importeRetiro;
        System.out.print("Ingrese monto a extraer en su cuenta: ");
        importeRetiro = leer.nextDouble();
        if (cuentaBancaria.getSaldo() >= importeRetiro) {
            cuentaBancaria.setSaldo(cuentaBancaria.getSaldo() - importeRetiro);
        } else {
            System.out.println("No tiene suficiente saldo para retirar");
        }
    }

    public void retiroRapida() {
        double importeRetiro;
        System.out.print("Ingrese monto rapido a extraer en su cuenta, Monto maximo a retirar " + (cuentaBancaria.getSaldo() * 0.20) + " Cuanto?: ");
        importeRetiro = leer.nextDouble();
        if ((cuentaBancaria.getSaldo() * 0.20) >= importeRetiro) {
            cuentaBancaria.setSaldo(cuentaBancaria.getSaldo() - importeRetiro);
        } else {
            System.out.println("Superaste el 20% de tu saldo, no esta permitido");
        }

    }

    public void consultaSaldo() {
        System.out.println("El saldo de tu cuenta es: " + cuentaBancaria.getSaldo());
    }

    public void consultaDatos() {
        System.out.println("Cuenta #: " + cuentaBancaria.getNumeroCuenta());
        System.out.println("DNI : " + cuentaBancaria.getDNI());
        System.out.println("Saldo : " + cuentaBancaria.getSaldo());
        System.out.println(cuentaBancaria.toString());
    }

    public boolean menu() {
        boolean band = true;
        int opcion;
        do {
            System.out.println("Menu Financiero");
            System.out.println("---------------");
            System.out.println("1- Crear Cuenta");
            System.out.println("2- Ingresar Saldo");
            System.out.println("3- Retirar Fondos");
            System.out.println("4- Extraccion Rapida");
            System.out.println("5- Consultar Saldo");
            System.out.println("6- Consultar Datos");
            System.out.println("7- Salir");
            System.out.println("----------------");
            System.out.print("Opcion? ");
            opcion = leer.nextInt();
        } while (opcion < 1 || opcion > 7);
        if (opcion < 1 || opcion > 7) {
            System.out.println("Opcion erronea ingres valor valido");
        }

        switch (opcion) {
            case 1:
                crearCuenta();
                break;
            case 2:
                deposito();
                break;
            case 3:
                retiro();
                break;
            case 4:
                retiroRapida();
                break;
            case 5:
                consultaSaldo();
                break;
            case 6:
                consultaDatos();
                break;
            case 7:
                band = false;
        }

        //System.out.println("Saliendo....");
        // sCuenta.ingresaDinero(xCuenta);

        return band;
    }
}

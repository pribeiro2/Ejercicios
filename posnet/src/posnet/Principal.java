
package posnet;
public class Principal {
    public static void main(String[] args) {

     Posnet posnet = new Posnet();
     Persona p = new Persona("20213444","Pepe","Gomez","1535464663","pepe@gmail.com" );
     TarjetaDeCredito t = new TarjetaDeCredito("BBVA","45546646455",15000,EntidadFinanciera.BIRZA,p);
     
        System.out.print("Tarjeta antes del pago: ");
        System.out.println(t);
        System.out.println("");
     
        System.out.print("Ticket tras pagar... ");
        Ticket ticketGenerado = posnet.efectuarPago(t, 200, 1);
        System.out.println(ticketGenerado);
        System.out.println("");
        
        System.out.print("Tarjeta despues del pago: ");
        System.out.println(t);
        System.out.println("");
     
        
    }
    
}

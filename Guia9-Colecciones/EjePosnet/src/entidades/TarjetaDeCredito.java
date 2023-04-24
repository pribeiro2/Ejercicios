package entidades;
public class TarjetaDeCredito {

private String entidadBancaria;
private String numero;
private double saldo;
private EntidadFinanciera entidadFinancira;
private Persona titular;

    public TarjetaDeCredito() {
    }

    public TarjetaDeCredito(String entidadBancaria, String numero, double saldo, EntidadFinanciera entidadFinancira, Persona titular) {
        this.entidadBancaria = entidadBancaria;
        this.numero = numero;
        this.saldo = saldo;
        this.entidadFinancira = entidadFinancira;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", numero=" + numero + ", saldo=" + saldo + ", entidadFinancira=" + entidadFinancira + ", titular=" + titular + '}';
    }

   
    public boolean tieneSaldoDisponible (double monto) {
        return saldo >= monto;
    }
    
    public void descontar(double monto) {
        saldo -= monto;
    }
    
    public String nombreCompletoDelTitular() {
        
        return titular.nombreCompleto(); 
    }
    
}

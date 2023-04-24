/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
Métodos getters y setters para el número de DNI y la letra.
 */
package g8e4.entidades;

public class NIF {

private long DNI; 
private String Letra;

    public NIF() {
    }

    public NIF(long DNI, String Letra) {
        this.DNI = DNI;
        this.Letra = Letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    
}

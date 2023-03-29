package entidades;

public class ahorcado {

private String[][] palabraABuscar ;
private int cantidadEncontradas=0;
private int jugadasMaximas;

    public ahorcado() {
    }

    public ahorcado(String[][] palabraABuscar, int jugadasMaximas) {
        this.palabraABuscar = palabraABuscar;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[][] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[][] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getCantidadEncontradas() {
        return cantidadEncontradas;
    }

    public void setCantidadEncontradas(int cantidadEncontradas) {
        this.cantidadEncontradas = cantidadEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
  


}

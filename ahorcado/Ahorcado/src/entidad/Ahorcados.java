/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Riky
 */
public class Ahorcados {
    
    private String[][] palabra;
    private int letrasEncontradas=0;
    private int jugadasMaximas;
    

    public Ahorcados() {
    }

    public Ahorcados(String[][] palabra, int jugadasMaximas) {
        this.palabra = palabra;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[][] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[][] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
    
    
    
    
    
    
    
    
}

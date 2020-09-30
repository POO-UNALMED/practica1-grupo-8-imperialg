package gestorAplicacion.producto;

import java.util.ArrayList;

public class Juego extends Producto {
    private int pegi;
    private String plataforma;
    private String genero;
    private static ArrayList<Juego> lista = new ArrayList<Juego>();

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Juego(String nombre, boolean uso, int pegi, String plataforma, String genero) {
        super(nombre, uso);
        this.pegi = pegi;
        this.plataforma = plataforma;
        this.genero = genero;
        lista.add(this);
    }
}

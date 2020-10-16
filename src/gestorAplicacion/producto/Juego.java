package gestorAplicacion.producto;

public class Juego extends Producto {
    private int pegi;
    private String plataforma;
    private String genero;


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

    public Juego(String nombre, boolean uso, int unidades, float precio, int pegi, String plataforma, String genero) {
        super(nombre, uso, unidades, precio);
        this.pegi = pegi;
        this.plataforma = plataforma;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return getNombre() + " " ;
    }
}

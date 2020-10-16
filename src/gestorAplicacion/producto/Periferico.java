package gestorAplicacion.producto;

public class Periferico extends Producto {
    private String plataforma;
    private int unidadesMalas;
    private int unidadesBuenas;


    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Periferico(String nombre, boolean uso, int unidades, float precio, boolean estado, String plataforma) {
        super(nombre, uso, unidades, precio);
        if (estado) {
            this.unidadesMalas = unidades;
        } else if (!estado) {
            this.unidadesBuenas = unidades;
        }
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return getNombre() + " " + plataforma + " " +  unidadesBuenas;
    }
}


package gestorAplicacion.producto;

public class Periferico extends Producto {
    private String plataforma;


    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Periferico(String nombre, boolean uso, float precio, String plataforma) {
        super(nombre, uso, precio);
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return getNombre() + " " + plataforma + getPrecio();
    }
}


package gestorAplicacion.producto;
import java.util.ArrayList;

public class Consola extends Producto {
    private String color;
    private boolean estado;
    private String version;
    private int almacenamiento;
    private static ArrayList<Consola> lista = new ArrayList<Consola>();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public Consola(String nombre, boolean uso, String color, boolean estado, String version, int almacenamiento) {
        super(nombre, uso);
        this.color = color;
        this.estado = estado;
        this.version = version;
        this.almacenamiento = almacenamiento;
        lista.add(this);
    }
}

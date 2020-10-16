package gestorAplicacion.producto;
import java.io.Serializable;

public abstract class Producto implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id = 1;
    protected String nombre;
    private int unidadesVendidas;
    private int unidadesNuevas;
    private int unidadesUsadas;
    private float precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidadesNuevas() {
        return unidadesNuevas;
    }

    public int getUnidadesUsadas() {
        return unidadesUsadas;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public abstract String toString();

    public Producto(String nombre, boolean uso, int unidades, float precio) {
        this.nombre = nombre;
        this.precio = precio;
        if (uso) {
            this.unidadesUsadas = unidades;
        } else if (!uso) {
            this.unidadesNuevas = unidades;
        }
    }
}

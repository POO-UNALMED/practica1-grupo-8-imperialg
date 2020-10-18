package gestorAplicacion.producto;
import java.io.Serializable;

public abstract class Producto implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id = 1;
    protected String nombre;
    private float precio;
    private Boolean uso;

    public float getPrecio() {
        return precio;
    }

    public Boolean getUso() {
        return uso;
    }

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


    public abstract String toString();

    public Producto(String nombre, boolean uso, float precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.uso = uso;
    }
}

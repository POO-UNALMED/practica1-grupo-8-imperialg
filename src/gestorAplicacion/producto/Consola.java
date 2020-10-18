package gestorAplicacion.producto;

public class Consola extends Producto {
    private String color;
    private String version;
    private int almacenamiento;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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


    public Consola(String nombre, boolean uso, float precio, String color, String version, int almacenamiento) {
        super(nombre, uso, precio);
        this.color = color;
        this.version = version;
        this.almacenamiento = almacenamiento;
    }
    @Override
    public String toString() {
        return "Consola: " + getNombre() + " " + almacenamiento + " " + getVersion() + getPrecio();
    }
}




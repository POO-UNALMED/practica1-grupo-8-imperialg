package gestorAplicacion.producto;

public class Consola extends Producto {
    private String color;
    private String version;
    private int almacenamiento;
    private int unidadesBuenas;
    private int unidadesMalas;

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

    public Consola(String nombre, boolean uso, int unidades, float precio, String color, boolean estado, String version, int almacenamiento) {
        super(nombre, uso, unidades, precio);
        this.color = color;
        this.version = version;
        this.almacenamiento = almacenamiento;
        if (estado) {
            this.unidadesMalas = unidades;
        } else if (!estado) {
            this.unidadesBuenas = unidades;
        }
    }

    @Override
    public String toString() {
        return "Consola: " + getNombre() + almacenamiento;
    }
}

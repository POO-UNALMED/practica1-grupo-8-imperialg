package gestorAplicacion.producto;

public class Producto {
    private int id = 1;
    private String nombre;
    public static int stock;
    private boolean uso;

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

    public static int getStock() {
        return stock;
    }

    public static void setStock(int stock) {
        Producto.stock = stock;
    }

    public boolean isUso() {
        return uso;
    }

    public void setUso(boolean uso) {
        this.uso = uso;
    }

    public Producto(String nombre, boolean uso) {
        this.nombre = nombre;
        this.uso = uso;
    }
}

package gestorAplicacion.transacciones;

import gestorAplicacion.producto.Producto;

public class Detalle {
    private int idDetalle;
    public Producto producto;
    private float precio;
    private String tiposervicio;


    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    public Detalle(Producto producto, float precio, String tiposervicio) {
        this.producto = producto;
        this.precio = precio;
        this.tiposervicio = tiposervicio;
    }

    @Override
    public String toString() {
        return "    " + idDetalle + " " + tiposervicio + " " + producto + " " + precio;
    }
}
package gestorAplicacion.transacciones;

import gestorAplicacion.producto.Producto;

public class Detalle {
    private static int idDetalle;
    private Factura factura;
    public Producto producto;
    private int cantidad;
    private float precio;
    private String tiposervicio;
    private int ganancia;

    

    public static int getId() {
        return idDetalle;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

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

    public Detalle(Factura factura, Producto producto, int cantidad, float precio, String tiposervicio) {
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tiposervicio = tiposervicio;
    }

    @Override
    public String toString() {
        return "    " + idDetalle + " " + tiposervicio + " " + producto + " " + cantidad + " " + precio;
    }
}
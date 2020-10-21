/*1). En las fuentes se incluir√° la siguiente documentaci√≥n:
        ÔÇß Cabecera del archivo: funcionalidad del m√≥dulo, autores, componentes del m√≥dulo, etc.
        ÔÇß Cabeceras en las clases, explicando su finalidad y describiendo las estructuras de datos definidas cuando
        sean relevantes.
        ÔÇß Cabeceras en los m√©todos, comentando su prop√≥sito y describiendo los par√°metros de entrada/salida.
        ÔÇß Comentarios en l√≠neas de c√≥digo de relevante inter√©s o importancia.
        ÔÇß Otros aspectos de inter√©s a tener en cuenta por el profesor.*/

// Autores:   - Santiago Franco Valencia 
//            - Anderson Elian Gutierrez 
//            - Santiago Valencia MejÌa 
//            - Daniel Alejandro Giraldo

// En este mÛdulo se crea la clase Detalle, asi como sus mÈtodos b·sicos (Get y Set), adem·s se definen un conjunto de atributos
// para su funcionamiento. Esta clase se ver· implementada en cada una de las lineas que componen una Factura, pues una Factura         
// est· compuesta por uno o m·s detalles

package gestorAplicacion.transacciones;
import gestorAplicacion.producto.Producto;

public class Detalle {
    private int idDetalle;
    public Producto producto;
    private float precio;
    private String tiposervicio;
    
    // Se crean los mÈtodos Get y Set de los atributos de la Clase Detalle 
    
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
    
    // Se crea el constructor de la clase Detalle, el cual recibe como parametros los atributos de esta clase
    public Detalle(Producto producto, float precio, String tiposervicio) {
        this.producto = producto;
        this.precio = precio;
        this.tiposervicio = tiposervicio;
    }

    @Override
    // Se crea el toString de la clase Detalle, el cual mostrar· por pantalla el tipo de servicio al cual est· asosicado el 
    // detalle (compra, venta, reparacion, cambio de almacenamiento de una consola, cambio de color de un procuto, etc ),
    // el nombre del producto involucrado en el detalle y el precio del detalle, el cual depende del tipo de servicio realizado.
    
    public String toString() {
        return  " " + tiposervicio + " " + producto.getNombre() + " " + precio;
    }
}
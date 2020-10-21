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

// En este mÛdulo se crea la clase Factura, en la cual se ver·n reflejados todos los detalles que la componen, por esta razÛn,
// en esta clase se implementÛ una lista llamada "detalles" en la que se encuentran los detalles asociados a la factura. Adem·s 
// se crearon los mÈtodos b·sicos (Get y Set) 

package gestorAplicacion.transacciones;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Factura {
    private static final long serialVersionUID = 1L;
    private int idFactura;
    private LocalDate fecha = LocalDate.now(); // devuelve la fecha en la que se genera una factura
    private Cliente cliente;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // formato de fecha dado en dÌa/mes/aÒo
    private ArrayList<Detalle> detalles = new ArrayList<Detalle>();

    public String getFecha() {
        return fecha.format(formato);
    }
    
    // Se crean los mÈtodos Get y Set de los atributos de la Clase Factura  
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Detalle> getDetalles() {
        return detalles;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public Factura(Cliente cliente) {
        this.cliente = cliente;
    }

    // Se crea el constructor de la clase Factura con los parametros de Cliente y detalles (lista con todos los detalles que
    // componen la factura)
    public Factura(Cliente cliente, ArrayList<Detalle> detalles) {
        this.cliente = cliente;
        this.detalles = detalles;
    }

    @Override
    //  Se crea el toString de la clase Factura, el cual mostrar· por pantalla el Id asociado a la factura, la fecha en que se 
    // generÛ la fatura, el nombre del cliente al cual se le generÛ la factura, los detalles que componen a la factura y el valor
    // total de la factura. 
    public String toString(){
        String detas = "";
        float total = 0;
        for (Detalle detalle: detalles){ // el for se implementa para recorrer la lista de detalles, para despues mostrarlos. 
            detas += detalle.toString() + "\n";
            total += detalle.getPrecio();
        }
        return idFactura + "   " + fecha + "     "  + cliente.getNombre() + "\n" + detas + "total: " + total; 
        }
}
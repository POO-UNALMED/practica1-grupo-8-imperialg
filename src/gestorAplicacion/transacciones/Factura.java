/*1). En las fuentes se incluirá la siguiente documentación:
         Cabecera del archivo: funcionalidad del módulo, autores, componentes del módulo, etc.
         Cabeceras en las clases, explicando su finalidad y describiendo las estructuras de datos definidas cuando
        sean relevantes.
         Cabeceras en los métodos, comentando su propósito y describiendo los parámetros de entrada/salida.
         Comentarios en líneas de código de relevante interés o importancia.
         Otros aspectos de interés a tener en cuenta por el profesor.*/

// Autores:   - Santiago Franco Valencia 
//            - Anderson Elian Gutierrez 
//            - Santiago Valencia Mej�a 
//            - Daniel Alejandro Giraldo

// En este m�dulo se crea la clase Factura, en la cual se ver�n reflejados todos los detalles que la componen, por esta raz�n,
// en esta clase se implement� una lista llamada "detalles" en la que se encuentran los detalles asociados a la factura. Adem�s 
// se crearon los m�todos b�sicos (Get y Set) 

package gestorAplicacion.transacciones;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Factura {
    private static final long serialVersionUID = 1L;
    private int idFactura;
    private LocalDate fecha = LocalDate.now(); // devuelve la fecha en la que se genera una factura
    private Cliente cliente;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // formato de fecha dado en d�a/mes/a�o
    private ArrayList<Detalle> detalles = new ArrayList<Detalle>();

    public String getFecha() {
        return fecha.format(formato);
    }
    
    // Se crean los m�todos Get y Set de los atributos de la Clase Factura  
    
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
    //  Se crea el toString de la clase Factura, el cual mostrar� por pantalla el Id asociado a la factura, la fecha en que se 
    // gener� la fatura, el nombre del cliente al cual se le gener� la factura, los detalles que componen a la factura y el valor
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
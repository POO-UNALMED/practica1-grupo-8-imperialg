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

// En este mÛdulo se crea la clase Cliente, asÌ como sus mÈtodos b·sicos (Get y Set), adem·s se definen un conjunto de atributos,
// los cuales almacenar·n informaciÛn acerca de cada Cliente que se vaya registrando en la plataforma.

package gestorAplicacion.transacciones;
import java.util.ArrayList;
import java.io.Serializable;

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int cc;
    private long celular;
    private String email;
    private int puntos = 0;

    public Cliente() {

    }
    
 // Se crean los mÈtodos Get y Set de los atributos de la Clase Cliente
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    // Se crea el constructor de la clase Cliente, con sus atributos como par·metros.
    public Cliente(String nombre, int cc, long celular, String email) {
        this.nombre = nombre;
        this.cc = cc;
        this.celular = celular;
        this.email = email;
    }
    
    // Se crea el toString de la clase Cliente, el cual retorna el nombre del cliente, su cÈdula
    // y la cantidad de puntos que posee en la tienda.
    public String toString(){
        return nombre + "    " + cc + "     " + puntos;
    }
}

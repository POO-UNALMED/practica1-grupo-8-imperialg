/*1). En las fuentes se incluirá la siguiente documentación:
//Se crea la clase periférico y sus respectivos métodos, haciendo parte del paquete producto.
         Cabeceras en las clases, explicando su finalidad y describiendo las estructuras de datos definidas cuando
        sean relevantes.
         Cabeceras en los métodos, comentando su propósito y describiendo los parámetros de entrada/salida.
         Comentarios en líneas de código de relevante interés o importancia.
         Otros aspectos de interés a tener en cuenta por el profesor.*/
package gestorAplicacion.producto;
// La clase contiene aquelos atributos que modelan los periféricos, es decir la plataforma en la que funcionan y su estado.
public class Periferico extends Producto {
    private String plataforma;
    private boolean estado;


    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    public boolean getEstado() {
    	return estado;
    }
    
    public void setEstado(boolean estado) {
    	this.estado=estado;
    }

    public Periferico(String nombre, boolean uso, float precio, String plataforma) {
        super(nombre, uso, precio);
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return getNombre() + " " + plataforma + getPrecio();
    }
    public void repararPeriferico(Periferico periferico){
    	if (periferico.getEstado()==false){
    		System.out.println("La Consola ya se encuentra reparada");
    	}else {
    		periferico.setEstado(false);
    		System.out.println("Se ha reparado la consola");
    	}
    }
}


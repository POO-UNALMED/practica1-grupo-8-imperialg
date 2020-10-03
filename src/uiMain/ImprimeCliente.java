package uiMain;
import BaseDatos.DatosTranssacciones;
import gestorAplicacion.transacciones.*;
import java.util.*;
public class ImprimeCliente {
	Scanner entrada = new Scanner(System.in);
    public static void clientesRegistrados(){
        int indiceCliente = 1;
        for (Cliente cliente: DatosTranssacciones.getListaClientes()){
            System.out.println(indiceCliente + ":"+ cliente.getNombre() + "       " + cliente.getCc());
        }//si selecciona un cliente se selecciona de la lista de clientes el cliente i-1.
        //si el cliente no esta registrado, se crea un nuevo objeto de la clase cliente y se anade a la lista.
    }
    public void iniciarTransaccion(){
        boolean registrado = false;
        registrado = entrada.nextBoolean();
        System.out.println("¿El cliente se encuentra registrado: Indique t0rue sí lo está y false para registrarlo");
        if (registrado==true){
            ImprimeCliente.clientesRegistrados();
            int clienteselecto = 0;  //numero escaneado -1
            new Factura(DatosTranssacciones.getListaClientes().get(clienteselecto));
        }else{


        }
    }
}

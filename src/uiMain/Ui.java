package uiMain;
import gestorAplicacion.transacciones.*;
import BaseDatos.*;
import java.util.Scanner;

public class Ui {
	public static void main(String[] Args) {
		DatosTranssacciones.leerDatos();
		DatosTranssacciones.guardarDatos();
	}
	Scanner entrada = new Scanner(System.in);
	public void ingresarConsola(){
		System.out.println("Ingrese nombre de consola: ");
		String nombre = entrada.next();
		System.out.println("Ingrese uso(true or false): ");
		Boolean uso = entrada.nextBoolean();
		System.out.println("Ingrese color: ");
		String color = entrada.next();
		System.out.println("Ingrese estado(true or false): ");
		Boolean estado = entrada.nextBoolean();
		System.out.println("Ingrese nombre de la version: ");
		String version = entrada.next();
		System.out.println("Ingrese cantidad almacenamiento: ");
		int almacenamiento = entrada.nextInt();
		Consola consola = new Consola(nombre,uso,color,estado,version,almacenamiento);
		DatosProductos.agregarConsola(consola);
	}
	public void ingresarJuego(){
		System.out.println("Ingrese nombre del juego: ");
		String nombre = entrada.next();
		System.out.println("Ingrese uso(true or false): ");
		Boolean uso = entrada.nextBoolean();
		System.out.println("Ingrese pegi: ");
		int pegi = entrada.nextInt();
		System.out.println("Ingrese nombre plataforma: ");
		String plataforma = entrada.next();
		System.out.println("Ingrese genero: ");
		String genero = entrada.next();
		Juego juego= new Juego(nombre,uso,pegi,plataforma,genero);
		DatosProductos.agregarJuego(juego);
	}
	public void ingresarPeriferico(){
		System.out.println("Ingrese nombre de periferico: ");
		String nombre = entrada.next();
		System.out.println("Ingrese uso(true or false): ");
		Boolean uso = entrada.nextBoolean();
		System.out.println("Ingrese estado(true or false): ");
		Boolean estado = entrada.nextBoolean();
		System.out.println("Ingrese nombre plataforma: ");
		String plataforma = entrada.next();
		Periferico periferico = new Periferico (nombre,uso,estado,plataforma);
		DatosProductos.agregarPeriferico(periferico);
	}
	
	public void ingresarCliente() {
		System.out.println("Ingrese nombre de Cliente: ");
		String nombre = entrada.next();
		System.out.println("Ingrese cedula: ");
		int cc = entrada.nextInt();
		System.out.println("Ingrese celular: ");
		long celular = entrada.nextLong();
		System.out.println("Ingrese email: ");
		String email = entrada.next();
		Cliente cliente = new Cliente(nombre,cc,celular,email);
		DatosTranssacciones.agregarCliente(cliente);
	}

	public static void clientesRegistrados(){
		int indiceCliente = 1;
		for (Cliente cliente: DatosTranssacciones.getListaClientes()){
			System.out.println(indiceCliente + ":"+ cliente.getNombre() + "       " + cliente.getCc());
		}// si selecciona un cliente se selecciona de la lista de clientes el cliente i-1.
		// si el cliente no esta registrado, se crea un nuevo objeto de la clase cliente y se a�ade a la lista.
	}
	public void iniciarTransaccion(){
		boolean registrado = false;
		registrado = entrada.nextBoolean();
		System.out.println("¿El cliente se encuentra registrado: Indique true sí lo está y false para registrarlo");
		if (registrado){
			ImprimeCliente.clientesRegistrados();
			int clienteselecto = 0;  //número escaneado -1
			Factura factura = new Factura(DatosTranssacciones.getListaClientes().get(clienteselecto));
		}else if(!registrado){
			Factura factura = new Factura(DatosTranssacciones.getListaClientes().get(DatosTranssacciones.getListaClientes().size()-1));
		}
	}
}

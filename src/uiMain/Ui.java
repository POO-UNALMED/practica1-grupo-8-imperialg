package uiMain;

import BaseDatos.Datos;
import gestorAplicacion.transacciones.*;
import gestorAplicacion.producto.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Ui {
	public static void main(String[] Args) {
		Datos datos = new Datos();
		Ui uimain = new Ui();
		datos.leerDatos();
		datos.leerDatos1();
		uimain.clientesRegistrados(datos);
		uimain.menu(datos);
		datos.guardarDatos();
		datos.guardarDatos1();
	}

	Scanner entrada = new Scanner(System.in);

	public void menu(Datos datos){
		System.out.println("Ingrese una opción");
		System.out.println("1. Ingresar Clientes o Productos");
		System.out.println("2. Vender Productos");
		int i = entrada.nextInt();
		switch (i){
			case 1:
				this.menuAgregar(datos);
				break;
			case 2:
				this.menuVender(datos);
				break;
		}
	}

	public void menuAgregar(Datos datos){
		System.out.println("Ingrese una opcion");
		System.out.println("0. Volver");
		System.out.println("1. Ingresar Cliente");
		System.out.println("2. Ingresar Consola/s");
		System.out.println("3. Ingresar Juego/s");
		System.out.println("4. Ingresar Periferico/s");
		int i = entrada.nextInt();
		switch (i){
			case 1:
				datos.ingresarCliente();
				break;
			case 2:
				datos.ingresarConsola();
				break;
			case 3:
				datos.ingresarJuego();
				break;
			case 4:
				datos.ingresarPeriferico();
				break;

		}
	}
	public void menuVender(Datos datos){
		System.out.println("¿El cliente ya está registrado?");
		Boolean verificador = entrada.nextBoolean();
		Cliente cliente = clienteNoRegistrado(datos);
		System.out.println("¿Qué artículo desea vender?: Ingrese una opcion");
		System.out.println("0. Volver");
		System.out.println("1. Consola/s");
		System.out.println("2. Juego/s");
		System.out.println("3. Periferico/s");
		int i =entrada.nextInt();
		System.out.println("Seleccione su producto:");
		System.out.println("0. Volver");
		switch (i){
			case 1: {
				consolasRegistradas(datos);
				System.out.println("¿Cuántas consolas desea vender?: ");
				int tope = entrada.nextInt();
				System.out.println("Seleccione qué consola/s desea vender: (Ejemplo: [1, 2, 3])");
				int[] ints = this.seleccionProductos(tope);
				ArrayList<Producto> productos = datos.consolaPorIndice(ints);
				break;
			}
			case 2: {
				juegosRegistrados(datos);
				System.out.println("¿Cuantos juegos desea vender?: ");
				int tope = entrada.nextInt();
				System.out.println("Seleccione qué Juego/s desea vender: (Ejemplo: [1, 2, 3])");
				int[] ints = this.seleccionProductos(tope);
				ArrayList<Producto> productos = datos.juegoPorIndice(ints);
				break;
			}
			case 3: {
				perifericosRegistrados(datos);
				System.out.println("¿Cuántos perifericos desea vender?:");
				int tope = entrada.nextInt();
				System.out.println("Seleccione qué periferico/s desea vender: (Ejemplo: [1, 2, 3])");
				int[] ints = this.seleccionProductos(tope);
				ArrayList<Producto> productos = datos.perifericoPorIndice(ints);
				ArrayList<Detalle> listaDetalles = new ArrayList<Detalle>();
				for (Producto producto: productos){
					Detalle detalle = new Detalle(producto, producto.getPrecio(), "Venta");
				}
				Factura factura = new Factura(cliente, listaDetalles);
				datos.agregarFactura(factura);
				break;

			}
		}
			}
	// Mostrar en pantalla los clientes registrados:
	public void clientesRegistrados(Datos datos) {
		int indiceCliente = 1;
		for (Cliente cliente : datos.getListaClientes()) {
			System.out.println(indiceCliente + " " + cliente.toString());
			indiceCliente ++;
		}
	}
	// Mostrar en pantalla las consolas registradas:
	public void consolasRegistradas(Datos datos) {
		int indiceConsola = 1;
		for (Consola consola : datos.getListaConsolas()) {
			System.out.println(indiceConsola + " " + consola.toString());
			indiceConsola ++;
		}
	}
	// Mostrar en pantalla los juegos registrados:

	public void juegosRegistrados(Datos datos) {
		int indiceJuego = 1;
		for (Juego juego : datos.getListaJuegos()) {
			System.out.println(indiceJuego + " " + juego.toString());
			indiceJuego ++;
		}
	}
	// Mostrar en pantalla los perifericos registrados:

	public void perifericosRegistrados(Datos datos) {
		int indicePeriferico = 1;
		for (Periferico periferico : datos.getListaPerifericos()) {
			System.out.println(indicePeriferico + " " + periferico.toString());
			indicePeriferico ++;
		}
	}
	// Mostrar en pantalla las facturas registradas:

	public void facturasRegistradas(Datos datos) {
		for (Factura factura : datos.getListaFacturas()) {
			System.out.println(factura.toString());
		}
	}
	public int[] seleccionProductos(int tope){
		int[] ints = new int[tope];
		for(int i=0; i<tope; i++)
			ints[i] = entrada.nextInt();
		return ints;
	}

	public Cliente clienteRegistrado(Datos datos){
		this.clientesRegistrados(datos);
		int i = entrada.nextInt();
		return datos.seleccionarCliente(i-1);
	}

	public Cliente clienteNoRegistrado(Datos datos){
		datos.ingresarCliente();
		return this.clienteRegistrado(datos);
	}
}

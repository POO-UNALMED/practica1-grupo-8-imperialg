/*1). En las fuentes se incluirá la siguiente documentación:
		 Cabecera del archivo: funcionalidad del módulo, autores, componentes del módulo, etc.
		 Cabeceras en las clases, explicando su finalidad y describiendo las estructuras de datos definidas cuando
		sean relevantes.
		 Cabeceras en los métodos, comentando su propósito y describiendo los parámetros de entrada/salida.
		 Comentarios en líneas de código de relevante interés o importancia.
		 Otros aspectos de interés a tener en cuenta por el profesor.*/
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
		uimain.menuprincipal(datos);
		datos.guardarDatos();
		datos.guardarDatos1();
	}
	

	Scanner entrada = new Scanner(System.in);
	
	public void menuprincipal(Datos datos) {
		System.out.println("**BIENVENIDO A IMPERIALGAMING, LA MEJOR TIENDA VIRTUAL**"+"\n");
		this.menu(datos);
	}
	
	public void menu(Datos datos){
		for (int i = 0; i < 30 ; i++) {
			datos.ingresarCliente();
			datos.ingresarConsola();
			datos.ingresarJuego();
			datos.ingresarPeriferico();
		}
		System.out.println("Ingrese una opción");
		System.out.println("1. Ingresar Clientes o Productos");
		System.out.println("2. Vender Productos");
		System.out.println("3. Generar un servicio");
		System.out.println("4. Imperial");
		int i = entrada.nextInt();
		switch (i){
			case 1:
				this.menuAgregar(datos);
				break;
			case 2:
				this.menuVender(datos);
				break;
			case 3:
				this.menuServicios(datos);
				break;
			case 4:
				this.menuImperial(datos);
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
			case 0:
				this.menu(datos);
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
		System.out.println("¿El cliente ya está registrado?"+"\n");
		System.out.println("Presione 0 para volver");
		System.out.println("Sí el cliente está registrado ingrese 1");
		System.out.println("Sí el cliente no está registrado ingrese 2");
		int verificador = entrada.nextInt();
		Cliente cliente = new Cliente();
		if (verificador == 0){
			this.menu(datos);
		} else if(verificador == 1){
			cliente = this.clienteRegistrado(datos);
		} else if (verificador == 2) {
			cliente = this.clienteNoRegistrado(datos);
		}
		System.out.println("¿Qué artículo desea vender?: Ingrese una opcion");
		System.out.println("0. Volver");
		System.out.println("1. Consola/s");
		System.out.println("2. Juego/s");
		System.out.println("3. Periferico/s");
		int i =entrada.nextInt();
		System.out.println("Seleccione su producto:");
		switch (i){
			case 0:
				this.menuVender(datos);
			case 1: {
				consolasRegistradas(datos);
				System.out.println("¿Cuántas consolas desea vender?: ");
				int tope = entrada.nextInt();
				this.consolasRegistradas(datos);
				System.out.println("Seleccione qué consola/s desea vender: (Ejemplo: [1, 2, 3])");
				int[] ints = this.seleccionProductos(tope);
				ArrayList<Producto> productos = datos.consolaPorIndice(ints);
				for (Producto pro: productos){
					System.out.println(pro);
				}
				datos.generarFacturaVenta(productos, cliente);
				break;
			}
			case 2: {
				juegosRegistrados(datos);
				System.out.println("¿Cuantos juegos desea vender?: ");
				int tope = entrada.nextInt();
				this.juegosRegistrados(datos);
				System.out.println("Seleccione qué Juego/s desea vender: (Ejemplo: [1, 2, 3])");
				int[] ints = this.seleccionProductos(tope);
				ArrayList<Producto> productos = datos.juegoPorIndice(ints);
				datos.generarFacturaVenta(productos, cliente);
				break;
			}
			case 3: {
				perifericosRegistrados(datos);
				System.out.println("¿Cuántos perifericos desea vender?:");
				int tope = entrada.nextInt();
				this.perifericosRegistrados(datos);
				System.out.println("Seleccione qué periferico/s desea vender: (Ejemplo: [1, 2, 3])");
				int[] ints = this.seleccionProductos(tope);
				ArrayList<Producto> productos = datos.perifericoPorIndice(ints);
				datos.generarFacturaVenta(productos, cliente);
				break;

			}
		}
			}
	public void menuServicios(Datos datos){
		System.out.println("Ingrese una opción");
		System.out.println("0. Volver");
		System.out.println("1. Servicio técnico");
		System.out.println("2. Servicio comercial");
		
		int i = entrada.nextInt();
		switch(i) {
		case 0:
			this.menu(datos);
			break;
		case 1:
			this.menuServiciosTecnicos(datos);
			break;
		case 2:
			this.menuServiciosComerciales(datos);
			break;
	
		}
		
	}
	public void menuServiciosTecnicos(Datos datos){
		System.out.println("Ingrese una opción");
		System.out.println("0. Volver");
		System.out.println("1. Servicios técnicos para Consolas");
		System.out.println("2. Servicios técnicos para Perifericos");
		int i = entrada.nextInt();
		switch(i) {
		case 0:
			this.menuServicios(datos);
			break;
		case 1:
			this.menuConsolas(datos);
			break;
		case 2:
			this.menuPerifericos(datos);
			break;
		}
	}
	public void menuConsolas(Datos datos) {
		System.out.println("Ingrese una opción");
		System.out.println("0. Volver");
		System.out.println("1. Reparar");
		System.out.println("2. Cambiar almacenamiento");
		System.out.println("3. Cambiar color");		
		int i = entrada.nextInt();
		switch(i) {
		case 0:
			this.menuServiciosTecnicos(datos);
			break;
		case 1:
			System.out.println("Ir al método de Consola.repararConsola");
			break;
		case 2: {
			System.out.println("Ingresar el nuevo valor de Almacenamiento (Gb)");
			int nuevoAlmacenamiento = entrada.nextInt();
			//Consola.setAlmacenamiento(nuevoAlmacenamiento);
			break;
		}		
		case 3:{
			System.out.println("Ingresar el nuevo Color");
			String nuevoColor = entrada.next();	
			break;
		}
			
		}
	}
	
	public void menuPerifericos(Datos datos) {
		System.out.println("Ingrese una opción");
		System.out.println("0. Volver");
		System.out.println("1. Reparar");
		System.out.println("2. Cambiar color");
		int i = entrada.nextInt();
		switch(i) {
		case 0:
			this.menuServiciosTecnicos(datos);
			break;
		case 1:
			System.out.println("Ir al método de Periferico.repararPeriferico");
			break;
		case 2:
			System.out.println("Ingrese el nuevo color para periferico");
			String color = entrada.next();
			break;
		}		
	}
	
	public void menuServiciosComerciales(Datos datos){
		System.out.println("Ingrese una opción");
		System.out.println("0. Volver");
		System.out.println("1. Servicios comerciales para Consolas");
		System.out.println("2. Servicios comerciales para Perifericos");
		System.out.println("3. Servicios comerciales para Juegos");
		int i = entrada.nextInt();
		switch(i) {
		case 0:
			this.menuServicios(datos);
			break;
		case 1:
			this.servicioComercial(datos);
			break;
		case 2:
			this.servicioComercial(datos);
			break;
		case 3:
			this.servicioComercial(datos);	
			break;
		}
	}
	public void servicioComercial(Datos datos) {
		System.out.println("Ingrese una opción");
		System.out.println("0. Volver");
		System.out.println("1. Alquilar");
		System.out.println("2. Vender");
		System.out.println("3. Comprar");
		int i = entrada.nextInt();
		switch(i) {
		case 0:
			this.menuServiciosComerciales(datos);
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
		for(int i=0; i<tope; i++) {
			ints[i] = entrada.nextInt();
			System.out.println(ints[i]);
		}
		return ints;
	}

	public Cliente clienteRegistrado(Datos datos){
		this.clientesRegistrados(datos);
		int i = entrada.nextInt();
		return datos.seleccionarCliente(i-1);
	}

	public Cliente clienteNoRegistrado(Datos datos){
		datos.ingresarCliente();
		return datos.seleccionarUltimoCliente();
	}

	public void menuImperial(Datos datos){
		System.out.println("Ingrese una opción");
		System.out.println("0. Volver");
		System.out.println("1. Alquilar");
		System.out.println("2. Vender");
		System.out.println("3. Comprar");
		int i = entrada.nextInt();
	}
}

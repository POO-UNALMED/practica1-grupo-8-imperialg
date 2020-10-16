package uiMain;

import BaseDatos.Datos;
import gestorAplicacion.transacciones.Cliente;
import gestorAplicacion.producto.*;
import java.util.Scanner;

public class Ui {
	public static void main(String[] Args) {
		Datos datos = new Datos();
		datos.leerDatos();
		datos.leerDatos1();
		datos.guardarDatos();
		datos.guardarDatos1();
	}

	Scanner entrada = new Scanner(System.in);

	public void ingresarConsola(String nombre, boolean uso, String color, boolean estado, String version, int almacenamiento) {
		System.out.println("Ingrese nombre de consola: ");
		nombre = entrada.next();
		System.out.println("Ingrese uso(true or false): ");
		uso = entrada.nextBoolean();
		System.out.println("Ingrese color: ");
		color = entrada.next();
		System.out.println("Ingrese estado(true or false): ");
		estado = entrada.nextBoolean();
		System.out.println("Ingrese nombre de la version: ");
		version = entrada.next();
		System.out.println("Ingrese cantidad almacenamiento: ");
		almacenamiento = entrada.nextInt();
	}

	public void ingresarJuego(String nombre, boolean uso, int pegi, String plataforma, String genero) {
		System.out.println("Ingrese nombre del juego: ");
		nombre = entrada.next();
		System.out.println("Ingrese uso(true or false): ");
		uso = entrada.nextBoolean();
		System.out.println("Ingrese pegi: ");
		pegi = entrada.nextInt();
		System.out.println("Ingrese nombre plataforma: ");
		plataforma = entrada.next();
		System.out.println("Ingrese genero: ");
		genero = entrada.next();
	}

	public void ingresarPeriferico(String nombre, boolean uso, boolean estado, String plataforma) {
		System.out.println("Ingrese nombre de periferico: ");
		nombre = entrada.next();
		System.out.println("Ingrese uso(true or false): ");
		uso = entrada.nextBoolean();
		System.out.println("Ingrese estado(true or false): ");
		estado = entrada.nextBoolean();
		System.out.println("Ingrese nombre plataforma: ");
		plataforma = entrada.next();
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
		Cliente cliente = new Cliente(nombre, cc, celular, email);
	}

	public void clientesRegistrados(Datos datos) {
		int indiceCliente = 1;
		for (Cliente cliente : datos.getListaClientes()) {
			System.out.println(indiceCliente + cliente.toString());
		}
	}
}

package uiMain;
import java.util.*;
import gestorAplicacion.*;
import BaseDatos.*;

public class Ui {
	Scanner entrada = new Scanner(System.in);
	public void ingresarConsola(String nombre, boolean uso, String color, boolean estado, String version, int almacenamiento){
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
	public void ingresarJuego(String nombre, boolean uso, int pegi, String plataforma, String genero){
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
	public void ingresarPeriferico(String nombre, boolean uso, boolean estado, String plataforma){
		System.out.println("Ingrese nombre de periferico: ");
		nombre = entrada.next();
		System.out.println("Ingrese uso(true or false): ");
		uso = entrada.nextBoolean();
		System.out.println("Ingrese estado(true or false): ");
		estado = entrada.nextBoolean();
		System.out.println("Ingrese nombre plataforma: ");
		plataforma = entrada.next();
	}
	
	public void ingresarCliente(String nombre,int cc,long celular,String email) {
		System.out.println("Ingrese nombre de Cliente: ");
		nombre = entrada.next();
		System.out.println("Ingrese cedula: ");
		cc = entrada.nextInt();
		System.out.println("Ingrese celular: ");
		celular = entrada.nextLong();
		System.out.println("Ingrese email: ");
		email = entrada.next();
	}

	public static void main(String[] Args) {
		System.out.println("Hola");
	}
}

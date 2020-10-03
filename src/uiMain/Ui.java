package uiMain;
import java.util.*;
import gestorAplicacion.*;
import BaseDatos.*;

public class Ui {
	Scanner entrada = new Scanner(System.in);
	public void ingresarConsola(String nombre, boolean uso, String color, boolean estado, String version, int almacenamiento){
		nombre = entrada.next();
		uso = entrada.nextBoolean();
		color = entrada.next();
		estado = entrada.nextBoolean();
		version = entrada.next();
		almacenamiento = entrada.nextInt();
	}
	public void ingresarJuego(String nombre, boolean uso, int pegi, String plataforma, String genero){
		nombre = entrada.next();
		uso = entrada.nextBoolean();
		pegi = entrada.nextInt();
		plataforma = entrada.next();
		genero = entrada.next();
	}
	public void ingresarPeriferico(String nombre, boolean uso, boolean estado, String plataforma){
		nombre = entrada.next();
		uso = entrada.nextBoolean();
		estado = entrada.nextBoolean();
		plataforma = entrada.next();
	}
	
	public void ingresarCliente(String nombre,int cc,long celular,String email) {
		nombre = entrada.next();
		cc = entrada.nextInt();
		celular = entrada.nextLong();
		email = entrada.next();
	}

	public static void main(String[] Args) {
		System.out.println("Hola");
	}
}

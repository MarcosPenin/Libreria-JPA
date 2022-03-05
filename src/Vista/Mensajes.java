package Vista;

import java.util.Scanner;

public class Mensajes {

	static Scanner sc = new Scanner(System.in);

	public static void dniNoEncontrado() {
		System.out.println("No se ha encontrado ningún autor con ese DNI");
	}

	public static void codigoNoEncontrado() {
		System.out.println("No se ha encontrado ningún libro con ese código");

	}

	public static void sesionTerminada() {
		System.out.println("Sesión terminada. ¡Hasta la próxima!");

	}

	public static void libroNoEncontrado() {
		System.out.println("No se ha encontrado ningún libro con ese titulo");

	}

	public static void autorNoEncontrado() {
		System.out.println("No se ha encontrado ningún autor con ese nombre");

	}

	public static void sinLibros() {
		System.out.println("Aún no se ha registrado ningún libro");

	}

	public static void sinAutores() {
		System.out.println("Aún no se ha registrado ningún autor");
		
	}
	
	public static void separador() {
		System.out.println("************************************************************");
		
	}

}

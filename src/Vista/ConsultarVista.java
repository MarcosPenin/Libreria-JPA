package Vista;

import java.util.Scanner;

import POJO.Autor;
import POJO.Libro;
import utilidades.ControlData;

public class ConsultarVista {

	static Scanner sc = new Scanner(System.in);

	public static String pedirAutor() {
		System.out.println("Introduce el nombre del autor");
		String nombre = ControlData.lerString(sc);
		return nombre;

	}

	public static String pedirLibroNombre() {
		System.out.println("Introduce el título del libro");
		String titulo = ControlData.lerString(sc);
		return titulo;

	}

	public static int pedirLibroId() {
		System.out.println("Introduce el código del libro");
		int codigo = ControlData.lerInt(sc);
		return codigo;
	}

	public static void imprimirAutor(Autor autor) {
		System.out.println(autor);

	}

	public static void imprimirLibro(Libro libro) {
		System.out.println(libro.toString());
	}

	public static void imprimirLibros(Autor autor) {

		for (Libro x : autor.getLibros()) {
			System.out.println(x.toString());
		}

	}

}

package Vista;

import POJO.Autor;
import POJO.Libro;

public class ConsultarVista {

	public static String pedirAutor() {
		return "34342414P";

	}

	public static void imprimirAutor(Autor autor) {
		System.out.println(autor);

	}

	public static int pedirLibro() {
		return 1;
	}

	public static void imprimirLibro(Libro libro) {
		System.out.println(libro.toString());
	}

}

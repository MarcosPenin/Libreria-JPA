package Vista;

import POJO.Autor;
import POJO.Libro;

public class AnadirVista {

	public static Autor pedirAutor() {
		Autor autor = new Autor("77667766N", "xxxxxxxxx", "xxxxxxx");
		return autor;
	}

	public static Libro pedirLibro() {
		Libro libro = new Libro("yyyyyyyyyyyyyyyyyyyyy", 12);
		return libro;
	}

}

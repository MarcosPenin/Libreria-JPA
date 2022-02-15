package Vista;

import POJO.Autor;
import POJO.Libro;

public class BorrarVista {

	public static Autor pedirAutor() {
		Autor autor = new Autor("56565656L", "Dovtoyevski", "Rusia");
		return autor;
	}

	public static Libro pedirLibro() {
		Libro libro = new Libro("Crimen y Castigo", 12);
		return libro;
	}

	
	
}

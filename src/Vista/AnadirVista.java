package Vista;

import java.util.Scanner;

import POJO.Autor;
import POJO.Libro;
import utilidades.ControlData;

public class AnadirVista {
	static Scanner sc = new Scanner(System.in);

	public static Autor pedirAutor() {
		boolean flag;
		String dni;
		do {
			System.out.println("Introduce el dni del autor");
			dni = ControlData.lerString(sc);
			flag = ControlData.comprobarDni(dni);
		} while (!flag);

		System.out.println("Introduce el nombre del autor");
		String nombre = ControlData.lerString(sc);
		System.out.println("Introduce la nacionalidad del autor");
		String nacionalidad = ControlData.lerString(sc);

		Autor autor = new Autor(dni, nombre, nacionalidad);
		return autor;
	}

	public static Libro pedirLibro() {

		System.out.println("Introduce el título del libro");
		String titulo = ControlData.lerString(sc);
		System.out.println("Introduce el precio del libro");
		Double precio = ControlData.lerDouble(sc);

		Libro libro = new Libro(titulo, precio);
		return libro;
	}

}

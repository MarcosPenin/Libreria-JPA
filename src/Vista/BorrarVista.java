package Vista;

import java.util.Scanner;

import POJO.Autor;
import POJO.Libro;
import utilidades.ControlData;

public class BorrarVista {

	static Scanner sc=new Scanner(System.in);
	
	public static String pedirAutor() {
		System.out.println("Introduce el dni del autor");
		String dni=ControlData.lerString(sc);
		return dni;
	}

	public static int pedirCodigo() {
		System.out.println("Introduce el código del libro");
		int codigo=ControlData.lerInt(sc);
		return codigo;
	}

	
}

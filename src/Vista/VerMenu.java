
package Vista;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;

import Operaciones.Anadir;
import Operaciones.Borrar;
import Operaciones.Consultar;
import utilidades.ControlData;
import utilidades.Menu;

public class VerMenu {

	static Scanner sc = new Scanner(System.in);
	static Menu menuTablas = new Menu(tablas());
	static Menu menuTablas2 = new Menu(tablas2());
	static Menu menuConsultas=new Menu(consultas());
	static byte op;
	static Session session;

	public static void menuPrincipal(Session sesion) {
		session = sesion;
		Menu menuPrincipal = new Menu(opciones());
		byte opMenu;
		System.out.println("*********************************************************************");
		System.out.println("****************************BIENVENIDO*********************** ");

		do {
			System.out.println("*********************************************************************");
			System.out.println("Introduzca la opción que desee realizar:");
			menuPrincipal.printMenu();
			opMenu = ControlData.lerByte(sc);
			switch (opMenu) {
			case 1:
				menuInsertar();
				break;
			case 2:
				menuBorrar();
				break;
			case 3:
				menuConsultar();
				break;
			}
		} while (opMenu != 4);
	}

	public static void menuInsertar() {
		System.out.println("*********************************************************************");
		System.out.println("¿Que desea añadir?");
		menuTablas.printMenu();
		op = ControlData.lerByte(sc);
		switch (op) {
		case 1:
			Anadir.anadirAutor(session);
			break;
		case 2:
			Anadir.anadirLibro(session);
			break;
		case 3:
			Anadir.vincularLibro(session);
			break;

		}

	}

	public static void menuBorrar() {
		System.out.println("*********************************************************************");
		System.out.println("¿Que desea borrar?");
		menuTablas2.printMenu();
		op = ControlData.lerByte(sc);
		switch (op) {
		case 1:
			Borrar.borrarAutor(session);
			break;
		case 2:
			Borrar.borrarLibro(session);
			break;	
		}

	}

	public static void menuConsultar() {
		System.out.println("*********************************************************************");
		System.out.println("¿Que desea consultar?");
		menuConsultas.printMenu();
		op = ControlData.lerByte(sc);
		switch (op) {
		case 1:
			Consultar.libro(session);
			break;
		case 2:
			Consultar.librosAutor(session);
			break;
		case 3:
			Consultar.libros(session);
			break;
		case 4:
			Consultar.todo(session);
			break;
		}
	}


	static ArrayList<String> opciones() {
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Inserciones");
		opciones.add("Borrados");
		opciones.add("Consultas");
		opciones.add("Salir");
		return opciones;
	}

	static ArrayList<String> tablas() {
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Autor");
		opciones.add("Libro");
		opciones.add("Añadir libro a un autor");
		opciones.add("Volver");
		return opciones;
	}
	
	static ArrayList<String> tablas2() {
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Autor");
		opciones.add("Libro");
		opciones.add("Volver");
		return opciones;
	}
	

	static ArrayList<String> consultas() {
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Buscar libro por título");
		opciones.add("Buscar libros de un autor");
		opciones.add("Ver todos los libros");
		opciones.add("Ver todos los autores con sus libros");
		opciones.add("Volver");
		return opciones;
	}

}

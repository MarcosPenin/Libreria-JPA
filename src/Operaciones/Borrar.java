package Operaciones;

import org.hibernate.Session;

import POJO.Autor;
import POJO.Libro;
import Vista.BorrarVista;

public class Borrar {
	public static void borrarLibro() {
		Session session = AbrirSesion.abrirSesion();
		session.beginTransaction();
		int id=BorrarVista.pedirLibro();				
		Libro libro=session.get(Libro.class, id);
//		BorrarVista.imprimirLibro();
		session.close();
	}
	
}

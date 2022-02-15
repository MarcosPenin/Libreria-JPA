package Operaciones;

import org.hibernate.Session;

import POJO.Autor;
import POJO.Libro;
import Vista.ConsultarVista;


public class Borrar {

	public static void borrarAutor() {
		Session session = AbrirSesion.abrirSesion();
		session.beginTransaction();
		String dniAutor = ConsultarVista.pedirAutor();		
		Autor autor = session.get(Autor.class, dniAutor);
		session.remove(autor);
		session.getTransaction().commit();		
		session.close();
	}

	public static void borrarLibro() {
		Session session = AbrirSesion.abrirSesion();
		session.beginTransaction();
		int id = ConsultarVista.pedirLibro();
		Libro libro = session.get(Libro.class, id);
		session.remove(libro);
		session.getTransaction().commit();	
		session.close();
	}

}

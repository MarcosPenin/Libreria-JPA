package Operaciones;

import java.util.List;

import org.hibernate.Session;

import POJO.Autor;
import POJO.Libro;
import Vista.ConsultarVista;

public class Consultar {

	public static void consultarAutor() {
		Session session = Sesion.abrirSesion();
		session.beginTransaction();
		String dniAutor = ConsultarVista.pedirAutor();
		Autor autor = session.get(Autor.class, dniAutor);
		ConsultarVista.imprimirAutor(autor);
		session.close();
	}

	public static void consultarLibro() {
		Session session = Sesion.abrirSesion();
		session.beginTransaction();
		int id = ConsultarVista.pedirLibro();
		Libro libro = session.get(Libro.class, id);
		ConsultarVista.imprimirLibro(libro);
		session.close();
	}

	public static void librosAutor() {
		Session session = Sesion.abrirSesion();
		session.beginTransaction();		
		String dniAutor = ConsultarVista.pedirAutor();
		Autor autor = session.get(Autor.class, dniAutor);

		for (Libro x : autor.getLibros()) {
			ConsultarVista.imprimirLibro(x);
		}
		session.close();
	}
	
	public static void consultarLibros() {
		Session session = Sesion.abrirSesion();
		session.beginTransaction();

		List<Libro> libros = (List<Libro>) session.createQuery("FROM Libro").getResultList();
		for (Libro x : libros) {
			ConsultarVista.imprimirLibro(x);

		}

	}
}

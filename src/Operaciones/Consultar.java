package Operaciones;

import java.util.List;

import org.hibernate.Session;

import POJO.Autor;
import POJO.Libro;
import Vista.ConsultarVista;
import Vista.Mensajes;


public class Consultar {

	public static void libro(Session session) {
		String titulo = ConsultarVista.pedirLibroNombre();
		String c = "select i from Libro i where titulo='"+titulo+"'";	 
		Libro libro = (Libro) session.createQuery(c).list();
		if(libro!=null) {
			ConsultarVista.imprimirLibro(libro);
		}else {
			Mensajes.libroNoEncontrado();
		}
		
	}
		

	public static void librosAutor(Session session) {
		String nombre = ConsultarVista.pedirAutor();
		String c = "select i from Autor i";
		List<Autor> autores = session.createQuery(c).list();
		if (autores.isEmpty()) {
			Mensajes.sinAutores();
		}
		boolean flag = true;
		for (Autor i : autores) {
			if (i.getNombre().equalsIgnoreCase(nombre)) {
				ConsultarVista.imprimirLibros(i);
				Mensajes.separador();
				flag = false;
			}
		}
		if (flag) {
			Mensajes.autorNoEncontrado();
		}
	}

	public static void libros(Session session) {
		List<Libro> libros = (List<Libro>) session.createQuery("FROM Libro").getResultList();
		if (libros.isEmpty()) {
			Mensajes.sinLibros();
		}
		for (Libro x : libros) {
			ConsultarVista.imprimirLibro(x);
			Mensajes.separador();
			
		}

	}

	public static void todo(Session session) {
		String c = "select i from Autor i";
		List<Autor> autores = session.createQuery(c).list();
		if (autores.isEmpty()) {
			Mensajes.sinAutores();
		}

		for (Autor i : autores) {
			ConsultarVista.imprimirAutor(i);
			Mensajes.separador();
		}
	}

}

//	public static void librosAutor(Session session) {	
//	String dniAutor = ConsultarVista.pedirAutor();
//	Autor autor = session.get(Autor.class, dniAutor);
//	for (Libro x : autor.getLibros()) {
//		ConsultarVista.imprimirLibro(x);
//	}
//}	

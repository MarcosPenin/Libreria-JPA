package Operaciones;

import org.hibernate.Session;

import POJO.Autor;
import POJO.Libro;
import Vista.BorrarVista;
import Vista.ConsultarVista;
import Vista.Mensajes;

public class Borrar {
	public static void borrarAutor(Session session) {
		String dniAutor = BorrarVista.pedirAutor();
		Autor autor = session.get(Autor.class, dniAutor);
		try {
			session.remove(autor);
			session.getTransaction().commit();
		} catch (IllegalArgumentException e) {
			Mensajes.dniNoEncontrado();
		}
	}

	public static void borrarLibro(Session session) {
		int id = BorrarVista.pedirCodigo();
		Libro libro = session.get(Libro.class, id);
		try {
			session.remove(libro);
			session.getTransaction().commit();
		} catch (IllegalArgumentException e) {
			Mensajes.codigoNoEncontrado();
		}
	}

}

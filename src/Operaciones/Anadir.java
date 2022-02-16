package Operaciones;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import POJO.Autor;
import POJO.Libro;
import Vista.AnadirVista;

public class Anadir {

	public static void anadirAutor(Session session) {
		Autor autor=AnadirVista.pedirAutor();
		session.save(autor);
		session.getTransaction().commit();
	}		
	
	public static void anadirLibro(Session session) {		
		Libro libro=AnadirVista.pedirLibro();		
		session.save(libro);
		session.getTransaction().commit();
	}
	
}

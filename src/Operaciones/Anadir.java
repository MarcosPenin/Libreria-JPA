package Operaciones;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import POJO.Autor;
import POJO.Libro;
import Vista.AnadirVista;
import Vista.ConsultarVista;
import Vista.Mensajes;

public class Anadir {

	public static void anadirAutor(Session session) {
		Autor autor=AnadirVista.pedirAutor();
		session.beginTransaction();
		session.save(autor);
		session.getTransaction().commit();
	}		
	
	public static void anadirLibro(Session session) {		
		Libro libro=AnadirVista.pedirLibro();		
		session.beginTransaction();
		session.save(libro);
		session.getTransaction().commit();
	}
	
	public static void vincularLibro(Session session) {
		Libro libro=AnadirVista.pedirLibro();
		String nombreAutor=ConsultarVista.pedirAutor();
		
		String c = "select i from Autor i where nombre='"+nombreAutor+"'";	 
		Autor autor = (Autor) session.createQuery(c).uniqueResult();
		
		if (autor!=null) {
			session.beginTransaction();
			autor.anadirLibro(libro);
			session.update(autor);
			session.getTransaction().commit();
		}else {
			Mensajes.autorNoEncontrado();
		}
			
	}
	
	
	
	
}

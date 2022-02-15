package Operaciones;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import POJO.Autor;
import POJO.Libro;
import Vista.AnadirVista;

public class Anadir {

	public static void anadirAutor() {
		Session session = AbrirSesion.abrirSesion();
		session.beginTransaction();
		Autor autor=AnadirVista.pedirAutor();
		session.save(autor);
		session.getTransaction().commit();
		session.close();
	}		
	
	public static void anadirLibro() {		
		Session session = AbrirSesion.abrirSesion();
		session.beginTransaction();
		Libro libro=AnadirVista.pedirLibro();		
		session.save(libro);
		session.getTransaction().commit();
		session.close();
	}
	
	
	
	
	
}

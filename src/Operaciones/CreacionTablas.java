package Operaciones;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import POJO.Autor;
import POJO.Libro;
import POJO.Telefono;

public class CreacionTablas {

	public static void CreacionTablas() {		
		Session session = AbrirSesion.abrirSesion();
		session.beginTransaction();

		Autor a1 = new Autor("34342414L", "Asimov", "EEUU");
		Autor a2 = new Autor("34342414P", "Tolstoi", "Rusia");

		Libro l1 = new Libro("Guerra y paz", 10);
		Libro l2 = new Libro("Fundación", 12);
		Libro l3 = new Libro("El fin de la eternidad", 12);

		Telefono t1 = new Telefono("34342414L", "986232323");
		Telefono t2 = new Telefono("34342414P", "620676767");

		
		a1.anadirLibro(l2);
		a1.anadirLibro(l3);
		a1.setTelefono(t1);
		
		
		a2.anadirLibro(l1);
		a2.setTelefono(t2);

		session.save(a1);		
		session.save(a2);

		session.getTransaction().commit();
		session.close();
	}

}

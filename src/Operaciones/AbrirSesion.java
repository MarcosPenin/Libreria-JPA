package Operaciones;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AbrirSesion {

	public static Session abrirSesion() {
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
		
	}
	
}

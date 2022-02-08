package Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import ejemplo10.Modulo;
import ejemplo10.ProfesorNew;

public class Main {

	  public static void main(String[] args) {
	        SessionFactory sessionFactory;
	           	        
	        sessionFactory = new Configuration().configure().buildSessionFactory();
	     
	        ProfesorNew profesor1=new ProfesorNew(13, "Ana Isabel", "Perez", "León");
	        ProfesorNew profesor2=new ProfesorNew(14, "Francisco", "Moya", "Salas");        

	        Modulo modulo1=new Modulo(4, "Sistemas gestores de bases de datos");
	        Modulo modulo2=new Modulo(5, "Programación");
	        Modulo modulo3=new Modulo(6, "Lenguaje de marcas");

	        profesor1.getModulos().add(modulo1);
	        profesor1.getModulos().add(modulo2);
	        profesor2.getModulos().add(modulo3);

	        modulo1.getProfesores().add(profesor1);
	        modulo2.getProfesores().add(profesor1);
	        modulo3.getProfesores().add(profesor2);


	        Session session=sessionFactory.openSession();
	        session.beginTransaction();

	        session.save(profesor1);
	        session.save(profesor2);     

	        session.getTransaction().commit();
	        session.close();
	        
	    }
	
	
	
	
}

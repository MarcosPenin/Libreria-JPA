package Main;

import org.hibernate.Session;

import Operaciones.Sesion;
import Vista.Mensajes;
import Vista.VerMenu;

public class Main {

	public static void main(String[] args) {
//		CreacionTablas.CreacionTablas();
		Session session = Sesion.abrirSesion();
		session.beginTransaction();
		VerMenu.menuPrincipal(session);		
		session.close();
		Mensajes.sesionTerminada();

	}

}

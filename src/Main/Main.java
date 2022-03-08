package Main;

import org.hibernate.Session;

import Operaciones.CreacionTablas;
import Operaciones.Sesion;
import Vista.Mensajes;
import Vista.VerMenu;

public class Main {

/* Ejecutar tal cual la primera vez para crear la base de datos
 * A continuaci�n comentar l�nea 18,  y cambiar
 * create-drop por update en el fichero de configuraci�n
 */

	public static void main(String[] args) {
		//CreacionTablas.CreacionTablas();
		Session session = Sesion.abrirSesion();
		VerMenu.menuPrincipal(session);
		session.close();
		Mensajes.sesionTerminada();

	}

}

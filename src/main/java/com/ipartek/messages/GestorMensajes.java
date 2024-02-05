package com.ipartek.messages;

import jakarta.servlet.http.HttpSession;

public class GestorMensajes implements Mensajes{

	public static void ponerMensaje(int idMensaje, HttpSession session) {
	
		switch (idMensaje) {
		case 1:
			session.setAttribute("mensaje", INSERTADO);
			break;
		case 2:
			session.setAttribute("mensaje", BORRADO);
			break;
		case 3:
			session.setAttribute("mensaje", MODIFICADO);
			break;
		default:
			session.setAttribute("mensaje", "");
			break;
		}
	}
	
	public static void ponerMensajeError(int idMensaje, HttpSession session) {
		
		switch (idMensaje) {
		case 1:
			session.setAttribute("mensaje", INSERTADO_ERROR);
			break;
		case 2:
			session.setAttribute("mensaje", BORRADO_ERROR);
			break;
		case 3:
			session.setAttribute("mensaje", MODIFICADO_ERROR);
			break;
		default:
			session.setAttribute("mensaje", "");
			break;
		}

	}

	public static void borrarMensaje(HttpSession session) {
		session.removeAttribute("mensaje");
	}

}

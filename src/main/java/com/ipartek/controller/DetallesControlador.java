package com.ipartek.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.messages.GestorMensajes;
import com.ipartek.model.Inventario;
import com.ipartek.repository.InventarioRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class DetallesControlador {

	@ Autowired
	private InventarioRepository inventarioRepo;
	
	@RequestMapping("/detalles_borrar")
	public String detallesBorrar(HttpSession session, Model model) {
		GestorMensajes.borrarMensaje(session);

		// borrar el elemento de esa id
		System.out.println("SE HA BORRAU");
		
		GestorMensajes.ponerMensaje(2, session);
		

		model.addAttribute("atr_lista_productos", inventarioRepo.findAll());

		return "detalles";
	}

	@RequestMapping("/detalles_modificar")
	public String detallesModificar(HttpSession session, Model model) {
		GestorMensajes.borrarMensaje(session);

		// modificar el elemento de esa id
		System.out.println("SE HA MODIFICAU");
		
		GestorMensajes.ponerMensaje(3, session);

		model.addAttribute("atr_lista_productos", inventarioRepo.findAll());

		return "detalles";
	}

}

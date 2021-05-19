package com.dluna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dluna.service.IntProductosService;

@Controller
public class HomeController {

	@Autowired
	private IntProductosService productosService;
	
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	
	@GetMapping("/")
	public String mostrarIndex(Model model) {
		model.addAttribute("productos", productosService.obtenerTodos());
		return "home";
	}
}

package com.example.demo.es.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.es.entity.Persona;
import com.example.demo.es.services.PersonaService;

@RestController
public class HelloControler {
	
	//Persona persona = new Persona("Jose", "Perez", "jperez@gmail.com", 123345);
	
	@Autowired
	private PersonaService personaService;
	@GetMapping("/saludar")
		public List<Persona> saludo() {
		return personaService.listaPersona();
		
//		persona.setNombre("rolando");
	//	persona.setApellido("López");
		//persona.setEmail("rlopez@gmail.com")
			//return persona;
		
		}
	
}

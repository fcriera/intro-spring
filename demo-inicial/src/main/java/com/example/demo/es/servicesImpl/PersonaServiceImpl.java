package com.example.demo.es.servicesImpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.es.entity.Persona;
import com.example.demo.es.services.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	Persona persona;
	
	@Override
	public List<Persona> listaPersona() {
		List<Persona> lista = new ArrayList<>();
		persona.setNombre("Jose");
		persona.setApellido("Perez");
		persona.setEmail("jperez@gmail.com");
		persona.setTelefono(1233545454);
		lista.add(persona);
		
		Persona persona2 = new Persona("Karina", "Rodas", "krodas@gmail.com", 123345);
		lista.add(persona2);
		return lista;
	}
	
}

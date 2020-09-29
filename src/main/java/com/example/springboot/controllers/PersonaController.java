package com.example.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Persona;
import com.example.springboot.service.IPersonaService;

@RestController
public class PersonaController {

	@Autowired
	private IPersonaService personaService;

	@RequestMapping("/")
	public String index() {

		return "Hola. Mi proyecto está publicado";
	}

	@GetMapping("/personas")
	public List<Persona> getPersonas() {
		return personaService.getPersonas();
	}

	@GetMapping("/persona/{id}")
	public Persona getPersona(@PathVariable Long id) {
		return personaService.getPersona(id);
	}

	@DeleteMapping("/persona/{id}")
	void deletePersona(@PathVariable Long id) {
		Persona persona = new Persona();
		persona.setId(id);
		personaService.deletePersona(persona);
	}

	@PostMapping("/persona")
	Persona addPersona(@RequestBody Persona persona) {
		return personaService.savePersona(persona);
	}
	
	@PutMapping("/persona/{id}")
	Persona replacepersona(@RequestBody Persona persona, @PathVariable Long id) {
		return personaService.savePersona(persona);
	}
}

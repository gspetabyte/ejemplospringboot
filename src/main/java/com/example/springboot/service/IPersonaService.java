package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.Persona;

public interface IPersonaService {
	
	public List<Persona> getPersonas();

	public Persona getPersona(Long id);
	
	public void deletePersona(Persona persona);
	
	public Persona savePersona(Persona persona);

}
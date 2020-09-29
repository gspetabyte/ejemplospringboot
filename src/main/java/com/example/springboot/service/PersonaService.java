package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dao.IPersonaDao;
import com.example.springboot.model.Persona;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersonaDao personaDao;

	@Override
	public List<Persona> getPersonas() {
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	public Persona getPersona(Long id) {
		return (Persona) personaDao.findById(id).get();
	}

	@Override
	public void deletePersona(Persona persona) {
		personaDao.delete(persona);
	}
	
	@Override
	public Persona savePersona(Persona persona) {
		return personaDao.save(persona);
	}
	
	
}

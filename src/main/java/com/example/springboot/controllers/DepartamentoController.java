package com.example.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Departamento;
import com.example.springboot.service.IDepartamentoService;

@RestController
public class DepartamentoController {

	@Autowired
	private IDepartamentoService departamentoService;

	@GetMapping("/departamentos")
	public List<Departamento> getPersonas() {
		return departamentoService.getDepartamentos();
	}

}

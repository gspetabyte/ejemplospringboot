package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.Departamento;

public interface IDepartamentoService {
	
	public List<Departamento> getDepartamentos();

	public Departamento getDepartamento(Long id);

}
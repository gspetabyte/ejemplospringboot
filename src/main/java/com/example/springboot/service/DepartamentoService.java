package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dao.IDepartamentoDao;
import com.example.springboot.model.Departamento;

@Service
public class DepartamentoService implements IDepartamentoService {

	@Autowired
	private IDepartamentoDao departamnetoDao;

	@Override
	public List<Departamento> getDepartamentos() {
		return (List<Departamento>) departamnetoDao.findAll();
	}

	@Override
	public Departamento getDepartamento(Long id) {
		return (Departamento) departamnetoDao.findById(id).get();
	}

}

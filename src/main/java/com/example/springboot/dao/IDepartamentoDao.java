package com.example.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.model.Departamento;

public interface IDepartamentoDao extends CrudRepository<Departamento, Long> {

}

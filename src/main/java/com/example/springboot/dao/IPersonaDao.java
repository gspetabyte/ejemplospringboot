package com.example.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.model.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long> {

}

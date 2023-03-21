package com.mitocode.patronesdedisenio._14mvc.service;

import com.mitocode.patronesdedisenio._14mvc.dao.PersonaDAO;
import com.mitocode.patronesdedisenio._14mvc.model.Persona;

import java.util.List;

public class PersonaServiceImpl implements PersonaService {

	private PersonaDAO dao;
	
	public PersonaServiceImpl(PersonaDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Persona> listar() {
		return dao.listar();
	}

	@Override
	public Iterable<Object> listarTodos() {
		return null;
	}

	@Override
	public void registrar(Persona per) {

	}

}

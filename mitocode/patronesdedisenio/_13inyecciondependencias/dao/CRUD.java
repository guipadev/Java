package com.mitocode.patronesdedisenio._13inyecciondependencias.dao;

import java.util.List;

public interface CRUD<T> {

	List<T> listarTodos();
	T leerPorId (int id);
	void registrar(T t);
	void actualizar(T t);
	void eliminar(int id);
}

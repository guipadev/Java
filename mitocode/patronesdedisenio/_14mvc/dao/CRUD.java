package com.mitocode.patronesdedisenio._14mvc.dao;

import java.util.List;

public interface CRUD<T> {

	List<T> listar();

    Iterable<Object> listarTodos();

    void registrar(T per);
}

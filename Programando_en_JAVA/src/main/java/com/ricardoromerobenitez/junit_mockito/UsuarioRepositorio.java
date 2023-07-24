package com.ricardoromerobenitez.junit_mockito;

public interface UsuarioRepositorio {

    UsuarioDto crearUsuario(String nombre);

    UsuarioDto obtenerUsuario(Long id);
}

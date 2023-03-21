package com.yadevom._15JUNIT_MOCKITO_PRUEBAS_UNITARIAS;

public interface UsuarioRepositorio {

    UsuarioDto crearUsuario(String nombre);

    UsuarioDto obtenerUsuario(Long id);
}

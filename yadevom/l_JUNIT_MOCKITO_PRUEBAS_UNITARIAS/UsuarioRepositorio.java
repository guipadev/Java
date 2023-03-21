package com.yadevom.l_JUNIT_MOCKITO_PRUEBAS_UNITARIAS;

public interface UsuarioRepositorio {

    UsuarioDto crearUsuario(String nombre);

    UsuarioDto obtenerUsuario(Long id);
}

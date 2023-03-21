package com.yadevom.l_JUNIT_MOCKITO_PRUEBAS_UNITARIAS;

import com.yadevom.l_JUNIT_MOCKITO_PRUEBAS_UNITARIAS.UsuarioRepositorio;
import com.yadevom.l_JUNIT_MOCKITO_PRUEBAS_UNITARIAS.UsuarioDto;

public class UsuarioServicio {

    private final UsuarioRepositorio usuarioRepositorio;

    public UsuarioServicio(final UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public UsuarioDto crearUsuario(final String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        return usuarioRepositorio.crearUsuario(nombre);
    }

    public UsuarioDto obtenerUsuario(final long id) {
        return usuarioRepositorio.obtenerUsuario(id);
    }
}

package com.yadevom._15JUNIT_MOCKITO_PRUEBAS_UNITARIAS;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

//Indicar que vamos a utilizar mockito
@ExtendWith(MockitoExtension.class)
class UsuarioServicioTest {

    // Simular llamado crear usuario
    @Mock
    private UsuarioRepositorio usuarioRepositorio;

    // Recebir como dependencia los mock que hemos indicados como parametro anteriormente
    @InjectMocks
    private UsuarioServicio usuarioServicio;

    // Cuando se llame a crear usuario, se nos devuelva un objeto que vamos a simular
    @Test
    void dadoUsuarioParaCrearEsperamosUnUsuarioCreado() {
        UsuarioDto objectoSimulado = new UsuarioDto(1L, "Prueba");
        UsuarioDto esperado = new UsuarioDto(1L, "Prueba");
        Mockito.when(usuarioRepositorio.crearUsuario("Prueba"))
                .thenReturn(objectoSimulado);
        final UsuarioDto resultado =
                usuarioServicio.crearUsuario("Prueba");
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertEquals(esperado.nombre, resultado.nombre, "Los nombres no son diferentes");
        Assertions.assertEquals(esperado, resultado);
        Mockito.verify(usuarioRepositorio).crearUsuario("Prueba");

    }

    @Test
    void testObtenerUsuario() {
        UsuarioDto objectoSimulado = new UsuarioDto(1L, "Prueba");
        UsuarioDto esperado = new UsuarioDto(1L, "Prueba");
        Mockito.when(usuarioRepositorio.obtenerUsuario(1L))
                .thenReturn(objectoSimulado);
        final UsuarioDto resultado =
                usuarioServicio.obtenerUsuario(1L);
        Assertions.assertEquals(esperado, resultado);
        Mockito.verify(usuarioRepositorio).obtenerUsuario(1L);
    }

}
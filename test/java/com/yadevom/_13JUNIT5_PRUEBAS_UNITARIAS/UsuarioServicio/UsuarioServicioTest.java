package com.yadevom._13JUNIT5_PRUEBAS_UNITARIAS.UsuarioServicio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UsuarioServicioTest {

    private UsuarioServicio usuarioServicio;

    // Ejecutar metodo antes del ejecucion del test
    @BeforeEach
    public void setUp() {
        // Cada vez que se crea uno, sea uno limpio
        usuarioServicio = new UsuarioServicio();
        // Llenar BD antes de crear un tipo, teniendo datos de prueba en BD
        usuarioServicio.crearUsuario(0L, "Usuario principal");
        usuarioServicio.crearUsuario(2L, "Usuario segundo");
    }

    @DisplayName("Dado un usuario que queramos crear" +
            "Cuando llamamos a 'crear usuario'" +
            "Esperamos que el usuario este creado"
    )
    @Test
    public void testCrearUsuario1() {
        // resultado esperado
        UsuarioDto esperado = new UsuarioDto(1L, "prueba");
        // Clase a testear
        //UsuarioServicio usuarioServicio = new UsuarioServicio();
        // Metodo a testear
        final UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "prueba");
        // Validar resultado esperado
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertEquals(esperado.nombre, resultado.nombre, "Los nombres son diferentes");
        Assertions.assertEquals(esperado, resultado);
        //Assertions.assertTrue(true);
        //Assertions.assertFalse(false);
        //Assertions.fail();
    }

    @Test
    public void testCrearUsuario2() {
        // resultado esperado
        UsuarioDto esperado = new UsuarioDto(1L, "Nombre");
        // Clase a testear
        //UsuarioServicio usuarioServicio = new UsuarioServicio();
        // Metodo a testear
        final UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "prueba");
        // Validar resultado esperado
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertNotEquals(esperado.nombre, resultado.nombre, "Los nombres no son diferentes");
        Assertions.assertNotEquals(esperado, resultado);
    }


    @Test
    public void testObtenerUsuario() {
        //UsuarioServicio usuarioServicio = new UsuarioServicio();

        final UsuarioDto resultado = usuarioServicio.obtenerUsuario(1L);

        Assertions.assertEquals(null, resultado);
    }

    @Test
    public void testObtenerUsuario2() {
        UsuarioDto esperado = new UsuarioDto(0L, "Usuario principal");
        //UsuarioServicio usuarioServicio = new UsuarioServicio();

        //usuarioServicio.crearUsuario(1L, "Nombre");

        final UsuarioDto resultado = usuarioServicio.obtenerUsuario(0L);

        Assertions.assertEquals(esperado, resultado);
    }
}
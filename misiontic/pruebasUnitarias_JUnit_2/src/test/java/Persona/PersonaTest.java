/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yamid
 */
public class PersonaTest {
    
    public PersonaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculaIMC method, of class Persona.
     */
    @Test
    public void testCalculaIMC() {
        System.out.println("calculaIMC");
        double peso = 86.2;
        double estatura = 1.80;
        double expResult = 26.604938271604937;
        double result = Persona.calculaIMC(peso, estatura);
        assertEquals("Error al calcular IMC: ", expResult, result, 0.0);
    }

    /**
     * Test of nombreCompleto method, of class Persona.
     */
    @Test
    public void testNombreCompleto() {
        System.out.println("nombreCompleto");
        String nombre = "YAMID";
        String apellidos = "ORTIZ";
        String expResult = "YAMIDORTIZ";
        String result = Persona.nombreCompleto(nombre, apellidos);
        assertEquals("Erro al obtener nombres y apellidos: ", expResult, result);
    }
    
}

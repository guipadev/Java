/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

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
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of main method, of class Calculadora.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora.main(args);
       }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 5;
        int b = 5;
        int expResult = 10;
        int result = Calculadora.sumar(a, b);
        assertEquals("Resultaod esperado suma 10", expResult, result);//Este mensaje se muestra cuando falla la prueba
        
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 2;
        int b = 1;
        int expResult = 1;
        int result = Calculadora.resta(a, b);
        assertEquals("Resultado esperado resta 1", expResult, result);
        
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int a = 21;
        int b = 7;
        int expResult = 3;
        int result = Calculadora.division(a, b);
        assertEquals("Resultado esperado division 3", expResult, result);
        
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int a = 2;
        int b = 3;
        int expResult = 6;
        int result = Calculadora.multiplicacion(a, b);
        assertEquals("Resultado esperdo multiplicacion 6", expResult, result);
    }

    /**
     * Test of modulo method, of class Calculadora.
     */
    @Test
    public void testModulo() {
        System.out.println("modulo");
        int a = 7;
        int b = 3;
        int expResult = 1;
        int result = Calculadora.modulo(a, b);
        assertEquals("Resultado esperado modul es 1", expResult, result);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pichau
 */
public class TimeTest {
    
    public TimeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of adicionarDefensor method, of class Time.
     */
    @Test
    public void testAdicionarDefensor() {
        System.out.println("adicionarDefensor");
        Defensor defensor = null;
        Time instance = null;
        instance.adicionarDefensor(defensor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarAtacante method, of class Time.
     */
    @Test
    public void testAdicionarAtacante() {
        System.out.println("adicionarAtacante");
        Atacante atacante = null;
        Time instance = null;
        instance.adicionarAtacante(atacante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarGoleiro method, of class Time.
     */
    @Test
    public void testAdicionarGoleiro() {
        System.out.println("adicionarGoleiro");
        Goleiro goleiro = null;
        Time instance = null;
        instance.adicionarGoleiro(goleiro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefensores method, of class Time.
     */
    @Test
    public void testGetDefensores() {
        System.out.println("getDefensores");
        Time instance = null;
        ArrayList<Defensor> expResult = null;
        ArrayList<Defensor> result = instance.getDefensores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAtacantes method, of class Time.
     */
    @Test
    public void testGetAtacantes() {
        System.out.println("getAtacantes");
        Time instance = null;
        ArrayList<Atacante> expResult = null;
        ArrayList<Atacante> result = instance.getAtacantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resultados method, of class Time.
     */
    @Test
    public void testResultados() {
        System.out.println("resultados");
        Time instance = null;
        int expResult = 0;
        int result = instance.resultados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitante method, of class Time.
     */
    @Test
    public void testVisitante() {
        System.out.println("visitante");
        Time instance = null;
        boolean expResult = false;
        boolean result = instance.visitante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVitoria method, of class Time.
     */
    @Test
    public void testSetVitoria() {
        System.out.println("setVitoria");
        Time instance = null;
        instance.setVitoria();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDerrota method, of class Time.
     */
    @Test
    public void testSetDerrota() {
        System.out.println("setDerrota");
        Time instance = null;
        instance.setDerrota();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpate method, of class Time.
     */
    @Test
    public void testSetEmpate() {
        System.out.println("setEmpate");
        Time instance = null;
        instance.setEmpate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaForca method, of class Time.
     */
    @Test
    public void testCalculaForca() {
        System.out.println("calculaForca");
        Time instance = null;
        int expResult = 0;
        int result = instance.calculaForca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of golDe method, of class Time.
     */
    @Test
    public void testGolDe() {
        System.out.println("golDe");
        int tipo = 0;
        int local = 0;
        Time instance = null;
        instance.golDe(tipo, local);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

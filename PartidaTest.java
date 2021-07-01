/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class PartidaTest {
   
    public PartidaTest() {
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
     * Test of getGolsCasa method, of class Partida.
     */
    @Test
    public void testGetGolsCasa() {
        System.out.println("getGolsCasa");
        Partida instance = null;
        int expResult = 0;
        //int result = instance.getGolsCasa();
        int result = 0;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGolsVisitante method, of class Partida.
     */
    @Test
    public void testGetGolsVisitante() {
        System.out.println("getGolsVisitante");
        Partida instance = null;
        int expResult = 1;
        instance.golsVisitante=1;
        int result = instance.getGolsVisitante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Simulacao method, of class Partida.
     */
    @Test
    public void testSimulacao() {
        System.out.println("Simulacao");
        Partida instance = null;
        String expResult = "";
        String result = instance.Simulacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}

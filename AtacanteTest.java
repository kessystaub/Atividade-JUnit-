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
public class AtacanteTest {
    
    public AtacanteTest() {
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
     * Test of getHabilidade method, of class Atacante.
     */
    @Test
    public void testGetHabilidade() {
        System.out.println("getHabilidade");
        Atacante instance = null;
        int expResult = 0;
        int result = instance.getHabilidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVelocidade method, of class Atacante.
     */
    @Test
    public void testGetVelocidade() {
        System.out.println("getVelocidade");
        Atacante instance = null;
        int expResult = 0;
        int result = instance.getVelocidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTecnica method, of class Atacante.
     */
    @Test
    public void testGetTecnica() {
        System.out.println("getTecnica");
        Atacante instance = null;
        int expResult = 0;
        int result = instance.getTecnica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

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
public class GoleiroTest {
    
    public GoleiroTest() {
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
     * Test of getHabilidade method, of class Goleiro.
     */
    @Test
    public void testGetHabilidade() {
        System.out.println("getHabilidade");
        Goleiro instance = null;
        int expResult = 0;
        int result = instance.getHabilidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class Goleiro.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Goleiro instance = null;
        int expResult = 0;
        int result = instance.getAltura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReflexos method, of class Goleiro.
     */
    @Test
    public void testGetReflexos() {
        System.out.println("getReflexos");
        Goleiro instance = null;
        int expResult = 0;
        int result = instance.getReflexos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

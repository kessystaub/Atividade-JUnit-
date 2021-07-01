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
public class DefensorTest {
    
    public DefensorTest() {
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
     * Test of getHabilidade method, of class Defensor.
     */
    @Test
    public void testGetHabilidade() {
        System.out.println("getHabilidade");
        Defensor instance = null;
        int expResult = 0;
        int result = instance.getHabilidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCobertura method, of class Defensor.
     */
    @Test
    public void testGetCobertura() {
        System.out.println("getCobertura");
        Defensor instance = null;
        int expResult = 0;
        int result = instance.getCobertura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesarme method, of class Defensor.
     */
    @Test
    public void testGetDesarme() {
        System.out.println("getDesarme");
        Defensor instance = null;
        int expResult = 0;
        int result = instance.getDesarme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

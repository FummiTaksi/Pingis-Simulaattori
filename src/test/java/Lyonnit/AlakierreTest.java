/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lyonnit;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aleksi
 */
public class AlakierreTest {
    
    public AlakierreTest() {
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
     * Test of getVastaukset method, of class Alakierre.
     */
    @Test
    public void testGetVastaukset() {
        System.out.println("getVastaukset");
        Alakierre instance = new Alakierre();
        ArrayList<Lyonti> expResult = null;
        ArrayList<Lyonti> result = instance.getVastaukset();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTodNak method, of class Alakierre.
     */
    @Test
    public void testGetTodNak() {
        System.out.println("getTodNak");
        Alakierre instance = new Alakierre();
        double expResult = 0.0;
        double result = instance.getTodNak();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Alakierre.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Alakierre instance = new Alakierre();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Alakierre.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Alakierre instance = new Alakierre();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

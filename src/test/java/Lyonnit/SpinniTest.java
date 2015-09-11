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
public class SpinniTest {
    
    public SpinniTest() {
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
     * Test of getTodNak method, of class Spinni.
     */
    @Test
    public void testGetTodNak() {
        System.out.println("getTodNak");
        Spinni instance = new Spinni();
        double expResult = 0.0;
        double result = instance.getTodNak();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVastaukset method, of class Spinni.
     */
    @Test
    public void testGetVastaukset() {
        System.out.println("getVastaukset");
        Spinni instance = new Spinni();
        ArrayList<Lyonti> expResult = null;
        ArrayList<Lyonti> result = instance.getVastaukset();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Spinni.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Spinni instance = new Spinni();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Spinni.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Spinni instance = new Spinni();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

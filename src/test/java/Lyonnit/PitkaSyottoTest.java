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
public class PitkaSyottoTest {
    
    public PitkaSyottoTest() {
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
     * Test of getTodNak method, of class PitkaSyotto.
     */
    @Test
    public void testGetTodNak() {
        System.out.println("getTodNak");
        PitkaSyotto instance = new PitkaSyotto();
        double expResult = 0.0;
        double result = instance.getTodNak();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVastaukset method, of class PitkaSyotto.
     */
    @Test
    public void testGetVastaukset() {
        System.out.println("getVastaukset");
        PitkaSyotto instance = new PitkaSyotto();
        ArrayList<Lyonti> expResult = null;
        ArrayList<Lyonti> result = instance.getVastaukset();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PitkaSyotto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PitkaSyotto instance = new PitkaSyotto();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PitkaSyotto.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        PitkaSyotto instance = new PitkaSyotto();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

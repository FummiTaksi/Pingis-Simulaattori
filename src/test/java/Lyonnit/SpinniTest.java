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
    Spinni spinni;
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
        this.spinni = new Spinni(0.5);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTodNak method, of class Spinni.
     */
    @Test
    public void testGetTodNak() {
   assertEquals(0.5,spinni.getTodNak(),0.0001);
    }
//
//    /**
//     * Test of getVastaukset method, of class Spinni.
//     */
    @Test
    public void testGetVastaukset() {
    boolean testi;
    if (!spinni.getVastaukset().contains(new Spinni()) || !spinni.getVastaukset().contains(new Deffu()) || !spinni.getVastaukset().contains(new Blokki())) {
        testi = false;
    }
    else {
        testi = true;
    }
    assertTrue(testi);
    }
//
//    /**
//     * Test of toString method, of class Spinni.
//     */
    @Test
    public void testToStringPalauttaaTrue() {
        assertEquals("[6] Spinni", spinni.toString());
    }
    
    @Test
    public void testToStringPalauttaaFalse() {
        assertFalse("LOL".equals(spinni.toString()));
    }
//
//    /**
//     * Test of equals method, of class Spinni.
//     */
    @Test
  public void testEqualsPalauttaaTrue() {
        assertTrue(new Spinni().equals(spinni));
    }  
  
  @Test
  public void testEqualsPalauttaaFalse() {
      assertFalse(new Deffu().equals(spinni));
  }
//    
}

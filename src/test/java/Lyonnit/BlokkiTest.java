/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lyonnit;

import Logiikka.kasittelijat.LyontienKasittelija;
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
public class BlokkiTest {

    private Blokki blokki;

    public BlokkiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.blokki = new Blokki(0.5);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getTodNak method, of class Blokki.
     */
    @Test
    public void testGetTodNak() {
        assertEquals(blokki.getTodNak(), 0.5, 0.0001);
    }
//
//    /**
//     * Test of getVastaukset method, of class Blokki.
//     */

    @Test
    public void testGetVastaukset() {
        boolean testi;
        if (!blokki.getVastaukset().contains(new Spinni()) || !blokki.getVastaukset().contains(new Deffu())) {
            testi = false;
        }
        else {
            testi = true;
        }
        assertTrue(testi);
    }
//
//    /**
//     * Test of toString method, of class Blokki.
//     */
    @Test
    public void testToStringPalauttaaTrue() {
        assertEquals("[5] Blokki",blokki.toString());
    }
    
    @Test
    public void testToStringPalauttaaFalse() {
        assertFalse("LOL".equals(blokki.toString()));
    }

//    /**
//     * Test of equals method, of class Blokki.
//     */
    @Test
    public void testEqualsPalauttaaTrue() {
        Blokki testi  = new Blokki();
        assertTrue(testi.equals(blokki));
    }
    
    @Test
    public void testEqualsPalauttaaFalse() {
      assertFalse(new LyhytSyotto().equals(blokki));
    }
//    
}

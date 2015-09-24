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
public class DeffuTest {

    private Deffu deffu;

    public DeffuTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.deffu = new Deffu(0.5);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getTodNak method, of class Deffu.
     */
    @Test
    public void testGetTodNak() {
        assertEquals(0.5, deffu.getTodNak(), 0.0001);
    }
//
//    /**
//     * Test of getVastaukset method, of class Deffu.
//     */

    @Test
    public void testGetVastaukset() {
        boolean testi = true;
        if (!deffu.getVastaukset().contains(new Alakierre()) || !deffu.getVastaukset().contains(new Spinni())) {
            testi = false;
        } else {
            testi = true;
        }
        assertTrue(testi);
    }
//
//    /**
//     * Test of toString method, of class Deffu.
//     */

    @Test
    public void testToStringPalauttaaTrue() {
        assertEquals("[4] Deffu", deffu.toString());
    }
    
    @Test
    public void testToStringPalauttaaFalse() {
        assertFalse("LOL".equals(deffu.toString()));
    }
//
//    /**
//     * Test of equals method, of class Deffu.
//     */

    @Test
    public void testEqualsPalauttaaTrue() {
        Deffu testi = new Deffu();
        assertTrue(testi.equals(deffu));
    }
    
    @Test
    public void testEqualsPalauttaaFalse() {
     assertFalse(new Spinni().equals(deffu));
    }
//    
}

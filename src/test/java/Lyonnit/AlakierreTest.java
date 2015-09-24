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
public class AlakierreTest {
    private Alakierre alakierre;
    
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
        this.alakierre = new Alakierre(0.5);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getVastaukset method, of class Alakierre.
     */
    @Test
    public void testGetVastauksetToimii() {
        boolean testi;
        if (!alakierre.getVastaukset().contains(new Alakierre()) || !alakierre.getVastaukset().contains(new Spinni())) {
            testi = false;
        }
        else {
            testi = true;
        }
        assertTrue(testi);
    }

    /**
     * Test of getTodNak method, of class Alakierre.
     *


    /**
     * Test of toString method, of class Alakierre.
     */
    @Test
    public void testToStringPalauttaaTrue() {
       assertEquals("[3] Alakierre", alakierre.toString());
    }
    
    @Test
    public void testToStringPalauttaaFalse() {
        assertFalse("LOL".equals(alakierre.toString()));
    }
    
        @Test
    public void testGetTodNakParametriton() {
        assertEquals(alakierre.getTodNak(), 0.5,0.00001);
    }

    /**
     * Test of equals method, of class Alakierre.
     */
    @Test
    public void testEqualsPalauttaaFalsen() {
    assertFalse(new Blokki().equals(alakierre));

    }
    
    @Test
    public void testEqualsPalauttaaTruen() {
        Alakierre eiParametria = new Alakierre();
        assertTrue(eiParametria.equals(alakierre));
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.ApuLuokat;

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
public class TuomariTest {
    
    private Tuomari tuomari;

    public TuomariTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.tuomari = new Tuomari(new Pelaaja("pelaaja1", true), new Pelaaja("pelaaja2", true));
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void getPelaaja1Toimii()  {
        assertEquals("pelaaja1",tuomari.getPelaaja1().toString());
    }
    
    @Test
    public void getPelaaja2Toimii() {
        assertEquals("pelaaja2",tuomari.getPelaaja2().toString());
    }

    @Test
    public void palautaVastustajaToimiiPelaaja1() {
        assertEquals(tuomari.getVastustaja(tuomari.getPelaaja1()), tuomari.getPelaaja2());
    }

    @Test
    public void palautaVastustajaToimiiPelaaja2() {
        assertEquals(tuomari.getVastustaja(tuomari.getPelaaja2()), tuomari.getPelaaja1());
    }

    @Test
    public void arvoAloittajaToimii() {
        boolean pelaaja1 = false;
        boolean pelaaja2 = false;
        boolean testi;
        for (int i = 0; i < 100; i++) {
            tuomari.arvoAloittaja();
            if (tuomari.getSyottaja().equals(tuomari.getPelaaja1())) {
                pelaaja1 = true;
            }
            if (tuomari.getSyottaja().equals(tuomari.getPelaaja2())) {
                pelaaja2 = true;
            }

        }
        if (pelaaja1 && pelaaja2) {
            testi = true;
        } else {
            testi = false;
        }

        assertTrue(testi);
    }

}

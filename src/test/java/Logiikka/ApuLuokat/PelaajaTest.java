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
public class PelaajaTest {
    
    private Pelaaja ihmisPelaaja;
    private Pelaaja tietokonePelaaja;
    private Tuomari tuomari;

    public PelaajaTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.ihmisPelaaja = new Pelaaja("Ihmispelaaja", true);
        this.tietokonePelaaja = new Pelaaja("Tietokonepelaaja", false);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void pelaajanNimiMeneeOikein() {
        assertEquals("Ihmispelaaja", ihmisPelaaja.toString());
    }

    @Test
    public void onIhmisenOhjaamaPalauttaaTrue() {
        assertTrue(ihmisPelaaja.onkoIhmisenOhjaama());
    }

    @Test
    public void onIhmisenOhjaamaPalauttaaFalse() {
        assertFalse(tietokonePelaaja.onkoIhmisenOhjaama());
    }

    @Test
    public void equalsPalauttaaTrue() {
        assertTrue(ihmisPelaaja.equals(ihmisPelaaja));
    }

    @Test
    public void equalsPalauttaaFalse() {
        assertFalse(ihmisPelaaja.equals(tietokonePelaaja));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.ApuLuokat;

import Lyonnit.Blokki;
import Lyonnit.LyhytSyotto;
import Lyonnit.Lyonti;
import Lyonnit.PitkaSyotto;
import Lyonnit.Spinni;
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
public class PalloRalliTest {

    PalloRalli ralli;

    public PalloRalliTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.ralli = new PalloRalli(new Pelaaja("Ihminen", true), new Pelaaja("Tietokone", false));
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of palloKaynnissa method, of class PalloRalli.
     */
    @Test
    public void testPalloKaynnissaOnAluksiTrue() {
        assertTrue(ralli.palloKaynnissa());
    }

    @Test
    public void testPalloLoppuuToimiiPalloKaynnissaPalauttaaFalse() {
        ralli.palloLoppuu();
        assertFalse(ralli.palloKaynnissa());
    }

    @Test
    public void testPalloAlkaa() {
        ralli.palloLoppuu();
        ralli.palloAlkaa();
        assertTrue(ralli.palloKaynnissa());
    }
//
//    /**
//     * Test of palautaLyoja method, of class PalloRalli.
//     */

    @Test
    public void testSetPelaajanLyontiAsettaaPelaajan1LyonninOikeinJaGetPelaajan1LyontiToimii() {
        ralli.setPelaajanLyonti(new Pelaaja("Ihminen", true), new PitkaSyotto());
        assertEquals(ralli.getPelaajan1Lyonti(), new PitkaSyotto());
    }

    @Test
    public void testSetPelaajanLyontiAsettaaPelaajan2LyonninOikeinJaGetPelaajan2LyontiToimii() {
    ralli.setPelaajanLyonti(new Pelaaja("Tietokone",false), new Spinni());
    assertEquals(ralli.getPelaajan2Lyonti(),new Spinni());
    }
    
    @Test
    public void testSetPelaajanVuoroAsettaaPelaajan1Vuoroon() {
        ralli.pelaajanVuoro(new Pelaaja("Ihminen",true));
        assertTrue(ralli.onkoPelaaja1Vuorossa());
    }
    
    @Test
    public void testSetPelaajanVuoroAsettaaPelaajan2Vuoroon() {
        ralli.pelaajanVuoro(new Pelaaja("Tietokone",false));
        assertTrue(ralli.onkoPelaaja2Vuorossa());
    }

  
//
//    /**
//     * Test of palautaLyonti method, of class PalloRalli.
//     */
    @Test
    public void testPalautaLyontiPelaaja1Lyo() {
      ralli.setPelaajanLyonti(new Pelaaja("Ihminen",true), new Spinni());
      ralli.pelaajanVuoro(new Pelaaja("Tietokone",false));
      assertEquals(new Spinni(),ralli.palautaLyonti());
    }
    
    @Test
    public void testPalautaLyontiPelaaja2Lyo() {
        ralli.setPelaajanLyonti(new Pelaaja("Tietokone",false), new Blokki());
        ralli.pelaajanVuoro(new Pelaaja("Ihminen",true));
        assertEquals(new Blokki(),ralli.palautaLyonti());
    }
//
//    /**
//     * Test of pelaajanVuoro method, of class PalloRalli.
//     */

//
//    /**
//     * Test of palloLoppuu method, of class PalloRalli.
//     */

//
//    /**
//     * Test of palloAlkaa method, of class PalloRalli.
//     */
//    /**
//     * Test of setPelaajanLyonti method, of class PalloRalli.
//     */
//
//    /**
//     * Test of getPelaajan2Lyonti method, of class PalloRalli.
//     */

    @Test
    public void testLyoLyontiParametrinaLyonti() {
     boolean poyta = false;
     boolean ohi = false;
     for (int i = 0; i< 1000; i++) {
         boolean syotto = ralli.lyoLyonti(new LyhytSyotto());
         if (syotto) {
             poyta = true;
         }
         else {
             ohi = true;
         }
         if (poyta && ohi) {
             break;
         }
     }
     boolean testi;
     if (poyta && ohi) {
         testi = true;
     }
     else {
         testi = false;
     }
     assertTrue(testi);
    }
//
//    /**
//     * Test of lyoLyonti method, of class PalloRalli.
//     */
    @Test
    public void testLyoLyontiParametrinaDouble() {
        double todNak = 0.2;
        boolean poyta = false;
        boolean ohi = false;
        for (int i = 0;i < 1000; i++) {
            boolean lyonti = ralli.lyoLyonti(todNak);
            if (lyonti) {
                poyta = true;
            }
            else {
                ohi = true;
            }
            if (poyta && ohi) {
                break;
            }
        }
        boolean testi;
        if (poyta && ohi) {
            testi = true;
        }
        else {
            testi = false;
        }
        assertTrue(testi);
    }
//
//    /**
//     * Test of lyoLyontiSatunnaisesti method, of class PalloRalli.
//     */
    @Test
    public void testLyoLyontiSatunnaisesti() {
       boolean poyta = false;
       boolean ohi = false;
       
       for (int i = 0; i< 1000; i++) {
           boolean jabra = ralli.lyoLyontiSatunnaisesti(new Spinni().getVastaukset());
           if (jabra) {
               poyta = true;
           }
           else {
               ohi = true;
           }
           if (poyta && ohi) {
               break;
           }
       }
       boolean testi;
       if (poyta && ohi) {
           testi = true;
       }
       else {
           testi = false;
       }
       assertTrue(testi);
    }
    
}

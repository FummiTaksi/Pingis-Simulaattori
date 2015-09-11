/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.ApuLuokat;

import Lyonnit.Lyonti;
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of palloKaynnissa method, of class PalloRalli.
     */
    @Test
    public void testPalloKaynnissa() {
        System.out.println("palloKaynnissa");
        PalloRalli instance = null;
        boolean expResult = false;
        boolean result = instance.palloKaynnissa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of palautaLyoja method, of class PalloRalli.
     */
    @Test
    public void testPalautaLyoja() {
        System.out.println("palautaLyoja");
        PalloRalli instance = null;
        Pelaaja expResult = null;
        Pelaaja result = instance.palautaLyoja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of palautaLyonti method, of class PalloRalli.
     */
    @Test
    public void testPalautaLyonti() {
        System.out.println("palautaLyonti");
        PalloRalli instance = null;
        Lyonti expResult = null;
        Lyonti result = instance.palautaLyonti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pelaajanVuoro method, of class PalloRalli.
     */
    @Test
    public void testPelaajanVuoro() {
        System.out.println("pelaajanVuoro");
        Pelaaja pelaaja = null;
        PalloRalli instance = null;
        instance.pelaajanVuoro(pelaaja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of palloLoppuu method, of class PalloRalli.
     */
    @Test
    public void testPalloLoppuu() {
        System.out.println("palloLoppuu");
        PalloRalli instance = null;
        instance.palloLoppuu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of palloAlkaa method, of class PalloRalli.
     */
    @Test
    public void testPalloAlkaa() {
        System.out.println("palloAlkaa");
        PalloRalli instance = null;
        instance.palloAlkaa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPelaajanLyonti method, of class PalloRalli.
     */
    @Test
    public void testSetPelaajanLyonti() {
        System.out.println("setPelaajanLyonti");
        Pelaaja pelaaja = null;
        Lyonti lyonti = null;
        PalloRalli instance = null;
        instance.setPelaajanLyonti(pelaaja, lyonti);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPelaajan2Lyonti method, of class PalloRalli.
     */
    @Test
    public void testGetPelaajan2Lyonti() {
        System.out.println("getPelaajan2Lyonti");
        PalloRalli instance = null;
        Lyonti expResult = null;
        Lyonti result = instance.getPelaajan2Lyonti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPelaajan1Lyonti method, of class PalloRalli.
     */
    @Test
    public void testGetPelaajan1Lyonti() {
        System.out.println("getPelaajan1Lyonti");
        PalloRalli instance = null;
        Lyonti expResult = null;
        Lyonti result = instance.getPelaajan1Lyonti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onkoPelaaja1Vuorossa method, of class PalloRalli.
     */
    @Test
    public void testOnkoPelaaja1Vuorossa() {
        System.out.println("onkoPelaaja1Vuorossa");
        PalloRalli instance = null;
        boolean expResult = false;
        boolean result = instance.onkoPelaaja1Vuorossa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onkoPelaaja2Vuorossa method, of class PalloRalli.
     */
    @Test
    public void testOnkoPelaaja2Vuorossa() {
        System.out.println("onkoPelaaja2Vuorossa");
        PalloRalli instance = null;
        boolean expResult = false;
        boolean result = instance.onkoPelaaja2Vuorossa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lyoLyonti method, of class PalloRalli.
     */
    @Test
    public void testLyoLyonti_Lyonti() {
        System.out.println("lyoLyonti");
        Lyonti lyonti = null;
        PalloRalli instance = null;
        boolean expResult = false;
        boolean result = instance.lyoLyonti(lyonti);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lyoLyonti method, of class PalloRalli.
     */
    @Test
    public void testLyoLyonti_double() {
        System.out.println("lyoLyonti");
        double todnak = 0.0;
        PalloRalli instance = null;
        boolean expResult = false;
        boolean result = instance.lyoLyonti(todnak);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lyoLyontiSatunnaisesti method, of class PalloRalli.
     */
    @Test
    public void testLyoLyontiSatunnaisesti() {
        System.out.println("lyoLyontiSatunnaisesti");
        ArrayList<Lyonti> lyonnit = null;
        PalloRalli instance = null;
        boolean expResult = false;
        boolean result = instance.lyoLyontiSatunnaisesti(lyonnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

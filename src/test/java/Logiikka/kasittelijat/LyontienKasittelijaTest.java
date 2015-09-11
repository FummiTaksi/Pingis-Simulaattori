/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.kasittelijat;

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
public class LyontienKasittelijaTest {
    
    public LyontienKasittelijaTest() {
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
     * Test of lisaaLyontiListaan method, of class LyontienKasittelija.
     */
    @Test
    public void testLisaaLyontiListaan() {
        System.out.println("lisaaLyontiListaan");
        Lyonti lyonti = null;
        LyontienKasittelija instance = new LyontienKasittelija();
        instance.lisaaLyontiListaan(lyonti);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tyhjennaLista method, of class LyontienKasittelija.
     */
    @Test
    public void testTyhjennaLista() {
        System.out.println("tyhjennaLista");
        LyontienKasittelija instance = new LyontienKasittelija();
        instance.tyhjennaLista();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arvoLyonti method, of class LyontienKasittelija.
     */
    @Test
    public void testArvoLyonti_ArrayList() {
        System.out.println("arvoLyonti");
        ArrayList<Lyonti> lyonteja = null;
        LyontienKasittelija instance = new LyontienKasittelija();
        Lyonti expResult = null;
        Lyonti result = instance.arvoLyonti(lyonteja);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arvoLyonti method, of class LyontienKasittelija.
     */
    @Test
    public void testArvoLyonti_0args() {
        System.out.println("arvoLyonti");
        LyontienKasittelija instance = new LyontienKasittelija();
        Lyonti expResult = null;
        Lyonti result = instance.arvoLyonti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

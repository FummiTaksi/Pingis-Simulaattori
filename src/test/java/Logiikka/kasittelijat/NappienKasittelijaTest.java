/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.kasittelijat;

import Logiikka.ApuLuokat.Nappi;
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
public class NappienKasittelijaTest {
    
    public NappienKasittelijaTest() {
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
     * Test of lisaaNappiListaan method, of class NappienKasittelija.
     */
    @Test
    public void testLisaaNappiListaan() {
        System.out.println("lisaaNappiListaan");
        Lyonti lyonti = null;
        NappienKasittelija instance = new NappienKasittelija();
        instance.lisaaNappiListaan(lyonti);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisaaKaikkiNapitListaan method, of class NappienKasittelija.
     */
    @Test
    public void testLisaaKaikkiNapitListaan() {
        System.out.println("lisaaKaikkiNapitListaan");
        NappienKasittelija instance = new NappienKasittelija();
        instance.lisaaKaikkiNapitListaan();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOK method, of class NappienKasittelija.
     */
    @Test
    public void testGetOK() {
        System.out.println("getOK");
        NappienKasittelija instance = new NappienKasittelija();
        Nappi expResult = null;
        Nappi result = instance.getOK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onkoNappiPaalla method, of class NappienKasittelija.
     */
    @Test
    public void testOnkoNappiPaalla() {
        System.out.println("onkoNappiPaalla");
        Nappi nappi = null;
        NappienKasittelija instance = new NappienKasittelija();
        boolean expResult = false;
        boolean result = instance.onkoNappiPaalla(nappi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLyhytSyotto method, of class NappienKasittelija.
     */
    @Test
    public void testGetLyhytSyotto() {
        System.out.println("getLyhytSyotto");
        NappienKasittelija instance = new NappienKasittelija();
        Nappi expResult = null;
        Nappi result = instance.getLyhytSyotto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPitkaSyotto method, of class NappienKasittelija.
     */
    @Test
    public void testGetPitkaSyotto() {
        System.out.println("getPitkaSyotto");
        NappienKasittelija instance = new NappienKasittelija();
        Nappi expResult = null;
        Nappi result = instance.getPitkaSyotto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlakierre method, of class NappienKasittelija.
     */
    @Test
    public void testGetAlakierre() {
        System.out.println("getAlakierre");
        NappienKasittelija instance = new NappienKasittelija();
        Nappi expResult = null;
        Nappi result = instance.getAlakierre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeffu method, of class NappienKasittelija.
     */
    @Test
    public void testGetDeffu() {
        System.out.println("getDeffu");
        NappienKasittelija instance = new NappienKasittelija();
        Nappi expResult = null;
        Nappi result = instance.getDeffu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBlokki method, of class NappienKasittelija.
     */
    @Test
    public void testGetBlokki() {
        System.out.println("getBlokki");
        NappienKasittelija instance = new NappienKasittelija();
        Nappi expResult = null;
        Nappi result = instance.getBlokki();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpinni method, of class NappienKasittelija.
     */
    @Test
    public void testGetSpinni() {
        System.out.println("getSpinni");
        NappienKasittelija instance = new NappienKasittelija();
        Nappi expResult = null;
        Nappi result = instance.getSpinni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNapit method, of class NappienKasittelija.
     */
    @Test
    public void testGetNapit() {
        System.out.println("getNapit");
        NappienKasittelija instance = new NappienKasittelija();
        ArrayList<Nappi> expResult = null;
        ArrayList<Nappi> result = instance.getNapit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisaaPaallaOlevaksi method, of class NappienKasittelija.
     */
    @Test
    public void testLisaaPaallaOlevaksi() {
        System.out.println("lisaaPaallaOlevaksi");
        Nappi nappi = null;
        NappienKasittelija instance = new NappienKasittelija();
        instance.lisaaPaallaOlevaksi(nappi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tyhjennaPaallaOlevienLista method, of class NappienKasittelija.
     */
    @Test
    public void testTyhjennaPaallaOlevienLista() {
        System.out.println("tyhjennaPaallaOlevienLista");
        NappienKasittelija instance = new NappienKasittelija();
        instance.tyhjennaPaallaOlevienLista();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kaikkiMuutNapitFalseksi method, of class NappienKasittelija.
     */
    @Test
    public void testKaikkiMuutNapitFalseksi_0args() {
        System.out.println("kaikkiMuutNapitFalseksi");
        NappienKasittelija instance = new NappienKasittelija();
        instance.kaikkiMuutNapitFalseksi();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kaikkiMuutNapitFalseksi method, of class NappienKasittelija.
     */
    @Test
    public void testKaikkiMuutNapitFalseksi_Nappi() {
        System.out.println("kaikkiMuutNapitFalseksi");
        Nappi nimi = null;
        NappienKasittelija instance = new NappienKasittelija();
        instance.kaikkiMuutNapitFalseksi(nimi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asetaFalseksi method, of class NappienKasittelija.
     */
    @Test
    public void testAsetaFalseksi() {
        System.out.println("asetaFalseksi");
        Nappi falseNappi = null;
        NappienKasittelija instance = new NappienKasittelija();
        instance.asetaFalseksi(falseNappi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

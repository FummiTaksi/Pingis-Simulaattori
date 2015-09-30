/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

import Logiikka.ApuLuokat.PalloRalli;
import Logiikka.ApuLuokat.Pelaaja;
import Logiikka.ApuLuokat.Pelialusta;
import Logiikka.ApuLuokat.Tuomari;
import Logiikka.kasittelijat.NappienKasittelija;
import Lyonnit.Lyonti;
import javax.swing.JLabel;
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
public class LogiikkaTest {

    private Logiikka logiikka;

    public LogiikkaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Pelaaja ihminen1 = new Pelaaja("Ihminen", true);
        Pelaaja tietokone2 = new Pelaaja("Tietokone", false);
        PalloRalli ralli = new PalloRalli(ihminen1, tietokone2);
        Tuomari tuomari = new Tuomari(ihminen1, tietokone2);
        NappienKasittelija nk = new NappienKasittelija();
        JLabel selostus = new JLabel("SELOSTUS");
        JLabel tuloskentta = new JLabel("TULOSKENTTÄ");
        Pelialusta alusta = new Pelialusta(selostus,tuloskentta);
//        this.logiikka = new Logiikka(tuomari,ralli,nk,alusta);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getPalloRalli method, of class Logiikka.
     */
    @Test
    public void testGetPalloRalli() {
        
    }
    /**
     * Test of lyontiMeneePoytaan method, of class Logiikka.
     */
    @Test
    public void testLyontiMeneePoytaan() {
       
    }
//
//    /**
//     * Test of asetaNapit method, of class Logiikka.
//     */
    @Test
    public void testAsetaNapit() {
       
    }
//
//    /**
//     * Test of asetaNapitLyhyestaSyotosta method, of class Logiikka.
//     */
//    @Test
//    public void testAsetaNapitLyhyestaSyotosta() {
//        System.out.println("asetaNapitLyhyestaSyotosta");
//        Logiikka instance = null;
//        instance.asetaNapitLyhyestaSyotosta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of asetaNapitPitkastaSyotosta method, of class Logiikka.
//     */
//    @Test
//    public void testAsetaNapitPitkastaSyotosta() {
//        System.out.println("asetaNapitPitkastaSyotosta");
//        Logiikka instance = null;
//        instance.asetaNapitPitkastaSyotosta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of asetaNapitBlokista method, of class Logiikka.
//     */
//    @Test
//    public void testAsetaNapitBlokista() {
//        System.out.println("asetaNapitBlokista");
//        Logiikka instance = null;
//        instance.asetaNapitBlokista();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of asetaNapitDeffusta method, of class Logiikka.
//     */
//    @Test
//    public void testAsetaNapitDeffusta() {
//        System.out.println("asetaNapitDeffusta");
//        Logiikka instance = null;
//        instance.asetaNapitDeffusta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of asetaNapitSpinnista method, of class Logiikka.
//     */
//    @Test
//    public void testAsetaNapitSpinnista() {
//        System.out.println("asetaNapitSpinnista");
//        Logiikka instance = null;
//        instance.asetaNapitSpinnista();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of asetaNapitAlakierteesta method, of class Logiikka.
//     */
//    @Test
//    public void testAsetaNapitAlakierteesta() {
//        System.out.println("asetaNapitAlakierteesta");
//        Logiikka instance = null;
//        instance.asetaNapitAlakierteesta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of lyontiEiMenePoytaan method, of class Logiikka.
//     */
//    @Test
//    public void testLyontiEiMenePoytaan() {
//        System.out.println("lyontiEiMenePoytaan");
//        String uusiSelostus = "";
//        Pelaaja pelaaja = null;
//        Logiikka instance = null;
//        instance.lyontiEiMenePoytaan(uusiSelostus, pelaaja);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of lyoLyonti method, of class Logiikka.
//     */
//    @Test
//    public void testLyoLyonti() {
//        System.out.println("lyoLyonti");
//        Lyonti lyonti = null;
//        String voitto = "";
//        String havio = "";
//        Pelaaja pelaaja = null;
//        Logiikka instance = null;
//        instance.lyoLyonti(lyonti, voitto, havio, pelaaja);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}

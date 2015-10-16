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
import Logiikka.kasittelijat.LyontienKasittelija;
import Logiikka.kasittelijat.NappienKasittelija;
import Lyonnit.Blokki;
import Lyonnit.LyhytSyotto;
import Lyonnit.Lyonti;
import Lyonnit.PitkaSyotto;
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
public class TekoalynLogiikkaTest {

    private TekoalynLogiikka logiikka;

    public TekoalynLogiikkaTest() {
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
        Pelialusta alusta = new Pelialusta(selostus, tuloskentta);
        LyontienKasittelija lk = new LyontienKasittelija();
        this.logiikka = new TekoalynLogiikka(tuomari, nk, ralli, alusta, lk, tietokone2);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of tekoalySyottaa method, of class TekoalynLogiikka.
     */
    @Test
    public void testTekoalySyottaaPitkanSyoton() {
        logiikka.tekoalySyottaaPitkanSyoton();
        assertTrue(logiikka.getAlusta().getSelostus().equals("Vastustajasi syötti pitkän syötön")
                || logiikka.getAlusta().getSelostus().equals("Vastustajasi syöttää yli."));
    }

    @Test
    public void testTekoalySyottaaLyhyenSyoton() {
        logiikka.tekoalySyottaaLyhyenSyoton();
        assertTrue(logiikka.getAlusta().getSelostus().equals("Vastustajasi syötti lyhyen syötön.")
                || logiikka.getAlusta().getSelostus().equals("Vastustajasi syöttää verkkoon"));
    }

    @Test
    public void testTekoalySyottaa() {
        logiikka.tekoalySyottaa();
        assertTrue(logiikka.getPalloRalli().getPelaajan2Lyonti() != null
                && (logiikka.getPalloRalli().getPelaajan2Lyonti().equals(new PitkaSyotto())
                || logiikka.getPalloRalli().getPelaajan2Lyonti().equals(new LyhytSyotto()))
                || logiikka.getTuomari().palautaJohtaja().equals(logiikka.getTuomari().getPelaaja1()));
    }

    @Test
    public void testTekoalyBlokkaa() {
        logiikka.tekoalyBlokkaa();
        assertTrue(logiikka.getAlusta().getSelostus().equals("Vastustaja blokkasi kiskaisusi!")
                || logiikka.getAlusta().getSelostus().equals("Vastustajallasi ei ole mahdollisuuttakaan palauttaa pommiasi!"));
    }
//
//    /**
//     * Test of tekoalyVastaaLyhyeenSyottoon method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyVastaaLyhyeenSyottoon() {
//        System.out.println("tekoalyVastaaLyhyeenSyottoon");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyVastaaLyhyeenSyottoon();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyVastaaPitkaanSyottoon method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyVastaaPitkaanSyottoon() {
//        System.out.println("tekoalyVastaaPitkaanSyottoon");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyVastaaPitkaanSyottoon();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyVastaaBlokkiin method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyVastaaBlokkiin() {
//        System.out.println("tekoalyVastaaBlokkiin");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyVastaaBlokkiin();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyVastaaAlakierteeseen method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyVastaaAlakierteeseen() {
//        System.out.println("tekoalyVastaaAlakierteeseen");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyVastaaAlakierteeseen();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyVastaaDeffuun method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyVastaaDeffuun() {
//        System.out.println("tekoalyVastaaDeffuun");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyVastaaDeffuun();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyVastaaSpinniin method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyVastaaSpinniin() {
//        System.out.println("tekoalyVastaaSpinniin");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyVastaaSpinniin();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyVastaaLyontiin method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyVastaaLyontiin() {
//        System.out.println("tekoalyVastaaLyontiin");
//        Lyonti lyonti = null;
//        TekoalynLogiikka instance = null;
//        instance.tekoalyVastaaLyontiin(lyonti);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalySyottaaLyhyenSyoton method, of class TekoalynLogiikka.
//     */

//
//    /**
//     * Test of tekoalySyottaaPitkanSyoton method, of class TekoalynLogiikka.
//     */
//
//    /**
//     * Test of tekoalyBlokkaa method, of class TekoalynLogiikka.
//     */
//
//    /**
//     * Test of tekoalyPelaaAlakierteenPitkastaSyotosta method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyPelaaAlakierteenPitkastaSyotosta() {
//        System.out.println("tekoalyPelaaAlakierteenPitkastaSyotosta");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyPelaaAlakierteenPitkastaSyotosta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyPelaaAlakierteenLyhyestaSyotosta method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyPelaaAlakierteenLyhyestaSyotosta() {
//        System.out.println("tekoalyPelaaAlakierteenLyhyestaSyotosta");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyPelaaAlakierteenLyhyestaSyotosta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyPelaaAlakierteenAlakierteesta method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyPelaaAlakierteenAlakierteesta() {
//        System.out.println("tekoalyPelaaAlakierteenAlakierteesta");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyPelaaAlakierteenAlakierteesta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyPelaaAlakierteenDeffusta method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyPelaaAlakierteenDeffusta() {
//        System.out.println("tekoalyPelaaAlakierteenDeffusta");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyPelaaAlakierteenDeffusta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyPelaaDeffunBlokista method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyPelaaDeffunBlokista() {
//        System.out.println("tekoalyPelaaDeffunBlokista");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyPelaaDeffunBlokista();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyPelaaDeffunSpinnista method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyPelaaDeffunSpinnista() {
//        System.out.println("tekoalyPelaaDeffunSpinnista");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyPelaaDeffunSpinnista();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyPelaaSpinninPitkastaSyotosta method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyPelaaSpinninPitkastaSyotosta() {
//        System.out.println("tekoalyPelaaSpinninPitkastaSyotosta");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyPelaaSpinninPitkastaSyotosta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyPelaaSpinninDeffusta method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyPelaaSpinninDeffusta() {
//        System.out.println("tekoalyPelaaSpinninDeffusta");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyPelaaSpinninDeffusta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyPelaaSpinninAlakierteesta method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyPelaaSpinninAlakierteesta() {
//        System.out.println("tekoalyPelaaSpinninAlakierteesta");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyPelaaSpinninAlakierteesta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyPelaaSpinninBlokista method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyPelaaSpinninBlokista() {
//        System.out.println("tekoalyPelaaSpinninBlokista");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyPelaaSpinninBlokista();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tekoalyPelaaVastaSpinnin method, of class TekoalynLogiikka.
//     */
//    @Test
//    public void testTekoalyPelaaVastaSpinnin() {
//        System.out.println("tekoalyPelaaVastaSpinnin");
//        TekoalynLogiikka instance = null;
//        instance.tekoalyPelaaVastaSpinnin();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}

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
import Lyonnit.Alakierre;
import Lyonnit.Blokki;
import Lyonnit.LyhytSyotto;
import Lyonnit.Lyonti;
import Lyonnit.PitkaSyotto;
import Lyonnit.Spinni;
import java.util.ArrayList;
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
public class PelaajanLogiikkaTest {

    private PelaajanLogiikka logiikka;

    public PelaajanLogiikkaTest() {
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
        this.logiikka = new PelaajanLogiikka(tuomari, nk, ralli, alusta, ihminen1);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getPalloRalli method, of class PelaajanLogiikka. //
     */
    @Test
    public void testGetPalloRalli() {
        assertTrue(logiikka.getPalloRalli() != null);
    }
//
//    /**
//     * Test of asetaVastustajanLyonti method, of class PelaajanLogiikka.
//     */

    @Test
    public void testAsetaVastustajanLyonti() {
        logiikka.asetaVastustajanLyonti();
        assertTrue(logiikka.getPalloRalli().onkoPelaaja2Vuorossa());
    }
//
//    /**
//     * Test of lyhytSyotto method, of class PelaajanLogiikka.
//     */

    @Test
    public void testLyhytSyotto() {
        logiikka.lyhytSyotto();
        assertTrue(logiikka.getPalloRalli().getPelaajan1Lyonti() != null
                || !logiikka.getPalloRalli().palloKaynnissa());
    }
//
//    /**
//     * Test of pitkaSyotto method, of class PelaajanLogiikka.
//     */

    @Test
    public void testPitkaSyotto() {

        logiikka.pitkaSyotto();
        assertTrue(logiikka.getPalloRalli().getPelaajan1Lyonti() != null
                || !logiikka.getPalloRalli().palloKaynnissa());
    }
////
////    /**
////     * Test of blokki method, of class PelaajanLogiikka.
////     */

    @Test
    public void testBlokki() {
        logiikka.blokki();
        assertTrue(logiikka.getPalloRalli().getPelaajan1Lyonti() != null
                || !logiikka.getPalloRalli().palloKaynnissa());
    }
////
////    /**
////     * Test of deffuBlokista method, of class PelaajanLogiikka.
////     */

    @Test
    public void testDeffuBlokista() {
        logiikka.deffuBlokista();
        assertTrue(logiikka.getAlusta().getSelostus().equals("Deffasit pöytään.")
                || logiikka.getAlusta().getSelostus().equals("Kompastuit jalkoihisi"));
    }
//
//    /**
//     * Test of deffuSpinnista method, of class PelaajanLogiikka.
//     */

    @Test
    public void testDeffuSpinnista() {
        logiikka.deffuSpinnista();
        assertTrue(logiikka.getAlusta().getSelostus().equals("Deffasit vastustajan lämärin.")
                || logiikka.getAlusta().getSelostus().equals("Vastustaja pommitti läpi!!"));
    }
//
//    /**
//     * Test of deffu method, of class PelaajanLogiikka.
//     */

    @Test
    public void testDeffu() {
        ArrayList<Lyonti> lyonnit = new ArrayList();
        lyonnit.add(new Spinni());
        lyonnit.add(new Blokki());
        for (Lyonti lyonti : lyonnit) {
            logiikka.getPalloRalli().palloAlkaa();
            logiikka.getPalloRalli().setPelaajan2Lyonti(lyonti);
            logiikka.getPalloRalli().pelaajan1Vuoro();
            logiikka.deffu();
            assertTrue(logiikka.getPalloRalli().getPelaajan1Lyonti() != null
                    || !logiikka.getPalloRalli().palloKaynnissa());
        }

    }
//
//    /**
//     * Test of alakierre method, of class PelaajanLogiikka.
//     */

    @Test
    public void testAlakierre() {
        ArrayList<Lyonti> lyonnit = new ArrayList();
        lyonnit.add(new LyhytSyotto());
        lyonnit.add(new Alakierre());
        for (Lyonti lyonti : lyonnit) {
            logiikka.getPalloRalli().palloAlkaa();
            logiikka.getPalloRalli().setPelaajan2Lyonti(lyonti);
            logiikka.getPalloRalli().pelaajan1Vuoro();
            logiikka.alakierre();
            assertTrue(logiikka.getPalloRalli().getPelaajan1Lyonti() != null
                    || !logiikka.getPalloRalli().palloKaynnissa());
        }
    }
//
//    /**
//     * Test of spinniPitkastaSyotosta method, of class PelaajanLogiikka.
//     */

    @Test
    public void testSpinniPitkastaSyotosta() {
        logiikka.spinniPitkastaSyotosta();
        assertTrue(logiikka.getAlusta().getSelostus().equals("Löit spinnin pöytään vastustajan syötöstä")
                || logiikka.getAlusta().getSelostus().equals("Et osunut palloon!"));
    }
//
//    /**
//     * Test of spinniDeffusta method, of class PelaajanLogiikka.
//     */
//    @Test
//    public void testSpinniDeffusta() {
//        System.out.println("spinniDeffusta");
//        PelaajanLogiikka instance = null;
//        instance.spinniDeffusta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of spinniAlakierteesta method, of class PelaajanLogiikka.
//     */
//    @Test
//    public void testSpinniAlakierteesta() {
//        System.out.println("spinniAlakierteesta");
//        PelaajanLogiikka instance = null;
//        instance.spinniAlakierteesta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of spinniBlokista method, of class PelaajanLogiikka.
//     */
//    @Test
//    public void testSpinniBlokista() {
//        System.out.println("spinniBlokista");
//        PelaajanLogiikka instance = null;
//        instance.spinniBlokista();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of vastaSpinni method, of class PelaajanLogiikka.
//     */
//    @Test
//    public void testVastaSpinni() {
//        System.out.println("vastaSpinni");
//        PelaajanLogiikka instance = null;
//        instance.vastaSpinni();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of spinni method, of class PelaajanLogiikka.
//     */
//    @Test
//    public void testSpinni() {
//        System.out.println("spinni");
//        PelaajanLogiikka instance = null;
//        instance.spinni();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}

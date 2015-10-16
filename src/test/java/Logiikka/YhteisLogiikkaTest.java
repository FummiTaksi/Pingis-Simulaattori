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
import Lyonnit.LyhytSyotto;
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
public class YhteisLogiikkaTest {

    private YhteisLogiikka logiikka;

    public YhteisLogiikkaTest() {
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
        this.logiikka = new YhteisLogiikka(tuomari, nk, ralli, alusta);
        LyontienKasittelija lk = new LyontienKasittelija();
        TekoalynLogiikka tekoaly = new TekoalynLogiikka(tuomari, nk, ralli, alusta, lk, tietokone2);
        logiikka.setTekoalynLogiikka2(tekoaly);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setTekoalynLogiikka1 method, of class YhteisLogiikka.
     */
//    @Test
//    public void testSetTekoalynLogiikka1() {
//        System.out.println("setTekoalynLogiikka1");
//        TekoalynLogiikka logiikka = null;
//        YhteisLogiikka instance = null;
//        instance.setTekoalynLogiikka1(logiikka);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTekoalynLogiikka2 method, of class YhteisLogiikka.
//     */
//    @Test
//    public void testSetTekoalynLogiikka2() {
//        System.out.println("setTekoalynLogiikka2");
//        TekoalynLogiikka logiikka = null;
//        YhteisLogiikka instance = null;
//        instance.setTekoalynLogiikka2(logiikka);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of syotonAlustus method, of class YhteisLogiikka.
//     */
    @Test
    public void testSyotonAlustus() {
        logiikka.syotonAlustus();
        String alustus1 = logiikka.getAlusta().getSelostus();
        logiikka.getTuomari().lisaaPelaajallePiste(logiikka.getTuomari().getPelaaja1());
        logiikka.syotonAlustus();
        String alustus2 = logiikka.getAlusta().getSelostus();
        if (alustus1.equals("Sinun syöttövuorosi")) {
            assertTrue(alustus2.equals("Vastustajan syöttövuoro."));
        } else if (alustus1.equals("Vastustajan syöttövuoro.")) {
            assertTrue(alustus2.equals("Sinun syöttövuorosi"));
        } else {
            assertTrue(false);
        }
    }
//
//    /**
//     * Test of palloAlkaa method, of class YhteisLogiikka.
//     */

    @Test
    public void testPalloAlkaa() {
        for (int i = 0; i < 100; i++) {
            logiikka.getTuomari().aloitaUusiPeli();
            if (logiikka.getTuomari().getSyottaja().equals(logiikka.getTuomari().getPelaaja1())) {
                logiikka.palloAlkaa();
                assertTrue(logiikka.getAlusta().getSelostus().equals("Sinun syöttövuorosi.Valitse joko pitkä tai lyhyt syöttö."));
            } else {
                logiikka.palloAlkaa();
                assertTrue(logiikka.getTekoalynLogiikka2().getLyontienKasittelija().getLyonnit().contains(new PitkaSyotto())
                        && logiikka.getTekoalynLogiikka2().getLyontienKasittelija().getLyonnit().contains(new LyhytSyotto()));
            }
        }
    }
//
//    /**
//     * Test of peliLoppuu method, of class YhteisLogiikka.
//     */
    @Test
    public void testPeliLoppuuKayttajaVoittaa() {
      logiikka.peliLoppuu(logiikka.getTuomari().getPelaaja1());
      assertTrue(logiikka.getAlusta().getSelostus().equals("Ihminen voitti! Onnittelut!"));
    }
      
     @Test
     public void testPeliLoppuuTietokoneVoittaa() {
         logiikka.peliLoppuu(logiikka.getTuomari().getPelaaja2());
         assertTrue(logiikka.getAlusta().getSelostus().equals("Tietokone voitti! Parempi onni ensi kerralla."));
     }
//
//    /**
//     * Test of kunPainetaanOK method, of class YhteisLogiikka.
//     */
//    @Test
//    public void testKunPainetaanOK() {
//        System.out.println("kunPainetaanOK");
//        YhteisLogiikka instance = null;
//        instance.kunPainetaanOK();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}

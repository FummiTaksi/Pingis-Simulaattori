/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.kasittelijat;

import Lyonnit.Alakierre;
import Lyonnit.Blokki;
import Lyonnit.Deffu;
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
public class LyontienKasittelijaTest {

    LyontienKasittelija lk;

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
        this.lk = new LyontienKasittelija();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of lisaaLyontiListaan method, of class LyontienKasittelija.
     */
    @Test
    public void testLisaaLyontiListaan() {
        Spinni spinni = new Spinni();
        lk.lisaaLyontiListaan(spinni);
        boolean testi;
        if (lk.getLyonnit().contains(spinni)) {
            testi = true;
        } else {
            testi = false;
        }
        assertTrue(testi);
    }

    @Test
    public void lisaaKaikkiLyonnitListaan() {
        lk.lisaaKaikkiLyonnitListaan();
        boolean testi = true;
        if (!lk.getLyonnit().contains(new LyhytSyotto()) || !lk.getLyonnit().contains(new PitkaSyotto()) || !lk.getLyonnit().contains(new Alakierre()) || !lk.getLyonnit().contains(new Deffu()) || !lk.getLyonnit().contains(new Blokki()) || !lk.getLyonnit().contains(new Spinni())) {
            testi = false;
        }
        assertTrue(testi);
    }
//
//    /**
//     * Test of tyhjennaLista method, of class LyontienKasittelija.
//     */

    @Test
    public void testTyhjennaLista() {
        Spinni spinni = new Spinni();
        lk.lisaaLyontiListaan(spinni);
        lk.tyhjennaLista();
        boolean testi;
        if (lk.getLyonnit().isEmpty()) {
            testi = true;
        } else {
            testi = false;
        }
        assertTrue(testi);
    }
//
//    /**
//     * Test of arvoLyonti method, of class LyontienKasittelija.
//     */

    @Test
    public void testArvoLyontiParametrilla() {
        Spinni spinni = new Spinni();
        boolean spinni2 = false;
        boolean blokki = false;
        boolean deffu = false;
        boolean testi;
        for (int i = 0; i < 1000; i++) {
            Lyonti arvottu = lk.arvoLyonti(spinni.getVastaukset());
            if (arvottu.equals(spinni)) {
                spinni2 = true;
            }
            if (arvottu.equals(new Blokki())) {
                blokki = true;
            }
            if (arvottu.equals(new Deffu())) {
                deffu = true;
            }
            if (spinni2 && blokki && deffu) {
                break;
            }
        }
        if (spinni2 && blokki && deffu) {
            testi = true;
        } else {
            testi = false;
        }
        assertTrue(testi);
    }
//
//    /**
//     * Test of arvoLyonti method, of class LyontienKasittelija.
//     */

    @Test
    public void testArvoLyontiIlmanParametria() {
        lk.lisaaKaikkiLyonnitListaan();
        boolean lyhyt = false;
        boolean pitka = false;
        boolean alakierre = false;
        boolean deffu = false;
        boolean blokki = false;
        boolean spinni = false;
        boolean testi;
        for (int i = 0; i < 1000; i++) {
            Lyonti arvottu = lk.arvoLyonti();
            if (arvottu.equals(new LyhytSyotto())) {
                lyhyt = true;
            }
            if (arvottu.equals(new PitkaSyotto())) {
                pitka = true;
            }
            if (arvottu.equals(new Alakierre())) {
                alakierre = true;
            }
            if (arvottu.equals(new Deffu())) {
                deffu = true;
            }
            if (arvottu.equals(new Blokki())) {
                blokki = true;
            }
            if (arvottu.equals(new Spinni())) {
                spinni = true;
            }
            if (lyhyt && pitka && alakierre && deffu && blokki && spinni) {
                break;
            }

        }
        if (lyhyt && pitka && alakierre && deffu && blokki && spinni) {
            testi = true;
        } else {
            testi = false;
            assertTrue(testi);
        }

    }
//    
}

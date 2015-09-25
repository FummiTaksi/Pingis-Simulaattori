/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.kasittelijat;

import Logiikka.ApuLuokat.Nappi;
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
public class NappienKasittelijaTest {
    private NappienKasittelija nk;
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
        this.nk = new NappienKasittelija();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of lisaaNappiListaan method, of class NappienKasittelija.
     */
    @Test
    public void testLisaaNappiListaan() {
     nk.getNapit().clear();
     nk.lisaaNappiListaan(new LyhytSyotto());
     assertTrue(nk.getNapit().contains(new Nappi(new LyhytSyotto())));
    }
//
//    /**
//     * Test of lisaaKaikkiNapitListaan method, of class NappienKasittelija.
//     */
    @Test
    public void testLisaaKaikkiNapitListaan() {
     boolean ok = false;
     boolean lyhyt = false;
     boolean pitka = false;
     boolean alakierre = false;
     boolean deffu  = false;
     boolean blokki = false;
     boolean spinni = false;
     for (Nappi nappi : nk.getNapit()) {
         if (nappi.equals(new Nappi("[ENTER] OK"))) {
             ok = true;
         }
         if (nappi.equals(new Nappi(new LyhytSyotto()))) {
             lyhyt = true;
         }
         if (nappi.equals(new Nappi(new PitkaSyotto()))) {
             pitka = true;
         }
         if (nappi.equals(new Nappi(new Alakierre()))) {
             alakierre = true;
         }
         if (nappi.equals(new Nappi(new Deffu()))) {
             deffu = true;
         }
         if (nappi.equals(new Nappi(new Blokki()))) {
             blokki = true;
         }
         if (nappi.equals(new Nappi(new Spinni()))) {
             spinni = true;
         }
     }
     boolean testi;
     if (ok && lyhyt && pitka  && alakierre && deffu && blokki && spinni) {
         testi = true;
     }
     else {
         testi = false;
     }
     assertTrue(testi);
    }
//
//    /**
//     * Test of getOK method, of class NappienKasittelija.
//     */
    @Test
    public void testGetOK() {
    assertEquals(new Nappi("[ENTER] OK"), nk.getOK());
    }
//
//    /**
//     * Test of onkoNappiPaalla method, of class NappienKasittelija.
//     */
    @Test
    public void testOnkoNappiPaallaPalauttaaTrue() {
    nk.getOK().getButton().setEnabled(true);
    assertTrue(nk.onkoNappiPaalla(nk.getOK()));
    }
    
    @Test
    public void testOnkoNappiPaallaPalauttaaFalse() {
        nk.getOK().getButton().setEnabled(false);
        assertFalse(nk.onkoNappiPaalla(nk.getOK()));
    }
//
//    /**
//     * Test of getLyhytSyotto method, of class NappienKasittelija.
//     */
    @Test
    public void testGetLyhytSyotto() {
       assertEquals(new Nappi(new LyhytSyotto()),nk.getLyhytSyotto());
    }
    
//
//    /**
//     * Test of getPitkaSyotto method, of class NappienKasittelija.
//     */
    @Test
    public void testGetPitkaSyotto() {
      assertEquals(new Nappi(new PitkaSyotto()),nk.getPitkaSyotto());
    }
//
//    /**
//     * Test of getAlakierre method, of class NappienKasittelija.
//     */
    @Test
    public void testGetAlakierre() {
    assertEquals(new Nappi(new Alakierre()),nk.getAlakierre());
    }
//
//    /**
//     * Test of getDeffu method, of class NappienKasittelija.
//     */
    @Test
    public void testGetDeffu() {
    assertEquals(new Nappi(new Deffu()),nk.getDeffu());
    }
//
//    /**
//     * Test of getBlokki method, of class NappienKasittelija.
//     */
    @Test
    public void testGetBlokki() {
    assertEquals(new Nappi(new Blokki()),nk.getBlokki());
    }
//
//    /**
//     * Test of getSpinni method, of class NappienKasittelija.
//     */
    @Test
    public void testGetSpinni() {
        assertEquals(new Nappi(new Spinni()),nk.getSpinni());
    }
//
//    /**
//     * Test of getNapit method, of class NappienKasittelija.
//     */
    @Test
    public void testGetNapit() {
      nk.getNapit().clear();
      assertTrue(nk.getNapit().isEmpty());
    }
    
//
//    /**
//     * Test of lisaaPaallaOlevaksi method, of class NappienKasittelija.
//     */
    @Test
    public void testLisaaPaallaOlevaksi() {
        nk.lisaaPaallaOlevaksi(nk.getOK());
        assertTrue(nk.getPaallaOlevat().contains(nk.getOK()));
    }
    
//
//    /**
//     * Test of tyhjennaPaallaOlevienLista method, of class NappienKasittelija.
//     */
    @Test
    public void testTyhjennaPaallaOlevienLista() {
       nk.lisaaPaallaOlevaksi(nk.getOK());
       nk.tyhjennaPaallaOlevienLista();
       assertTrue(nk.getPaallaOlevat().isEmpty());
    }
    
    
//
//    /**
//     * Test of kaikkiMuutNapitFalseksi method, of class NappienKasittelija.
//     */
    @Test
    public void testKaikkiMuutNapitFalseksiIlmanParametria() {
      nk.lisaaPaallaOlevaksi(nk.getOK());
      nk.lisaaPaallaOlevaksi(nk.getSpinni());
      nk.kaikkiMuutNapitFalseksi();
      boolean testi = true;
      for (Nappi nappi : nk.getNapit()) {
          if (nappi.equals(nk.getOK()) || nappi.equals(nk.getSpinni())) {
              if (!nappi.getButton().isEnabled()) {
                  testi = false;
                  break;
              }
          }
          else {
              if (nappi.getButton().isEnabled()) {
                  testi = false;
                  break;
              }
          }
      }
      assertTrue(testi);
    }
    
//
//    /**
//     * Test of kaikkiMuutNapitFalseksi method, of class NappienKasittelija.
//     */
    @Test
    public void testKaikkiMuutNapitFalseksiParametrilla() {
       nk.kaikkiMuutNapitFalseksi(nk.getAlakierre());
       boolean testi = true;
       for (Nappi nappi : nk.getNapit()) {
           if (nappi.equals(nk.getAlakierre())) {
               if (!nappi.getButton().isEnabled()) {
                   testi = false;
                   break;
               }
           }
           else {
               if (nappi.getButton().isEnabled()) {
                   testi = false;
                   break;
               }
           }
       }
       assertTrue(testi);
    }
    
//
//    /**
//     * Test of asetaFalseksi method, of class NappienKasittelija.
//     */
    @Test
    public void testAsetaFalseksi() {
        nk.asetaFalseksi(nk.getBlokki());
        assertFalse(nk.getBlokki().getButton().isEnabled());
    }
    
//    
}

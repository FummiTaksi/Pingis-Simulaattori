/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

import Logiikka.ApuLuokat.Tuomari;
import Logiikka.ApuLuokat.PalloRalli;
import Logiikka.ApuLuokat.Pelaaja;
import Logiikka.kasittelijat.NappienKasittelija;
import Lyonnit.Lyonti;
import javax.swing.JLabel;

/**
 *
 * @author Aleksi
 */
public abstract class Logiikka {

    protected JLabel selostus;
    protected JLabel tulostaulu;
    protected Tuomari tuomari;
    protected NappienKasittelija nk;
    protected PalloRalli ralli;

    public Logiikka(JLabel selostus, JLabel tulostaulu, Tuomari tuomari, NappienKasittelija nk, PalloRalli ralli) {
        this.selostus = selostus;
        this.tulostaulu = tulostaulu;
        this.tuomari = tuomari;
        this.nk = nk;
        this.ralli = ralli;
    }

    public PalloRalli getPalloRalli() {
        return ralli;
    }

    public void lyontiMeneePoytaan(String uusiSelostus, Lyonti lyonti, Pelaaja pelaaja) {
        selostus.setText(uusiSelostus);
        ralli.setPelaajanLyonti(pelaaja, lyonti);
        ralli.pelaajanVuoro(tuomari.getVastustaja(pelaaja));
        nk.kaikkiMuutNapitFalseksi(nk.getOK());
//        if (ralli.palautaLyoja().onkoIhmisenOhjaama()) {
//            asetaNapit(lyonti);
//        }
    }
    public void asetaNapit(Lyonti lyonti) {
        nk.tyhjennaPaallaOlevienLista();
        if (lyonti.equals(nk.getLyhytSyotto().getLyonti())) {
            asetaNapitLyhyestaSyotosta();
        }
        else if (lyonti.equals(nk.getPitkaSyotto().getLyonti())) {
            asetaNapitPitkastaSyotosta();
        }
        else if (lyonti.equals(nk.getAlakierre().getLyonti())) {
            asetaNapitAlakierteesta();
        }
        else if (lyonti.equals(nk.getDeffu().getLyonti())) {
            asetaNapitDeffusta();
        }
        else if (lyonti.equals(nk.getBlokki().getLyonti())) {
            asetaNapitBlokista();
        }
        else if (lyonti.equals(nk.getSpinni().getLyonti())) {
            asetaNapitSpinnista();
        }
        nk.kaikkiMuutNapitFalseksi();
        nk.tyhjennaPaallaOlevienLista();
    }
    public void asetaNapitLyhyestaSyotosta() {
        nk.lisaaPaallaOlevaksi(nk.getAlakierre());
    }
    public void asetaNapitPitkastaSyotosta() {
        nk.lisaaPaallaOlevaksi(nk.getSpinni());
        nk.lisaaPaallaOlevaksi(nk.getAlakierre());
    }
    public void asetaNapitBlokista() {
        nk.lisaaPaallaOlevaksi(nk.getSpinni());
        nk.lisaaPaallaOlevaksi(nk.getDeffu());
    }
    public void asetaNapitDeffusta() {
        asetaNapitPitkastaSyotosta();
    }
    public void asetaNapitSpinnista() {
        nk.lisaaPaallaOlevaksi(nk.getBlokki());
        nk.lisaaPaallaOlevaksi(nk.getDeffu());
        nk.lisaaPaallaOlevaksi(nk.getSpinni());
    }
    
    public void asetaNapitAlakierteesta() {
        nk.lisaaPaallaOlevaksi(nk.getAlakierre());
        nk.lisaaPaallaOlevaksi(nk.getSpinni());
    }


    public void lyontiEiMenePoytaan(String uusiSelostus,Pelaaja pelaaja) {
        tuomari.lisaaVastustajallePiste(pelaaja);
        tulostaulu.setText(tuomari.toString());
        selostus.setText(uusiSelostus);
        ralli.palloLoppuu();
        nk.kaikkiMuutNapitFalseksi(nk.getOK());
    }

    public void lyoLyonti(Lyonti lyonti, String voitto, String havio, Pelaaja pelaaja) {
      
      if (ralli.lyoLyonti(lyonti)) {
          System.out.println(pelaaja + " löi lyönnin " + lyonti + " pöytään.");
          lyontiMeneePoytaan(voitto,lyonti,pelaaja);
      }
      else {
          System.out.println(pelaaja + " epäonnistui lyönnissä " + lyonti);
          lyontiEiMenePoytaan(havio,pelaaja);
      }
      
      
    }

}

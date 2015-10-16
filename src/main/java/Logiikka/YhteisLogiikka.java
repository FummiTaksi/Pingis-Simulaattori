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
import javax.swing.JLabel;

/**
 *
 * @author Aleksi
 */
public class YhteisLogiikka extends Logiikka {

    private TekoalynLogiikka tekoalynLogiikka1;
    private TekoalynLogiikka tekoalynLogiikka2;

    public YhteisLogiikka(Tuomari tuomari, NappienKasittelija nk, PalloRalli ralli, Pelialusta alusta) {
        super(tuomari, nk, ralli, alusta);
    }

    public void setTekoalynLogiikka1(TekoalynLogiikka logiikka) {
        tekoalynLogiikka1 = logiikka;
    }

    public void setTekoalynLogiikka2(TekoalynLogiikka logiikka) {
        tekoalynLogiikka2 = logiikka;
    }

    public TekoalynLogiikka getTekoalynLogiikka1() {
        return tekoalynLogiikka1;
    }

    public TekoalynLogiikka getTekoalynLogiikka2() {
        return tekoalynLogiikka2;
    }

    /**
     * Muuttaa selostuksen sopivaksi ennen pallon alkua.
     */
    public void syotonAlustus() {
        if (tuomari.getSyottaja().onkoIhmisenOhjaama()) {
            alusta.muutaSelostusta("Sinun syöttövuorosi");

        } else {
            alusta.muutaSelostusta("Vastustajan syöttövuoro.");
        }
        nk.kaikkiMuutNapitFalseksi(nk.getOK());

    }

    /**
     * Aloittaa pallon riippuen siitä onko syöttövuorossa ihminen vai tietokone.
     */
    public void palloAlkaa() {
        ralli.palloAlkaa();
        System.out.println("Tilanne on : " + tuomari.toString());
        if (tuomari.getSyottaja().onkoIhmisenOhjaama()) {
            alusta.muutaSelostusta("Sinun syöttövuorosi.Valitse joko pitkä tai lyhyt syöttö.");
            nk.lisaaPaallaOlevaksi(nk.getLyhytSyotto());
            nk.lisaaPaallaOlevaksi(nk.getPitkaSyotto());
            nk.kaikkiMuutNapitFalseksi();
            nk.tyhjennaPaallaOlevienLista();
        } else {
            if (tuomari.getSyottaja().equals(tuomari.getPelaaja1())) {
                tekoalynLogiikka1.tekoalySyottaa();
            } else {
                tekoalynLogiikka2.tekoalySyottaa();
            }
        }
    }

    /**
     * Laittaa lopputekstit pelin loppuessa.
     *
     * @param voittaja
     */
    public void peliLoppuu(Pelaaja voittaja) {
        
        if (voittaja.onkoIhmisenOhjaama()) {
            alusta.muutaSelostusta(voittaja + " voitti! Onnittelut!");
        } else {
            alusta.muutaSelostusta(voittaja.toString() + " voitti! Parempi onni ensi kerralla.");
        }

    }

    /**
     * Käsittelee tapahtumat kun painetaan OK-nappia.
     */
    public void kunPainetaanOK() {
        if (tuomari.voittaakoPelaaja1()) {
            peliLoppuu(tuomari.getPelaaja1());
        } else if (tuomari.voittaakoPelaaja2()) {
            peliLoppuu(tuomari.getPelaaja2());
        } else if (!ralli.palloKaynnissa()) {
            palloAlkaa();
        } else if (ralli.onkoPelaaja1Vuorossa()) {

            if (!tuomari.getPelaaja1().onkoIhmisenOhjaama()) {
                tekoalynLogiikka1.tekoalyVastaaLyontiin(ralli.palautaLyonti());
            } else {
                asetaNapit(ralli.palautaLyonti());
            }

        } else if (ralli.onkoPelaaja2Vuorossa()) {
            if (!tuomari.getPelaaja2().onkoIhmisenOhjaama()) {
                tekoalynLogiikka2.tekoalyVastaaLyontiin(ralli.palautaLyonti());
            } else {
                asetaNapit(ralli.palautaLyonti());
            }

        }
    }

}

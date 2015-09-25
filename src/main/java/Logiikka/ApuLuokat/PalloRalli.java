package Logiikka.ApuLuokat;


import Logiikka.kasittelijat.LyontienKasittelija;
import Lyonnit.Lyonti;
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Palloralli luokka pitää kirjaa pallorallin kulusta.
 * @author Aleksi
 */
public class PalloRalli {

    private Lyonti pelaajan1Lyonti;
    private Lyonti pelaajan2Lyonti;
    private boolean onkoPelaajan1Lyonti;
    private boolean onkoPelaajan2Lyonti;
    private boolean palloJatkuu;
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;

    public PalloRalli(Pelaaja pelaaja1, Pelaaja pelaaja2) {
        this.pelaaja1 = pelaaja1;
        this.pelaaja2 = pelaaja2;
        this.palloJatkuu = true;

    }
    /**
     * Palauttaa true jos palloralli on käynnissä, false muuten.
     * @return 
     */
    public boolean palloKaynnissa() {
        return palloJatkuu;
    }
    /**
     * Palauttaa sen Pelaaja-olion, joka on lyöntivuorossa.
     * @return 
     */
    public Pelaaja palautaLyoja() {
        if (onkoPelaajan1Lyonti) {
            return pelaaja1;
        } else {
            return pelaaja2;
        }
    }
    /**
     * Palauttaa lyönnin, joka on viimeiseksi lyöty pöytään.
     * @return 
     */
    public Lyonti palautaLyonti() {
        if (palautaLyoja().equals(pelaaja1)) {
            return getPelaajan2Lyonti();
        }
        else {
            return getPelaajan1Lyonti();
        }
    }
    /**
     * Asettaa parametrina olevan pelaajan lyöntivuoroon.
     * @param pelaaja 
     */
    public void pelaajanVuoro(Pelaaja pelaaja) {
        if (pelaaja.equals(pelaaja1)) {
            this.onkoPelaajan1Lyonti = true;
            this.onkoPelaajan2Lyonti = false;
        }
        if (pelaaja.equals(pelaaja2)) {
            this.onkoPelaajan2Lyonti = true;
            this.onkoPelaajan1Lyonti = false;
        }
    }
    /**
     * Asettaa pallon loppuneeksi.
     */
    public void palloLoppuu() {
        palloJatkuu = false;
    }
    /**
     * Asettaa pallon alkaneeksi.
     */
    public void palloAlkaa() {
        palloJatkuu = true;
    }
    /**
     * Asettaa parametrin pelaajan lyönniksi parametrin lyönnin.
     * @param pelaaja
     * @param lyonti 
     */
    public void setPelaajanLyonti(Pelaaja pelaaja, Lyonti lyonti) {
        if (pelaaja.equals(pelaaja1)) {
            pelaajan1Lyonti = lyonti;
        }
        if (pelaaja.equals(pelaaja2)) {
            pelaajan2Lyonti = lyonti;
        }
    }
    
    public Lyonti getPelaajan2Lyonti() {
        return pelaajan2Lyonti;
    }

    public Lyonti getPelaajan1Lyonti() {
        return pelaajan1Lyonti;
    }
    /**
     * Palauttaa true jos pelaaja1 on lyöntivuorossa. False jos ei ole.
     * @return 
     */
    public boolean onkoPelaaja1Vuorossa() {
         return onkoPelaajan1Lyonti;
    }
    /**
     * Palauttaa true jos pelaaja2 on lyöntivuorossa. False jos ei ole.
     * @return 
     */
    public boolean onkoPelaaja2Vuorossa() {
        return onkoPelaajan2Lyonti;
    }
    /**
     * Palauttaa true jos parametrin lyönti menee pöytään. False jos ei.
     * @param lyonti
     * @return 
     */
    public boolean lyoLyonti(Lyonti lyonti) {
        double arvottuLuku = new Random().nextDouble();
        if (arvottuLuku <= lyonti.getTodNak()) {
            return true;
        }
        return false;
    }
    /**
     * 
     * @param todnak
     * @return 
     */
    public boolean lyoLyonti(double todnak) {
        double arvottuLuku = new Random().nextDouble();
        if (arvottuLuku <= todnak) {
            return true;
        }
        return false;
    }
    /**
     * Arpoo parametrin ArrayListasta lyönnin, palauttaa true jos kyseinen lyönti menee pöytään, false muuten.
     * @param lyonnit
     * @return 
     */
    public boolean lyoLyontiSatunnaisesti(ArrayList<Lyonti> lyonnit) {
        LyontienKasittelija lk = new LyontienKasittelija();
        Lyonti arvottuLyonti = lk.arvoLyonti(lyonnit);
        return lyoLyonti(arvottuLyonti);
    }

}

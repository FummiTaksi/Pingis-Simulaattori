package Logiikka.ApuLuokat;

import Lyonnit.Lyonti;
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
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

    public boolean palloKaynnissa() {
        return palloJatkuu;
    }

    public Pelaaja palautaLyoja() {
        if (onkoPelaajan1Lyonti) {
            return pelaaja1;
        } else {
            return pelaaja2;
        }
    }
    
    public Lyonti palautaLyonti() {
        if (palautaLyoja().equals(pelaaja1)) {
            return getPelaajan2Lyonti();
        }
        else {
            return getPelaajan1Lyonti();
        }
    }

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

    public void palloLoppuu() {
        palloJatkuu = false;
    }

    public void palloAlkaa() {
        palloJatkuu = true;
    }

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

    public boolean onkoPelaaja1Vuorossa() {
        return onkoPelaajan1Lyonti;
    }

    public boolean onkoPelaaja2Vuorossa() {
        return onkoPelaajan2Lyonti;
    }

    public boolean lyoLyonti(Lyonti lyonti) {
        double arvottuLuku = new Random().nextDouble();
        if (arvottuLuku <= lyonti.getTodNak()) {
            return true;
        }
        return false;
    }

    public boolean lyoLyonti(double todnak) {
        double arvottuLuku = new Random().nextDouble();
        if (arvottuLuku <= todnak) {
            return true;
        }
        return false;
    }

    public boolean lyoLyontiSatunnaisesti(ArrayList<Lyonti> lyonnit) {
        Lyonti arvottuLyonti = lyonnit.get(new Random().nextInt(lyonnit.size() - 1));
        return lyoLyonti(arvottuLyonti);
    }

}

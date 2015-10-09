package Logiikka;


import Logiikka.ApuLuokat.Tuomari;
import Logiikka.ApuLuokat.PalloRalli;
import Logiikka.ApuLuokat.Pelaaja;
import Logiikka.ApuLuokat.Pelialusta;
import Logiikka.kasittelijat.NappienKasittelija;
import Lyonnit.Alakierre;
import Lyonnit.Blokki;
import Lyonnit.Deffu;
import Lyonnit.LyhytSyotto;
import Lyonnit.Lyonti;
import Lyonnit.PitkaSyotto;
import Lyonnit.Spinni;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aleksi
 */
public class PelaajanLogiikka extends Logiikka {
    private Pelaaja pelaaja;
    public PelaajanLogiikka(Tuomari tuomari, NappienKasittelija nk, PalloRalli ralli,Pelialusta alusta,Pelaaja pelaaja) {
        super(tuomari,nk,ralli,alusta);
        this.pelaaja = pelaaja;
    }

    public PalloRalli getPalloRalli() {
        return ralli;
    }
    
    public void asetaVastustajanLyonti() {
        ralli.pelaajanVuoro(tuomari.getVastustaja(pelaaja));
    }
    public void lyhytSyotto() {
        lyoLyonti(new LyhytSyotto(),"Syöttösi meni pöytään","Syötät verkkoon",pelaaja);
    }

    public void pitkaSyotto() {
        lyoLyonti(new PitkaSyotto(),"Syöttösi meni pöytään", "Syötät yli",pelaaja);
    }

    public void blokki() {
        lyoLyonti(new Blokki(0.6),"Blokkasit vastustajan hyökkäyksen","Vastustaja lataa armottoman pommin kulmasta läpi!",pelaaja);
    }

    public void deffuBlokista() {
       lyoLyonti(new Deffu(0.7),"Deffasit pöytään.","Kompastuit jalkoihisi",pelaaja);
    }

    public void deffuSpinnista() {
        lyoLyonti(new Deffu(0.7),"Deffasit vastustajan lämärin.","Vastustaja pommitti läpi!!",pelaaja);
    }

    public void deffu() {
        if (ralli.palautaLyonti().equals(nk.getBlokki().getLyonti())) {
            deffuBlokista();
        } else if (ralli.palautaLyonti().equals(nk.getSpinni().getLyonti())) {
            deffuSpinnista();
        }
    }

    public void alakierre() { 
        lyoLyonti(new Alakierre(0.9),"Löit alakierteen pöytään", "Löit alakierteen verkkoon",pelaaja);
    }

    public void spinniPitkastaSyotosta() {
        lyoLyonti(new Spinni(0.6),"Löit spinnin pöytään vastustajan syötöstä", "Et osunut palloon!",pelaaja);
    }

    public void spinniDeffusta() {
        lyoLyonti(new Spinni(0.7),"Löit spinnin vastustajan deffusta", "Löit verkkoon vastustajan hevos-alakierteestä!",pelaaja);
    }

    public void spinniAlakierteesta() {
        lyoLyonti(new Spinni(0.75),"Löit spinnin pöytään", "Löit spinnin yli",pelaaja);
    }

    public void spinniBlokista() {
        lyoLyonti(new Spinni(0.8),"Lyöt spinnin pöytään", "Et ehdi vastustajan blokkiin!!",pelaaja);
    }
    
    public void vastaSpinni() {
        lyoLyonti(new Spinni(0.5),"Lyöt vasta-spinnin!" , "Vastalämärisi lentää kolme metriä yli",pelaaja);
    }

    public void spinni() {
        if (ralli.getPelaajan2Lyonti().equals(nk.getPitkaSyotto().getLyonti())) {
            spinniPitkastaSyotosta();
        } else if (ralli.getPelaajan2Lyonti().equals(nk.getDeffu().getLyonti())) {
            spinniDeffusta();
        } else if (ralli.getPelaajan2Lyonti().equals(nk.getAlakierre().getLyonti())) {
            spinniAlakierteesta();
        } else if (ralli.getPelaajan2Lyonti().equals(nk.getBlokki().getLyonti())) {
            spinniBlokista();
        }
        else if (ralli.getPelaajan2Lyonti().equals(nk.getSpinni().getLyonti())) {
            vastaSpinni();
        }
    }

}

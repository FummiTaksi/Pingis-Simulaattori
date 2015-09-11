/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

import Logiikka.ApuLuokat.PalloRalli;
import Logiikka.ApuLuokat.Pelaaja;
import Logiikka.ApuLuokat.Tuomari;
import Logiikka.kasittelijat.NappienKasittelija;
import Lyonnit.Lyonti;
import javax.swing.JLabel;

/**
 *
 * @author Aleksi
 */
public class YhteisLogiikka extends Logiikka{
    private TekoalynLogiikka tekoalynLogiikka1;
    private TekoalynLogiikka tekoalynLogiikka2;
    public YhteisLogiikka(JLabel selostus, JLabel tulostaulu, Tuomari tuomari, NappienKasittelija nk, PalloRalli ralli) {
        super (selostus,tulostaulu,tuomari,nk,ralli);
    }
    
    public void setTekoalynLogiikka1(TekoalynLogiikka logiikka) {
        tekoalynLogiikka1 =logiikka;
    }
    
    public void setTekoalynLogiikka2(TekoalynLogiikka logiikka) {
        tekoalynLogiikka2 = logiikka;
    }
    
  
    
    public void syotonAlustus() {
        if (tuomari.getSyottaja().onkoIhmisenOhjaama()) {
            selostus.setText("Sinun syöttövuorosi");
            
        } else {
            selostus.setText("Vastustajan syöttövuoro.");
        }
        nk.kaikkiMuutNapitFalseksi(nk.getOK());
        
    }
    public void palloAlkaa() {
        ralli.palloAlkaa();
        if (tuomari.getSyottaja().onkoIhmisenOhjaama()) {
            selostus.setText("Sinun syöttövuorosi.Valitse joko pitkä tai lyhyt syöttö.");
            nk.lisaaPaallaOlevaksi(nk.getLyhytSyotto());
            nk.lisaaPaallaOlevaksi(nk.getPitkaSyotto());
            nk.kaikkiMuutNapitFalseksi();
            nk.tyhjennaPaallaOlevienLista();
        }
        else {
          if (tuomari.getSyottaja().equals(tuomari.getPelaaja1())) {
              tekoalynLogiikka1.tekoalySyottaa();
          }
          else {
              tekoalynLogiikka2.tekoalySyottaa();
          }
        }
    }
    
    
    public void peliLoppuu(Pelaaja voittaja) {
        if (voittaja.onkoIhmisenOhjaama()) {
            selostus.setText( voittaja + " voitit! Onnittelut!");
        }
        else {
            selostus.setText(voittaja.toString() + " voitti! Parempi onni ensi kerralla.");
        }
    }
    
    public void kunPainetaanOK() {
        if (tuomari.voittaakoPelaaja1()) {
            peliLoppuu(tuomari.getPelaaja1());
        }
        else if (tuomari.voittaakoPelaaja2()) {
            peliLoppuu(tuomari.getPelaaja2());
        }
        else if (!ralli.palloKaynnissa()) {
            palloAlkaa();
        }
       else if (ralli.onkoPelaaja1Vuorossa()) {
    
            if (!tuomari.getPelaaja1().onkoIhmisenOhjaama()) {
                tekoalynLogiikka1.tekoalyVastaaLyontiin(ralli.palautaLyonti());
            }
            else {
                asetaNapit(ralli.palautaLyonti());
            }

        }
       else if (ralli.onkoPelaaja2Vuorossa()) {
            if (!tuomari.getPelaaja2().onkoIhmisenOhjaama()) {
                tekoalynLogiikka2.tekoalyVastaaLyontiin(ralli.palautaLyonti());
            }
            else {
                asetaNapit(ralli.palautaLyonti());
            }
            
        }
    }
 
}
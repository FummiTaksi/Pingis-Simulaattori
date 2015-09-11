package Logiikka;

import Logiikka.ApuLuokat.Tuomari;
import Logiikka.ApuLuokat.PalloRalli;
import Logiikka.ApuLuokat.Pelaaja;
import Logiikka.kasittelijat.LyontienKasittelija;
import Logiikka.kasittelijat.NappienKasittelija;
import Lyonnit.Alakierre;
import Lyonnit.Blokki;
import Lyonnit.Deffu;
import Lyonnit.LyhytSyotto;
import Lyonnit.Lyonti;
import Lyonnit.PitkaSyotto;
import Lyonnit.Spinni;
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
public class TekoalynLogiikka extends Logiikka {

    private LyontienKasittelija lk;
    private Pelaaja pelaaja;
    public TekoalynLogiikka(JLabel selostus, JLabel tuloskentta, Tuomari tuomari, NappienKasittelija nk, PalloRalli ralli, LyontienKasittelija lk,Pelaaja pelaaja) {
        super(selostus, tuloskentta, tuomari, nk, ralli);
        this.lk = lk;
        this.pelaaja = pelaaja;
    }

    public void tekoalySyottaa() {
        lk.lisaaLyontiListaan(new PitkaSyotto());
        lk.lisaaLyontiListaan(new LyhytSyotto());
        Lyonti syotto = lk.arvoLyonti();
        if (syotto.equals(nk.getLyhytSyotto().getLyonti())) {
            tekoalySyottaaLyhyenSyoton();
        }
        if (syotto.equals(nk.getPitkaSyotto().getLyonti())) {
            tekoalySyottaaPitkanSyoton();
        }
    }
    
    public void tekoalyVastaaLyhyeenSyottoon() {
        tekoalyPelaaAlakierteenLyhyestaSyotosta();
    }
    
    public void tekoalyVastaaPitkaanSyottoon() {
        Lyonti palautus = lk.arvoLyonti(new PitkaSyotto().getVastaukset());
        if (palautus.equals(nk.getSpinni().getLyonti())) {
           tekoalyPelaaSpinninPitkastaSyotosta();
        }
        if (palautus.equals(nk.getAlakierre().getLyonti())) {
            tekoalyPelaaAlakierteenPitkastaSyotosta();
        }
    }
    
    public void tekoalyVastaaBlokkiin() {
        Lyonti palautus = lk.arvoLyonti(new Blokki().getVastaukset());
        if (palautus.equals(nk.getSpinni().getLyonti())) {
            tekoalyPelaaSpinninBlokista();
        }
        if (palautus.equals(nk.getDeffu().getLyonti())) {
            tekoalyPelaaDeffunBlokista();
        }
    }
    
    public void tekoalyVastaaAlakierteeseen() {
     Lyonti palautus = lk.arvoLyonti(new Alakierre().getVastaukset());
     if (palautus.equals(nk.getAlakierre().getLyonti())) {
         tekoalyPelaaAlakierteenAlakierteesta();
     }
     if (palautus.equals(nk.getSpinni().getLyonti())) {
         tekoalyPelaaSpinninAlakierteesta();
     }
    }
    
    public void tekoalyVastaaDeffuun() {
        Lyonti palautus = lk.arvoLyonti(new Alakierre().getVastaukset());
        if (palautus.equals(nk.getAlakierre().getLyonti())) {
            tekoalyPelaaAlakierteenDeffusta();
        }
        if (palautus.equals(nk.getSpinni().getLyonti())) {
            tekoalyPelaaSpinninDeffusta();
        }
    }
    public void tekoalyVastaaSpinniin() {
        Lyonti palautus = lk.arvoLyonti(new Spinni().getVastaukset());
        if (palautus.equals(nk.getBlokki().getLyonti())) {
            tekoalyBlokkaa();
        }
        if (palautus.equals(nk.getDeffu().getLyonti())) {
            tekoalyPelaaDeffunSpinnista();
        }
        if (palautus.equals(nk.getSpinni().getLyonti())) {
            tekoalyPelaaVastaSpinnin();
        }
    }
    
    public void tekoalyVastaaLyontiin(Lyonti lyonti) {
        lk.tyhjennaLista();
        if (lyonti.equals(nk.getLyhytSyotto().getLyonti())) {
            tekoalyVastaaLyhyeenSyottoon();
        }
        if (lyonti.equals(nk.getPitkaSyotto().getLyonti())) {
            tekoalyVastaaPitkaanSyottoon();
        }
        if (lyonti.equals(nk.getAlakierre().getLyonti())) {
            tekoalyVastaaAlakierteeseen();
        }
        if (lyonti.equals(nk.getDeffu().getLyonti())) {
            tekoalyVastaaDeffuun();
        }
        if (lyonti.equals(nk.getBlokki().getLyonti())) {
            tekoalyVastaaBlokkiin();
        }
        if (lyonti.equals(nk.getSpinni().getLyonti())) {
            tekoalyVastaaSpinniin();
        }
    }

    public void tekoalySyottaaLyhyenSyoton() {
        lyoLyonti(new LyhytSyotto(), "Vastustajasi syötti lyhyen syötön.", "Vastustajasi syöttää verkkoon", pelaaja);
    }

    public void tekoalySyottaaPitkanSyoton() {
        lyoLyonti(new PitkaSyotto(), "Vastustajasi syötti pitkän syötön", "Vastustajasi syöttää yli.", pelaaja);
    }

    public void tekoalyBlokkaa() {
        lyoLyonti(new Blokki(0.6), "Vastustaja blokkasi kiskaisusi!", "Vastustajallasi ei ole mahdollisuuttakaan palauttaa pommiasi!", pelaaja);
    }
    
    public void tekoalyPelaaAlakierteenPitkastaSyotosta() {
        lyoLyonti(new Alakierre(0.9),"Vastustaja palauttaa kierteesi kauniilla slaissilla","Vastustaja uiveltaa pallon alaverkkoon.", pelaaja);
    }

    public void tekoalyPelaaAlakierteenLyhyestaSyotosta() {
        lyoLyonti(new Alakierre(0.9), "Vastustaja palauttaa ovelan syöttösi.", "Vastustaja ei kykene palauttamaan lyhyttä syöttöäsi.", pelaaja);
    }

    public void tekoalyPelaaAlakierteenAlakierteesta() {
        lyoLyonti(new Alakierre(0.9), "Vastustaja onnistuu alakierrelyönnissään", "Vastustaja möhlii!", pelaaja);
    }

    public void tekoalyPelaaAlakierteenDeffusta() {
        lyoLyonti(new Alakierre(0.9), "Vastustaja palauttaa deffusi alakierteellä.", "Pallo singahtaa vastustajan mailasta pöydän alle!", pelaaja);
    }

    public void tekoalyPelaaDeffunBlokista() {
        lyoLyonti(new Deffu(0.9), "Vastustaja deffaa blokkisi", "Vastustaja kompastuu", pelaaja);
    } 
    
    public void tekoalyPelaaDeffunSpinnista() {
        lyoLyonti(new Deffu(0.7),"Vastustaja deffaa pommisi!" , "Lyöt pallon vastustajan ulottumattomiin!",pelaaja);
    } 
    
    public void tekoalyPelaaSpinninPitkastaSyotosta() {
        lyoLyonti(new Spinni(0.6),"Vastustaja lyö spinnin syötöstäsi!", "Vastustaja lyö kantilla katsomoon!" , pelaaja);
    }
    
    public void tekoalyPelaaSpinninDeffusta() {
        lyoLyonti(new Spinni(0.7),"Vastustaja lyö spinnin deffustasi!" , "Vastustaja lyö deffustasi verkkoon!", pelaaja);
    }
    
    public void tekoalyPelaaSpinninAlakierteesta() {
        lyoLyonti(new Spinni(0.75),"Vastustaja avaa jykevällä spinnillä", "Vastustaja tekee avausvirheen", pelaaja);
    }
    
    public void tekoalyPelaaSpinninBlokista() {
        lyoLyonti(new Spinni(0.8),"Vastustaja lyö spinnin blokistasi", "Blokkaat vastustajan kebab-kioskille!" , pelaaja);
    }
    
    public void tekoalyPelaaVastaSpinnin() {
        lyoLyonti(new Spinni(0.5),"Vastustaja lyö vastaan spinnistäsi","Vastustaja epäonnistuu vastahyökkäyksessä!",pelaaja);
    }
    
}

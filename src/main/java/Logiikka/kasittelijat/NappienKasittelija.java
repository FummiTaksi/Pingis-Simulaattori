package Logiikka.kasittelijat;



import Logiikka.ApuLuokat.Nappi;
import Lyonnit.Alakierre;
import Lyonnit.Blokki;
import Lyonnit.Deffu;
import Lyonnit.LyhytSyotto;
import Lyonnit.Lyonti;
import Lyonnit.PitkaSyotto;
import Lyonnit.Spinni;
import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Hallitsee kaikkia pelin Nappi-olioita.
 * @author Aleksi
 */
public class NappienKasittelija {

    private ArrayList<Nappi> napit;
    private ArrayList<Nappi> paallaOlevat;
    private Nappi ok;
    private Nappi lyhyt;
    private Nappi pitka;
    private Nappi alakierre;
    private Nappi deffu;
    private Nappi blokki;
    private Nappi spinni;
    
    /**
     * Konstruktorissa lisätään kaikki napit nappi-listaan. Päällä olevien nappien lista on aluksi tyhjä.
     */
    public NappienKasittelija() {
        this.napit = new ArrayList();
        this.paallaOlevat = new ArrayList();
        lisaaKaikkiNapitListaan();
    }
    
    public void lisaaNappiListaan(Lyonti lyonti) {
        Nappi lisattava = new Nappi(lyonti);
        napit.add(lisattava);
    }
    
    public void lisaaKaikkiNapitListaan() {
        this.ok = new Nappi("[ENTER] OK");
        napit.add(ok);
        this.lyhyt = new Nappi(new LyhytSyotto());
        napit.add(lyhyt);
        this.pitka = new Nappi(new PitkaSyotto());
        napit.add(pitka);
        this.alakierre = new Nappi(new Alakierre());
        napit.add(alakierre);
        this.deffu = new Nappi(new Deffu());
        napit.add(deffu);
        this.blokki = new Nappi(new Blokki());
        napit.add(blokki);
        this.spinni = new Nappi(new Spinni());
        napit.add(spinni);
        
        
    }
    public Nappi getOK() {
        return ok;
    }
    
    public boolean onkoNappiPaalla(Nappi nappi) {
        return nappi.getButton().isEnabled();
    }
    
    public Nappi getLyhytSyotto() {
        return lyhyt;
    }
    
   
    public Nappi getPitkaSyotto() {
        return pitka;
    }
    public Nappi getAlakierre() {
        return alakierre;
    }
    public Nappi getDeffu() {
        return deffu;
    }
    public Nappi getBlokki() {
        return blokki;
    }
    public Nappi getSpinni() {
        return spinni;
    }
    public ArrayList<Nappi> getNapit() {
        return napit;
    }
    
    public ArrayList<Nappi> getPaallaOlevat() {
        return paallaOlevat;
    }
    /**
     * Lisää parametrina olevan napin päällä-olevien nappien listaan.
     * @param nappi 
     */
    public void lisaaPaallaOlevaksi(Nappi nappi) {
        paallaOlevat.add(nappi);
    }
    
    public void tyhjennaPaallaOlevienLista() {
        paallaOlevat.clear();
    }
    /**
     * Laittaa kaikki päällä-olevien listalla olevat napit päälle. Muut napit pois päältä.
     */
    public void kaikkiMuutNapitFalseksi() {
        for (Nappi nappi : napit) {
            if (paallaOlevat.contains(nappi)) {
//                System.out.println("päälle laitetaan: " + nappi);
                nappi.getButton().setEnabled(true);
            } else {
                nappi.getButton().setEnabled(false);
            }
        }
    }
    /**
     * Laittaa parametrina olevan napin päällä olevaksi. Kaikki muut napit pois päältä.
     * @param nimi 
     */
    public void kaikkiMuutNapitFalseksi(Nappi nimi) {
    
        for (Nappi nappi : napit) {
            if (nappi.equals(nimi)) {
                nappi.getButton().setEnabled(true);
            }
            else {
                nappi.getButton().setEnabled(false);
            }
        }
    }
    
    public void asetaFalseksi(Nappi falseNappi) {
        for (Nappi nappi :napit) {
            if (nappi.equals(falseNappi)) {
                nappi.getButton().setEnabled(false);
            }
        }
    }

}

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
 *
 * @author Aleksi
 */
public class NappienKasittelija {

    private ArrayList<Nappi> napit;
    private ArrayList<Nappi> paallaOlevat;
    public NappienKasittelija() {
        this.napit = new ArrayList();
        this.paallaOlevat = new ArrayList();
        lisaaKaikkiNapitListaan();
    }
    
    public void lisaaNappiListaan(Lyonti lyonti) {
        Nappi lisattava = new Nappi(new JButton(lyonti.toString()),lyonti);
        napit.add(lisattava);
    }
    
    public void lisaaKaikkiNapitListaan() {
        napit.add(new Nappi (new JButton("[ENTER] OK"),null));
        LyontienKasittelija vali = new LyontienKasittelija();
        vali.lisaaKaikkiLyonnitListaan();
        for (Lyonti lyonti : vali.getLyonnit()) {
            lisaaNappiListaan(lyonti);
        }
        
    }
    public Nappi getOK() {
        return new Nappi(new JButton("[ENTER] OK"),null);
    }
    
    public boolean onkoNappiPaalla(Nappi nappi) {
        return nappi.getButton().isEnabled();
    }
    
    public Nappi getLyhytSyotto() {
        return new Nappi(new JButton("[1] Lyhyt Syotto"),new LyhytSyotto());
    }
    
   
    public Nappi getPitkaSyotto() {
        return new Nappi(new JButton("[2] Pitka Syotto"),new PitkaSyotto());
    }
    public Nappi getAlakierre() {
        return new Nappi(new JButton("[3] Alakierre"),new Alakierre());
    }
    public Nappi getDeffu() {
        return new Nappi(new JButton("[4] Deffu"),new Deffu());
    }
    public Nappi getBlokki() {
        return new Nappi(new JButton("[5] Blokki"),new Blokki());
    }
    public Nappi getSpinni() {
        return new Nappi(new JButton("[6] Spinni"),new Spinni());
    }
    public ArrayList<Nappi> getNapit() {
        return napit;
    }

    public void lisaaPaallaOlevaksi(Nappi nappi) {
        paallaOlevat.add(nappi);
    }
    
    public void tyhjennaPaallaOlevienLista() {
        paallaOlevat.clear();
    }

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

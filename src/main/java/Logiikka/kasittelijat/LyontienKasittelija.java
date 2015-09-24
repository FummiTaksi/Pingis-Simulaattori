package Logiikka.kasittelijat;

import Lyonnit.Alakierre;
import Lyonnit.Blokki;
import Lyonnit.Deffu;
import Lyonnit.LyhytSyotto;
import Lyonnit.Lyonti;
import Lyonnit.PitkaSyotto;
import Lyonnit.Spinni;
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
public class LyontienKasittelija {

    private ArrayList<Lyonti> lyonnit;

    public LyontienKasittelija() {
        this.lyonnit = new ArrayList();

    }

    public void lisaaLyontiListaan(Lyonti lyonti) {
        lyonnit.add(lyonti);
    }

    public void lisaaKaikkiLyonnitListaan() {
        lyonnit.add(new LyhytSyotto());
        lyonnit.add(new PitkaSyotto());
        lyonnit.add(new Alakierre());
        lyonnit.add(new Deffu());
        lyonnit.add(new Blokki());
        lyonnit.add(new Spinni());
    }

    public void tyhjennaLista() {
        lyonnit.clear();
    }

    public void poistaLyontiListasta(Lyonti lyonti) {
        lyonnit.remove(lyonti);
    }

    public ArrayList<Lyonti> getLyonnit() {
        return lyonnit;
    }

    public Lyonti arvoLyonti(ArrayList<Lyonti> lyonteja) {
        int maara = lyonteja.size();
        return lyonteja.get(new Random().nextInt(lyonteja.size()));

    }

    public Lyonti arvoLyonti() {
        return lyonnit.get(new Random().nextInt(lyonnit.size()));
    }
}

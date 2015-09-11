package Logiikka.kasittelijat;


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
public class LyontienKasittelija  {
    private ArrayList<Lyonti> lyonnit;
    
    public LyontienKasittelija() {
     this.lyonnit = new ArrayList();   
    }
    public void lisaaLyontiListaan(Lyonti lyonti) {
        lyonnit.add(lyonti);
    }
    
    public void tyhjennaLista() {
        lyonnit.clear();
    }
    
    public Lyonti arvoLyonti(ArrayList<Lyonti> lyonteja) {
        int maara = lyonteja.size();
        return lyonteja.get(new Random().nextInt(lyonteja.size()));
        
    }
    
    public Lyonti arvoLyonti() {
        return lyonnit.get(new Random().nextInt(lyonnit.size()));
    }
}

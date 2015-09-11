package Logiikka.ApuLuokat;


import Logiikka.ApuLuokat.Pelaaja;
import java.util.HashMap;
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
public class Tuomari {
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;
    private HashMap<Pelaaja,Integer> tulostaulu;
    private Pelaaja aloittaja;
    
    public Tuomari(Pelaaja pelaaja1, Pelaaja pelaaja2) {
        this.pelaaja1 = pelaaja1;
        this.pelaaja2 = pelaaja2;
        this.tulostaulu = new HashMap();
        tulostaulu.put(pelaaja1, 0);
        tulostaulu.put(pelaaja2, 0);
        arvoAloittaja();
    }
    public int getPelatutPisteet() {
        int pelatutPisteet = 0;
        for (Integer piste: tulostaulu.values()) {
            pelatutPisteet += piste;
        }
        return pelatutPisteet;
    }
    public void arvoAloittaja() {
        boolean p1Aloittaa = new Random().nextBoolean();
        if (p1Aloittaa) {
            this.aloittaja = pelaaja1;
        }
        else {
            this.aloittaja = pelaaja2;
        }
    }
    
    public Pelaaja getSyottaja() {
        if (getPelatutPisteet() == 0) {
            return aloittaja;
        }
           if (aloittaja.equals(pelaaja1)) {
               if (getPelatutPisteet() % 2 == 0) {
                   return pelaaja1;
               }
               else {
                   return pelaaja2;
               }
           }
           else {
               if (getPelatutPisteet() % 2 == 0) {
                   return pelaaja2;
               }
               else {
                   return pelaaja1;
               }
           }
           
    }
    
    public void lisaaVastustajallePiste(Pelaaja pelaaja) {
        if (pelaaja.equals(pelaaja1)) {
            lisaaPelaajallePiste(pelaaja2);
        }
       else if (pelaaja.equals(pelaaja2)) {
            lisaaPelaajallePiste(pelaaja1);
        }
    }
    
public void lisaaPelaajallePiste(Pelaaja pelaaja) {
    if (pelaaja.equals(pelaaja1)) {
        int uusipiste = tulostaulu.get(pelaaja) + 1;
        tulostaulu.put(pelaaja, uusipiste);
    }
    else if (pelaaja.equals(pelaaja2)) {
        int uusipiste = tulostaulu.get(pelaaja) + 1;
        tulostaulu.put(pelaaja,uusipiste);
    }
}
    
    public boolean voittaakoPelaaja1() {
        if (tulostaulu.get(pelaaja1) >= 11 && tulostaulu.get(pelaaja1) - tulostaulu.get(pelaaja2) >= 2 ) {
            return true;
        }
        return false;
    }
    
    public boolean voittaakoPelaaja2() {
        if (tulostaulu.get(pelaaja2) >= 11 && tulostaulu.get(pelaaja2) - tulostaulu.get(pelaaja1) >= 2) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        String palautus  = "";
        for (Pelaaja pelaaja: tulostaulu.keySet()) {
            palautus += pelaaja + " " + tulostaulu.get(pelaaja) + " ";
        }
        return palautus;
    }
    
    public String getPelaajan1Tuloste() {
        return pelaaja1.toString() + " " + tulostaulu.get(pelaaja1); 
    }
    
    public String getPelaajan2Tuloste() {
        return pelaaja2.toString() + " " + tulostaulu.get(pelaaja2);
    }
    
    public Pelaaja getPelaaja1() {
        return pelaaja1;
    }
    
    public Pelaaja getPelaaja2() {
        return pelaaja2;
    }
    
    public Pelaaja getVastustaja(Pelaaja pelaaja) {
//        System.out.println("metodin parametri " + pelaaja);
//        System.out.println("Pelaaja 1: " + pelaaja1);
//        System.out.println("Pelaaja 2 : " + pelaaja2);
        if (pelaaja.equals(pelaaja1)) {
//            System.out.println("palautan oikein");
            return pelaaja2;
        }
        if (pelaaja.equals(pelaaja2)) {
            return pelaaja1;
        }
//        System.out.println("palautan nullin.");
        return null;
    }
}

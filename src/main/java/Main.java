

import Logiikka.ApuLuokat.Tuomari;
import Logiikka.ApuLuokat.Pelaaja;

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
public class Main {
    
    
    public static void main(String[] args) {
        
       Pelaaja pelaaja = new Pelaaja("Sinä",true);
       Pelaaja tietokone = new Pelaaja("Vastustaja",false);
       Tuomari tuomari = new Tuomari(pelaaja,tietokone);
       
       Kayttoliittyma kl = new Kayttoliittyma(tuomari);
       kl.run();
    }
}

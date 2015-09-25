package Logiikka.ApuLuokat;


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
public class Pelialusta {
    private JLabel selostus;
    private JLabel tuloskentta;
    
    public Pelialusta(JLabel selostus, JLabel tuloskentta) {
        this.selostus = selostus;
        this.tuloskentta = tuloskentta;
    }
    
    public void muutaSelostusta(String uusiSelostus) {
        selostus.setText(uusiSelostus);
    }
    
    public void muutaTulosKenttaa(String uusiTulos) {
        tuloskentta.setText(uusiTulos);
    }
}

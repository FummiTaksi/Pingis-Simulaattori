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
    public String getSelostus() {
        return selostus.getText();
    }
    
    public String getTulosKentta() {
        return tuloskentta.getText();
    }
    
    /**
     * Laittaa selostus-JLabeliin parametrin tekstin.
     * @param uusiSelostus 
     */
    public void muutaSelostusta(String uusiSelostus) {
        selostus.setText(uusiSelostus);
    }
    /**
     * Laittaa tuloskenttä-JLabeliin parametrin tekstin.
     * @param uusiTulos 
     */
    public void muutaTulosKenttaa(String uusiTulos) {
        tuloskentta.setText(uusiTulos);
    }
}

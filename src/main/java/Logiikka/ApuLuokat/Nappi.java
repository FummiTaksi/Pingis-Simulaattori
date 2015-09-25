/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.ApuLuokat;


import Lyonnit.Lyonti;
import javax.swing.JButton;

/**
 * Nappi-olio tietää Lyönnin ja siihen yhdistävän JButtonin.
 * @author Aleksi
 */
public class Nappi {
    private JButton nappi;
    private Lyonti lyonti;
    
    public Nappi(Lyonti lyonti) {
        this.lyonti = lyonti;
        this.nappi = new JButton(lyonti.toString());
    }
    /**
     * Voidaan luoda ilman Lyonti-oliota. Tämä on käytännöllistä OK-napin kannalta.
     * @param napinNimi 
     */
    public Nappi(String napinNimi) {
        this.lyonti = null;
        this.nappi = new JButton(napinNimi);
    }
    public JButton getButton() {
        return nappi;
    }
    
    public Lyonti getLyonti() {
        return lyonti;
    }
    
    public String toString() {
        return nappi.getActionCommand();
    }
    
    @Override
    public boolean equals(Object o) {
        if (o.getClass() != getClass()) {
            return false;
        }
        Nappi verrattava = (Nappi) o;
        if (!verrattava.toString().equals(toString())) {
            return false;
        }
       return true;
    }
}

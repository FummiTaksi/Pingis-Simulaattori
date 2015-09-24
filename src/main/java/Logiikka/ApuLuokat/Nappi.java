/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.ApuLuokat;


import Lyonnit.Lyonti;
import javax.swing.JButton;

/**
 *
 * @author Aleksi
 */
public class Nappi {
    private JButton nappi;
    private Lyonti lyonti;
    
    public Nappi(JButton nappi,Lyonti lyonti) {
        this.nappi = nappi;
        this.lyonti = lyonti;
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

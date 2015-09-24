/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lyonnit;

import java.util.ArrayList;

/**
 *
 * @author Aleksi
 */
public class Deffu implements Lyonti {
    
    private double todnak;
    
    public Deffu(double todnak) {
        this.todnak = todnak;
    }
    
    public Deffu() {
        
    }
    
    @Override
    public double getTodNak() {
        return todnak;
    }

    @Override
    public ArrayList<Lyonti> getVastaukset() {
        ArrayList<Lyonti> vastaukset = new ArrayList();
        vastaukset.add(new Spinni(0.7));
        vastaukset.add(new Alakierre(0.9));
        return vastaukset;
    }
    
    @Override
    public String toString() {
        return "[4] Deffu";
    }
    
    @Override
    public boolean equals(Object o) {
        if (o.getClass() != getClass()) {
            return false;
        }
        Lyonti verrattava = (Lyonti) o;
        if (!verrattava.toString().equals(toString())) {
            return false;
        }
        return true;
    }
}

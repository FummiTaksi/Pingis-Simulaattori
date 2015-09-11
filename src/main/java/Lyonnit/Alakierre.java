package Lyonnit;


import Lyonnit.Lyonti;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleksi
 */
public class Alakierre implements Lyonti{

    private double todnak;
    
    public Alakierre(double todnak) {
        this.todnak = todnak;
    }
    
    public Alakierre() {
        
    }
   

    @Override
    public ArrayList<Lyonti> getVastaukset() {
        ArrayList<Lyonti> vastaukset = new ArrayList();
        vastaukset.add(new Alakierre(0.90));
        vastaukset.add(new Spinni(0.75));
        return vastaukset;
    }

    @Override
    public double getTodNak() {
        return todnak;
    }
    
    @Override
    public String toString() {
        return "[3] Alakierre";
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

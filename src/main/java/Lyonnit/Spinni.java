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
public class Spinni implements Lyonti {

    private double todnak;

    public Spinni(double todnak) {
        this.todnak = todnak;
    }

    public Spinni() {

    }

    @Override
    public double getTodNak() {
        return todnak;
    }

    @Override
    public ArrayList<Lyonti> getVastaukset() {
        ArrayList<Lyonti> vastaukset = new ArrayList();
        vastaukset.add(new Blokki(0.6));
        vastaukset.add(new Deffu(0.7));
        vastaukset.add(new Spinni(0.5));
        return vastaukset;

    }

    @Override
    public String toString() {
        return "[6] Spinni";
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

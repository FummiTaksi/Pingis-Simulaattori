/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lyonnit;

import java.util.ArrayList;

/**
 * Spinni on hyökkäävä lyönti, josta vastustaja joutuu puolustuskannalle. Spinni on muita lyöntejä epävarmempi mutta sillä voi saada suoria pisteitä.
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

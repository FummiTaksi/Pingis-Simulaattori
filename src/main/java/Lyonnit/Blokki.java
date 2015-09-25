/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lyonnit;

import java.util.ArrayList;

/**
 * Blokilla voi puolustaa vastustajan hyökkäävää Spinni-lyöntiä. Hieman epävarmempi kuin deffu mutta vastustajan on vaikeampi vastata siihen.
 * @author Aleksi
 */
public class Blokki implements Lyonti {
    public double todnak;

    public Blokki(double todnak) {
        this.todnak = todnak;
    }

    public Blokki() {

    }

    @Override
    public double getTodNak() {
        return todnak;
    }

    @Override
    public ArrayList<Lyonti> getVastaukset() {
        ArrayList<Lyonti> vastaukset = new ArrayList();
        vastaukset.add(new Spinni(0.8));
        vastaukset.add(new Deffu(0.9));
        return vastaukset;
    }

    @Override
    public String toString() {
        return "[5] Blokki";
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

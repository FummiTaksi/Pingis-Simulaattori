/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lyonnit;

import java.util.ArrayList;

/**
 * Lyhyestä syötöstä vastustajasi voi vain palauttaa alakierteen, vaikeampi saada suoraa pistettä mutta vastustaja ei pääse hyökkäämään siitä.
 * @author Aleksi
 */
public class LyhytSyotto implements Lyonti {

    @Override
    public double getTodNak() {
        return 0.90;
    }

    @Override
    public ArrayList<Lyonti> getVastaukset() {
        ArrayList<Lyonti> vastaukset = new ArrayList();
        vastaukset.add(new Alakierre(0.9));
        return vastaukset;
    }

    @Override
    public String toString() {
        return "[1] Lyhyt Syotto";
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

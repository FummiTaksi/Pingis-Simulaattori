/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.ApuLuokat;

/**
 *
 * @author Aleksi
 */
public class Pelaaja {

    protected String nimi;
    private boolean ihmisenOhjaama;

    public Pelaaja(String nimi, boolean ihmisenOhjaama) {
        this.nimi = nimi;
        this.ihmisenOhjaama = ihmisenOhjaama;
    }

    public String toString() {
        return nimi;
    }

    public boolean onkoIhmisenOhjaama() {
        return ihmisenOhjaama;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o.getClass() != getClass()) {
            return false;
        }
        Pelaaja verrattava = (Pelaaja) o;
        if (verrattava.toString().equals(toString())) {
            return true;
        }
        return false;
    }
}

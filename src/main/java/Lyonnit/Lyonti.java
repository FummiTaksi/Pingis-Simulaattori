/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lyonnit;

import java.util.ArrayList;

/**
 * Rajapinta, jonka jokaisen pelissä olevan lyönnin on toteutettava.
 * @author Aleksi
 */
public interface Lyonti {
    /**
     * Kertoo mikä on lyönnin todennäköisyys mennä pöytään.
     * @return Palauttaa double arvon välillä 0-1.
     */
    public double getTodNak();
    /**
     * Palauttaa lyönnit, joilla vastustaja voi vastata kyseiseen lyöntiin.
     * @return Palauttaa ArrayListan joka sisältää Lyönti-olioita.
     */
    public ArrayList<Lyonti> getVastaukset();
    /**
     * Palauttaa lyönnin nimen. Alussa on numero jolla lyöntiä voi pelata nappia painamalla.
     * @return 
     */
    public String toString();

    public boolean equals(Object o);

}

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
public interface Lyonti {

    public double getTodNak();

    public ArrayList<Lyonti> getVastaukset();

    public String toString();

    public boolean equals(Object o);

}

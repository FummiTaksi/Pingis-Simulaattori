/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lyonnit;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aleksi
 */
public class PitkaSyottoTest {
    private PitkaSyotto pitka;
    public PitkaSyottoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.pitka = new PitkaSyotto();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTodNak method, of class PitkaSyotto.
     */
    @Test
    public void testGetTodNak() {
        assertEquals(0.9,pitka.getTodNak(),0.0001);
    }
//
//    /**
//     * Test of getVastaukset method, of class PitkaSyotto.
//     */
    @Test
    public void testGetVastaukset() {
       boolean testi;
       if (!pitka.getVastaukset().contains(new Spinni()) || !pitka.getVastaukset().contains(new Alakierre())) {
           testi = false;
       }
       else {
           testi = true;
       }
       assertTrue(testi);
    }
//
//    /**
//     * Test of toString method, of class PitkaSyotto.
//     */
    @Test
    public void testToStringPalauttaaTrue() {
     assertEquals("[2] Pitka Syotto" , pitka.toString());
    }
    
    @Test
    public void testToStringPalauttaaFalse() {
        assertFalse("Lol".equals(pitka.toString()));
    }
//
//    /**
//     * Test of equals method, of class PitkaSyotto.
//     */
    @Test
    public void testEqualsPalauttaaTrue() {
      assertTrue(new PitkaSyotto().equals(pitka));
    }
    
    @Test
    public void testEqualsPalauttaaFalse() {
        assertFalse(new LyhytSyotto().equals(pitka));
    }
//    
}

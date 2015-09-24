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
public class LyhytSyottoTest {
    private LyhytSyotto lyhyt;
    public LyhytSyottoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.lyhyt = new LyhytSyotto();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTodNak method, of class LyhytSyotto.
     */
    @Test
    public void testGetTodNak() {
      assertEquals(0.9,lyhyt.getTodNak(),0.0001);
    }
//
//    /**
//     * Test of getVastaukset method, of class LyhytSyotto.
//     */
    @Test
    public void testGetVastaukset() {
        boolean testi = true;
        for (Lyonti lyonti : lyhyt.getVastaukset()) {
            if (!lyonti.equals(new Alakierre())) {
                testi = false;
            }
        }
        assertTrue(testi);
    }
//
//    /**
//     * Test of toString method, of class LyhytSyotto.
//     */
    @Test
    public void testToStringPalauttaaTrue() {
     assertEquals("[1] Lyhyt Syotto" , lyhyt.toString());
    }
    
    @Test
    public void testToStringPalauttaaFalse() {
        assertFalse("LOL".equals(lyhyt.toString()));
    }
//
//    /**
//     * Test of equals method, of class LyhytSyotto.
//     */
    @Test
    public void testEqualsPalauttaaTrue() {
        assertTrue(new LyhytSyotto().equals(lyhyt));
    }
    @Test
    public void testEqualsPalauttaaFalse() {
        assertFalse(new PitkaSyotto().equals(lyhyt));
    }
    
}

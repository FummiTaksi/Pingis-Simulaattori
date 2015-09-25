/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.ApuLuokat;

import Lyonnit.LyhytSyotto;
import Lyonnit.Lyonti;
import javax.swing.JButton;
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
public class NappiTest {
    private Nappi lyhytSyotto;
    private Nappi ok;
    public NappiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.lyhytSyotto = new Nappi(new LyhytSyotto());
        this.ok = new Nappi("[ENTER] OK");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getButton method, of class Nappi.
     */
    @Test
    public void testGetButtonToimiiKunKonstruktorissaLyonti() {
       assertEquals(new JButton("[1] Lyhyt Syotto").getActionCommand(),lyhytSyotto.getButton().getActionCommand());
    }
    
    @Test
    public void testGetButtonToimiiKunKonstruktorissaString() {
        assertEquals(new JButton("[ENTER] OK").getActionCommand(), ok.getButton().getActionCommand());
    }
//
//    /**
//     * Test of getLyonti method, of class Nappi.
//     */
    @Test
    public void testGetLyontiPalauttaaOikeanLyonnin() {
        assertEquals(new LyhytSyotto(),lyhytSyotto.getLyonti());
    }
    
    @Test
    public void testGetLyontiPalauttaaNullJosKonstruktorissaString() {
        assertEquals(null,ok.getLyonti());
    }
//
//    /**
//     * Test of toString method, of class Nappi.
//     */
    @Test
    public void testToString() {
     assertEquals("[1] Lyhyt Syotto",lyhytSyotto.toString());
    }
//
//    /**
//     * Test of equals method, of class Nappi.
//     */
    @Test
    public void testEqualsPalauttaaTrue() {
        assertTrue(new Nappi(new LyhytSyotto()).equals(lyhytSyotto));
    }
    
    @Test
    public void testEqualsPalauttaaFalse() {
        assertFalse(lyhytSyotto.equals(ok));
    }
    
}

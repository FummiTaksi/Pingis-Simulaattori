/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lyonnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Aleksi
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Lyonnit.BlokkiTest.class, Lyonnit.LyhytSyottoTest.class, Lyonnit.PitkaSyottoTest.class, Lyonnit.LyontiTest.class, Lyonnit.SpinniTest.class, Lyonnit.AlakierreTest.class, Lyonnit.DeffuTest.class})
public class LyonnitSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}

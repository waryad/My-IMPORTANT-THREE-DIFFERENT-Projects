/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package SheridanFundamentalsGroupProject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class PlayersClassTest {
    
    public PlayersClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of blackJackGG method, of class PlayersClass.
     */
    @Test
    public void testBlackJackGG() {
        System.out.println("blackJackGG");
        PlayersClass instance = new PlayersClassImpl();
        boolean expResult = false;
        boolean result = instance.blackJackGG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testBlackJackGGGood() {
        System.out.println("blackJackGG");
        PlayersClass instance = new PlayersClassImpl();
        boolean expResult = false;
        boolean result = instance.blackJackGG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testBlackJackGGBad() {
        System.out.println("blackJackGG");
        PlayersClass instance = new PlayersClassImpl();
        boolean expResult = false;
        boolean result = instance.blackJackGG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHand method, of class PlayersClass.
     */
    @Test
    public void testSetHandBoundary() {
        System.out.println("setHand");
        HandClass hand = null;
        PlayersClass instance = new PlayersClassImpl();
        instance.setHand(hand);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class PlayersClass.
     */
    @Test
    public void testSetNameGood() {
        System.out.println("setName");
        String name = "David";
        PlayersClass instance = new PlayersClassImpl();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
       @Test
    public void testSetNameBad() {
        System.out.println("setName");
        String name = "David";
        PlayersClass instance = new PlayersClassImpl();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSetNameBoundary() {
        System.out.println("setName");
        String name = "David";
        PlayersClass instance = new PlayersClassImpl();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayHand method, of class PlayersClass.
     */
    @Test
    public void testDisplayHandGood() {
        System.out.println("displayHand");
        PlayersClass instance = new PlayersClassImpl();
        instance.displayHand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDisplayHandBad() {
        System.out.println("displayHand");
        PlayersClass instance = new PlayersClassImpl();
        instance.displayHand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDisplayHandBoundary() {
        System.out.println("displayHand");
        PlayersClass instance = new PlayersClassImpl();
        instance.displayHand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class PlayersClassImpl extends PlayersClass {
    }
    
}

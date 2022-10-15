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
public class HandClassTest {
    
    public HandClassTest() {
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
     * Test of getValueHand method, of class HandClass.
     */
    @Test
    public void testGetValueHandGood() {
        System.out.println("getValueHand");
        HandClass instance = new HandClass();
        int expResult = 0;
        int result = instance.getValueHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testGetValueHandBad() {
        System.out.println("getValueHand");
        HandClass instance = new HandClass();
        int expResult = 0;
        int result = instance.getValueHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testGetValueHandBoundary() {
        System.out.println("getValueHand");
        HandClass instance = new HandClass();
        int expResult = 0;
        int result = instance.getValueHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clearHand method, of class HandClass.
     */
    @Test
    public void testClearHandGood() {
        System.out.println("clearHand");
        HandClass instance = new HandClass();
        instance.clearHand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testClearHandBad() {
        System.out.println("clearHand");
        HandClass instance = new HandClass();
        instance.clearHand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

      @Test
    public void testClearHandBoundary() {
        System.out.println("clearHand");
        HandClass instance = new HandClass();
        instance.clearHand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HandClass.
     */
    @Test
    public void testToStringGood() {
        System.out.println("toString");
        HandClass instance = new HandClass();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testToStringBad() {
        System.out.println("toString");
        HandClass instance = new HandClass();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testToStringBoundary() {
        System.out.println("toString");
        HandClass instance = new HandClass();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }  
}

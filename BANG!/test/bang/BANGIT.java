/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bang;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emman
 */
public class BANGIT {
    
    public BANGIT() {
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
     * Test of main method, of class BANG.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BANG.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bartAction method, of class BANG.
     */
    @Test
    public void testBartAction() {
        System.out.println("bartAction");
        ArrayList<Player> play_order = null;
        int i = 0;
        int dam = 0;
        BANG.bartAction(play_order, i, dam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indianAttack method, of class BANG.
     */
    @Test
    public void testIndianAttack() {
        System.out.println("indianAttack");
        ArrayList<Player> play_order = null;
        BANG.indianAttack(play_order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deathSeq method, of class BANG.
     */
    @Test
    public void testDeathSeq_ArrayList_Player() {
        System.out.println("deathSeq");
        ArrayList<Player> play_order = null;
        Player deadMan = null;
        BANG.deathSeq(play_order, deadMan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of zombieStart method, of class BANG.
     */
    @Test
    public void testZombieStart() {
        System.out.println("zombieStart");
        BANG.zombieStart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deathSeq method, of class BANG.
     */
    @Test
    public void testDeathSeq_ArrayList_int() {
        System.out.println("deathSeq");
        ArrayList<Player> play_order = null;
        int i = 0;
        BANG.deathSeq(play_order, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notBart method, of class BANG.
     */
    @Test
    public void testNotBart() {
        System.out.println("notBart");
        ArrayList<Player> play_order = null;
        int i = 0;
        boolean gringo = false;
        int damage = 0;
        boolean expResult = false;
        boolean result = BANG.notBart(play_order, i, gringo, damage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endGame method, of class BANG.
     */
    @Test
    public void testEndGame() {
        System.out.println("endGame");
        int team = 0;
        BANG.endGame(team);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arrowTakeAction method, of class BANG.
     */
    @Test
    public void testArrowTakeAction() {
        System.out.println("arrowTakeAction");
        ArrayList<Player> play_order = null;
        int order = 0;
        BANG.arrowTakeAction(play_order, order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

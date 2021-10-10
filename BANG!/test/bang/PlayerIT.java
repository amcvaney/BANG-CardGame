/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bang;

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
public class PlayerIT {
    
    public PlayerIT() {
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
     * Test of getCharacter method, of class Player.
     */
    @Test
    public void testGetCharacter() {
        System.out.println("getCharacter");
        Player instance = null;
        CharacterCards expResult = null;
        CharacterCards result = instance.getCharacter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bulletUpdate method, of class Player.
     */
    @Test
    public void testBulletUpdate() {
        System.out.println("bulletUpdate");
        Player instance = null;
        instance.bulletUpdate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addArrow method, of class Player.
     */
    @Test
    public void testAddArrow() {
        System.out.println("addArrow");
        int number = 0;
        Player instance = null;
        instance.addArrow(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeArrow method, of class Player.
     */
    @Test
    public void testRemoveArrow() {
        System.out.println("removeArrow");
        int number = 0;
        Player instance = null;
        instance.removeArrow(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arrowReset method, of class Player.
     */
    @Test
    public void testArrowReset() {
        System.out.println("arrowReset");
        Player instance = null;
        instance.arrowReset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of damage method, of class Player.
     */
    @Test
    public void testDamage() {
        System.out.println("damage");
        int damage = 0;
        Player instance = null;
        instance.damage(damage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaxHealth method, of class Player.
     */
    @Test
    public void testSetMaxHealth() {
        System.out.println("setMaxHealth");
        int maxHealth = 0;
        Player instance = null;
        instance.setMaxHealth(maxHealth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of heal method, of class Player.
     */
    @Test
    public void testHeal() {
        System.out.println("heal");
        int heal = 0;
        Player instance = null;
        instance.heal(heal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of revealRole method, of class Player.
     */
    @Test
    public void testRevealRole() {
        System.out.println("revealRole");
        Player instance = null;
        instance.revealRole();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bang;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
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
public class BANGFXIT {
    
    public BANGFXIT() {
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
     * Test of main method, of class BANGFX.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BANGFX.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class BANGFX.
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Stage primaryStage = null;
        BANGFX instance = new BANGFX();
        instance.start(primaryStage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetDictionary method, of class BANGFX.
     */
    @Test
    public void testResetDictionary() {
        System.out.println("resetDictionary");
        BANGFX instance = new BANGFX();
        instance.resetDictionary();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of action method, of class BANGFX.
     */
    @Test
    public void testAction() {
        System.out.println("action");
        BANGFX instance = new BANGFX();
        instance.action();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stageSet method, of class BANGFX.
     */
    @Test
    public void testStageSet() {
        System.out.println("stageSet");
        Group group = null;
        BANGFX instance = new BANGFX();
        Group expResult = null;
        Group result = instance.stageSet(group);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of textMove method, of class BANGFX.
     */
    @Test
    public void testTextMove() {
        System.out.println("textMove");
        Label line = null;
        String text = "";
        int x = 0;
        int y = 0;
        int fontSize = 0;
        BANGFX instance = new BANGFX();
        instance.textMove(line, text, x, y, fontSize);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imageSet method, of class BANGFX.
     */
    @Test
    public void testImageSet() {
        System.out.println("imageSet");
        ImageView img = null;
        int width = 0;
        int height = 0;
        Image imgage = null;
        BANGFX instance = new BANGFX();
        instance.imageSet(img, width, height, imgage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imageMove method, of class BANGFX.
     */
    @Test
    public void testImageMove() {
        System.out.println("imageMove");
        ImageView img = null;
        int x = 0;
        int y = 0;
        BANGFX instance = new BANGFX();
        instance.imageMove(img, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCharacters method, of class BANGFX.
     */
    @Test
    public void testUpdateCharacters() {
        System.out.println("updateCharacters");
        BANGFX instance = new BANGFX();
        instance.updateCharacters();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of go1 method, of class BANGFX.
     */
    @Test
    public void testGo1() {
        System.out.println("go1");
        BANGFX instance = new BANGFX();
        instance.go1();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of go2 method, of class BANGFX.
     */
    @Test
    public void testGo2() {
        System.out.println("go2");
        BANGFX instance = new BANGFX();
        instance.go2();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of go3 method, of class BANGFX.
     */
    @Test
    public void testGo3() {
        System.out.println("go3");
        BANGFX instance = new BANGFX();
        instance.go3();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of go4 method, of class BANGFX.
     */
    @Test
    public void testGo4() {
        System.out.println("go4");
        BANGFX instance = new BANGFX();
        instance.go4();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

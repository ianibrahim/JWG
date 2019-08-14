/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kris
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    @Before
    public void setUp() {
     
        
    }

 
//    @Test
//    public void testGetGoodInstance() {
//
//        int expResult = 52;
//        int result = GroupOfCards.getInstance().size();
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testBadInstance() {
//
//        int expResult = 25;
//        int result = GroupOfCards.getInstance().size();
//        assertEquals(expResult, result);
//    }
    

@Test
    public void testGetGoodInstance() {
        System.out.println("testDeckSizeGood");
        int deckSize = 52;
        GroupOfCards instance = new GroupOfCards();
        int expResult = 52;
        int result = instance.getDeckSize();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetBadInstance() {
        System.out.println("testDeckSizeBad");
        int deckSize = 12;
        GroupOfCards instance = new GroupOfCards();
        int expResult = 52;
        int result = instance.getDeckSize();
        assertEquals(expResult, result);
    }
}

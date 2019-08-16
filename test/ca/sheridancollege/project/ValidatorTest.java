/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kris
 */
public class ValidatorTest {
    
    public ValidatorTest() {
    }

    @Test
    public void testGetGoodValidInt() {
        System.out.println("getValidIntGood");
        int check = 1;
        Validator instance = new Validator();
        int expResult = 1;
        int result = instance.getValidInt();
        assertEquals(expResult, result);

    }
    
    @Test
    public void testGetBadValidInt() {
        System.out.println("getValidIntBad");
        int check = -1;
        Validator instance = new Validator();
        int expResult = 2;
        int result = instance.getValidInt();
        assertEquals(expResult, result);

    }
    
}

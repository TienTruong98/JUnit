/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author natton
 */
public class FactorialNormalTest {
    @Test
    public void testSuccessfullCases(){
        assertEquals(FactorialCalculator.calculateFactorial(2), 1);
        assertEquals(FactorialCalculator.calculateFactorial(3), 6);
        assertEquals(FactorialCalculator.calculateFactorial(4), 24);
    }
    @Test
    public void testSpecialCases(){
        assertEquals(FactorialCalculator.calculateFactorial(0), 1);
        assertEquals(FactorialCalculator.calculateFactorial(1), 1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testException(){
        FactorialCalculator.calculateFactorial(-5);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author natton
 */
@RunWith(value = Parameterized.class)
public class FactorialAdvanceTest {
    @Parameterized.Parameters
    public static Collection<Object[]> initData(){
        return Arrays.asList(new Object[][] {
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {4,24},
            {5,120}
        });
    }
    
    @Parameterized.Parameter(value = 1)
    public long expected;
    @Parameterized.Parameter(value = 0)
    public int input;
    
    @Test
    public void testMultiCasses(){
        Assert.assertEquals(expected, utils.FactorialCalculator.calculateFactorial(input));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assume;
import org.junit.runners.Parameterized;

/**
 *
 * @author natton
 */
public class CalculatorTest {

    enum Type {
        SUBSTRACT, ADD
    }

    public CalculatorTest() {
    }

    public static Collection<Object[]> initData() {
        return Arrays.asList(new Object[][]{
            {Type.ADD, 1, 2, 3},
            {Type.ADD, 2, 3, 5},
            {Type.SUBSTRACT, 1, 2, -1},
            {Type.SUBSTRACT, 2, 3, -1}
        });
    }

    @Parameterized.Parameter
    public int input1;
    @Parameterized.Parameter
    public int input2;
    @Parameterized.Parameter
    public int expected;
    @Parameterized.Parameter
    public Type type;
    
    @Test
    public void testAdd(){
        Assume.assumeTrue(type == Type.ADD);
        assertEquals(expected, Calculator.add(input1, input2));
    }
    
    @Test
    public void testSubbtract(){
        Assume.assumeTrue(type == Type.SUBSTRACT);
        assertEquals(expected, Calculator.substract(input1, input2));
    }

}

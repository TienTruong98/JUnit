/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author natton
 */
public class FactorialCalculator {

    public static long calculateFactorial(int n) throws IllegalArgumentException {
        long result = 1;
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("0<=n<=15");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

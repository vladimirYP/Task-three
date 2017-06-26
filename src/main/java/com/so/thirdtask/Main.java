/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.thirdtask;

import java.math.BigInteger;

/**
 *
 * @author Влад
 */
public class Main {

    /**
     * Calculates the factorial
     *
     * @param count index of the factorial
     */
    public BigInteger factorial(int count) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i < count + 1; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    /**
     * Calculates the sum of digits of the number
     *
     * @param number Number to calculate converted to String
     */
    public int sum(String number) {
        String s[] = number.split("");
        int res = 0;
        for (int i = 0; i < s.length; i++) {
            res += Integer.parseInt(s[i]);
        }
        return res;
    }

}

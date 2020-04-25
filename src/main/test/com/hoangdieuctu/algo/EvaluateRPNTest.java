package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class EvaluateRPNTest {

    @Test
    public void testCase1() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int eval = EvaluateRPN.eval(tokens);
        Assert.assertEquals(9, eval);
    }

    @Test
    public void testCase2() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        int eval = EvaluateRPN.eval(tokens);
        Assert.assertEquals(6, eval);
    }

}

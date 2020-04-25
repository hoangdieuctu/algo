package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class EvaluateIPNTest {


    @Test
    public void testCase1() {
        String[] tokens = {"5", "+", "4", "*", "3", "-", "2"};
        int eval = EvaluateIPN.eval(tokens);
        Assert.assertEquals(15, eval);
    }

    @Test
    public void testCase2() {
        String[] tokens = {"5", "*", "(", "5", "+", "3", ")", "/", "2"};
        int eval = EvaluateIPN.eval(tokens);
        Assert.assertEquals(20, eval);
    }


    @Test
    public void testCase3() {
        String[] tokens = {"6", "*", "(", "4", "+", "3", "*", "2", ")", "/", "2"};
        int eval = EvaluateIPN.eval(tokens);
        Assert.assertEquals(30, eval);
    }

    @Test
    public void testCase4() {
        String[] tokens = {"6", "*", "(", "4", "+", "3", "*", "2", "*", "(", "4", "+", "6", ")", ")", "/", "2"};
        int eval = EvaluateIPN.eval(tokens);
        Assert.assertEquals(192, eval);
    }
}

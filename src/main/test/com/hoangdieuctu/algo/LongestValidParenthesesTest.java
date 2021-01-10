package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class LongestValidParenthesesTest {

    @Test
    public void testCase1() {
        int result = LongestValidParentheses.find(")()())");
        Assert.assertEquals(4, result);
    }

    @Test
    public void testCase2() {
        int result = LongestValidParentheses.find("(()");
        Assert.assertEquals(2, result);
    }

    @Test
    public void testCase3() {
        int result = LongestValidParentheses.find("()(()");
        Assert.assertEquals(2, result);
    }

    @Test
    public void testCase4() {
        int result = LongestValidParentheses.find("()()())");
        Assert.assertEquals(6, result);
    }
}

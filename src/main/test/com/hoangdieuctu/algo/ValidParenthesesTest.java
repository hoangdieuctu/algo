package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void testCase1() {
        boolean valid = ValidParentheses.valid("()");
        Assert.assertTrue(valid);
    }

    @Test
    public void testCase2() {
        boolean valid = ValidParentheses.valid("[(()[]())]");
        Assert.assertTrue(valid);
    }

    @Test
    public void testCase3() {
        boolean valid = ValidParentheses.valid("[)");
        Assert.assertFalse(valid);
    }

    @Test
    public void testCase4() {
        boolean valid = ValidParentheses.valid("[");
        Assert.assertFalse(valid);
    }

    @Test
    public void testCase5() {
        boolean valid = ValidParentheses.valid("]");
        Assert.assertFalse(valid);
    }
}

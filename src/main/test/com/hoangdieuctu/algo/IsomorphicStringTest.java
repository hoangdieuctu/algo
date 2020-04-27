package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class IsomorphicStringTest {

    @Test
    public void testCase1() {
        boolean isomorphic = IsomorphicString.isomorphic("abca", "defd");
        Assert.assertTrue(isomorphic);
    }

    @Test
    public void testCase2() {
        boolean isomorphic = IsomorphicString.isomorphic("abca", "deff");
        Assert.assertFalse(isomorphic);
    }

    @Test
    public void testCase3() {
        boolean isomorphic = IsomorphicString.isomorphic("ab", "xx");
        Assert.assertFalse(isomorphic);
    }
}

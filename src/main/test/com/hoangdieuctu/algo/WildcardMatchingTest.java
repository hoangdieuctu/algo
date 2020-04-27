package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class WildcardMatchingTest {

    @Test
    public void testCase1() {
        boolean match = WildcardMatching.match("bbaabefsabc", "*bc");
        Assert.assertTrue(match);
    }

    @Test
    public void testCase2() {
        boolean match = WildcardMatching.match("abc", "*b*");
        Assert.assertTrue(match);
    }

    @Test
    public void testCase3() {
        boolean match = WildcardMatching.match("abc", "*bd");
        Assert.assertFalse(match);
    }

    @Test
    public void testCase4() {
        boolean match = WildcardMatching.match("abc", "a?c");
        Assert.assertTrue(match);
    }

    @Test
    public void testCase5() {
        boolean match = WildcardMatching.match("aa", "a");
        Assert.assertFalse(match);
    }

    @Test
    public void testCase6() {
        boolean match = WildcardMatching.match("adceb", "*a*b");
        Assert.assertTrue(match);
    }

    @Test
    public void testCase7() {
        boolean match = WildcardMatching.match("aaaa", "***a");
        Assert.assertTrue(match);
    }

    @Test
    public void testCase8() {
        boolean match = WildcardMatching.match("aaaa", "*");
        Assert.assertTrue(match);
    }

    @Test
    public void testCase9() {
        boolean match = WildcardMatching.match("", "*");
        Assert.assertTrue(match);
    }

    @Test
    public void testCase10() {
        boolean match = WildcardMatching.match("abc", "****");
        Assert.assertTrue(match);
    }
}

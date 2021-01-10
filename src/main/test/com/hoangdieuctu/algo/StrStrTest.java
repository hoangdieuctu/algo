package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class StrStrTest {

    @Test
    public void testCase1() {
        int index = StrStr.strStr("hello", "ll");
        Assert.assertEquals(2, index);
    }

    @Test
    public void testCase2() {
        int index = StrStr.strStr("hello", "oo");
        Assert.assertEquals(-1, index);
    }

    @Test
    public void testCase3() {
        int index = StrStr.strStr("hello", "");
        Assert.assertEquals(0, index);
    }
}

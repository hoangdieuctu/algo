package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void testCase1() {
        String str = "Today is Saturday";
        String reverse = ReverseString.reverse(str);
        Assert.assertEquals("Saturday is Today", reverse);
    }

}

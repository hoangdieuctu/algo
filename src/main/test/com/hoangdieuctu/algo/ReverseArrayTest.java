package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class ReverseArrayTest {

    @Test
    public void testCase1() {
        int[] arr = new int[]{1, 2, 3, 6, 7, 4, 3};

        ReverseArray.reverse(arr);

        int[] expect = new int[]{3, 4, 7, 6, 3, 2, 1};
        Assert.assertArrayEquals(expect, arr);
    }

}

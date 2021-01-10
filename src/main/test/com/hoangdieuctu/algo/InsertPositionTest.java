package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class InsertPositionTest {

    @Test
    public void testCase1() {
        int position = InsertPosition.find(new int[]{1, 3, 5, 6}, 5);
        Assert.assertEquals(2, position);
    }

    @Test
    public void testCase2() {
        int position = InsertPosition.find(new int[]{1, 3, 5, 6}, 2);
        Assert.assertEquals(1, position);
    }
}

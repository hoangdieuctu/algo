package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class KthSmallestTest {

    @Test
    public void testCase1() {
        int smallest = KthSmallest.find(new int[]{3, 2, 1, 5, 6, 4}, 2);
        Assert.assertEquals(2, smallest);
    }

}

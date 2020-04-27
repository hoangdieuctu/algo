package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class KthLargestTest {

    @Test
    public void testCase1() {
        int largest = KthLargest.find(new int[]{3, 2, 1, 5, 6, 4}, 2);
        Assert.assertEquals(5, largest);
    }

}

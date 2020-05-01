package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumIIITest {

    @Test
    public void testCase1() {
        TwoSumIII twoSumIII = new TwoSumIII();
        twoSumIII.add(1);
        twoSumIII.add(3);
        twoSumIII.add(5);

        Assert.assertEquals(true, twoSumIII.find(4));
        Assert.assertEquals(false, twoSumIII.find(7));
    }

}

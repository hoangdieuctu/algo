package com.hoangdieuctu.line;

import org.junit.Assert;
import org.junit.Test;

public class Ex4Test {

    @Test
    public void test1() {
        int[] results = Ex4.find(new int[]{2, 3, 4, 1, 5}, 6);
        Assert.assertEquals(2, results.length);
    }


    @Test
    public void test2() {
        int[] results = Ex4.find(new int[]{2, 3, 4, 1, 5}, 0);
        Assert.assertEquals(0, results.length);
    }

    @Test
    public void test3() {
        String input = "2 3 4 1 5";
        String[] items = input.split(" ");
        int[] arr = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            arr[i] = Integer.parseInt(items[i]);
        }

        System.out.println(-1);
        int[] results = Ex4.find(arr, 6);
        Assert.assertEquals(2, results.length);
        Assert.assertEquals(1, results[0]);
        Assert.assertEquals(5, results[1]);
    }
}

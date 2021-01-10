package com.hoangdieuctu.algo;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SlidingWindowTest {

    @Test
    public void testCase1_1() {
        int[] arr = new int[]{12, 1, 78, 90, 57, 89, 56};
        List<Integer> results = SlidingWindow.printMax(arr, 3);
        Assert.assertEquals("[78, 90, 90, 90, 89]", results.toString());
    }

    @Test
    public void testCase1_2() {
        int[] arr = new int[]{12, 1, 78, 90, 57, 89, 56};
        List<Integer> results = SlidingWindow.printMaxIndexBase(arr, 3);
        Assert.assertEquals("[78, 90, 90, 90, 89]", results.toString());
    }

    @Test
    public void testCase2_1() {
        int[] arr = new int[]{12, 10, 11, 5, 5, 5, 4};
        List<Integer> results = SlidingWindow.printMax(arr, 3);
        Assert.assertEquals("[12, 11, 11, 5, 5]", results.toString());
    }

    @Test
    public void testCase2_2() {
        int[] arr = new int[]{12, 10, 11, 5, 5, 5, 4};
        List<Integer> results = SlidingWindow.printMaxIndexBase(arr, 3);
        Assert.assertEquals("[12, 11, 11, 5, 5]", results.toString());
    }
}

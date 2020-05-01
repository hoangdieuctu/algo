package com.hoangdieuctu.algo;

public class TwoSumII {

    static int[] find(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (true) {
            int result = nums[start] + nums[end];
            if (result == target) {
                break;
            }

            if (result > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[]{start + 1, end + 1};
    }

}

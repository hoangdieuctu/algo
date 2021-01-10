package com.hoangdieuctu.algo;

public class InsertPosition {

    static int find(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            int val = nums[mid];
            if (val == target) {
                return mid;
            } else if (val > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return i;
    }


}

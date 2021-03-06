package com.hoangdieuctu.algo;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static int[] find(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if (map.containsKey(c)) {
                return new int[]{map.get(c) + 1, i + 1};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }

}

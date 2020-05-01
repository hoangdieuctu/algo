package com.hoangdieuctu.algo;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIII {

    Set<Integer> nums = new HashSet<>();
    Set<Integer> sums = new HashSet<>();

    public void add(int num) {
        for (Integer n : nums) {
            sums.add(n + num);
        }

        nums.add(num);
    }

    public boolean find(int target) {
        return sums.contains(target);
    }
}

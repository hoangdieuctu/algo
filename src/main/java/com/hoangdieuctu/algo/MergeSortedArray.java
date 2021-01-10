package com.hoangdieuctu.algo;

public class MergeSortedArray {

    /**
     * @param nums1 => 1 2 3 0 0 0
     * @param m    => 6
     * @param nums2 => 2 5 6
     * @param n    => 3
     */
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        int i = 0;

        while (i < m) {
            if (j < n && nums2[j] < nums1[i]) {
                if (nums1.length - 1 - i >= 0) {
                    System.arraycopy(nums1, i, nums1, i + 1, nums1.length - 1 - i);
                }

                nums1[i] = nums2[j];

                m++;
                j++;
            }
            i++;
        }

        while (j < n) {
            nums1[i] = nums2[j];

            i++;
            j++;
        }
    }

}

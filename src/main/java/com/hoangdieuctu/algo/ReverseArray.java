package com.hoangdieuctu.algo;

public class ReverseArray {

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int j = arr.length - i - 1;
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }

}

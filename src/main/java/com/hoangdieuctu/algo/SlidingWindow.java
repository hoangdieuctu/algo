package com.hoangdieuctu.algo;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindow {

    static List<Integer> printMax(int arr[], int k) {
        List<Integer> results = new ArrayList<>();

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.getLast() < arr[i]) {
                deque.removeLast();
            }
            deque.addLast(arr[i]);
        }

        results.add(deque.peek());

        for (int j = k; j < arr.length; j++) {
            while (!deque.isEmpty() && deque.getLast() < arr[j]) {
                deque.removeLast();
            }
            deque.addLast(arr[j]);
            if (deque.peekFirst() == arr[j - k]) {
                deque.removeFirst();
            }

            results.add(deque.peek());
        }

        return results;
    }

    static List<Integer> printMaxIndexBase(int[] arr, int k) {
        List<Integer> results = new ArrayList<>();

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && arr[deque.getLast()] < arr[i]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        results.add(arr[deque.peek()]);

        for (int j = k; j < arr.length; j++) {
            if (deque.peekFirst() == j - k) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && arr[deque.getLast()] < arr[j]) {
                deque.removeLast();
            }
            deque.addLast(j);

            results.add(arr[deque.peek()]);
        }

        return results;
    }
}

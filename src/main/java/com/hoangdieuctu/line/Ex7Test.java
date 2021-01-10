package com.hoangdieuctu.line;

import org.junit.Test;

import java.util.*;

public class Ex7Test {

    List<String> lines = Arrays.asList("1", "5", "-1", "3");

    /**
     * test case windows = 3
     */
    @Test
    public void test1() {
        int windowSize = 3;

        List<Integer> arr = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        int f = 4;

        arr.add(f);
        deque.addLast(f);

        int i = 1;
        for (String line : lines) {
            int val = Integer.parseInt(line);
            arr.add(val);
            i++;

            while (!deque.isEmpty() && deque.getLast() < val) {
                deque.removeLast();
            }
            deque.addLast(val);
            System.out.println(deque.peek());

            if (i >= windowSize && deque.peekFirst().equals(arr.get(i - windowSize))) {
                deque.removeFirst();
            }
        }
    }

}

package com.hoangdieuctu.nab;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class NABTest {

    @Test
    public void test1() {
        int sum = Arrays.stream(new int[]{1, 2, 3})
                .filter(i -> i >= 2)
                .map(i -> i * 3)
                .sum();
        System.out.println(sum);
    }

    @Test
    public void test2() {
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123", "555-3389"));
        people.put("Mary", Arrays.asList("555-2243", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242"));

        List<String> phones = people.values().stream()
                .flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println(phones);
    }

    @Test
    public void test3() {
//        String[] a = {"a", "p", "s", "n"};
//        Arrays.sort(a, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        int b = Arrays.binarySearch(a, "n");
//        System.out.println(b);

//        int[] f = {1,2,3,6,8};
        int[] f = {8,6,3,2,1};
        System.out.println(Arrays.binarySearch(f, 6));
    }
}

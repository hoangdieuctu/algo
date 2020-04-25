package com.hoangdieuctu.algo;

public class ReverseString {

    static String reverse(String str) {
        String[] items = str.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = items.length - 1; i >= 0; i--) {
            builder.append(items[i]).append(" ");
        }

        return builder.substring(0, builder.length() - 1);
    }

}

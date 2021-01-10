package com.hoangdieuctu.convert;

public class StrToAscii {

    public static String convert(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            builder.append(c).append(" ");
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("wearekarros"));
    }
}

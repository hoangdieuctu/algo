package com.hoangdieuctu.line;

public class Ex1 {

    /**
     * RemoteIo is awesome
     *
     * @param s
     * @return
     */
    static String revert(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder builder = new StringBuilder();
        String[] items = s.split(" ");
        for (String item : items) {
            StringBuilder b = new StringBuilder(item).reverse();
            builder.append(b).append(" ");
        }

        return builder.substring(0, builder.length() - 1);
    }

}

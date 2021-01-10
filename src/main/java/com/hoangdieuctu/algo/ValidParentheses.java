package com.hoangdieuctu.algo;

import java.util.Stack;

public class ValidParentheses {

    static boolean valid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                case ']':
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    }

                    Character pop = stack.pop();
                    int r = c - pop;
                    if (r != 1 && r != 2) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }

        return stack.isEmpty();
    }
}

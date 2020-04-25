package com.hoangdieuctu.algo;

import java.util.Stack;

public class EvaluateRPN {

    static int eval(String[] tokens) {
        String operations = "+-*/";
        Stack<String> stack = new Stack<>();

        for (String token : tokens) {
            if (!operations.contains(token)) {
                stack.push(token);
            } else {
                Integer f = Integer.parseInt(stack.pop());
                Integer n = Integer.parseInt(stack.pop());

                switch (token) {
                    case "+":
                        stack.push(String.valueOf(n + f));
                        break;
                    case "-":
                        stack.push(String.valueOf(n - f));
                        break;
                    case "*":
                        stack.push(String.valueOf(n * f));
                        break;
                    case "/":
                        stack.push(String.valueOf((n / f)));
                        break;
                }
            }
        }

        return Integer.parseInt(stack.pop());
    }

}

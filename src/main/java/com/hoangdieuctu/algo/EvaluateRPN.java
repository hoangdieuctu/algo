package com.hoangdieuctu.algo;

import java.util.Stack;

public class EvaluateRPN {

    static int eval(String[] tokens) {
        String operations = "+-*/";
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (!operations.contains(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                Integer f = stack.pop();
                Integer n = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(n + f);
                        break;
                    case "-":
                        stack.push(n - f);
                        break;
                    case "*":
                        stack.push(n * f);
                        break;
                    case "/":
                        stack.push(n / f);
                        break;
                }
            }
        }

        return stack.pop();
    }

}

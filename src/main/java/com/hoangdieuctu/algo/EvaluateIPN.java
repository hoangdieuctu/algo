package com.hoangdieuctu.algo;

import java.util.*;

public class EvaluateIPN {

    static int eval(String[] tokens) {
        Map<String, Integer> priority = new HashMap<>();
        priority.put("+", 1);
        priority.put("-", 1);
        priority.put("*", 2);
        priority.put("/", 2);

        Stack<String> operators = new Stack<>();

        List<String> rTokens = new ArrayList<>();
        for (String token : tokens) {
            if (token.equals("(")) {
                operators.push(token);
            } else if (token.equals(")")) {
                while (true) {
                    String pOps = operators.pop();
                    if (pOps.equals("(")) {
                        break;
                    }
                    rTokens.add(pOps);
                }
            } else if (!priority.keySet().contains(token)) {
                rTokens.add(token);
            } else {
                if (operators.isEmpty()) {
                    operators.push(token);
                } else {
                    String pOps = operators.peek();
                    if (priority.containsKey(pOps) && priority.get(pOps) > priority.get(token)) {
                        rTokens.add(pOps);
                        operators.pop();
                    }
                    operators.push(token);
                }
            }
        }

        while (!operators.isEmpty()) {
            rTokens.add(operators.pop());
        }

        String[] cTokens = new String[rTokens.size()];
        for (int i = 0; i < rTokens.size(); i++) {
            cTokens[i] = rTokens.get(i);
        }

        return EvaluateRPN.eval(cTokens);
    }

}

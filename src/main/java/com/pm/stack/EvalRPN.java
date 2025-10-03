package com.pm.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvalRPN {
    private int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String s : tokens) {
            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                int val2 = stack.pop();
                int val1 = stack.pop();
                stack.push(val1 - val2);
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (s.equals("/")) {
                int val2 = stack.pop();
                int val1 = stack.pop();
                stack.push(val1 / val2);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    public int solution() {
        return evalRPN(new String[]{"1","2","+","3","*","4","-"});
    }
}

package com.pm.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        var top = minStack.isEmpty() ? val : minStack.peek();
        val = Math.min(top, val);
        minStack.push(val);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        stack.peek();
    }

    public int getMin() {
        minStack.peek();
    }
}

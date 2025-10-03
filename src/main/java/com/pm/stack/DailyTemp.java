package com.pm.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemp {
    private int[] dailyTemperatures(int[] temperatures) {
        record Pair (int temp, int index) {}
        Deque<Pair> stack = new ArrayDeque<>();
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()) {
                stack.push(new Pair(temperatures[i], i));
            } else {
                while (!stack.isEmpty() && stack.peek().temp < temperatures[i]) {
                    Pair p = stack.pop();
                    res[p.index] = i - p.index;
                }
                stack.push(new Pair(temperatures[i], i));
            }
        }

        return res;
    }

    public int[] solution() {
        return dailyTemperatures(new int[]{30,38,30,36,35,40,28});
    }
}

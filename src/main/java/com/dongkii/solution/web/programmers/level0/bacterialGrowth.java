package com.dongkii.solution.web.programmers.level0;

public class bacterialGrowth {
    public static int solution(int n, int t) {
        Double tmp = Math.pow(2, t);
        return tmp.intValue() * n;
    }
}

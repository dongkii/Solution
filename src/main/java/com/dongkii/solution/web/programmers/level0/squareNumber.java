package com.dongkii.solution.web.programmers.level0;

public class squareNumber {
    public static int solution(int n) {
        Double tmp = Math.sqrt(n);
        int tmpInt = tmp.intValue();
        tmp = Math.pow(tmpInt, 2);
        return tmp.intValue() == n?1:2;
    }
}

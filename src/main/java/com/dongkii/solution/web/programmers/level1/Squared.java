package com.dongkii.solution.web.programmers.level1;

import java.util.regex.Pattern;

public class Squared {
    public static long solution(long n) {
        long answer = 0;

        Double sqrt = Math.sqrt(n);
        if(sqrt == sqrt.intValue()) {
            answer = (long)Math.pow(sqrt+1, 2);
        } else {
            answer = -1;
        }

        return answer;
    }
}

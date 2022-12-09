package com.dongkii.solution.web.programmers.level2;

public class longJump {
    public static long solution(int n) {
        long answer = 0;
        long[] memo = new long[2001];
        memo[1] = 1;
        memo[2] = 2;

        for(int i = 3; i <= n; i++) {
            memo[i] = (memo[i-1] + memo[i-2]) % 1234567;
        }

        return memo[n];
    }
}

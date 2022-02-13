package com.dongkii.solution.web.programmers.level1;

public class Divisor {
    public static int solution(int n) {
        int answer = 0;

        for(int j = 1; j <= n/2; j++) {
            if(n % j == 0) {
                answer += j;
            }
        }

        // 입력 n이 0일때 더하지 않게
        if(n > 0) answer +=n;

        return answer;
    }
}

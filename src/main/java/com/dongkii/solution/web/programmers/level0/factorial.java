package com.dongkii.solution.web.programmers.level0;

public class factorial {
    public static int solution(int n) {
        int answer = 0;

        int k = 2;
        int result = 1;
        while(true) {
            result = result * k;
            if(result == n) {
                answer = k;
                break;
            } else if(result > n) {
                answer = k-1;
                break;
            }

            k++;
        }

        return answer;
    }
}

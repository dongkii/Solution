package com.dongkii.solution.web.programmers.level1;

public class colaProblem {
    public static int solution(int a, int b, int n) {
        int answer = 0;

        int result = n;
        int mod = 0;

        while(true) {
            if(result < a) break;

            mod = result%a;
            answer += (result-mod)/a * b;
            result = (result-mod)/a * b + mod;
        }

        return answer;
    }
}

package com.dongkii.solution.web.programmers.level2;

public class dotted {
    public static long solution(int k, int d) {
        long answer = 0;

        for(int i = 0; i <= d; i+=k) {
           int tmp = (int)Math.sqrt( Math.pow(d, 2) - Math.pow(i, 2));

           answer += (tmp/k)+1;
        }

        return answer;
    }
}

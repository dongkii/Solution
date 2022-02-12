package com.dongkii.solution.web.programmers.level1;

public class Collatz {
    public static int solution(int num) {
        int answer = -1;

        int cnt = 0;

        while(cnt < 500) {
            if(num == 1) break;
            num = num%2 == 0 ? num/2 : num*3 + 1;
            cnt++;
        }

        return cnt >= 500 ? answer : cnt;
    }
}

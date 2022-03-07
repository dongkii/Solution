package com.dongkii.solution.web.programmers.level2;

public class Jump_and_teleport {
    public static int solution(int n) {
        int answer = 0;

        while(n != 0) {
            if(n%2 == 0) {
                n = n/2;
            } else {
                answer +=1;
                n -=1;
            }
        }

        return answer;
    }
}

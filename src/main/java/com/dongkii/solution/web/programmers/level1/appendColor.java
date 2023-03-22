package com.dongkii.solution.web.programmers.level1;

public class appendColor {
    public static int solution(int n, int m, int[] section) {
        int answer = 0;

        if(section.length == 1) {
            return 1;
        }

        int tmp = section[0] + m - 1;
        answer++;

        for(int i = 1; i < section.length; i++) {
            if(section[i] > tmp) {
                tmp = section[i] + m - 1;
                answer++;
            }
        }

        return answer;
    }
}

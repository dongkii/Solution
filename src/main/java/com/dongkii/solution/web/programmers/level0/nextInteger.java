package com.dongkii.solution.web.programmers.level0;

public class nextInteger {
    public static int solution(int[] common) {
        int answer = 0;

        int tmp1 = common[common.length-1] - common[common.length-2];
        int tmp2 = common[common.length-2] - common[common.length-3];

        if(tmp1 == tmp2) {
            answer = common[common.length-1] + tmp1;
        } else {
            answer = common[common.length-1] * (tmp1/tmp2);
        }

        return answer;
    }
}

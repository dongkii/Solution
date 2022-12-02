package com.dongkii.solution.web.programmers.level1;

import java.util.Arrays;

public class hallOfFame {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        int[] tmpArr = new int[score.length];

        for(int i = 0; i < score.length; i++) {
            tmpArr[i] = score[i];

            int[] tmp = Arrays.copyOf(tmpArr, tmpArr.length);
            Arrays.sort(tmp);

            if(i < k) {
                answer[i] = tmp[score.length-1-i];
            } else {
                answer[i] = tmp[score.length-k];
            }
        }

        return answer;
    }
}

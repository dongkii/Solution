package com.dongkii.solution.web.programmers.level2;

import java.util.Arrays;

public class MinMax {
    public static String solution(String s) {
        String answer = "";

        String[] sArr = s.split(" ");
        int[] iArr = new int[sArr.length];

        for(int i = 0; i < sArr.length; i++) {
            iArr[i] = Integer.valueOf(sArr[i]);
        }

        Arrays.sort(iArr);

        answer = iArr[0] + " " + iArr[iArr.length-1];

        return answer;
    }
}

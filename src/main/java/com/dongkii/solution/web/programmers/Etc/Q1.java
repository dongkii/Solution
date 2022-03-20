package com.dongkii.solution.web.programmers.Etc;

public class Q1 {
    public static String solution(int U, int L, int[] C) {
        // write your code in Java SE 11
        String answer = "";

        int[][] result = new int[2][C.length];
        int upper = 0;
        int lower = 0;

        // 각 열의 합계
        for(int i = 0; i < C.length; i++) {
            if(C[i] == 2) {
                result[0][i] = 1;
                result[1][i] = 1;
            } else if (C[i] == 1) {
                result[0][i] = 1;
                result[1][i] = 0;
            } else {
                result[0][i] = 0;
                result[1][i] = 0;
            }

            upper += result[0][i];
            lower += result[1][i];

            if(upper > U) {
                result[0][i] = 0;
                result[1][i] = 1;
            }
        }

        if(upper+lower != U + L) return "IMPOSSIBLE";

        for(int j = 0; j < 2; j++) {
            for(int k = 0; k < C.length; k++) {
                answer += String.valueOf(result[j][k]);
            }
            if(j == 0) answer += ",";
        }

        return answer;
    }
}

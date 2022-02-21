package com.dongkii.solution.web.programmers.level2;

import java.util.Arrays;

public class MinNumber {
    public static int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }

        /* 1차 풀이 - 실패 및 시간초과
        for(int i = 0; i < A.length; i++) {
            int tempSum = 0;

            int j = 0;

            while(true) {
                if(j == A.length) break;

                tempSum += A[j] * B[(j+i)%B.length];
                j++;

            }

            answer = (answer == 0) ? tempSum : (answer > tempSum ? tempSum : answer); // 최소값 비교
        }
        */

        return answer;
    }
}
package com.dongkii.solution.web.programmers.level1;

import java.util.*;

public class SecretMap {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0; i < n; i++) {
            int tmp1 = arr1[i];
            int tmp2 = arr2[i];
            answer[i] = "";

            for(int j = 0; j < n; j++) {        // arr배열의 각인덱스를 2^n-j-1 로 나누어 몫을 OR연산 처리, 나머지를 다시 계산
                answer[i] += ((tmp1 / (int)Math.pow(2, n-j-1) | tmp2 / (int)Math.pow(2, n-j-1)) == 1? "#" : " ");   // 1일경우 #으로, 0일경우 공백으로
                
                tmp1 = (int)(tmp1 % (int)Math.pow(2, n-j-1));
                tmp2 = (int)(tmp2 % (int)Math.pow(2, n-j-1));
            }
        }

        return answer;
    }
}

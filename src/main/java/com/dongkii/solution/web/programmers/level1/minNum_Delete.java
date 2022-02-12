package com.dongkii.solution.web.programmers.level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class minNum_Delete {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        if(arr.length == 1) return new int[] {-1};

        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }

        int t = 0;
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != min) {
                answer[t] = arr[j];
                t++;
            }
        }

        return answer;
    }
}

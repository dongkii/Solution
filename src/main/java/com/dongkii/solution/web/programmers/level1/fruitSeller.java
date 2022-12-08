package com.dongkii.solution.web.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class fruitSeller {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        // 사과점수 1 ~ k
        // 한상자의 사과 갯수 m
        // 상자에서 제일 낮은 점수의 사과 p
        // 한상자의 가격 p * m
        Integer[] tmp = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Collections.reverseOrder());

        for(int i=m-1; i < tmp.length; i+=m) {
            answer += tmp[i] * m;
        }

        return answer;
    }
}

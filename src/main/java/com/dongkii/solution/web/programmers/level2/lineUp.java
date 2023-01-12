package com.dongkii.solution.web.programmers.level2;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class lineUp {
    public static int[] solution(int n, long k) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[n];
        long factorial = 1;

        // n! 값과 리스트 초기화
        for(int i = 1; i <= n; i++) {
            factorial *= i;
            list.add(i);
        }
        // k번째는 k-1 의 인덱스
        k--;

        int i = 0;
        while(n > 0) {
            factorial /= n--;
            answer[i++] = list.get((int)(k/factorial));
            list.remove((int)(k/factorial));
            k %= factorial;
        }

        return answer;
    }
}

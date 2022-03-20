package com.dongkii.solution.web.programmers.Etc;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q3 {
    public static int solution(int[] A) {
        int answer = 0;

        // 입력값 오름차순으로 정렬 : 가장 작은수가 0번째 인덱스
        Arrays.sort(A);

        for(int i = 0; i < A.length; i++) {
            int result = A[i];

            // 인덱스 값이 0보다 크면 결과는 0
            if(result > 0) break;

            // 해당 인덱스의 음수값의 절대값(즉 양수값) 이 있을 경우 break
            if(IntStream.of(A).anyMatch(x -> x == Math.abs(result))) {
                answer = Math.abs(A[i]);
                break;
            }
        }

        return answer;
    }
}

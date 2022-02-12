package com.dongkii.solution.web.programmers.level1;

import java.util.*;

public class Budget {
    public static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);     // 작은 예산부터 처리하기 위해 소트
        for(int i = 0; i < d.length; i++) {
            if(budget - d[i] < 0) { // 예산에서 신청한 금액을 뺀게 0보다 작으면 리턴
                return answer;
            } else {
                budget -= d[i];
                answer += 1;
            }
        }

        return answer;
    }
}

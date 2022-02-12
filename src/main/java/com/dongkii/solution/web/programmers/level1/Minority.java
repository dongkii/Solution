package com.dongkii.solution.web.programmers.level1;

public class Minority {
    public static int solution(int n) {
        int answer = 1;

        for(int i = 3; i < n+1; i++) {
            int minorityCnt = 0;    // 나눈 나머지가 0이 되는 카운트
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j == 0) {
                    minorityCnt++;
                }

                if(minorityCnt > 0) break;
            }

            if(minorityCnt == 0) {
                answer++;
            }
        }

        return answer;
    }
}

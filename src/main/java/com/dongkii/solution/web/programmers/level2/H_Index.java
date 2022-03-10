package com.dongkii.solution.web.programmers.level2;

public class H_Index {
    public static int solution(int[] citations) {
        int answer = 0;

        for(int i = citations.length; i > 0; i--) {
            int h = 0 ;

            for(int j = 0; j < citations.length; j++) {
                if(citations[j] > i) h++;
            }

            if(h == i) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}

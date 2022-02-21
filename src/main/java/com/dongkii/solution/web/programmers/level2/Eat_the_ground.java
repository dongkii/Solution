package com.dongkii.solution.web.programmers.level2;

public class Eat_the_ground {
    public static int solution(int[][] land) {
        int answer = 0;

        int preJ = 0;           // 이전 열의 값 저장을 위한 변수

        for(int i = 0; i < land.length; i++) {
            int max = 0;
            int tmp = preJ;
            for(int j = 0; j < land[i].length; j++) {
                if(max < land[i][j] && j != preJ) {
                        max = land[i][j];
                        tmp = j;
                }
            }
            preJ = tmp;
            answer += max;
        }

        return answer;
    }
}

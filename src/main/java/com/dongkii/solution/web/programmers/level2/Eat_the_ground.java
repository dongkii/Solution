package com.dongkii.solution.web.programmers.level2;

public class Eat_the_ground {
    public static int solution(int[][] land) {
        int answer = 0;

        int[][] tmp = new int[land.length][4];      // 최선의 선택을 비교하기 위한 2차원배열 생성

        for(int i = 0; i < 4; i++) tmp[0][i] = land[0][i];   // 첫번째 행값을 미리 저장

        for(int i = 1; i < land.length; i++) {  // i = 1 : 두번째 행부터 첫번째 행과 비교
            for(int j = 0; j < 4; j++) {
                for(int k = 0; k < 4; k++) {
                    if(j != k) {
                        tmp[i][j] = Math.max(tmp[i][j], land[i][j] + tmp[i-1][k]);
                    }
                }
            }
        }
        
        for(int i = 0; i < 4; i++) {
            answer = Math.max(answer, tmp[land.length-1][i]);  // 마지막행에 나온 결과값을들 중 가장 큰값
        }

        return answer;
        
        /*
        문제에선 위에서 아래로 내려가는 것만 구하라고 명시되어있지만, 각행에서 최대의 값이 나올 수 있는걸 골라야함
        int preJ = 5;       // 이전 열의 값 저장을 위한 변수 - 처음에 0으로 초기화시 land[0][0] 이 가장 큰값이어도 저장을 못함

        for(int i = 0; i < land.length; i++) {
            int max = 0;
            int tmp = preJ;
            for(int j = 0; j < 4; j++) {
                if(max <= land[i][j] && j != preJ) {
                        max = land[i][j];
                        tmp = j;
                }
            }

            preJ = tmp;
            answer += max;
        }
         */


    }
}

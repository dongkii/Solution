package com.dongkii.solution.web.programmers.level2;

import java.util.Arrays;
import java.util.Collections;

public class Triangle_snail {
    public static int[] solution(int n) {
        int[] answer = new int[n *(n+1) / 2];
        int[][] matrix = new int[n][n];

        int x = -1, y = 0, num = 1;

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                // 2중 반복문을 돌려 이동할 수 있는 위치는 아래로, 오른쪽으로, 왼쪽위로 3가지 뿐
                if(i % 3 == 0) {    // 나머지가 0일경우 아래로
                    x++;
                } else if(i % 3 == 1) { // 나머지가 1일경우 오른쪽으로
                    y++;
                } else if(i % 3 == 2) { // 나머지가 2일경우 왼쪽위로
                    x--;
                    y--;
                }
                matrix[x][y] = num++; // 해당 위치에 숫자 입력
            }
        }

        int t = 0;
        for(int i = 0; i < matrix.length; i++) {    // 0을 제외한 나머지만 추출하기 위해 처리
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) break;
                answer[t] = matrix[i][j];
                t++;
            }
        }

        return answer;
    }
}

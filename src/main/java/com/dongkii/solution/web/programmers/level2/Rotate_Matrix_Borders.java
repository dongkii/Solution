package com.dongkii.solution.web.programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class Rotate_Matrix_Borders {
    public static int[] solution(int rows, int columns, int[][] queries) {
        // 아무 회전도 하지 않았을 때, i 행 j 열의 값은 ((i-1) x columns + j) 이다.
        // 행렬을 2차원 배열로 봤을 때, ij 의 값은 (i x columns + (j + 1)) 이다.

        int[][] mat = new int[rows][columns];
        int[] answer = new int[queries.length];

        // 2차원 배열 생성
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                mat[i][j] = i * columns + (j + 1);
            }
        }

        for(int i = 0; i < queries.length; i++) {
            int min = 9999;   // 최대 100x100 행렬

            // Xij
            int x1 = queries[i][0]-1;
            int x2 = queries[i][2]-1;

            // Yij
            int y1 = queries[i][1]-1;
            int y2 = queries[i][3]-1;

            // 제일 첫번째 값을 빼두고
            int x1y1 = mat[x1][y1];

            // 역순으로 대입
            for(int x = x1; x < x2; x++) { // 아래를 위에 대입
                mat[x][y1] = mat[x+1][y1];
                min = Math.min(mat[x][y1], min);
            }

            for(int y = y1; y < y2; y++) { // 우측을 왼쪽에 대입
                mat[x2][y] = mat[x2][y+1];
                min = Math.min(mat[x2][y], min);
            }

            for(int x = x2; x > x1; x--) { // 위를 아래에 대입
                mat[x][y2] = mat[x-1][y2];
                min = Math.min(mat[x][y2], min);
            }

            for(int y = y2; y > y1; y--) { // 좌측을 오른쪽에 대입
                mat[x1][y] = mat[x1][y-1];
                min = Math.min(mat[x1][y], min);
            }

            mat[x1][y1+1] = x1y1; // 빼둔 값을 대입
            min = Math.min(min, x1y1);

            answer[i] = min;
        }

        return answer;
    }
}
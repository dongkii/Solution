package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class Find_the_largest_square {
    public static int solution(int[][] board) {
        int answer = 1;

        List<int[]> list = new ArrayList<int[]>();

        for(int i = 1; i < board.length; i++) {
            for(int j = 1; j < board[i].length; j++) {
                if(board[i][j] == 0) continue;          // 0일경우 컨티뉴 처리

                // 해당 위치의 왼쪽과 위쪽의중 최소값을 구한 후, 최소값과 해당위치 i-1, j-1 위치중 최소값에 1을 더한 수로 변경
                board[i][j] = Math.min(Math.min(board[i-1][j], board[i][j-1]), board[i-1][j-1]) + 1; 
                answer = Math.max(answer, board[i][j]); // 해당값과 answer 중 큰값으로 저장
            }
        }

        return answer * answer;
    }
}
package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class Find_the_largest_square {
    public static int solution(int[][] board) {
        int answer = 1;    // answer는 모든 수가 0이 아니면 answer는 1

        int zeroCnt = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0) {
                    zeroCnt += 1;           // 0의 카운트를 세기 위해
                } else if(i != 0 && j != 0) {
                    // 해당 위치의 왼쪽과 위쪽의중 최소값을 구한 후, 최소값과 해당위치 i-1, j-1 위치중 최소값에 1을 더한 수로 변경
                    board[i][j] = Math.min(Math.min(board[i-1][j], board[i][j-1]), board[i-1][j-1]) + 1;
                    answer = Math.max(answer, board[i][j]); // 해당값과 answer 중 큰값으로 저장
                }
            }
        }

        if(zeroCnt == board.length * board[0].length) answer = 0; // 모든 수가 0일경우 결과는 0

        return answer * answer;
    }
}
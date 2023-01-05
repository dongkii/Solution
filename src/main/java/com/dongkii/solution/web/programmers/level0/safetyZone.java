package com.dongkii.solution.web.programmers.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class safetyZone {
    public static int solution(int[][] board) {
        int answer = 0;

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    for(int t = -1; t < 2; t++) {
                        for(int k = -1; k < 2; k++) {
                            if(i+t >= 0 && j+k >= 0 && i+t < board.length && j+k < board[0].length) {
                                if(board[i+t][j+k] == 0)
                                    board[i+t][j+k] = 2;
                            }
                        }
                    }
                }
            }
        }

        for(int i = 0; i < board.length; i++) {
            answer += Collections.frequency(Arrays.stream(board[i]).boxed().collect(Collectors.toList()), 0);
        }

        return answer;
    }
}

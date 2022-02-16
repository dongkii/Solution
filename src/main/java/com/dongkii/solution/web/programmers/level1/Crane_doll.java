package com.dongkii.solution.web.programmers.level1;

import java.util.Stack;

public class Crane_doll {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> st = new Stack<Integer>();   // 인형을 담을 바구니

        // 움직임 반복문
        for(int i = 0; i < moves.length; i++) {

            // 각 위치 반복문
            for(int j = 0; j < board.length; j++) {
                int tmp = board[j][moves[i]-1];     // 맨위가 0인지 판별하기 위함
                if(tmp != 0) {                      // 하나를 집은 경우 - 0이 아닌 숫자가 채워져있는경우
                    if(st.size() > 0 && tmp == st.peek()) { // 바구니가 0보다 크고, 바구니의 최상단과 집은 인형이 같을경우
                        st.pop();                           // 바구니에서 꺼냄 (문제 조건 - 2개가 같을경우 제거)
                        answer += 2;                        // 제거된 2개 answer에 추가
                    } else {
                        st.push(board[j][moves[i]-1]);      // 집게로 집은것과 바구니 최상단이 다르면 스택에 추가
                    }
                    board[j][moves[i]-1] = 0;               // 집은 부분은 인형이 없어지니 0으로 변경

                    break;
                }
            }
        }

        return answer;
    }
}
package com.dongkii.solution.web.programmers.level2;

import java.util.Stack;

public class Hanoi {

    private static int index = 0;
    public static int[][] solution(int n) {
        int[][] answer = new int[(int)Math.pow(2, n) - 1][2];

        hanoi(n, 1,3,2, answer);

        return answer;
    }

    public static void hanoi(int n, int start, int dest, int waypoint, int[][] answer) {
        if(n == 1) {
            answer[index++] = new int[]{start, dest};
        } else {
            hanoi(n-1, start, waypoint, dest, answer); // 가장 큰 링을 제외한 나머지를 2번 막대로 이동
            
            answer[index++] = new int[] {start, dest}; // 최종 가장 큰 링을 1번에서 3번으로 이동

            hanoi(n-1, waypoint, dest, start, answer); // n-1 하노이의 탑을 다시 반복하기 위해 재귀호출
        }
    }
}

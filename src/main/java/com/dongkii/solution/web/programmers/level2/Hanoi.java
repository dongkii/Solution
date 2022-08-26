package com.dongkii.solution.web.programmers.level2;

import java.util.Stack;

public class Hanoi {
    public static int[][] solution(int n) {
        int[][] answer = {};

        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();

        // 1번 기둥 초기화
        for(int i = 0; i < n; i++) {
            s1.push(n-i);
        }



        return answer;
    }
}

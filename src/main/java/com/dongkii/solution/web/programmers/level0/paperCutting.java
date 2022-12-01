package com.dongkii.solution.web.programmers.level0;

public class paperCutting {
    public static int solution(int M, int N) {
        int answer = 0;

        int lt = M > N?N:M;
        int gt = M > N?M:N;

        answer = (lt-1) + (lt * (gt-1));

        return answer;
    }
}
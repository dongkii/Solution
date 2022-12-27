package com.dongkii.solution.web.programmers.level0;

public class iceAmericano {
    public static int[] solution(int money) {
        int[] answer = new int[2];

        answer[0] = money/5500;
        answer[1] = money%5500;

        return answer;
    }
}

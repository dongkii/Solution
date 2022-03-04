package com.dongkii.solution.web.programmers.level2;

public class Carpet {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int w = 0;
        int h = 0;

        for(int i = 1; i <= yellow; i++) {
            if(yellow%i == 0) {             // yellow를 i로 나눈 나머지가 0이면
                if((i+2) * (yellow/i + 2) - yellow == brown) {  // 몫 + 2, i + 2의 넓이가 brown + yellow 일때 값을 구하면된다.
                    answer[0] = Math.max(i+2, yellow/i + 2);
                    answer[1] = Math.min(i+2, yellow/i + 2);
                }
            }
        }

        return answer;
    }
}

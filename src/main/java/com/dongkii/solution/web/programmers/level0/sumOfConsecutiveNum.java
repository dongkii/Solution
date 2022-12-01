package com.dongkii.solution.web.programmers.level0;

public class sumOfConsecutiveNum {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];

        int mid = total / num;
        int sub = total % num == 0 ? num/2 : num/2-1;

        int start = mid - sub;

        for(int i = 0; i < num; i++) {
            answer[i] = start + i;
        }

        return answer;
    }
}

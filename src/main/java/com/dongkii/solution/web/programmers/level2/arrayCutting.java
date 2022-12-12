package com.dongkii.solution.web.programmers.level2;

public class arrayCutting {
    public static int[] solution(int n, long left, long right) {
        int size = (int)(right-left+1);
        int[] answer = new int[size];

        int k = 0;
        for(long i = left; i < right+1; i++) {
            // i % n == 자리수 ( 0이면 n )
            // i / n == 반복수
            long x = i / n;
            long y = i % n;

            long max = x>y?x:y;

            answer[k++] = (int)max+1;
        }

        return answer;
    }
}

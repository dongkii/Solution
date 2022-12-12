package com.dongkii.solution.web.programmers.level2;

public class anotherBit {
    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        long now = 0;
        long tmp = 0;
        int n = 0;

        for(int i = 0; i < numbers.length; i++) {
            now = numbers[i];
            tmp = now;
            while(tmp > 0) {
                if(tmp%2 == 0)
                    break;

                tmp /= 2;
                n++;
            }

            if(n==0) {
                now++;
            } else {
                now = now + (long)Math.pow(2, n) - (long)Math.pow(n, i);
            }

            answer[i] = now;
         }

        return answer;
    }
}

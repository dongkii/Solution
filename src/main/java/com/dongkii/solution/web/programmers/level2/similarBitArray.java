package com.dongkii.solution.web.programmers.level2;

public class similarBitArray {
    public static int solution(int n, long l, long r) {
        int answer = 0;

        for(long i = l; i <= r; i++) {
            int flag = 1;
            if(i % 5 == 3) {
                continue;
            }

            long temp = i;
            long result;
            while(true) {
                if(temp % 5 == 0) {
                    temp /= 5;
                } else {
                    temp = (temp / 5) + 1;
                }

                if(temp % 5 == 3) {
                    flag = 0;
                    break;
                } else if(temp <= 5) {
                    flag = 1;
                    break;
                }
            }

            if(flag == 1) answer++;
        }

        return answer;
    }
}

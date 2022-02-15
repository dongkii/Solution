package com.dongkii.solution.web.programmers.level2;

public class Contry_num_124 {
    public static String solution(int n) {
        String answer = "";

        String[] tmp = {"4", "1", "2"};
        //int[] tmp = {4, 1, 2};

        while(n > 0) {
            answer = tmp[n%3] + answer;
            n = n / 3 - (n%3 == 0 ? 1 : 0);
        }

        /* 조건 부여했지만 효율성 실패
        int a = 0;
        while ( n > 0 ) {
            a = n % 3;
            n /= 3;

            if (a == 0) {
                n -= 1;
            }

            answer = a + answer;
        }

        // 3진법으로 시도
        int i = 0;
        while(Math.pow(3, i) <= n) i++;

        int tmp = n;
        for(int j = 0; j < i; j++) {
            answer = String.valueOf(tmp/(int)Math.pow(3, i-j-1));
            tmp = tmp%(int)Math.pow(3, i-j-1);
        }
        */

        return answer;
    }
}
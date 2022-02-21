package com.dongkii.solution.web.programmers.level2;

public class ExpressionOfNumber {
    public static int solution(int n) {
        int answer = 1; // 1로주는건 n = n 이지만 n까지 포문을 안돌리기 위해

        for(int i = 1; i <= n/2; i++) {
            int tmp = 0;
            int j = i;
            while(true) {
                tmp += j;

                if(tmp == n) {
                    answer+=1;
                    break;
                } else if(tmp > n) break;

                j+=1;
            }
        }

        return answer;
    }
}

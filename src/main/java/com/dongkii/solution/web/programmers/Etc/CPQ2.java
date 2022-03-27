package com.dongkii.solution.web.programmers.Etc;

import java.util.ArrayList;
import java.util.List;

public class CPQ2 {
    public static long[] solution(long n) {
        long[] answer = {-1, -1};
        // 5까지는 서로 다른 소수로 나타낼 수 없음
        if(n < 6) return answer;

        // n의 소수를 찾은 후 리스트에 입력
        for(long i = 2; i <= n/2; i++) {
            if(n%i == 0){
                int prime = 0;
                // 나누는 값이 소수인지 확인
                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i%j == 0) {
                        prime++;
                    }

                    if(prime > 0) break;
                }

                // 나누는 값이 소수이고, 몫이 소수인지 확인
                if(prime == 0) {
                    for(int t = 2; t <= Math.sqrt(n/i); t++) {
                        if((n/i)%t == 0) {
                            prime++;
                        }

                        if(prime > 0) break;
                    }
                }

                if(prime == 0) {
                    answer[0] = i;
                    answer[1] = n/i;
                    return answer;
                }
            }
        }

        return answer;
    }
}

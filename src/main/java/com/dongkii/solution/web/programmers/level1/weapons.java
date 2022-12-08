package com.dongkii.solution.web.programmers.level1;

public class weapons {
    public static int solution(int number, int limit, int power) {
        // 1은 약수의 개수가 한개
        int answer = 1;

        // 2부터 약수의 개수를 구한다.
        for(int i = 2; i < number+1; i++) {
            int count = 2;      // 1과 자기자신은 약수에 포함
            for(int j = 2; j <= i/2; j++) { // 2로 나누었을대부터 구한다
                if(i % j == 0) {
                    count++;
                }
            }

            if(count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }

        return answer;
    }
}

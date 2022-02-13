package com.dongkii.solution.web.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class Ternary {
    public static int solution(int n) {
        // n은 1억 이하의 자연수
        int answer = 0;

        // 3진법 자리수를 구하기 위해
        int i = 0;
        while(Math.pow(3, i) <= n) i++;

        // 3진법으로 변환
        int tmp = n;
        String[] tmpStr = new String[i];
        for(int j = 0; j < i; j++){
            tmpStr[j] = String.valueOf(tmp/(int)Math.pow(3, i-j-1));
            tmp = tmp%(int)Math.pow(3, i-j-1);
        }

        // 변환된 3진법을 뒤집음
        Arrays.stream(tmpStr).sorted(Collections.reverseOrder());

        // 뒤집힌 3진법을 10진법으로 변경
        for(int k = 0; k < i; k++) {
            answer += Integer.valueOf(tmpStr[k]) * Math.pow(3, k);
        }

        return answer;
    }
}

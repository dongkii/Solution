package com.dongkii.solution.web.programmers.level0;

public class sevenCount {
    public static int solution(int[] array) {
        int answer = 0;

        for(int i = 0; i < array.length; i++) {
            char[] tmp = String.valueOf(array[i]).toCharArray();

            for(int j = 0; j < tmp.length; j++) {
                if(tmp[j] == '7') answer++;
            }
        }

        return answer;
    }
}

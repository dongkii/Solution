package com.dongkii.solution.web.programmers.level0;

import java.util.Arrays;

public class stringSort {
    public static String solution(String my_string) {
        String answer = "";

        char[] tmp = my_string.toLowerCase().toCharArray();

        Arrays.sort(tmp);
        answer = new String(tmp);

        return answer;
    }
}

package com.dongkii.solution.web.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class String_Revers {
    public static String solution(String s) {
        String answer = "";

        String[] strArr = s.split("");

        Arrays.sort(strArr, Collections.reverseOrder());

        answer = Arrays.stream(strArr).collect(Collectors.joining());

        return answer;
    }
}

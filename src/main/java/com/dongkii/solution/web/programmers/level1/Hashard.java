package com.dongkii.solution.web.programmers.level1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Hashard {
    public static boolean solution(int x) {
        boolean answer = false;

        String[] xStr = String.valueOf(x).split("");

        int sum = 0;
        for(String a : xStr) {
            sum += Integer.valueOf(a);
        }

        if(x%sum == 0) {
            answer = true;
        }

        return answer;
    }
}

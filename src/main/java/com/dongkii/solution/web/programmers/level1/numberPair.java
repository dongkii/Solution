package com.dongkii.solution.web.programmers.level1;

import java.util.Arrays;

public class numberPair {
    public static String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 10; i++) {
            int a = X.length()- X.replaceAll(String.valueOf(i), "").length();
            int b = Y.length()- Y.replaceAll(String.valueOf(i), "").length();

            int min = (a < b) ? a : b;
            sb.append(String.valueOf(i).repeat(min));
        }

        if(sb.length() == 0) {
            answer = "-1";
        } else {
            sb = sb.reverse();

            if(sb.charAt(0) == '0' && sb.charAt(1) == '0')
                return "0";

            answer = sb.toString();
        }

        return answer;
    }
}

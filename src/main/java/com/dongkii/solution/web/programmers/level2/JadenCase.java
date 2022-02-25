package com.dongkii.solution.web.programmers.level2;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class JadenCase {
    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");

        for(int i = 0; i < arr.length; i++) {
            if(!"".equals(arr[i])) {
                String fir = String.valueOf(arr[i].charAt(0));
                if(!fir.matches("[0-9]")) {
                    fir = fir.toUpperCase();
                }

                arr[i] = fir + arr[i].substring(1, arr[i].length()).toLowerCase();
            }
        }

        answer = Arrays.stream(arr).collect(Collectors.joining(" ", "",""));
        if(s.charAt(s.length()-1) == ' ') answer += " ";

        return answer;
    }
}

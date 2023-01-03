package com.dongkii.solution.web.programmers.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class oneAppear {
    public static String solution(String s) {
        String answer = "";

        String[] temp = s.split("");

        Arrays.sort(temp);
        answer = Arrays.stream(temp).collect(Collectors.joining());

        HashMap<String, Integer> map = new HashMap<>();

        for(int  i = 0; i < s.length(); i++) {
            if(map.get(temp[i]) == null) {
                map.put(temp[i], 1);
            } else {
                answer = answer.replaceAll(temp[i], "");
            }
        }

        return answer;
    }
}

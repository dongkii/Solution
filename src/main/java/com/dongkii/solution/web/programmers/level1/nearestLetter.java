package com.dongkii.solution.web.programmers.level1;

import java.util.HashMap;

public class nearestLetter {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            int ans = 0;
            Character temp = s.charAt(i);
            if(map.get(temp) == null) {
                map.put(temp, i);
                ans = -1;
            } else {
                ans = i - map.get(temp);
                map.put(temp, i);
            }

            answer[i] = ans;
        }

        return answer;
    }
}

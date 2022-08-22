package com.dongkii.solution.web.programmers.level1;

import java.util.HashMap;

public class Survey {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < survey.length; i++) {
            int choice = choices[i];

            String character = "";
            int score = 0;

            if(choice < 4) {
                character = survey[i].substring(0, 1);
                score = 4-choice;

            } else if (choice > 4) {
                character = survey[i].substring(1, 2);
                score = choice-4;
            }

            if(map.get(character) != null) {
                map.put(character, map.get(character) + score);
            } else {
                map.put(character, score);
            }
        }

        answer += (map.get("R") == null ? 0 : map.get("R")) >= (map.get("T") == null ? 0 : map.get("T")) ? "R" : "T";
        answer += (map.get("C") == null ? 0 : map.get("C")) >= (map.get("F") == null ? 0 : map.get("F")) ? "C" : "F";
        answer += (map.get("J") == null ? 0 : map.get("J")) >= (map.get("M") == null ? 0 : map.get("M")) ? "J" : "M";
        answer += (map.get("A") == null ? 0 : map.get("A")) >= (map.get("N") == null ? 0 : map.get("N")) ? "A" : "N";

        return answer;
    }
}

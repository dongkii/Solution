package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ending_in_english {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[] {0, 0};
        List<String> aleady = new ArrayList<String>();

        aleady.add(words[0]);

        for(int i = 1; i < words.length; i++) {
            // 이전문자의 마지막과 현재 글자의 첫글자가 같아야하고
            // 이전에 나오지 않은 단어여야 함

            if(words[i-1].charAt(words[i-1].length()-1) == words[i].charAt(0)
                    && !aleady.contains(words[i])) {
                aleady.add(words[i]);
            } else {
                answer[0] = i % n + 1;
                answer[1] = (int)Math.ceil((i+1) / (double)n);
                break;
            }
        }

        return answer;
    }
}

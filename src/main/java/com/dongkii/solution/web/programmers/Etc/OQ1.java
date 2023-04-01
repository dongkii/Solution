package com.dongkii.solution.web.programmers.Etc;

import java.util.ArrayList;
import java.util.List;

public class OQ1 {
    public static int solution(String[] rolls) {
        int answer = 0;

        List<Integer> score = new ArrayList<>();

        for(String roll : rolls) {
            if("R".equals(roll)) {
                score.remove(score.size()-1);
            } else if("D".equals(roll)) {
                score.add(score.get(score.size()-1) * 2);
            } else if("+".equals(roll)) {
                score.add(score.get(score.size()-1) + score.get(score.size()-2));
            } else {
                score.add(Integer.parseInt(roll));
            }
        }

        answer = score.stream().mapToInt(Integer::intValue).sum();

        return answer;
    }
}

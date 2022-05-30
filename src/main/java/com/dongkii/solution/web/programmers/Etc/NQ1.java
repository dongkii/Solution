package com.dongkii.solution.web.programmers.Etc;

import java.util.Collections;
import java.util.List;

public class NQ1 {
    public static int solution(List<Integer> frequencies, List<List<Integer>> filterRanges) {
        int answer = 0;

        // filterRanges min, max
        int min = 99999999;
        int max = 0;



        for(int i = 0; i < filterRanges.size(); i++) {
            if(filterRanges.get(i).get(0) > max) {
                max = filterRanges.get(i).get(0);
            }

            if(filterRanges.get(i).get(1) < min) {
                min = filterRanges.get(i).get(1);
            }
        }

        for(int i = 0; i < frequencies.size(); i++) {
            if(min >= frequencies.get(i) && max <= frequencies.get(i)) {
                answer++;
            }
        }

        return answer;
    }
}

package com.dongkii.solution.web.programmers.level0;

import java.util.*;

public class orderFix {
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < score.length; i++) {
            int avg = score[i][0] * score[i][1] / 2;
            map.put(i+1, avg);
        }

        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        int i = 1;
        for(Map.Entry<Integer, Integer> entry : entryList) {
            answer[entry.getKey()-1] = i;
            i++;
        }

        return answer;
    }
}

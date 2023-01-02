package com.dongkii.solution.web.programmers.level0;

import java.util.*;

public class emergencyOrder {
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < emergency.length; i++) {
            map.put(i+1, emergency[i]);
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

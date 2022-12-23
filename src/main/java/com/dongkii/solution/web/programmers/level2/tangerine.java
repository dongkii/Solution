package com.dongkii.solution.web.programmers.level2;

import java.util.*;

public class tangerine {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < tangerine.length; i++) {
            if(map.get(tangerine[i]) == null) {
                map.put(tangerine[i], 1);
            } else {
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        int sum = 0;

        for(Map.Entry<Integer, Integer> entry : entryList) {
            if(entry.getValue() > k) {
                answer = 1;
                break;
            }

            sum += entry.getValue();
            answer++;

            if(sum >= k) break;
        }

        return answer;
    }
}

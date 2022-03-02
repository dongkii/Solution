package com.dongkii.solution.web.programmers.level2;

import java.util.*;

public class Dungeon {
    public static int solution(int k, int[][] dungeons) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < dungeons.length; i++) {
            // 맵에 키값으로 인덱스를, 밸류로 최소피로도와 소모피로도의 차이를 넣는다.
            int minus = dungeons[i][0] - dungeons[i][1];

            map.put(i, minus);
        }

        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        // 최소피로도와 소모피로도를 기준으로 내림차순 정렬
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        for(Map.Entry<Integer, Integer> entry : entryList) {
            if( k >= dungeons[entry.getKey()][0]) {
                k -= dungeons[entry.getKey()][1];
                answer += 1;
            } else {
                break;
            }
        }

        return answer;
    }
}

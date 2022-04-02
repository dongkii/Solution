package com.dongkii.solution.web.programmers.Etc;

import java.util.*;

public class DMQ1 {
    public static int[][] solution(int[][] dist) {
        int[][] answer = new int[2][dist.length];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 0);

        for(int i = 0; i < dist.length; i++) {
            for(int j = i+1; j < dist.length; j++) {
                if(map.get(j) == null) {
                    map.put(j, dist[i][j]);
                } else if(Math.abs(map.get(i) - map.get(j)) != dist[i][j]){
                    map.put(j, map.get(j) * -1);
                }
            }
        }
        List<Map.Entry<Integer, Integer>> list_entries = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(list_entries, new Comparator<Map.Entry<Integer,Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        List<Integer> answerList = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry : list_entries) {
            answerList.add(entry.getKey());
        }

        for(int j = 0; j < dist.length; j++) {
            answer[0][j] = answerList.get(j);
        }

        for(int j = 0; j < dist.length; j++) {
            answer[1][j] = answerList.get(dist.length-j-1);
        }

        if(answer[0][0] > answer[1][0]) {
            int[] tmp = answer[0];
            answer[0] = answer[1];
            answer[1] = tmp;
        }

        return answer;
    }
}


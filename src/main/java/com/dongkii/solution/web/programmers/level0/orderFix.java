package com.dongkii.solution.web.programmers.level0;

import java.util.*;

public class orderFix {
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        List<Integer> sList = new ArrayList<>();
        for(int[] s : score) {
            sList.add(s[0] + s[1]);
        }
        sList.sort(Comparator.reverseOrder());

        for(int i = 0; i < score.length; i++) {
            answer[i] = sList.indexOf(score[i][0] + score[i][1]) + 1;
        }

        /*
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < score.length; i++) {
            int avg = (score[i][0] + score[i][1]) / 2;
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
        int pre = 0;
        int acc = 0;
        for(Map.Entry<Integer, Integer> entry : entryList) {
            if(pre != entry.getValue()) {
                acc = 0;
            } else {
                acc += 1;
            }

            answer[entry.getKey()-1] = (i - acc);

            i++;
            pre = entry.getValue();
        }
         */

        return answer;
    }
}

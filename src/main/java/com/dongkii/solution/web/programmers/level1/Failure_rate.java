package com.dongkii.solution.web.programmers.level1;

import java.util.*;

public class Failure_rate {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Map<Integer, Double> map = new HashMap<Integer, Double>();
        int[] tmp = Arrays.copyOf(stages, stages.length);
        Arrays.sort(tmp);

        for (int i = 1; i <= N; i++) {
            int uncomplete = 0;
            for(int j = 0; j < tmp.length; j++) {
                if (i == tmp[j]) {
                    uncomplete++;
                }
            }
            // 스테이지를 클리어하지못한 수 uncomplete

            map.put(i, uncomplete == 0 ? 0 : (double)uncomplete/(double)tmp.length);
            tmp = Arrays.copyOfRange(tmp, uncomplete, tmp.length);
        }

        List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(map.entrySet());
        Collections.sort(entryList, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int k = 0;
        for(Map.Entry<Integer, Double> entry : entryList) {
            answer[k] = entry.getKey();
            k++;
        }

        return answer;
    }
}
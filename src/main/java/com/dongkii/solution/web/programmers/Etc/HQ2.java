package com.dongkii.solution.web.programmers.Etc;

import java.util.HashMap;
import java.util.Iterator;

public class HQ2 {
    public static int solution(int n, int delay, int forget) {
        int answer = 1;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);

        for(int i = 2; i < n+1; i++) {
            int forgetday = i-forget;
            for(int j = 0; j < forgetday; j++) {
                map.remove(j);
            }

            int delayday = i-delay;
            for(int j = 0; j < delayday; j++) {
                map.put(i, map.get(j));
            }
        }


        Iterator<Integer> iter = map.keySet().iterator();
        while(iter.hasNext()) {
            Integer key = iter.next();
            Integer value = map.get(key);

            System.out.println(key + "일차 / 알고있는사람 수 : " + value);
        }

        answer = map.values().stream().mapToInt(Integer::intValue).sum();

        return answer;
    }
}

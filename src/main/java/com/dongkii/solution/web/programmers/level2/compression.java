package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;

public class compression {
    public static int[] solution(String msg) {
        HashMap<String, Integer> map = new HashMap<>();

        int k = 1;

        // A 부터 Z 까지 맵에 세팅
        while(k < 27) {
            map.put(String.valueOf((char)(64+k)), k);
            k++;
        }

        ArrayList<Integer> list = new ArrayList<>();

        // 문자열 시작 위치를 찾기위한 while
        int i = 0;
        while(i < msg.length()) {
            // 문자열 길이를 알기위한 for
            String w = "";
            for(int j = 1; j <= msg.length()-i; j++) {
                String sub = msg.substring(i, i + j);
                if(map.get(sub) == null) {
                    map.put(sub, k);
                    k++;
                    break;
                } else {
                    w = sub;
                }
            }

            list.add(map.get(w));
            i += w.length();
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}

package com.dongkii.solution.web.programmers.Etc;

import java.util.*;

public class OQ3 {
    public static String solution(String s) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            String st = String.valueOf(s.charAt(i));

            if(map.get(st) == null) {
                map.put(st, 1);
            } else {
                map.put(st, map.get(st) + 1);
            }
        }

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        List<String> sArr = new ArrayList<>();
        int t = 0;

        for(Map.Entry<String, Integer> entry : entryList) {
            if( t == 0 ) {
                t = entry.getValue();
            } else if(t != entry.getValue()) {
                Collections.sort(sArr);
                answer += String.join("", sArr);
                sArr.clear();
                t = entry.getValue();
            }

            sArr.add(entry.getKey().repeat(t));
        }

        if(sArr.size() != 0) {
            Collections.sort(sArr);
            answer += String.join("", sArr);
        }

        return answer;
    }
}

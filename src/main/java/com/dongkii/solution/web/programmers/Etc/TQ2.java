package com.dongkii.solution.web.programmers.Etc;

import java.util.*;

public class TQ2 {
    public static String solution(String call) {
        String answer = "";

        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < call.length(); i++) {
            for(int j = i; j <= call.length(); j++) {
                String tmp = call.substring(i, j).toLowerCase();

                if(map.get(tmp) == null) {
                    map.put(tmp, 1);
                } else {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }
        }

        map.remove("");

        List<Map.Entry<String, Integer>> list_entries = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

        Collections.sort(list_entries, new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        int i = 0;
        int pre = 0;
        List<Integer> answerList = new ArrayList<Integer>();
        for(Map.Entry<String, Integer> entry : list_entries) {
            if(i == 0) {
                pre = entry.getValue();
            } else {
                if(pre != entry.getValue()) break;
            }

            call = call.replace(entry.getKey().toLowerCase(), "");
            call = call.replace(entry.getKey().toUpperCase(), "");
            i++;
        }

        return call;
    }
}

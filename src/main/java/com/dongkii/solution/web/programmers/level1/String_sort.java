package com.dongkii.solution.web.programmers.level1;

import java.util.*;

public class String_sort {
    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        return Arrays.stream(strings).sorted(Comparator.comparing(s -> String.valueOf(s).charAt(n)).thenComparing(s2 -> String.valueOf(s2))).toArray(String[]::new);

        /*
        // strings배열에서 n번째 인덱스 값을 정렬하기위한 맵 생성
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        // 맵의 키에 인덱스 값, 값에 n값에 해당하는 문자열을 넣어줌
        for(int i = 0; i < strings.length; i++) {
            map.put(i, strings[i].substring(n, n+1));
        }
        
        // 값으로 정렬
        List<Map.Entry<Integer, String>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue().thenComparing(strings[]));

        // 각각 값을 정렬하기 위한 맵
        Map<String, List<String>> pre_answer = new HashMap<String, List<String>>();

        int k = 0;
        for(Map.Entry<Integer, String> entry : entryList) {

        }


        return answer;

         */
    }
}

package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class newsClustering {
    public static int solution(String str1, String str2) {
        int answer = 0;

        ArrayList<String> s1 = jaccard(str1);
        ArrayList<String> s2 = jaccard(str2);

        // 다중집합을 고려하기 위해 합집합은 두 집합의 전체를 가져온 후 교집합을 빼면 됨
        ArrayList<String> uni = new ArrayList<>();
        uni.addAll(s2);
        uni.addAll(s1);

        // retainAll은 기준이 되는 집합의 개수에 따라 다중집합을 처리하는데 반례가 생김
        // ex) str1 = {BB BA AA AA AA}, str2 = {AA AA AB BB BB}
        // 위의 경우 교집합은 AA, AA BB 이어야하지만 retainAll 사용시
        // str1.retainAll(str2) 와 str2.retainAll(str1) 의 결과가 다르며, 교집합이 아님
        ArrayList<String> inter = new ArrayList<>();
        for(int i = 0; i < s1.size(); i++) {
            for(int j = 0; j < s2.size(); j++) {
                if(s1.get(i).equals(s2.get(j))) {
                    s2.remove(j);
                    inter.add(s1.get(i));
                    break;
                }
            }
        }

        if(inter.size() == 0 && uni.size() == 0) {
            answer = 65536;
        } else {
            answer = (int)(inter.size()/(double)(uni.size()-inter.size()) * 65536);
        }

        return answer;
    }

    public static ArrayList<String> jaccard(String str) {
        ArrayList<String> arr = new ArrayList<>();

        for(int i = 0; i < str.length()-1; i++) {
            String tmp = str.substring(i, i+2).toLowerCase();
            if(tmp.matches("^[a-z]*")) {
               arr.add(tmp);
            }
        }

        return arr;
    }
}

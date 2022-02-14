package com.dongkii.solution.web.programmers.level1;

import java.util.Locale;

public class Create_String {
    public static String solution(String s) {
        String answer = "";

        String[] words = s.split(" ", -1);

        for(int i = 0; i < words.length; i ++) {
            String tmpWord = "";
            for(int j = 0; j < words[i].length(); j++) {
                String tmp = String.valueOf(words[i].charAt(j));
                if( j % 2 == 0 ) {
                    tmpWord += tmp.toUpperCase();
                } else {
                    tmpWord += tmp.toLowerCase();
                }
            }

            answer += tmpWord;
            if(words.length - 1 != i) answer += " ";
        }

        return answer;
    }
}

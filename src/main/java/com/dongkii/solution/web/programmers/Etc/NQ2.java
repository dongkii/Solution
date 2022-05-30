package com.dongkii.solution.web.programmers.Etc;

import java.util.Stack;

public class NQ2 {
    public static String decode(String encoded) {
        String answer = "";

        StringBuffer sb = new StringBuffer(encoded);
        String reverse = sb.reverse().toString();

        String temp = "";

        for(int i = 0; i < reverse.length(); i++) {
            temp += String.valueOf(reverse.charAt(i));

            int ascii = Integer.parseInt(temp);

            if((ascii > 64 && ascii < 91) || (ascii > 96 && ascii < 123) || ascii == 32) {
                char c = (char)ascii;
                answer += c;
                temp = "";
            }
        }

        return answer;
    }
}

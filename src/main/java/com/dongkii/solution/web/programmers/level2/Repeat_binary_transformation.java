package com.dongkii.solution.web.programmers.level2;

public class Repeat_binary_transformation {
    public static int[] solution(String s) {
        int[] answer = new int[2];

        while(s.length() != 1) {
            int tmp = s.length();
            s = s.replace("0", "");

            int len = s.length();
            answer[1] += (tmp - len);

            s = "";
            int i = 0;
            while(Math.pow(2, i) <= len) i++;

            for(int j = 0; j < i; j++) {
                s += String.valueOf(len/(int)Math.pow(2, i-j-1));
                len = len%(int)Math.pow(2, i-j-1);
            }

            answer[0] += 1;
        }

        return answer;
    }
}

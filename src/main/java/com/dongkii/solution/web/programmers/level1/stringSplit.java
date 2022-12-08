package com.dongkii.solution.web.programmers.level1;

import java.util.Stack;

public class stringSplit {
    public static int solution(String s) {
        int answer = 0;

        Stack<String> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();

        char[] strArr = s.toCharArray();
        String x = "";

        for(int i=0; i < strArr.length; i++) {
            String tmp = String.valueOf(strArr[i]);
            if(st1.empty() && st2.empty()) {
                x = tmp;
            }

            if(x.equals(tmp)) {
                st1.push(tmp);
            } else if(!x.equals(tmp)) {
                st2.push(tmp);
            }

            if(st1.size() == st2.size()) {
                answer++;
                st1.clear();
                st2.clear();
            }
        }

        if(st1.size() != st2.size()) answer++;

        return answer;
    }
}

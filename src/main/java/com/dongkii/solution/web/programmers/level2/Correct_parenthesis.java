package com.dongkii.solution.web.programmers.level2;

import java.util.Stack;

public class Correct_parenthesis {
    public static boolean solution(String s) {
        Stack<String> st = new Stack<String>();

        for(int i = 0; i < s.length(); i++) {
            if(')' == s.charAt(i) && st.empty()) {
                return false;
            } else if('(' == s.charAt(i)) {
                st.push(String.valueOf(s.charAt(i)));
            } else {
                st.pop();
            }
        }

        return st.size() == 0;
    }
}

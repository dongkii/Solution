package com.dongkii.solution.web.programmers.level2;

import java.util.Stack;

public class Remove_pair {
    public static int solution(String s) {
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {
            if (st.empty()) {
                st.add(s.charAt(i));
            } else if (st.peek() == s.charAt(i)) {
                st.pop();
            } else {
                st.add(s.charAt(i));
            }
        }

        return st.size() > 0 ? 0 : 1;
    }
}

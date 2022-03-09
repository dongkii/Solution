package com.dongkii.solution.web.programmers.level2;

import org.springframework.aop.scope.ScopedProxyUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.stream.Collectors;

public class Making_a_big_number {
    public static String solution(String number, int k) {

        char[] res = new char[number.length()-k];
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            while(!st.isEmpty() && st.peek()<c && k-->0) st.pop();
            st.push(c);
        }

        for(int i=0; i<res.length; i++){
            res[i] = st.get(i);
        }
        return new String(res);
    }
}

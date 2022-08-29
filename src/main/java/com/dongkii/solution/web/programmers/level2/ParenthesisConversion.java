package com.dongkii.solution.web.programmers.level2;

import java.util.Stack;

public class ParenthesisConversion {
    public static String solution(String p) {
        String answer = parenthesis(p);

        return answer;
    }

    public static String parenthesis(String p) {
        if(p.length() == 0)
            return "";

        String u = "";
        String v = "";
        int l = 0, r = 0;

        for (int i = 0; i < p.length(); i++) {
            u += String.valueOf(p.charAt(i));

            if('(' == p.charAt(i)) {
                l++;
            } else {
                r++;
            }

            if( l == r ) {
                v = p.substring(i+1);
                break;
            }
        }

        if(isCorrect(u)) {
            return u += parenthesis(v);
        } else {
            String temp = "(";
            temp += parenthesis(v);
            temp += ")";

            u = u.substring(1, u.length()-1);

            for(int i = 0; i < u.length(); i++) {
                if(u.charAt(i) == '(') {
                    temp += ')';
                } else {
                    temp += '(';
                }
            }

            return temp;
        }
    }

    public static boolean isCorrect(String str) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                st.push('(');
            } else {
                if(st.isEmpty() || st.peek() == ')') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }

        return true;
    }
}

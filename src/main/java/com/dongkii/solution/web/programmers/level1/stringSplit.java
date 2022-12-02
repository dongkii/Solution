package com.dongkii.solution.web.programmers.level1;

import java.util.Stack;

public class stringSplit {
    public static int solution(String s) {
        int answer = 0;

        Stack<String> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();

        char[] strArr = s.toCharArray();
        String preStr = "";
        String result = "";

        for(int i=0; i < strArr.length; i++) {
            String tmp = String.valueOf(strArr[i]);
            if(st1.isEmpty() || tmp.equals(st1.peek())) {
                System.out.println("st1");
                st1.push(tmp);
            } else if(st2.isEmpty() || tmp.equals(st2.peek())){
                System.out.println("st2");
                st2.push(tmp);
            }

            result += tmp;

            if (st1.size() == st2.size()) {
                System.out.println(result);
                result = "";
                st1.clear();
                st2.clear();
                answer++;
            }

            preStr = tmp;
        }

        if(st1.size() != st2.size()) answer++;

        return answer;
    }
}

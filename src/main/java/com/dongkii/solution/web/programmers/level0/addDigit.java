package com.dongkii.solution.web.programmers.level0;

public class addDigit {
    public static int solution(int n) {
        int answer = 0;

        String tmp = String.valueOf(n);

        for(int i = 0; i < tmp.length(); i++) {
            answer += Integer.parseInt(String.valueOf(tmp.toCharArray()[i]));
        }

        return answer;
    }
}

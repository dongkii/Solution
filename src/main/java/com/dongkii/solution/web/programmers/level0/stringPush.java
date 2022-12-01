package com.dongkii.solution.web.programmers.level0;

public class stringPush {
    public static int solution(String A, String B) {
        int answer = 0;

        for(int i = 0; i < A.length(); i++) {
            if(A.equals(B)) {
                break;
            } else {
                A = A.substring(A.length()-1, A.length()) + A.substring(0, A.length()-1);
                answer++;
            }
        }

        return !A.equals(B) && answer == A.length()?-1:answer;
    }
}

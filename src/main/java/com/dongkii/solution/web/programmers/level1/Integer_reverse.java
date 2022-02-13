package com.dongkii.solution.web.programmers.level1;

public class Integer_reverse {
    public static int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];

        int j = 0;
        for(int i = String.valueOf(n).length()-1; i >= 0; i--) {
            answer[j] = Character.getNumericValue(String.valueOf(n).charAt(i));
            j++;
        }

        return answer;
    }
}

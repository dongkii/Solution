package com.dongkii.solution.web.programmers.level1;

public class hamburger {
    public static int solution(int[] ingredient) {
        int answer = 0;

        StringBuilder tmp = new StringBuilder();

        for(int i = 0; i < ingredient.length; i++) {
            tmp.append(ingredient[i]);

            if(tmp.length() > 3 && "1231".equals(tmp.subSequence(tmp.length()-4, tmp.length()))) {
                answer += 1;
                tmp = tmp.delete(tmp.length()-4, tmp.length());
            }
        }

        return answer;
    }
}

package com.dongkii.solution.web.programmers.level0;

public class cutAndSaveArray {
    public static String[] solution(String my_str, int n) {
        int cnt = 0;

        if(my_str.length()%n == 0) {
            cnt = my_str.length()/n;
        } else {
            cnt = my_str.length()/n + 1;
        }

        String[] answer = new String[cnt];

        for(int i = 0; i < cnt; i++) {
            int a = i*n;
            int b = (i+1) * n;
            if(b > my_str.length()) b = a + my_str.length()%n;
            answer[i] = my_str.substring(a, b);
        }

        return answer;
    }
}

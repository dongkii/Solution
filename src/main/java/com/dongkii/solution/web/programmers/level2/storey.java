package com.dongkii.solution.web.programmers.level2;

public class storey {
    public static int solution(int storey) {
        int answer = 0;

        String temp = String.valueOf(storey);

        int up = 0;
        int five = 0;

        for(int i = temp.length()-1; i >= 0; i--) {
            int st = Integer.parseInt(String.valueOf(temp.charAt(i)));
            if(five == 1 && st < 5) {
                st = st;
            } else {
                st += up;
            }

            up = 0;
            five = 0;
            if(st > 5) {
                answer += 10 - st;
                up++;
            } else if(st < 5) {
                answer += st;
            } else {
                answer += 5;
                five++;
                up++;
            }
        }

        if(five != 1)
            answer += up;

        return answer;
    }
}

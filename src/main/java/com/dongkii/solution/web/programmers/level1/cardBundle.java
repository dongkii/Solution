package com.dongkii.solution.web.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cardBundle {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        int t = 0, k = 0;

        for(int i = 0; i < goal.length; i++) {
            if(t < cards1.length && goal[i].equals(cards1[t])) {
                t++;
            } else if(k < cards2.length && goal[i].equals(cards2[k])) {
                k++;
            } else {
                answer = "No";
                break;
            }

            answer = "Yes";
        }

        return answer;
    }
}

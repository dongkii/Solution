package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;

public class numberBlock {
    public static int[] solution(long begin, long end) {
        ArrayList<Integer> list = new ArrayList<>();

        for(long i = begin; i < end+1; i++) {

            if(i < 2) {
                list.add(0);
            } else {
                int cnt = 0;
                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i%j == 0 && i/j < 10000000) {
                        list.add((int)i/j);
                        cnt++;
                        break;
                    }
                }

                if(cnt == 0) list.add(1);
            }
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }
}

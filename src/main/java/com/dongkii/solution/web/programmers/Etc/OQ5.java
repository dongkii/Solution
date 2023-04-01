package com.dongkii.solution.web.programmers.Etc;

import java.util.*;
import java.util.stream.Collectors;

public class OQ5 {
    public static int solution(int[] happiness) {
        int answer = 0;

        int[] h = Arrays.copyOf(happiness, happiness.length+1);
        h[happiness.length] = 0;

        List<Integer> list = Arrays.stream(happiness).boxed().collect(Collectors.toList());
        Collections.reverse(list);

        happiness = list.stream().mapToInt(Integer::intValue).toArray();
        int[] h2 = Arrays.copyOf(happiness, happiness.length+1);
        h2[happiness.length] = 0;

        int a = cal(h);
        int b = cal(h2);

        answer = Math.max(a, b);


        return answer;
    }

    public static int cal(int[] h) {
        int leeds = 0, happy = 0, max = 0;


        for(int i = 0; i < h.length-1; i++) {
            if(h[i] > 8) {
                happy++;
                leeds++;
            } else if(h[i] < 9) {
                if(happy > 0)
                    happy--;

                if(happy == 0 && leeds > 0 && h[i+1] > 8) {
                    leeds++;
                } else if(happy == 0 && h[i+1] < 9) {
                    max = Math.max(max, leeds);
                    leeds = 0;
                } else if(happy > 0){
                    leeds++;
                }
            }
        }

        max = Math.max(max, leeds);

        return max;
    }
}
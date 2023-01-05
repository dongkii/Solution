package com.dongkii.solution.web.programmers.level0;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class unusualArrangement {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];

        List<Integer> list = IntStream.of(numlist).boxed().collect(Collectors.toList());

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int o1Abs = Math.abs(o1-n);
                int o2Abs = Math.abs(o2-n);

                if(o1Abs == o2Abs) {
                    if( o1 > o2 ) return -1;
                    else if( o1 < o2) return 1;
                } else {
                    return o1Abs - o2Abs;
                }

                return 0;
            }
        });

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}

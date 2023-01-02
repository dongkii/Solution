package com.dongkii.solution.web.programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class pickMultiple {
    public static int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i]%n == 0) {
                list.add(numlist[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

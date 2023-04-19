package com.dongkii.solution.web.programmers.Etc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LiveQ {
    public static int solution(int[] balls, int maxOperations) {
        List<Integer> list = Arrays.stream(balls).boxed().collect(Collectors.toList());

        for(int i = 0; i < maxOperations; i++) {
            Collections.sort(list);
            int max = list.get(list.size()-1);
            list.remove(list.size()-1);

            int a = max/2;
            int b = max - a;

            list.add(a);
            list.add(b);
        }

        Collections.sort(list);

        return list.get(list.size()-1);
    }
}

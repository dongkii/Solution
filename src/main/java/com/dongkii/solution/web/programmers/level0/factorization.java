package com.dongkii.solution.web.programmers.level0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class factorization {
    public static int[] solution(int n) {
        Set<Integer> set = new HashSet<>();

        int i = 2;

        while(n >= 2) {
            if(n % i == 0) {
                set.add(i);
                n /= i;
            } else {
                i++;
            }
        }

        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(answer);

        return answer;
    }
}

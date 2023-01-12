package com.dongkii.solution.web.programmers.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class consecutiveSubsequences {
    public static int solution(int[] elements) {
        Set<Integer> result = new HashSet<>();

        for(int i = 1; i <= elements.length; i++) {

            int val = 0;

            Set<Integer> set = new HashSet<>();
            for(int j = 0; j < i; j++) val += elements[j%elements.length];
            set.add(val);

            for(int j = 0; j < elements.length; j++) {
                val -= elements[j%elements.length];
                val += elements[(i+j) % elements.length];
                set.add(val);
            }

            result.addAll(set);
        }

        return result.size();
    }
}

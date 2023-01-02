package com.dongkii.solution.web.programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySimilarity {
    public static int solution(String[] s1, String[] s2) {
        List<String> l1 = new ArrayList<>(Arrays.asList(s1));
        List<String> l2 = new ArrayList<>(Arrays.asList(s2));

        l1.retainAll(l2);

        return l1.size();
    }
}

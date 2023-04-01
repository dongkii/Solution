package com.dongkii.solution.web.programmers.Etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OQ2 {
    public static int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());

        list1.retainAll(list2);

        return list1.size() == 0 ? -1 : list1.get(0);
    }
}

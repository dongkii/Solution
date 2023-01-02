package com.dongkii.solution.web.programmers.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class numberOfDuplicate {
    public static int solution(int[] array, int n) {
        int answer = 0;

        List<Integer> nums = Arrays.stream(array).boxed().collect(Collectors.toList());

        answer = Collections.frequency(nums, 1);

        return answer;
    }
}

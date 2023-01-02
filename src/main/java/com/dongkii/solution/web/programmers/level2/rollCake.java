package com.dongkii.solution.web.programmers.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class rollCake {
    public static int solution(int[] topping) {
        int answer = -1;

        int[] array = {1, 1, 2, 3, 4, 5};

        List<Integer> nums = Arrays.stream(array).boxed().collect(Collectors.toList());

        int tmp = Collections.frequency(nums, 1);

        System.out.println(tmp);

        return answer;
    }
}

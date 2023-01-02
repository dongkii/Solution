package com.dongkii.solution.web.programmers.level0;

import java.util.*;
import java.util.stream.Collectors;

public class rotateArray {
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if("left".equals(direction)) {
            answer = Arrays.copyOfRange(numbers, 1, numbers.length+1);
            answer[answer.length-1] = numbers[0];
        } else {
            List<Integer> l1 = new ArrayList<>(Arrays.asList(numbers[numbers.length-1]));

            numbers = Arrays.copyOfRange(numbers, 0, numbers.length-1);
            List<Integer> l2 = new ArrayList<>(Arrays.stream(numbers).boxed().collect(Collectors.toList()));
            l1.addAll(l2);

            answer = l1.stream().mapToInt(Integer::intValue).toArray();
        }

        return answer;
    }
}

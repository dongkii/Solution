package com.dongkii.solution.web.programmers.level2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Biggest_number {
    public static String solution(int[] numbers) {
        String answer = "";

        // numbers의 각 원소중 첫째자리가 가장 큰 수 부터 나열
        // 모든 수를 나열해서 가장 큰수를 구하면 numbers 배열 크기 팩토리얼 만큼의 개수를 구해야함 (n 은 1 ~ 100,000)

        // int배열을 String배열로 전환
        String[] arr = Arrays.stream(numbers).sorted().mapToObj(String::valueOf).toArray(String[]::new);

        // sort 함수를 Override 하여 두 수의 합 순서에 따라 정렬
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        // 역순으로 정렬했는데 맨 앞 값이 0이면 전체가 0이다
        if(arr[0].equals("0")) return "0";

        // 문자열 배열을 문자열로 변환
        answer = Arrays.stream(arr).collect(Collectors.joining());

        return answer;
    }
}

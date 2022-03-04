package com.dongkii.solution.web.programmers.level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tuple {
    public static int[] solution(String s) {
        // 문자열 s를 스플릿으로 1차원 배열로 만듬
        String rows[] = s.replace("{", "").replace("}}", "").split("\\}\\,");

        // 문자열의 길이가 길면 수가 더 많은 것이니 문자열 길이로 정렬, 길이가 낮은수가 앞으로 오도록
        Arrays.sort(rows, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.length() > o2.length())?1:-1;
            }
        });

        String[][] arr = new String[rows.length][]; // 각 원소를 모두 더하기위해 2차원 배열 선언
        int[] answer = new int[rows.length];        // 튜플을 구하기 위한 변수수

        int preSum = 0;
        for(int i = 0; i < rows.length; i++) {
            arr[i] = rows[i].split(",");

            int sum = 0;

            for(int j = 0; j < arr[i].length; j++) { // 각 원소의 합을 구함
                sum += Integer.parseInt(arr[i][j]);
            }

            answer[i] = sum - preSum;  // 현재 원소의 합에서 이전 원소의 합을 빼면 튜플 인덱스가 나옴

            preSum = sum;
        }

        return answer;
    }
}

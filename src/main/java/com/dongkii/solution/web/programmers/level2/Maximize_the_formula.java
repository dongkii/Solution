package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Maximize_the_formula {
    public static long solution(String expression) {
        long answer = 0;

        List<String> list = new ArrayList<String>();

        // 문자열을 리스트로 변환
        String val = "";
       for(int i = 0; i < expression.length(); i++) {
            String tmp = String.valueOf(expression.charAt(i));

            if(Pattern.matches("[0-9]", tmp)) {
                val += tmp;
            } else {
                list.add(val);
                val = "";
                list.add(tmp);
            }

        }
        if(!"".equals(val)) list.add(val);

        String[] arr = list.stream().map(String::new).toArray(String[]::new);
        boolean[] visited = new boolean[(int)Math.ceil(arr.length/2)];
        int output = 0;

        permutation(arr, output, visited, 0, arr.length, visited.length);

        return answer;
    }

    public static void permutation(String[] arr, int output, boolean[] visited, int depth, int n, int r) {
        System.out.println(depth);
        if(depth == r) {
            System.out.println(output);
            return;
        }

        for(int i = 0; i < n; i+=2) {    // 0번째 인덱스 부터
            if(visited[i] != true) {
                visited[i] = true;
                switch (arr[i+1]) {
                    case "+" :
                        output += Integer.parseInt(arr[i]) + Integer.parseInt(arr[i+2]);
                        break;
                    case "-" :
                        output += Integer.parseInt(arr[i]) - Integer.parseInt(arr[i+2]);
                        break;
                    case "*" :
                        output += Integer.parseInt(arr[i]) * Integer.parseInt(arr[i+2]);
                        break;
                }
                permutation(arr, output, visited, depth + 2, n, r);
                visited[i] = false;
            }
        }
    }
}

package com.dongkii.solution.web.programmers.level2;

import java.util.*;
import java.util.stream.Collectors;

public class Coloring {
    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        Map<Integer, List<int[]>> areaList = new HashMap<Integer, List<int[]>>();

        int areaIdx = 0;

        // 각 영역의 값을 키로, 각 영역의 좌표를 값으로 가지는 맵 처리
        for(int i = 0; i < picture.length; i++) {
            for(int j = 0; j < picture[0].length; j++) {

            }
        }

        areaList.remove(0);

        int[] answer = new int[2];
        answer[0] = 1; // 영역수
        answer[1] = 1; // 각 영역중 제일 큰값

        System.out.println(answer[0] + " / " + answer[1]);
        return answer;
    }
}

/*

1 1 1 0
1 2 2 0
1 0 0 1
0 0 0 1
0 0 0 3
0 0 0 3

 */
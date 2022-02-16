package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class Keep_distance {
    public static int[] solution(String[][] places) {
        int[] answer = {};

        List<int[]> pList = new ArrayList<int[]>();
        List<int[]> xList = new ArrayList<int[]>();

        // 2차원 배열 전체
        for(int i = 0; i < places.length; i++) {

            // 각 대기실 for
            for(int j = 0; j < 5; j++) {

                // 각 자리
                for(int k = 0; k < 5; k++) {
                    // P(응시자)들 저장
                    if("P".equals(places[j][k])) {
                        pList.add(new int[] {j, k});
                    }

                    if("X".equals(places[j][k])) {
                        xList.add(new int[] {j, k});
                    }
                }
            }
            System.out.println(pList.size());
            System.out.println(xList.size());
            System.out.println("----------");
        }

        return answer;
    }
}

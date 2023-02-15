package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class tableHashFunction {
    public static int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;

        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[col-1]!=o2[col-1] ? o1[col-1]-o2[col-1] : o2[0]-o1[0];
            }
        });

        List<Integer> list = new ArrayList<>();
        for(int i = row_begin; i < row_end+1; i++) {
            int sum = 0;

            for(int j = 0; j < data[i-1].length; j++) {
                sum += data[i-1][j]%i;
            }
            list.add(sum);
        }

        for(Integer a : list) {
            answer = answer ^ a;
        }

        return answer;
    }
}

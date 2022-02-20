package com.dongkii.solution.web.programmers.level2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Fibonachi {
    public static int solution(int n) {
        int answer = 0;

        List<Integer> tmpList = new ArrayList<Integer>();
        tmpList.add(0);
        tmpList.add(1);

        for(int i = 2; i <= n; i++) {
            tmpList.add(tmpList.get(0)%1234567 + tmpList.get(1)%1234567);
            tmpList.remove(0);
        }

        return tmpList.get(1)%1234567;
    }
}

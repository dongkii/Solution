package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class numberCard {
    private static List<Integer> list;

    public static int solution(int[] arrayA, int[] arrayB) {
        int a = condition(arrayA, arrayB);
        int b = condition(arrayB, arrayA);

        System.out.println(a + " / " + b);

        return Math.max(a, b);
    }

    public static int condition(int[] arrayA, int[] arrayB) {
        Arrays.sort(arrayA);
        findDiviors(arrayA[0]);

        Collections.sort(list, Collections.reverseOrder());

        for(int i = 0; i < list.size(); i++) {
            boolean chk = true;

            for(int j = 0; j < arrayA.length; j++) {
                if(arrayA[j]%list.get(i) != 0) {
                    chk = false;
                    break;
                }
            }

            if(chk) {
                for(int k = 0; k < arrayB.length; k++) {
                    if (arrayB[k] % list.get(i) == 0) {
                        chk = false;
                        break;
                    }
                }
            }

            if(chk) return list.get(i);
        }

        return 0;
    }

    public static void findDiviors(int a) {
        list = new ArrayList<>();

        for(int i = 2; i <= a/2; i++) {
            if(a%i == 0)
                list.add(i);
        }

        list.add(a);
    }
}

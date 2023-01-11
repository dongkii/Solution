package com.dongkii.solution.web.programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class privacy {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < privacies.length; i++) {
            String[] pri = privacies[i].split(" ");
            String mon = "";

            for(int j = 0; j < terms.length; j++) {
                String[] term = terms[j].split(" ");
                if(pri[1].equals(term[0])) {
                    mon = term[1];
                    break;
                }
            }

            if(calculate(today, pri[0], mon)) {
                list.add(i+1);
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static boolean calculate(String today, String validity, String month) {
        String[] to = today.split("\\.");
        to[0] = to[0].substring(2, 4);

        int a = ((Integer.parseInt(to[0]) * 12 * 28) + (Integer.parseInt(to[1]) - 1) * 28) + Integer.parseInt(to[2]);


        String[] val = validity.split("\\.");
        val[0] = val[0].substring(2, 4);

        int b = ((Integer.parseInt(val[0]) * 12 * 28) + (Integer.parseInt(val[1]) - 1) * 28) + Integer.parseInt(val[2]);

        b = b + (Integer.parseInt(month) * 28 -1);

        if(b < a) {
            return true;
        } else {
            return false;
        }
    }
}

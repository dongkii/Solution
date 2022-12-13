package com.dongkii.solution.web.programmers.level2;

import java.util.Arrays;

public class discountEvent {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        String[] wantAll = new String[10];
        int n = 0;
        for(int i = 0; i < number.length; i++) {
            for(int j = 0; j < number[i]; j++) {
                wantAll[n] = want[i];
                n++;
            }
        }

        Arrays.sort(wantAll);

        for(int k = 0; k < discount.length-9; k++) {
            String[] tmp = Arrays.copyOfRange(discount, k, k+10);
            Arrays.sort(tmp);

            if(Arrays.equals(wantAll, tmp)) {
                answer++;
            }
        }

        return answer;
    }
}

package com.dongkii.solution.web.programmers.Etc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class YQ2 {
    public static int solution(int[] A) {
        int answer = 0;
        int sum = 0;

        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());

        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);

            if(sum == 0 ) {
                if(list.get(i+1) < 0 && list.get(i) < list.get(i+1)) {
                    sum -= list.get(i);
                    list.add(list.get(i));
                    list.remove(i);
                    i--;
                    answer++;
                }
            } else if(sum < 0) {
                sum -= list.get(i);
                list.add(list.get(i));
                list.remove(i);
                i--;
                answer++;
            }
        }

        return answer;
    }
}

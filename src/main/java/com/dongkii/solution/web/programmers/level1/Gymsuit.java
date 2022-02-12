package com.dongkii.solution.web.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class Gymsuit {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        // 학생 순번이 키, 체육복 갯수 값
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // 학생 수 맵에 넣기
        for(int i = 1; i <= n; i++) {
            map.put(i, 1);
        }

        // 잃어버린애 빼기
        for(int j = 0; j < lost.length; j++) {
            map.put(lost[j], map.get(lost[j])-1);
        }

        // 여벌 추가
        for(int t = 0; t < reserve.length; t++) {
            map.put(reserve[t], map.get(reserve[t]) + 1);
        }

        for(int k = 1; k <= map.size(); k++) {
            // 가지고 있는 체육복이 없을 때
            if(map.get(k) == 0) {
                if(k == 1) {
                    if(map.get(k+1) == 2) {
                        map.put(k+1, 1);
                        map.put(k, 1);
                    }
                } else if(k == map.size()) {
                    if(map.get(k-1) == 2) {
                        map.put(k-1, 1);
                        map.put(k, 1);
                    }
                } else {
                    if(map.get(k-1) == 2){
                        map.put(k-1, 1);
                        map.put(k, 1);
                    } else if(map.get(k+1) == 2) {
                        map.put(k+1, 1);
                        map.put(k, 1);
                    }
                }
            }
        }

        for(int q = 1; q <= map.size(); q++) {
            if(map.get(q) != 0) answer++;
        }

        return answer;
    }
}

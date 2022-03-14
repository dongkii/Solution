package com.dongkii.solution.web.programmers.level2;

import java.util.Arrays;

public class Rescue_boat {
    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people); // 무게를 오름차순으로 정렬

        int i = 0, t = 0;
        int j = people.length - 1;
        while( t < people.length) {
            if(people[i] + people[j] <= limit) { // 오름차순 중 제일 큰값과 제일 작은값을 더한값이 limit 보다 작거나 같은지 확인
                // limit보다 작거나 같을 경우 2명이 함께 탑승 가능
                i++;
                j--;
                t+=2;
            } else {
                // limit보다 클 경우 큰값만 탑승
                j--;
                t++;
            }

            answer += 1;
        }

        return answer;
    }
}

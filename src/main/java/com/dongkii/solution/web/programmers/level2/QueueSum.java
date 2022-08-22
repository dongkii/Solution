package com.dongkii.solution.web.programmers.level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueSum {
    public static int solution(int[] queue1, int[] queue2) {
        int answer = -2;

        long sum1 = Arrays.stream(queue1).sum(); // 큐1 의 합
        long sum2 = Arrays.stream(queue2).sum(); // 큐2 의 합

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for(int i = 0; i < queue1.length; i++) {
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }

        for(int k = 0; k < queue1.length*3 - 2; k++) {
            int tmp = 0;
            if(sum1 == sum2) {
                return k;
            }

            if(sum2 < sum1) {
                tmp = q1.poll();
                sum1 -= tmp;
                sum2 += tmp;
                q2.offer(tmp);
            } else {
                tmp = q2.poll();
                sum2 -= tmp;
                sum1 += tmp;
                q1.offer(tmp);
            }
        }

        return -1;
    }
}

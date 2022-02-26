package com.dongkii.solution.web.programmers.level2;

import java.util.*;
import java.util.stream.IntStream;

public class Truck_crossing_the_bridge {
    public static int solution(int bridge_length, int weight, int[] truck_weight) {
        int answer = 0;

        Queue<int[]> q = new LinkedList<int[]>();

        int sum = 0;
        int i = 1;
        while(true) {
            if(i == truck_weight.length+1 && q.isEmpty()) break;
            // 큐가 비었고, i가 1부터 돌았으니 트럭의 모든 인덱스를 다 돌면 브레이크

            if(q.size() > 0 && q.peek()[1]+bridge_length == answer) {
                // 큐에 들어간 시간+다리길이와 answer의 값이 일치하면 큐에서 꺼냄
                sum -= q.peek()[0];
                q.poll();
            }

            if(i < truck_weight.length+1 && q.isEmpty()) {  // 큐가 비었으면 입력
                // 큐에 들어간 트럭의 무게와 들어간 시간을 입력
                q.add(new int[] {truck_weight[i-1], answer});
                sum += truck_weight[i-1];
                i+=1;
            } else if( i < truck_weight.length+1 && sum + truck_weight[i-1] <= weight) {
                // 트럭 무게의 합과 다음 트럭의 무게가 다리가 버틸 수 있는 무게보다 작거나 같으면 입력
                q.add(new int[] {truck_weight[i-1], answer});
                sum += truck_weight[i-1];
                i+=1;
            }

            answer +=1;
        }

        return answer;
    }
}

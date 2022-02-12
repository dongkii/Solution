package com.dongkii.solution.web.programmers.level2;

import java.util.*;
import java.util.stream.*;

public class The_spicy {
    public static int solution(int[] scoville, int K) {
        int answer = 0;

        // int 배열을 우선순위 큐에 저장
        PriorityQueue<Integer> pq = Arrays.stream(scoville).boxed().collect(Collectors.toCollection(PriorityQueue::new));

        // 우선순위 큐의 루트노드가 K 보다 클때까지 (peek가 가장 낮은 수인데 peek가 K보다 클때까지)
        while(pq.peek() < K) {
            if(pq.size() == 1) return -1; // 섞을게 없기때문에 -1 리턴
            pq.add(pq.poll() + (pq.poll() * 2));   // 첫번째 poll이 가장 낮은 수, 두번째 poll이 두번째 낮은수
            answer++;               // 섞은횟수 증가
        }

        /*
        // scoville 지수가 낮은 것부터 정렬
        Arrays.sort(scville);

        // tmpArr배열에 스코빌지수 배열 복사
        int[] tmpArr = Arrays.copyOf(scoville, scoville.length);

        // tmpArr배열의 첫번째 인덱스가 K보다 클때까지 루프
        while(tmpArr[0] < K) {
            if(tmpArr.length == 1) return -1;       // 섞을게 없기때문에 -1 리턴
            int tmp = tmpArr[0] + (tmpArr[1] * 2);  // 가장 낮은수와 두번째 낮은 수 섞기
            answer++;                               // 섞은 카운트 증가
            tmpArr[1] = tmp;                        // 섞은 값을 tmpArr의 두번째 인덱스에 넣고

            tmpArr = Arrays.copyOfRange(tmpArr, 1, tmpArr.length);
            // 첫번째 인덱스를 제외한 두번째 인덱스(위에서 섞은값 넣음)부터 배열 복사

            Arrays.sort(tmpArr);                    // 섞어서 나온 지수를 포함해 다시 정렬
        }
         */

        return answer;
    }
}

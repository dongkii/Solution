package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class Keep_distance {
    public static int[] solution(String[][] places) {
        int[] answer = new int[5];

        // 2차원 배열 전체
        for(int i = 0; i < places.length; i++) {
            answer[i] = 1;
            List<int[]> pList = new ArrayList<int[]>();

            // 각 대기실 for
            for(int j = 0; j < 5; j++) {

                // 각 자리
                for(int k = 0; k < 5; k++) {
                    // P(응시자)들 저장
                    if("P".equals(String.valueOf(places[i][j].charAt(k)))) {
                        pList.add(new int[] {j, k});
                    }
                }
            }

            for(int a = 0; a < pList.size()-1; a++) {
                for(int b = a + 1; b < pList.size(); b++) {
                    // 맨해튼 거리 공식 |b1 - a1| + |b2 - a2|
                    int m = Math.abs(pList.get(b)[0] - pList.get(a)[0]) + Math.abs(pList.get(b)[1] - pList.get(a)[1]);
                    if(m == 1) { // 맨해튼 거리가 1이면 파티션이 있을 수 없음
                        answer[i] = 0;
                        break;
                    }

                    if(m == 2) { // 맨해튼 거리가 2이면 중간에 파티션이 있는지 확인
                        // 각 P값의 x좌표중 최소값, y좌표중 최소값을 구해 4칸만 비교해서 하나라도 O 가 있으면 거리두기 실패
                        int min_x = Math.min(pList.get(b)[0], pList.get(a)[0]);
                        int min_y = Math.min(pList.get(b)[1], pList.get(a)[1]);

                        if(pList.get(b)[0] == pList.get(a)[0] && places[i][min_x].charAt(min_y+1) == 'O') {
                            answer[i] = 0;
                            break;
                        } else if(pList.get(b)[1] == pList.get(a)[1] && places[i][min_x+1].charAt(min_y) == 'O') {
                            answer[i] = 0;
                            break;
                        } else if ((pList.get(b)[0] != pList.get(a)[0] && pList.get(b)[1] != pList.get(a)[1])
                                    && (places[i][min_x].charAt(min_y) == 'O'
                                    || places[i][min_x + 1].charAt(min_y) == 'O'
                                    || places[i][min_x].charAt(min_y + 1) == 'O'
                                    || places[i][min_x + 1].charAt(min_y + 1) == 'O')) {
                                answer[i] = 0;
                                break;
                        }
                    }
                }

                if(answer[i] == 0) break;
            }
        }

        return answer;
    }
}

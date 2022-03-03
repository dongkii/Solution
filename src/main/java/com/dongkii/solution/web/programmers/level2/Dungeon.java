package com.dongkii.solution.web.programmers.level2;

import java.util.*;

public class Dungeon {

    public static int answer = 0;
    public static boolean[] visited;

    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    }

    static void dfs(int depth, int k, int[][] dungeons) {
        for(int i = 0; i < dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0] <= k) { // 방문하지 않은 던전이고, 필요피로도가 남은피로도보다 적거나 같을 경우
                visited[i] = true;                   // 해당 던전 방문
                dfs(depth + 1, k - dungeons[i][1], dungeons);   // 방문한 던전 깊이 1추가, 피로도는 소모피로도만큼 감소
                visited[i] = false;                  // 던전 초기화
            }
        }

        answer = Math.max(answer, depth);
    }
}

package com.dongkii.solution.web.programmers.level2;

import java.util.PriorityQueue;

public class Delivery {

    static final int INF = 500001;

    public static int solution(int N, int[][] road, int K) {
        int answer = 0;

        int[][] map = new int[N+1][N+1];

        // 초기화
        for(int i = 0; i <= N; i++) {
            for(int j = 0; j <= N; j++) {
                if(i==j) continue;
                map[i][j] = INF;
            }
        }

        // 간선 정보 저장 (이중 배열)
        for(int i = 0; i < road.length; i++) {
            if(map[road[i][0]][road[i][1]] > road[i][2]) {
                map[road[i][0]][road[i][1]] = map[road[i][1]][road[i][0]] = road[i][2];
            }
        }

        // 걸리는 시간 초기화
        int[] dist = new int[N+1];
        for(int i = 2; i <= N; i++) {
            dist[i] = (dist[i] == 0) ? INF : map[i][i];
        }

        boolean[] visited = new boolean[N+1];
        visited[1] = true;

        for(int i = 1; i < N; i++) {
            int min_idx = 1;
            int min_value = INF;
            for(int j = 2; j <= N; j++) {
                if(!visited[j] && dist[j] < min_value) {
                    min_value = dist[j];
                    min_idx = j;
                }
            }

            visited[min_idx] = true;

            for(int j = 2; j <= N; j++) {
                if(dist[j] > dist[min_idx] + map[min_idx][j])
                    dist[j] = dist[min_idx] + map[min_idx][j];
            }
        }

        for (int i = 1; i <= N; i++) {
            if(dist[i]<=K) answer ++;
        }

        return answer;
    }
}

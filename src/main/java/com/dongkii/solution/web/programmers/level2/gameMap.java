package com.dongkii.solution.web.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class gameMap {

    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};

    public static int solution(int[][] maps) {
        int answer = 0;

        int m = maps.length;
        int n = maps[0].length;
        int[][] visited = new int[m][n];

        bfs(maps, visited);

        answer = visited[maps.length-1][maps[0].length-1];

        if(answer == 0 )
            answer = -1;

        return answer;
    }

    public static void bfs(int[][] maps, int[][] visited) {
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});

        while(!queue.isEmpty()) {
            int[] current = queue.remove();
            System.out.println("current[] = " + current[0] + " | " + current[1]);
            int cX = current[0];
            int cY = current[1];

            for(int i = 0; i < 4; i++) {
                int nX = cX + dx[i];
                int nY = cY + dy[i];

                if(nX < 0 || nX > maps.length-1 || nY < 0 || nY > maps[0].length-1)
                    continue;

                if(visited[nX][nY] == 0 && maps[nX][nY] == 1) {
                    visited[nX][nY] = visited[cX][cY] +1;
                    System.out.println("visited : " + visited[nX][nY]);
                    queue.add(new int[] {nX, nY});
                }
            }
        }
    }
}

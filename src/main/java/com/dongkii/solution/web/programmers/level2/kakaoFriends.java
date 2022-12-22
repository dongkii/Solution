package com.dongkii.solution.web.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class kakaoFriends {

    // 1 1 1 0
    // 1 2 2 0
    // 1 0 0 1
    // 0 0 0 1
    // 0 0 0 3
    // 0 0 0 3
    class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited;
    static Queue<Node> queue;
    static int size;

    public int[] solutiion(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        visited = new boolean[m][n];
        queue = new LinkedList<Node>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(visited[i][j] != true && picture[i][j] != 0) {
                    size = 1;
                    bfs(i, j, m, n, picture);
                    if(maxSizeOfOneArea < size) maxSizeOfOneArea = size;
                    numberOfArea++;
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        return answer;
    }

    public void bfs(int x, int y, int m, int n, int[][] picture) {
        queue.add(new Node(x, y));
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            Node now = queue.poll();

            for(int i = 0; i < 4; i++) {
                int kx = now.x + dx[i];
                int ky = now.y + dy[i];
                if(0 <= kx && kx < m && 0 <= ky && ky < n) {
                    if(visited[kx][ky] != true && picture[x][y] == picture[kx][ky]) {
                        queue.add(new Node(kx, ky));
                        visited[kx][ky] = true;
                        size++;
                    }
                }
            }
        }
    }
}

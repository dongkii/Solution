package com.dongkii.solution.web.programmers.Etc;

public class CPQ3 {

    static int answer = -1;

    public static int solution(int[][] board) {


        boolean[][] visit = new boolean[4][4];

        System.out.println(dfs(board, visit, 1, 0));
        dfs(board, visit, 2, 0);
        dfs(board, visit, 3, 0);
        dfs(board, visit, 4, 0);

        return answer;
    }

    public static int dfs(int[][] board, boolean[][] visit, int n, int dgree) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == n && !visit[i][j]) {
                    visit[i][j] = true;
                    dfs(board, visit, n, dgree+1);
                }
            }
        }

        return Math.max(answer, dgree);
    }
}

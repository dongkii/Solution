package com.dongkii.solution.web.programmers.level2;

import java.util.*;

public class friends4block {

    public static char[][] bo;
    public static boolean[][] remove;

    public static int solution(int m, int n, String[] board) {
        int answer = 0;

        bo = new char[m][n];


        for(int i = 0; i < m; i++) {
            bo[i] = board[i].toCharArray();
        }

        while(true){
            remove = new boolean[m][n];
            for(int i = 0; i < m-1; i++) {
                for(int j = 0; j < n-1; j++) {
                    if('0' != bo[i][j])
                        check(i, j, bo);
                }
            }

            int cnt = remove(m, n, bo);
            if(cnt == 0) {
                return answer;
            } else {
                answer += cnt;
            }

        }
    }

    public static void check(int m, int n, char[][] board) {
        char ch = board[m][n];

        if(m < board.length-1 && n < board[0].length-1) {
            if(ch == board[m+1][n] && ch == board[m][n+1] && ch == board[m][n+1] && ch == board[m+1][n+1]) {
                remove[m][n] = true;
                remove[m][n+1] = true;
                remove[m+1][n] = true;
                remove[m+1][n+1] = true;
            }
        }
    }

    public static int remove(int m, int n, char[][] board) {
        int cnt = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(remove[i][j]){
                    board[i][j] = '0';
                    cnt++;
                }
            }
        }

        // 사라진칸 재정렬
        for(int j = 0; j < n; j++) {
            List<Character> list1 = new ArrayList<>();
            List<Character> list2 = new ArrayList<>();

            for(int i = 0; i < m; i++) {
                if('0' == bo[i][j]) {
                    list1.add('0');
                } else {
                    list2.add(bo[i][j]);
                }
            }

            if(list1.size() > 0) {
                list1.addAll(list2);

                for(int i = 0; i < m; i++) {
                    bo[i][j] = list1.get(i);
                }
            }
        }


        return cnt;
    }
}

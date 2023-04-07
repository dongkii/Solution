package com.dongkii.solution.web.programmers.level2;

import java.util.*;

public class friends4block {

    public static String[][] bo;
    public static Set<String> remove = new HashSet<>();

    public static int solution(int m, int n, String[] board) {
        int answer = 0;

        bo = new String[m][n];

        for(int i = 0; i < m; i++) {
            bo[i] = board[i].split("");
        }

        while(true){
            for(int i = 0; i < m-1; i++) {
                for(int j = 0; j < n-1; j++) {
                    if(!"0".equals(bo[i][j]))
                        check(i, j, bo);
                }
            }

            if(remove.size() > 0) {
                Iterator<String> it = remove.iterator();
                while(it.hasNext()) {
                    String tmp = it.next();
                    int a = Integer.parseInt(tmp.split("")[0]);
                    int b = Integer.parseInt(tmp.split("")[1]);
                    bo[a][b] = "0";
                    answer++;
                }

                remove.clear();
            } else {
                return answer;
            }

            // 사라진칸 재정렬
            for(int j = 0; j < n; j++) {
                List<String> list1 = new ArrayList<>();
                List<String> list2 = new ArrayList<>();

                for(int i = 0; i < m; i++) {
                    if("0".equals(bo[i][j])) {
                        list1.add("0");
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
        }
    }

    public static void check(int i, int j, String[][] board) {
        int result = 0;

        if(i < board.length-1 && j < board[0].length-1) {
            if(board[i][j].equals(board[i+1][j])) {
                result++;
            }

            if(board[i][j].equals(board[i][j+1])) {
                result++;
            }

            if(board[i][j].equals(board[i+1][j+1])) {
                result++;
            }
        }

        if(result == 3) {
            remove.add(i + "" + j);
            remove.add((i+1) + "" + j);
            remove.add(i + "" + (j+1));
            remove.add((i+1) + "" + (j+1));
        }
    }
}
